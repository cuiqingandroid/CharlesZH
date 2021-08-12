package charles.version462.modifiers;

import java.io.IOException;


import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.NotFoundException;

public class MenuEncodingModifier {
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
//        modifyViewMenu(classPool, savePath);
//        modifySessionMenu(classPool, savePath);
        modifyCharlesFrame(classPool, savePath);
        modifyActionSwitchboard(classPool, savePath);
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


    /**
     * 修改视图菜单
     */
    private static void modifyCharlesFrame(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.CharlesFrame");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "newSessionAction.putValue(javax.swing.Action.NAME, \"新建会话\");" +
                "newSessionAction.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"创建新的会话并开始记录\");" +
                "quitAction.putValue(javax.swing.Action.NAME, \"退出\");" +
                "preferencesAction.putValue(javax.swing.Action.NAME, \"选项\");" +
                "recordingSettingsAction.putValue(javax.swing.Action.NAME, \"记录设置\");" +
                "proxySettingsAction.putValue(javax.swing.Action.NAME, \"代理设置\");" +
                "dnsSettingsAction.putValue(javax.swing.Action.NAME, \"DNS设置\");" +
                "accessControlSettingsAction.putValue(javax.swing.Action.NAME, \"访问控制设置\");" +
                "externalProxySettingsAction.putValue(javax.swing.Action.NAME, \"外部代理设置\");" +
                "externalDnsResolverSettingsAction.putValue(javax.swing.Action.NAME, \"外部DNS设置\");" +
                "remoteControlSettingsAction.putValue(javax.swing.Action.NAME, \"Web接口设置\");" +
                "sslSettingsAction.putValue(javax.swing.Action.NAME, \"SSL代理设置\");" +
                "errorLogAction.putValue(javax.swing.Action.NAME, \"错误日志\");" +
                "errorLogAction.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"查看错误日志\");" +
                "activeConnectionsAction.putValue(javax.swing.Action.NAME, \"活动链接\");" +
                "activeConnectionsAction.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"查看活动链接列表\");" +
                "}");

        CtMethod g = ctClass.getDeclaredMethod("g");
        g.setBody(" {   javax.swing.JMenuBar jMenuBar = new javax.swing.JMenuBar();\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a(jMenuBar);\n" +
                "    com.xk72.charles.gui.menus.FileMenu fileMenu = new com.xk72.charles.gui.menus.FileMenu(\"文件\", this);\n" +
                "    fileMenu.setMnemonic('f');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)fileMenu);\n" +
                "    jMenuBar.add((javax.swing.JMenu)fileMenu);\n" +
                "    com.xk72.charles.gui.menus.EditMenu editMenu = new com.xk72.charles.gui.menus.EditMenu(\"编辑\", this);\n" +
                "    editMenu.setMnemonic('e');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)editMenu);\n" +
                "    jMenuBar.add((javax.swing.JMenu)editMenu);\n" +
                "    com.xk72.charles.gui.menus.ViewMenu viewMenu = this.actionSwitchboard.A;\n" +
                "    viewMenu.setMnemonic('v');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)viewMenu);\n" +
                "viewMenu.setText(\"视图\");\n" +
                "    jMenuBar.add((javax.swing.JMenu)viewMenu);\n" +
                "    com.xk72.charles.gui.menus.ProxyMenu proxyMenu = new com.xk72.charles.gui.menus.ProxyMenu(\"代理\", this);\n" +
                "    proxyMenu.setMnemonic('p');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)proxyMenu);\n" +
                "    jMenuBar.add((javax.swing.JMenu)proxyMenu);\n" +
                "    com.xk72.charles.gui.menus.ToolsMenu toolsMenu = new com.xk72.charles.gui.menus.ToolsMenu(\"工具\", this);\n" +
                "    toolsMenu.setMnemonic('t');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)toolsMenu);\n" +
                "    jMenuBar.add((javax.swing.JMenu)toolsMenu);\n" +
                "    com.xk72.charles.gui.menus.WindowMenu windowMenu = new com.xk72.charles.gui.menus.WindowMenu(\"窗口\", this);\n" +
                "    windowMenu.setMnemonic('w');\n" +
                "    com.xk72.charles.gui.lib.UIUtils.a((javax.swing.JMenu)windowMenu);\n" +
                "    this.desktop.a((java.awt.event.ContainerListener)windowMenu);\n" +
                "    jMenuBar.add((javax.swing.JMenu)windowMenu);\n" +
                "    com.xk72.charles.gui.menus.HelpMenu helpMenu = h();\n" +
                "helpMenu.setText(\"帮助\");\n" +
                "    jMenuBar.add((javax.swing.JMenu)helpMenu);\n" +
                "    if (com.xk72.charles.macos.g.a())\n" +
                "      ((com.xk72.charles.macos.gui.a)com.xk72.charles.macos.g.b()).a(this); \n" +
                "    setJMenuBar(jMenuBar);}");
        ctClass.writeFile(savePath);
        ctClass.detach();
    }

    /**
     * 修改子菜单
     */
    private static void modifyActionSwitchboard(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.a");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "m.putValue(javax.swing.Action.NAME, \"清空会话\");" +
                "m.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"清空当前会话\");" +
                "n.putValue(javax.swing.Action.NAME, \"保存会话\");" +
                "n.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"保存当前会话\");" +
                "o.putValue(javax.swing.Action.NAME, \"会话另存为\");" +
                "o.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"会话另存为到新文件\");" +
                "p.putValue(javax.swing.Action.NAME, \"导出会话\");" +
                "p.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"导出当前会话\");" +
                "q.putValue(javax.swing.Action.NAME, \"关闭会话\");" +
                "q.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"关闭当前会话\");" +
                "r.putValue(javax.swing.Action.NAME, \"查找\");" +
                "r.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"查找当前会话\");" +
                "s.putValue(javax.swing.Action.NAME, \"查找下一个\");" +
                "s.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"查找到下一个\");" +
                "t.putValue(javax.swing.Action.NAME, \"查找上一个\");" +
                "t.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"查找到上一个\");" +
                "u.putValue(javax.swing.Action.NAME, \"修改请求\");" +
                "u.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"修改选中请求\");" +
                "v.putValue(javax.swing.Action.NAME, \"新建请求\");" +
                "v.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"新建请求\");" +
                "w.putValue(javax.swing.Action.NAME, \"重发请求\");" +
                "w.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"重发选中请求\");" +
                "}");

        ctClass.writeFile(savePath);
        ctClass.detach();
    }


}
