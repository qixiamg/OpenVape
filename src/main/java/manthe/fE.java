/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.fX;
import manthe.ju_0;

public class fE
extends cy_0 {
    public fE(Object object) {
        super(object);
    }

    public static fE a(int n6, int n10, int n11) {
        if (V.c() >= 23) {
            return fE.a(fX.a(n6), n10, n11);
        }
        return new fE(ju_0.a(fE.a.M().bH, n6, n10, n11));
    }

    public static fE a(fX fX2, int n6, int n10) {
        return new fE(fE.a.M().bH.a(fX2.a(), n6, n10));
    }

    public int h() {
        return ju_0.c(fE.a.M().bH, this.b);
    }

    public int g() {
        if (V.c() >= 23) {
            return new fX(ju_0.d(fE.a.M().bH, this.b)).g();
        }
        return ju_0.a(fE.a.M().bH, this.b);
    }

    public int f() {
        return ju_0.b(fE.a.M().bH, this.b);
    }
}

