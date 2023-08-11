/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import manthe.V;
import manthe.cy_0;
import manthe.ej_0;
import manthe.jU;

public class fX
extends cy_0 {
    public fX(Object object) {
        super(object);
    }

    public static fX q() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 1));
        }
        return new fX(jU.f(fX.a.M().ad));
    }

    public static fX h() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 2));
        }
        return new fX(jU.g(fX.a.M().ad));
    }

    public static fX o() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 5));
        }
        return new fX(fX.a.M().ad.d());
    }

    public static fX m() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 6));
        }
        return new fX(jU.h(fX.a.M().ad));
    }

    public static fX f() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 10));
        }
        return new fX(jU.a(fX.a.M().ad));
    }

    public static fX l() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 11));
        }
        return new fX(jU.i(fX.a.M().ad));
    }

    public static fX n() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 12));
        }
        return new fX(jU.e(fX.a.M().ad));
    }

    public static fX k() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 8));
        }
        return new fX(jU.c(fX.a.M().ad));
    }

    public static fX a(int n6) {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, n6));
        }
        return fX.i()[n6];
    }

    public static fX s() {
        if (V.c() >= 23) {
            return new fX(jU.a(fX.a.M().ad, 15));
        }
        return new fX(jU.j(fX.a.M().ad));
    }

    public static fX[] i() {
        if (V.c() >= 23) {
            Iterable iterable = (Iterable)jU.b(fX.a.M().ad);
            ArrayList<fX> arrayList = new ArrayList<fX>();
            arrayList.add(null);
            for (Object t : iterable) {
                fX fX2 = new fX(t);
                arrayList.add(fX2);
            }
            return arrayList.toArray(new fX[arrayList.size()]);
        }
        Object[] objectArray = jU.d(fX.a.M().ad);
        fX[] fXArray = new fX[objectArray.length];
        for (int i = 0; i < objectArray.length; ++i) {
            fXArray[i] = new fX(objectArray[i]);
        }
        return fXArray;
    }

    public boolean p() {
        return jU.a(fX.a.M().ad, this.b);
    }

    public int j() {
        return jU.d(fX.a.M().ad, this.b);
    }

    public boolean r() {
        return jU.c(fX.a.M().ad, this.b);
    }

    public int g() {
        if (V.c() >= 23) {
            return jU.b(fX.a.M().ad, this.a());
        }
        return jU.e(fX.a.M().ad, this.b);
    }

    public void a(ej_0 ej_02, Object object, int n6) {
        jU.a(fX.a.M().ad, this.b, ej_02.a(), object, n6);
    }
}

