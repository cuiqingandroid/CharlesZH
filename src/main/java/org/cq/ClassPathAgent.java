package org.cq;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.jar.JarFile;

public class ClassPathAgent {
    public static void agentmain(String args, Instrumentation instrumentation) throws IOException {
        instrumentation.appendToSystemClassLoaderSearch(new JarFile(args));
    }
}