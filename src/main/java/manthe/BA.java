/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.cb_0;
import manthe.fQ;
import manthe.zY;

class BA
implements Comparator<fQ> {
    final zY a;

    BA(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(cb_0.a(fQ2.f()), cb_0.a(fQ3.f()));
    }
}

