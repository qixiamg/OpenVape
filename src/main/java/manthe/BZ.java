/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ej_0;
import manthe.ex_0;
import manthe.uq;
import manthe.z3;

class BZ
implements Comparator<ex_0> {
    final z3 a;

    private BZ(z3 z32) {
        this.a = z32;
    }

    private float a(ex_0 ex_02) {
        ej_0 ej_02 = new ej_0(ex_02.a());
        return ej_02.aD();
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        return Float.compare(this.a(ex_02), this.a(ex_03));
    }

    BZ(z3 z32, uq uq2) {
        this(z32);
    }
}

