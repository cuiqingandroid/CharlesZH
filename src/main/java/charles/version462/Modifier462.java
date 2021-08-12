package charles.version462;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import charles.VersionModifier;
import charles.version462.modifiers.JavaSourceReplace;
import charles.version462.modifiers.MenuEncodingModifier;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

public class Modifier462 extends VersionModifier {

    public Modifier462(String originJar, String savePath) {
        super(originJar, savePath);
    }

    @Override
    public boolean modifyByteCode() {
        try {
            ClassPool classPool=ClassPool.getDefault();
            classPool.insertClassPath(getOriginJarPath());
            modifyBundleStringEncoding(classPool, getTempPath());
            replaceSource();
//            register(classPool, getSourcePath());
            MenuEncodingModifier.modify(classPool, getTempPath());
//            JavaSourceReplace.modify(classPool, getTempPath());
            return true;
        } catch (NotFoundException | CannotCompileException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getSourcePath() {
        return "4.6.2";
    }

    /**
     * 替换资源文件，包括class文件
     */
    private void replaceSource(){
        String sourcePath = getSourcePath();

        URL classResourceURL = getClass().getResource("/"+sourcePath);
        String jarPath = classResourceURL.getPath().substring(classResourceURL.getPath().indexOf("/"), classResourceURL.getPath()
                .indexOf("!"));

        JarFile jarFile;
        try {
            jarFile = new JarFile(jarPath);
            Enumeration<JarEntry> jarEntries = jarFile.entries();

            while (jarEntries.hasMoreElements()) {
                JarEntry jarEntry = jarEntries.nextElement();
                String resourceName = jarEntry.getName();
                if (resourceName.startsWith(sourcePath) && !jarEntry.isDirectory()) {
                    File saveFile = new File(getTempPath(), resourceName.replace(sourcePath, ""));
                    if(!saveFile.getParentFile().exists()){
                        saveFile.getParentFile().mkdirs();
                    }
                    if(!saveFile.exists()){
                        saveFile.createNewFile();
                    }
                    InputStream inputStream = jarFile.getInputStream(jarEntry);
                    FileOutputStream fileOutputStream = new FileOutputStream(saveFile);
                    fileOutputStream.write(inputStream.readAllBytes());
                    inputStream.close();
                    fileOutputStream.close();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    /**
     * 修改string bundle的字符编码
     */
    public void modifyBundleStringEncoding(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.lib.d");
        CtClass ccString = classPool.get("java.lang.String");
        CtMethod ctMethod =ctClass.getDeclaredMethod("a",new CtClass[]{ccString});
        ctMethod.setBody("{int i = $1.indexOf(\"@@\");\n" +
                "    while (i != -1) {\n" +
                "      int j = $1.indexOf(\"@@\", i + 2);\n" +
                "      if (j != -1) {\n" +
                "        String str = $1.substring(i + 2, j);\n" +
                "        $1 = $1.substring(0, i) + $1.substring(0, i) + getString(str);\n" +
                "        i = $1.indexOf(\"@@\", i);\n" +
                "      } \n" +
                "    } \n" +
                "$1 = new String($1.getBytes(\"ISO-8859-1\"), \"utf-8\");\n"+
                "    return $1;}");
        ctClass.writeFile(savePath);
        ctClass.detach();
    }

//    /**
//     * 注册
//     */
//    private void register(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
//        CtClass ctClass = classPool.get("com.xk72.charles.p");
//        CtMethod ctMethod =ctClass.getDeclaredMethod("a",null);
//        ctMethod.setBody("{return true;}");
//        ctMethod = ctClass.getDeclaredMethod("c",null);
//        ctMethod.setBody("{return \"cuiqing\";}");
//        ctClass.writeFile(savePath);
//        ctClass.detach();
//    }
}
