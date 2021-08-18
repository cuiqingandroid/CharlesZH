package org.cq;

import org.cq.jartool.JarTool;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import charles.VersionFactory;
import charles.VersionModifier;

public class Main {

    public static void main(String[] args) {
        new GUI();
    }

    private static String translate(File originPath, String version, boolean deleteTemp, boolean newOutput) {
        String filename = originPath.getName();
        String tempPath = new File(originPath.getParent(), filename + "_temp").getAbsolutePath();
        String outputFilename = filename.substring(0, filename.lastIndexOf(".")) + "_zh.jar";
        File outputFile;
        if (newOutput) {
            outputFile = new File(originPath.getParent(), outputFilename);
        } else {
            outputFile = originPath;
        }
        VersionModifier modifier = VersionFactory.createVersionModifier(version, originPath.getAbsolutePath(), tempPath);
        if (modifier != null) {
            boolean bytecodeModify = modifier.modifyByteCode();
            if (!bytecodeModify) {
                return "翻译失败，请选择对应版本的charles.jar";
            }
            if (!newOutput && outputFile.exists()) {
                outputFile.delete();
            }
            if (JarTool.artifactFiles(originPath.getAbsolutePath(), modifier.getTempPath(), outputFile.getAbsolutePath())) {
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



    static class GUI extends JPanel {

        protected static final Insets spaceInsets = new Insets(10, 10, 4, 10);
        private final JFrame jFrame;

        JComboBox<String> jComboBox;
        JTextField textField;


        private void moveFrameToCenter() {
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int width = screenSize.width;
            int height = screenSize.height;
            int x = (width - jFrame.getWidth()) / 2;
            int y = (height - jFrame.getHeight()) / 2;
            jFrame.setLocation(x, y);
        }

        protected void createTips(){
            JTextArea desc = new JTextArea("找到charles安装目录里的charles.jar：" +System.getProperty("line.separator")+
                    "Windows在C:/Program Files/Charles/lib/charles.jar，mac在/Applications/Charles.app/Contents/Java/charles.jar。" +System.getProperty("line.separator")+
                    "将原文件拷贝到可以读写目录，在下方选择刚刚拷贝的文件，点击生成后，使用生成的文件替换charles安装目录的charles.jar。" +System.getProperty("line.separator")+
                    "替换之前注意备份原始charles.jar，避免出现不可预知的问题。");
            desc.setLineWrap(true);
            desc.setMargin(new Insets(5, 5, 5, 5));
            desc.setOpaque(false);
            addComponent( desc, 0
            );

        }

        protected void createVersionSelect() {
            JPanel jPanel = new JPanel();
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setAlignment(FlowLayout.LEFT);
            jPanel.setLayout(flowLayout);

            JLabel okButton = new JLabel("选择charles版本:");
            jPanel.add(okButton);

            jComboBox = new JComboBox<>();
            jComboBox.addItem("选择Charles版本");
            for (String supportVersion: VersionFactory.SUPPORT_VERSIONS) {
                jComboBox.addItem(supportVersion);
            }

            jPanel.add(jComboBox);
            addComponent( jPanel, 1
            );

        }

        protected void createPath() {
            JPanel jPanel = new JPanel();
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setAlignment(FlowLayout.LEFT);
            jPanel.setLayout(flowLayout);

            JLabel jLabel = new JLabel("选择charles.jar路径:");
            jPanel.add(jLabel);

            textField = new JTextField();
            Dimension d = textField.getPreferredSize();
            d.width = 300;
            textField.setPreferredSize(d);
            jPanel.add(textField);


            JButton button = new JButton("选择");
            button.addActionListener(e -> {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jfc.showDialog(new JLabel(), "选择charles.jar文件");
                File file = jfc.getSelectedFile();
                if (file != null) {
                    textField.setText(file.getAbsolutePath());
                    System.out.println("文件路径:" + textField.getText());
                } else {
                    System.out.println("操作取消");
                }
            });
            jPanel.add(button);

            addComponent( jPanel, 2
            );
        }

        protected void createOkButton() {
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout());

            JButton okButton = new JButton("OK");
            jPanel.add(okButton);
            okButton.addActionListener(e -> {
                if (jComboBox.getSelectedIndex() <= 0) {
                    JOptionPane.showMessageDialog(this, "请选择版本", "报错", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String version = (String) jComboBox.getSelectedItem();
                String path = textField.getText();
                if (path == null || path.length() <= 0) {
                    JOptionPane.showMessageDialog(this, "请先选择原始charles.jar", "报错", JOptionPane.ERROR_MESSAGE);
                } else {
                    File file = new File(path);
                    if (file.exists()) {
                        String errMsg = translate(file, version, false, true);
                        if (errMsg == null) {
                            JOptionPane.showMessageDialog(this, "翻译成功，替换charles.jar后重启charles", "成功", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, errMsg, "报错", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "选择的文件不存在", "报错", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            addComponent( jPanel, 4
            );

        }

        protected void addComponent(Component component,
                                    int gridy) {
            GridBagConstraints gbc = new GridBagConstraints(0, gridy,
                    1, 1, 1.0, 0, GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL, GUI.spaceInsets, 0, 0);
            add(component, gbc);
        }

        GUI() {
            int w = 600;
            int h = 400;

            jFrame = new JFrame("Charles汉化工具");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(w, h);
            jFrame.setContentPane(this);
            jFrame.setResizable(false);

            moveFrameToCenter();

            GridBagLayout lay = new GridBagLayout();
            setLayout(lay);

            setLayout(new GridBagLayout());

            createTips();
            createVersionSelect();
            createPath();
            createOkButton();

            jFrame.setVisible(true);
        }
    }
}
