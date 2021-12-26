package charles.version462.modifiers;

import java.io.IOException;


import javax.swing.JMenu;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;

public class MenuModifier extends JMenu{
    public static void modify(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        modifyViewMenu(classPool, savePath);
        modifySessionMenu(classPool, savePath);
        modifyCharlesFrame(classPool, savePath);
        modifyActionSwitchboard(classPool, savePath);
        modifyCompose(classPool, savePath);
        editMenu(classPool, savePath);
        copyUrl(classPool, savePath);
        addHelpMenu(classPool, savePath);
    }

    /**
     * 修改文件菜单的open和import
     */
    private static void modifySessionMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.i");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "l.putValue(javax.swing.Action.NAME, \"打开会话\");" +
                "l.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"打开之前的会话\");" +
                "m.putValue(javax.swing.Action.NAME, \"导入\");" +
                "m.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"导入文件到会话\");" +
                "}");
        ctClass.writeFile(savePath);
        ctClass.detach();
    }

    /**
     * 修改视图菜单
     */
    private static void modifyViewMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.transaction.frames.n");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "l.putValue(javax.swing.Action.NAME, \"备注\");" +
                "m.putValue(javax.swing.Action.NAME, \"请求\");" +
                "n.putValue(javax.swing.Action.NAME, \"响应\");" +
                "}");
        ctClass.writeFile(savePath);
        ctClass.detach();




        ctClass = classPool.get("com.xk72.charles.gui.transaction.frames.d");
        ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "e.putValue(javax.swing.Action.NAME, \"总览\");" +
                "f.putValue(javax.swing.Action.NAME, \"概览\");" +
                "g.putValue(javax.swing.Action.NAME, \"图表\");" +
                "}");
        ctClass.writeFile(savePath);
        ctClass.detach();
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
                "x.putValue(javax.swing.Action.NAME, \"批量重发\");" +
                "x.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"批量重复发送请求\");" +
                "y.putValue(javax.swing.Action.NAME, \"验证\");" +
                "y.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"验证选中请求\");" +
                "z.putValue(javax.swing.Action.NAME, \"发布到Gist\");" +
                "z.putValue(javax.swing.Action.SHORT_DESCRIPTION, \"发送request和response到gist\");" +
                "}");

        ctClass.writeFile(savePath);
        ctClass.detach();
    }


    /**
     * 修改请求重发
     */
    private static void modifyCompose(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
//        CtClass ctClass = classPool.get("com.xk72.charles.tools.ComposeTool");
//        CtConstructor ctConstructor = ctClass.getConstructors()[0];
//        ctConstructor.setBody("{" +
//                "super(\"修改请求\");;" +
//                "}");
//
//        ctClass.writeFile(savePath);
//        ctClass.detach();
//
//        CtClass ctClass1 = classPool.get("com.xk72.charles.gui.session.actions.AbstractComposeAction");
//        CtConstructor ctConstructor1 = ctClass1.getConstructors()[0];
//        ctConstructor1.insertAfter("{" +
//                "putValue(javax.swing.Action.NAME, \"修改请求\");" +
//                "}");
//
//        ctClass1.writeFile(savePath);
//        ctClass1.detach();
    }

    /**
     * 右键菜单拷贝 URL
     */
    private static void copyUrl(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.transaction.actions.CopyURLAction");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "putValue(javax.swing.Action.NAME, \"复制URL\");" +
                "}");

        ctClass.writeFile(savePath);
        ctClass.detach();
    }

    /**
     * 右键菜单拷贝 URL
     */
    private static void editMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        CtClass ctClass = classPool.get("com.xk72.charles.gui.menus.EditMenu");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "getItem(0).getAction().putValue(javax.swing.Action.NAME, \"剪切\");" +
                "getItem(1).getAction().putValue(javax.swing.Action.NAME, \"复制\");" +
                "getItem(2).getAction().putValue(javax.swing.Action.NAME, \"粘贴\");" +
                "getItem(3).getAction().putValue(javax.swing.Action.NAME, \"全选\");" +
                "}");

        ctClass.writeFile(savePath);
        ctClass.detach();
    }

    /**
     * help menu增加菜单
     */
    private static void addHelpMenu(ClassPool classPool, String savePath) throws NotFoundException, CannotCompileException, IOException {
        if (classPool.find("com.xk72.charles.gui.menus.HelpMenuUrl") == null) {
            CtClass helpUrlClass = classPool.makeClass("com.xk72.charles.gui.menus.HelpMenuUrl", classPool.get("javax.swing.AbstractAction"));
            CtConstructor urlConstruct = new CtConstructor(new CtClass[] {classPool.get("java.lang.String")}, helpUrlClass);
            urlConstruct.setBody("{" +
                    "super($1);\n"+
                    "}");
            helpUrlClass.addConstructor(urlConstruct);
            CtMethod ctMethod=new CtMethod(CtClass.voidType,"actionPerformed",new CtClass[]{classPool.get("java.awt.event.ActionEvent")}, helpUrlClass);
            ctMethod.setModifiers(Modifier.PUBLIC);
            ctMethod.setBody("{com.xk72.util.k.a(\"https://github.com/cuiqingandroid/CharlesZH\");}");
            helpUrlClass.addMethod(ctMethod);
            helpUrlClass.writeFile(savePath);
            helpUrlClass.detach();
        }
        CtClass ctClass = classPool.get("com.xk72.charles.gui.menus.HelpMenu");
        CtConstructor ctConstructor = ctClass.getConstructors()[0];
        ctConstructor.insertAfter("{" +
                "add(new com.xk72.charles.gui.menus.HelpMenuUrl(\"翻译支持\"));"+
                "}");
        ctClass.writeFile(savePath);
        ctClass.detach();
    }

}
