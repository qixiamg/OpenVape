/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.A5;
import manthe.ds_2;
import manthe.eJ;
import manthe.ej_0;
import manthe.ex_0;
import manthe.me_0;
import manthe.zO;

class CM
implements Comparator<ex_0> {
    final zO a;

    private CM(zO zO2) {
        this.a = zO2;
    }

    private double a(ex_0 ex_02) {
        eJ eJ2 = ds_2.k();
        double d3 = eJ2.a(ex_02);
        if (this.a.u.u().booleanValue() && ex_02.a(A5.cF)) {
            ej_0 ej_02 = new ej_0(ex_02.a());
            float f10 = ej_02.aD();
            d3 += (double)((Float.isNaN(f10) ? 0.0f : f10) / 10.0f);
            if (ej_02.aN() > 4) {
                d3 += (double)ej_02.aN();
            }
        }
        return d3;
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        return Double.compare(this.a(ex_02), this.a(ex_03));
    }

    CM(zO zO2, me_0 me_02) {
        this(zO2);
    }
}

