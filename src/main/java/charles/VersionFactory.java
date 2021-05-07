package charles;

import charles.version461.Modifier461;

public class VersionFactory {

    public static final String V_461 = "4.6.1";
    public static VersionModifier createVersionModifier(String version, String originJar, String savePath){
        if (V_461.equals(version)) {
            return new Modifier461(originJar, savePath);
        }
        return null;
    }
}
