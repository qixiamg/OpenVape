/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cv_0;
import manthe.dl_1;
import manthe.dx_2;
import manthe.e7;
import manthe.ex_0;
import manthe.gB;

/*
 * Renamed from manthe.cp
 */
public class cp_1
extends cv_0 {
    public cp_1(Object object) {
        super(object);
    }

    public e7 h() {
        return new e7(gB.c(cp_1.a.M().aa, this.b));
    }

    public ex_0 g() {
        return new ex_0(gB.a(cp_1.a.M().aa, this.b));
    }

    public dx_2 j() {
        if (V.c() >= 23) {
            return new dl_1(gB.b(cp_1.a.M().aa, this.b)).f();
        }
        return new dx_2(gB.b(cp_1.a.M().aa, this.b));
    }

    public double i() {
        return gB.d(cp_1.a.M().aa, this.b);
    }
}

