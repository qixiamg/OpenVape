/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.cb_0;
import manthe.fG;
import manthe.zP;

class AW
implements Comparator<fG> {
    final zP a;

    AW(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(cb_0.a(fG2), cb_0.a(fG3));
    }
}
