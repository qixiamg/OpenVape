/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.eC;
import manthe.eJ;
import manthe.xs_0;

class AR
implements Comparator<eC> {
    final eJ b;
    final xs_0 a;

    AR(xs_0 xs_02, eJ eJ2) {
        this.a = xs_02;
        this.b = eJ2;
    }

    public int a(eC eC2, eC eC3) {
        return (int)eC2.a(this.b) - (int)eC3.a(this.b);
    }
}

