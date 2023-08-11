/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.FileDialog;
import java.awt.Frame;
import manthe.rs_0;
import manthe.vK;

class mB
implements vK {
    final rs_0 a;

    mB(rs_0 rs_02) {
        this.a = rs_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        FileDialog fileDialog = new FileDialog((Frame)null);
        fileDialog.setFile("*.txt");
        fileDialog.setVisible(true);
        fileDialog.setMode(1);
        if (fileDialog.getFile() != null) {
            String string = fileDialog.getDirectory() + fileDialog.getFile();
            rs_0.a(this.a, string);
        }
    }
}

