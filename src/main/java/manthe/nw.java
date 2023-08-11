/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.cb_0;
import manthe.fQ;
import manthe.zY;

class nw
implements Comparator<fQ> {
    final zY a;

    nw(zY zY2) {
        this.a = zY2;
    }

    public int a(fQ fQ2, fQ fQ3) {
        return Double.compare(cb_0.b(fQ2.f()), cb_0.b(fQ3.f()));
    }
}

