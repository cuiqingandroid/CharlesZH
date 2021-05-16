package charles.version461.modifiers;

import javassist.*;

import java.io.IOException;

public class MenuEncodingModifier {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        modifyViewMenu(classPool, savePath);
        modifySessionMenu(classPool, savePath);
    }

    /**
     * 修改编辑菜单
     */
    private static void modifyViewMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {

    }

    /**
     * 修改编辑菜单
     */
    private static void modifySessionMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.ZOpb");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
//        ctConstructor.setBody("");
        ctConstructor.setBody("{kbzH = (javax.swing.Action)new com.xk72.charles.CharlesGUIFileManager$1(this, \"打开会话\",\"打开之前的会话\");ERKX = (javax.swing.Action)new com.xk72.charles.CharlesGUIFileManager$2(this, \"导入\", \"导入文件到会话\");}");
        ctClass.writeFile(savePath);
    }
}
