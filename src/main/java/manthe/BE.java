/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class BE
implements Comparator<fG> {
    final zP a;

    BE(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(VapeSettings.c(fG2), VapeSettings.c(fG3));
    }
}

