/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

/*
 * Renamed from manthe.ns
 */
public class ns_0 {
    public static String a() {
        Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public static void a(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }
}

