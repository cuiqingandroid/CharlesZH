package charles.version461.modifiers;

import javassist.*;

import java.io.IOException;

public class BundleStringEncodingModifier {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.lib.uAtD");
        CtClass ccString = classPool.get("java.lang.String");
        CtMethod ctMethod =ctClass.getDeclaredMethod("XdKP",new CtClass[]{ccString});
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
    }
}
