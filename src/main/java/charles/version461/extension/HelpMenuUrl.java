package charles.version461.extension;

import com.xk72.util.dqlb;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HelpMenuUrl extends AbstractAction {
    String url;
    HelpMenuUrl(String name, String url) {
        super(name);
        this.url = url;
    }

    public void actionPerformed(ActionEvent var1) {
        dqlb.XdKP(this.url);
    }
}