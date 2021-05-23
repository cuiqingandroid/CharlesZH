package org.cq;

import charles.VersionFactory;
import charles.VersionModifier;
import org.cq.jartool.JarTool;

public class Main {
    public static void main(String[] args) {
        String originJarPath = System.getProperty("user.dir")+"/charles4.6.1.jar";
        VersionModifier modifier = VersionFactory.createVersionModifier(VersionFactory.V_461, originJarPath, "./4.6.1");
        if (modifier != null){
            modifier.modifyByteCode();
            JarTool jartool = new JarTool();
            jartool.run(originJarPath, modifier.getSavePath(), System.getProperty("user.dir")+"/charles.jar");
            System.out.println("done");
        }
    }
}
