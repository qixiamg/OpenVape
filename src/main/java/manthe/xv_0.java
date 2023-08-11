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
import manthe.ej_0;
import manthe.ex_0;
import manthe.fE;
import manthe.fX;
import manthe.me_0;
import manthe.zO;

/*
 * Renamed from manthe.xv
 */
class xv_0
implements Comparator<ex_0> {
    final zO a;

    private xv_0(zO zO2) {
        this.a = zO2;
    }

    private float a(ex_0 ex_02) {
        float f10 = 0.0f;
        eC eC2 = new eC(ex_02.a());
        if (this.a.u.u().booleanValue()) {
            float f11 = new ej_0(ex_02.a()).aD();
            f10 += (Float.isNaN(f11) ? 0.0f : f11) / 5.0f;
        }
        if (eC2.aG().d()) {
            fE fE2;
            f10 += an_0.b(eC2.aG());
            if (eC2.a(fX.o()) && (fE2 = eC2.b(fX.o())).f() > 0) {
                f10 = (float)((double)f10 * (1.375 * (double)fE2.h()));
            }
        }
        return f10;
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        if (ex_02.a(A5.cc) && ex_03.a(A5.cc)) {
            return Float.compare(this.a(ex_02), this.a(ex_03));
        }
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a(ex_02), eJ2.a(ex_03));
    }

    xv_0(zO zO2, me_0 me_02) {
        this(zO2);
    }
}

