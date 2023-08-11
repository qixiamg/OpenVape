/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ds_2;
import manthe.eJ;
import manthe.ex_0;
import manthe.pf_0;
import manthe.vX;
import manthe.ys_0;

class tm
implements Comparator {
    final ys_0 a;

    private tm(ys_0 ys_02) {
        this.a = ys_02;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds_2.k();
        return Integer.compare(pf_0.b(eJ2, (ex_0)object), pf_0.b(eJ2, (ex_0)object2));
    }

    tm(ys_0 ys_02, vX vX2) {
        this(ys_02);
    }
}

