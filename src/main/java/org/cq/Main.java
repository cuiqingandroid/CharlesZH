package org.cq;

import org.cq.jartool.JarTool;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import charles.VersionFactory;
import charles.VersionModifier;

public class Main {

    public static void main(String[] args) {
        new GUI();
    }

    private static String translate(File originPath, boolean deleteTemp) {
        String filename = originPath.getName();
        String tempPath = new File(originPath.getParent(), filename+"_temp").getAbsolutePath();
        String outputFilename = filename.substring(0, filename.lastIndexOf("."))+"_zh.jar";
        File outputFile =  new File(originPath.getParent(), outputFilename);
        VersionModifier modifier = VersionFactory.createVersionModifier(VersionFactory.V_462, originPath.getAbsolutePath(), tempPath);
        if (modifier != null) {
            boolean bytecodeModify = modifier.modifyByteCode();
            if (!bytecodeModify) {
                return "翻译失败，请选择对应版本的charles.jar";
            }
            if (outputFile.exists()) {
                outputFile.delete();
            }
            if(JarTool.artifactFiles(originPath.getAbsolutePath(), modifier.getTempPath(), outputFile.getAbsolutePath())) {
                System.out.println("done");
                if (deleteTemp && new File(tempPath).exists()) {
                    try {
                        Files.walk(Path.of(tempPath))
                                .sorted(Comparator.reverseOrder())
                                .map(Path::toFile)
                                .forEach(File::delete);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("delete file done");
                }
                return null;
            } else {
                return "压缩文件失败，请关闭charles后重试";
            }
        } else {
            return "暂不支持当前版本";
        }
    }

    private static void addOriginJarClasspath() {
        URL url = null;
        try {
            url = new URL("file:///E:/code/java/CharlesZH/charles4.6.1.jar");
            Method addUrlMethod = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            addUrlMethod.setAccessible(true);
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            addUrlMethod.invoke(contextClassLoader, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    static class GUI extends JPanel {

        JFrame jFrame;

        GUI() {
            int w = 600;
            int h = 400;

            jFrame = new JFrame("Charles汉化工具");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(w, h);

            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int width = screenSize.width;
            int height = screenSize.height;
            int x = (width - w) / 2;
            int y = (height - h) / 2;
            jFrame.setLocation(x, y);

            jFrame.add(this, BorderLayout.WEST);

            GridBagLayout lay = new GridBagLayout();
            setLayout(lay);

            GridBagConstraints constraints = new GridBagConstraints();
            JLabel tips = new JLabel("请选择charles.jar的文件路径，并保证读写权限");
            constraints.gridx = 1;
            constraints.gridy = 0;
            constraints.weightx =5;
            add(tips, constraints);


            JLabel prefix = new JLabel("charles.jar路径:");
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.weightx = 1;
            add(prefix, constraints);

            JTextField jtfPath = new JTextField();
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.weightx = 4;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            add(jtfPath, constraints);


            JButton jbSelectPath = new JButton("选择");
            constraints.gridx = 2;
            constraints.gridy = 1;
            constraints.weightx = 1;
            add(jbSelectPath, constraints);
            jbSelectPath.addActionListener(e -> {
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jfc.showDialog(new JLabel(), "选择charles.jar文件");
                File file=jfc.getSelectedFile();
                jtfPath.setText(file.getAbsolutePath());
                System.out.println("文件路径:"+jtfPath.getText());
            });


            JButton jbGenerate = new JButton();
            jbGenerate.setText("一键汉化");
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.weightx =2;
            add(jbGenerate, constraints);
            jbGenerate.addActionListener(e -> {
                String path = jtfPath.getText();
                if (path == null || path.length() <= 0) {
                    JOptionPane.showMessageDialog(this,"请先选择原始charles.jar","报错",JOptionPane.ERROR_MESSAGE);
                } else {
                    File file = new File(path);
                    if (file.exists()) {
                        String errMsg = translate(file, false);
                        if (errMsg == null) {
                            JOptionPane.showMessageDialog(this,"翻译成功，替换charles.jar后重启charles","成功",JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this,errMsg,"报错",JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this,"选择的文件不存在","报错",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            jFrame.setResizable(false);
            jFrame.setVisible(true);

        }
    }
}
