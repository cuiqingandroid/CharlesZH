package charles.version461.modifiers;

import javassist.*;

import java.io.IOException;

import javax.swing.AbstractAction;

public class MenuEncodingModifier {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        modifyViewMenu(classPool, savePath);
        modifySessionMenu(classPool, savePath);
    }

    /**
     * 修改文件菜单的open和import
     */
    private static void modifySessionMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.ZOpb");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.setBody("{kbzH = (javax.swing.Action)new com.xk72.charles.CharlesGUIFileManager$1(this, \"打开会话\",\"打开之前的会话\");ERKX = (javax.swing.Action)new com.xk72.charles.CharlesGUIFileManager$2(this, \"导入\", \"导入文件到会话\");}");
        ctClass.writeFile(savePath);
    }

    /**
     * 修改视图菜单
     */
    private static void modifyViewMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.transaction.frames.SkbX");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "kbzH.putValue(javax.swing.Action.NAME, \"备注\");" +
                "ERKX.putValue(javax.swing.Action.NAME, \"请求\");" +
                "gMxR.putValue(javax.swing.Action.NAME, \"响应\");" +
                "PRdh.putValue(javax.swing.Action.NAME, \"总览\");" +
                "Idso.putValue(javax.swing.Action.NAME, \"概览\");" +
                "Vvaz.putValue(javax.swing.Action.NAME, \"图表\");" +
                "}");
        ctClass.writeFile(savePath);
    }




}
