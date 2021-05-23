package charles.version461.modifiers;

import charles.version461.mirror.mukF;
import charles.version461.extension.HelpMenuUrl;
import javassist.*;

import java.io.IOException;

public class JavaSourceReplace {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        addExtensionClass(classPool, savePath);
        replaceJavaClass(classPool, savePath);
        addHelpMenu(classPool, savePath);
    }

    private static void replaceJavaClass(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
//        CtClass ctClass = classPool.get("com.xk72.charles.gui.transaction.general.mukF");
        CtClass ctClass = classPool.getCtClass(mukF.class.getName());
        // 修改包路径
        ctClass.setName("com.xk72.charles.gui.transaction.general.mukF");
        ctClass.writeFile(savePath);

    }

    private static void addExtensionClass(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.getCtClass(HelpMenuUrl.class.getName());
        // 修改包路径
        ctClass.writeFile(savePath);
    }

    /**
     * help menu增加菜单
     */
    private static void addHelpMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
//        CtClass ctClass = classPool.get("com.xk72.charles.gui.menus.HelpMenu");
//        CtConstructor ctConstructor = ctClass.getConstructors()[0];
//        ctConstructor.insertAfter("{" +
//                "add(new charles.version461.extension.HelpMenuUrl(\"翻译支持\",\"https://github.com/cuiqingandroid/CharlesZH\"));" +
//                "}");
//        ctClass.writeFile(savePath);
    }
}