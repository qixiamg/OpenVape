/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ds_2;
import manthe.eJ;
import manthe.ex_0;
import manthe.uq;
import manthe.z3;

/*
 * Renamed from manthe.np
 */
class np_0
implements Comparator {
    final z3 a;

    private np_0(z3 z32) {
        this.a = z32;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a((ex_0)object), eJ2.a((ex_0)object2));
    }

    np_0(z3 z32, uq uq2) {
        this(z32);
    }
}

