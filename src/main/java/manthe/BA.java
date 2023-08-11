/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class BA
implements Comparator<fQ> {
    final zY a;

    BA(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(VapeSettings.a(fQ2.f()), VapeSettings.a(fQ3.f()));
    }
}

