/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;

class Ab
implements Comparator<fQ> {
    final zY a;

    Ab(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(VapeSettings.c(fQ2.f()), VapeSettings.c(fQ3.f()));
    }
}

