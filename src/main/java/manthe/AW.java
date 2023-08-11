/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class AW
implements Comparator<fG> {
    final zP a;

    AW(zP zP2) {
        this.a = zP2;
    }

    public int a(fG fG2, fG fG3) {
        return Double.compare(VapeSettings.a(fG2), VapeSettings.a(fG3));
    }
}

