package org.cq;

import charles.VersionFactory;
import charles.VersionModifier;

public class Main {
    public static void main(String[] args) {
        VersionModifier modifier = VersionFactory.createVersionModifier(VersionFactory.V_461,System.getProperty("user.dir")+"/charles.jar", "./4.6.1");
        if (modifier != null){
            modifier.modifyByteCode();
        }
    }

}
