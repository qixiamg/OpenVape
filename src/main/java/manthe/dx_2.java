/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.dj_0;
import manthe.dl_1;
import manthe.ds_2;
import manthe.ex_0;
import manthe.fP;
import manthe.g1;
import manthe.gS;
import manthe.hO;

/*
 * Renamed from manthe.dx
 */
public class dx_2
extends cy_0 {
    public dx_2(Object object) {
        super(object);
    }

    public static int a(dx_2 dx_22) {
        return dx_2.a.M().a.b(dx_22.a());
    }

    public static dx_2 a(String string) {
        Object object = dx_2.a.M().a.a(string);
        if (object == null) {
            return null;
        }
        return new dx_2(object);
    }

    public int g() {
        return hO.c(dx_2.a.M().a, this.b);
    }

    public dj_0 h() {
        if (V.c() >= 23) {
            return new dj_0(hO.a(dx_2.a.M().a, this.b, null));
        }
        return new dj_0(hO.a(dx_2.a.M().a, this.b));
    }

    public void a(gS gS2, int n6, int n10, int n11, ex_0 ex_02) {
        hO.a(dx_2.a.M().a, this.b, gS2.a(), n6, n10, n11, ex_02.a());
    }

    public void a(gS gS2, ex_0 ex_02) {
        hO.b(dx_2.a.M().a, this.b, gS2.a(), ex_02.a());
    }

    public void a(gS gS2, g1 g12, ex_0 ex_02) {
        if (V.c() >= 23) {
            return;
        }
        hO.a(dx_2.a.M().a, this.b, gS2.a(), g12.a(), ex_02.a());
    }

    public fP a(gS gS2, int n6, int n10, int n11) {
        if (V.c() >= 23) {
            return null;
        }
        return new fP(hO.b(dx_2.a.M().a, this.b, gS2.a(), n6, n10, n11));
    }

    public Boolean a(dl_1 dl_12, boolean bl) {
        return dx_2.a.M().a.a(this.b, (Object)dl_12, bl);
    }

    public boolean a(int n6, boolean bl) {
        return hO.a(dx_2.a.M().a, this.b, n6, bl);
    }

    public int a(int n6, int n10, int n11) {
        if (V.c() == 13) {
            return hO.a(dx_2.a.M().a, this.b, ds_2.t().a(), n6, n10, n11);
        }
        if (V.c() == 15) {
            return hO.a(dx_2.a.M().a, this.b, ds_2.t().a(), g1.a(n6, n10, n11).a());
        }
        if (V.c() == 23) {
            return hO.b(dx_2.a.M().a, this.b, ds_2.t().a(g1.a(n6, n10, n11)).a());
        }
        return 0;
    }

    public float f() {
        return hO.b(dx_2.a.M().a, this.b);
    }

    public boolean a(dl_1 dl_12) {
        if (V.c() >= 23) {
            return dx_2.a.M().a.a(this.b, dl_12.a());
        }
        return dx_2.a.M().a.e(this.b);
    }

    public boolean b(dl_1 dl_12) {
        if (V.c() >= 23) {
            return dx_2.a.M().a.b(this.b, dl_12.a());
        }
        return dx_2.a.M().a.a(this.b);
    }
}

