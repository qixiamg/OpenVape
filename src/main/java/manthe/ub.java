/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.A5;
import manthe.an_0;
import manthe.ds_2;
import manthe.eC;
import manthe.eJ;
import manthe.ex_0;
import manthe.fG;
import manthe.uq;
import manthe.z3;

class ub
implements Comparator {
    final z3 a;

    private ub(z3 z32) {
        this.a = z32;
    }

    private double a(ex_0 ex_02) {
        double d3 = 0.0;
        for (Object object : new eC(ex_02.a()).aU().g()) {
            fG fG2 = new fG(object);
            d3 += an_0.a(fG2);
        }
        return d3;
    }

    public int compare(Object object, Object object2) {
        ex_0 ex_02 = (ex_0)object;
        ex_0 ex_03 = (ex_0)object2;
        if (ex_02.a(A5.cc) && ex_03.a(A5.cc)) {
            return Double.compare(this.a(ex_02), this.a(ex_03));
        }
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a(ex_02), eJ2.a(ex_03));
    }

    ub(z3 z32, uq uq2) {
        this(z32);
    }
}

