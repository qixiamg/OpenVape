/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class nw
implements Comparator<fQ> {
    final zY a;

    nw(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(VapeSettings.b(fQ2.f()), VapeSettings.b(fQ3.f()));
    }
}

