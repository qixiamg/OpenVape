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
import manthe.fE;
import manthe.fX;
import manthe.uq;
import manthe.z3;

/*
 * Renamed from manthe.De
 */
class de_0
implements Comparator {
    final z3 a;

    private de_0(z3 z32) {
        this.a = z32;
    }

    private float a(ex_0 ex_02) {
        float f10 = 0.0f;
        eC eC2 = new eC(ex_02.a());
        if (eC2.aG().d()) {
            fE fE2;
            f10 += an_0.b(eC2.aG());
            if (eC2.a(fX.o()) && (fE2 = eC2.b(fX.o())).f() > 0) {
                f10 = (float)((double)f10 * (1.375 * (double)fE2.h()));
            }
        }
        return f10;
    }

    public int compare(Object object, Object object2) {
        ex_0 ex_02 = (ex_0)object;
        ex_0 ex_03 = (ex_0)object2;
        if (ex_02.a(A5.cc) && ex_03.a(A5.cc)) {
            return Float.compare(this.a((ex_0)object), this.a((ex_0)object2));
        }
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a(ex_02), eJ2.a(ex_03));
    }

    de_0(z3 z32, uq uq2) {
        this(z32);
    }
}

