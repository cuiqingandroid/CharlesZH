package charles.version461.modifiers;

import javassist.*;

import java.io.IOException;

public class JavaSourceReplace {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        addHelpMenu(classPool, savePath);
        register(classPool, savePath);
    }


    /**
     * help menu增加菜单
     */
    private static void addHelpMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.menus.HelpMenu");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "add(new com.xk72.charles.gui.menus.HelpMenuUrl(\"翻译支持\",\"https://github.com/cuiqingandroid/CharlesZH\"));" +
                "}");
        ctClass.writeFile(savePath);
    }

    private static void register(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.p");
        CtMethod ctMethod =ctClass.getDeclaredMethod("a",null);
        ctMethod.setBody("{return true;}");
        ctMethod = ctClass.getDeclaredMethod("c",null);
        ctMethod.setBody("{return \"cuiqing\";}");
        ctClass.writeFile();
    }
}
