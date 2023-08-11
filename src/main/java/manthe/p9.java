/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class p9
implements Comparator<fG> {
    final zP a;

    p9(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(VapeSettings.b(fG2), VapeSettings.b(fG3));
    }
}

