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
import manthe.fG;
import manthe.me_0;
import manthe.zO;

class b5
implements Comparator<ex_0> {
    final zO a;

    private b5(zO zO2) {
        this.a = zO2;
    }

    private double a(ex_0 ex_02) {
        double d3 = 0.0;
        for (Object object : new eC(ex_02.a()).aU().g()) {
            fG fG2 = new fG(object);
            d3 += an_0.a(fG2);
        }
        ej_0 ej_02 = new ej_0(ex_02.a());
        float f10 = ej_02.aD();
        d3 += (double)((Float.isNaN(f10) ? 0.0f : f10) / 10.0f);
        if (ej_02.aN() > 4) {
            d3 += (double)ej_02.aN();
        }
        return d3;
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        if (ex_02.a(A5.cc) && ex_03.a(A5.cc)) {
            return Double.compare(this.a(ex_02), this.a(ex_03));
        }
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a(ex_02), eJ2.a(ex_03));
    }

    b5(zO zO2, me_0 me_02) {
        this(zO2);
    }
}

