package charles.version462.modifiers;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;

public class JavaSourceReplace {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        addHelpMenu(classPool, savePath);
    }

    /**
     * help menu增加菜单
     */
    private static void addHelpMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        if (classPool.find("com.xk72.charles.gui.menus.HelpMenuUrl") == null) {
            CtClass helpUrlClass = classPool.makeClass("com.xk72.charles.gui.menus.HelpMenuUrl", classPool.get("javax.swing.AbstractAction"));
            CtConstructor urlConstruct = new CtConstructor(new CtClass[] {classPool.get("java.lang.String")}, helpUrlClass);
            urlConstruct.setBody("{" +
                    "super($1);\n"+
                    "}");
            helpUrlClass.addConstructor(urlConstruct);
            CtMethod ctMethod=new CtMethod(CtClass.voidType,"actionPerformed",new CtClass[]{classPool.get("java.awt.event.ActionEvent")}, helpUrlClass);
            ctMethod.setModifiers(Modifier.PUBLIC);
            ctMethod.setBody("{com.xk72.util.k.a(\"https://github.com/cuiqingandroid/CharlesZH\");}");
            helpUrlClass.addMethod(ctMethod);
            helpUrlClass.writeFile(savePath);
            helpUrlClass.detach();
        }
        CtClass ctClass = classPool.get("com.xk72.charles.gui.menus.HelpMenu");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "add(new com.xk72.charles.gui.menus.HelpMenuUrl(\"翻译支持\"));"+
                "}");
        ctClass.writeFile(savePath);
        ctClass.detach();
    }


}
