package charles;

import java.util.ArrayList;
import java.util.List;

import charles.version461.Modifier461;
import charles.version462.Modifier462;

public class VersionFactory {

    public static final String V_461 = "4.6.1";
    public static final String V_462 = "4.6.2";

    public static final List<String> SUPPORT_VERSIONS = new ArrayList<>(){};

    static {
        SUPPORT_VERSIONS.add(V_461);
        SUPPORT_VERSIONS.add(V_462);
    }

    public static VersionModifier createVersionModifier(String version, String originJar, String savePath){
        if (V_461.equals(version)) {
            return new Modifier461(originJar, savePath);
        } else if (V_462.equals(version)) {
            return new Modifier462(originJar, savePath);
        }
        return null;
    }
}
