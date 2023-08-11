/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.ds_2;
import manthe.dx_2;
import manthe.ex_0;
import manthe.g1;
import manthe.g4;
import manthe.gK;
import manthe.gg_0;
import manthe.j0;

/*
 * Renamed from manthe.gb
 */
public class gb_0
extends cy_0 {
    public gb_0(Object object) {
        super(object);
    }

    public static gb_0 a(ex_0 ex_02, gK gK2) {
        return new gb_0(gb_0.a.M().cu.b(ex_02.a(), gK2.a()));
    }

    public static gb_0 a(g4 g42, gK gK2, gg_0 gg_02, g1 g12) {
        return new gb_0(gb_0.a.M().cu.a(g42.a(), gK2.a(), gg_02.a(), g12.a()));
    }

    public ex_0 h() {
        return new ex_0(gb_0.a.M().cu.e(this.b));
    }

    public void a(ex_0 ex_02) {
        gb_0.a.M().cu.a(this.b, ex_02.a());
    }

    public gK k() {
        return new gK(gb_0.a.M().cu.a(this.b));
    }

    public g4 g() {
        return new g4(j0.a(gb_0.a.M().cu, this.b));
    }

    public int l() {
        if (V.c() == 13) {
            return gb_0.a.M().cu.c(this.b);
        }
        g1 g12 = new g1(gb_0.a.M().cu.d(this.b));
        return g12.h();
    }

    public int m() {
        if (V.c() == 13) {
            return gb_0.a.M().cu.f(this.b);
        }
        g1 g12 = new g1(gb_0.a.M().cu.d(this.b));
        return g12.f();
    }

    public int j() {
        if (V.c() == 13) {
            return gb_0.a.M().cu.h(this.b);
        }
        g1 g12 = new g1(gb_0.a.M().cu.d(this.b));
        return g12.g();
    }

    public dx_2 i() {
        return ds_2.t().b(this.l(), this.m(), this.j());
    }

    public int f() {
        if (V.c() == 13) {
            return gb_0.a.M().cu.g(this.b);
        }
        return new gg_0(gb_0.a.M().cu.b(this.b)).h();
    }
}

