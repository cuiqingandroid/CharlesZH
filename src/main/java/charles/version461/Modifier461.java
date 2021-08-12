package charles.version461;

import charles.VersionModifier;
import charles.version461.modifiers.BundleStringEncodingModifier;
import charles.version461.modifiers.JavaSourceReplace;
import charles.version461.modifiers.MenuEncodingModifier;
import charles.version461.modifiers.ClassFileModifier;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;

import java.io.File;
import java.io.IOException;

public class Modifier461 extends VersionModifier {

    public Modifier461(String originJar, String savePath) {
        super(originJar, savePath);
    }

    @Override
    public boolean modifyByteCode() {
        try {
            ClassPool classPool=ClassPool.getDefault();
            classPool.insertClassPath(getOriginJarPath());
            BundleStringEncodingModifier.modify(classPool, getTempPath());
            ClassFileModifier.copySource(getSourcePath(), getTempPath());
            MenuEncodingModifier.modify(classPool, getTempPath());
            JavaSourceReplace.modify(classPool, getTempPath());
            return true;
        } catch (NotFoundException | CannotCompileException | IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getSourcePath() {
        return new File(System.getProperty("user.dir"),"src/main/java/charles/version461/source").getAbsolutePath();
    }

}
