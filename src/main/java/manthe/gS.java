/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.V;
import manthe.cy_0;
import manthe.dl_1;
import manthe.dx_2;
import manthe.ex_0;
import manthe.fP;
import manthe.g1;
import manthe.gK;
import manthe.gZ;
import manthe.gb_0;
import manthe.gi_0;
import manthe.gn_0;
import manthe.kI;

public class gS
extends cy_0 {
    public gS(Object object) {
        super(object);
    }

    public boolean c(g1 g12) {
        return gS.a.M().s.e(this.b, g12.a());
    }

    public List k() {
        return gS.a.M().s.b(this.b);
    }

    public List j() {
        return gS.a.M().s.c(this.b);
    }

    public List h() {
        return gS.a.M().s.d(this.b);
    }

    public List a(ex_0 ex_02, fP fP2) {
        return gS.a.M().s.a(this.b, ex_02.a(), fP2.a());
    }

    public dx_2 a(double d3, double d4, double d5) {
        if (V.c() == 13) {
            return new dx_2(gS.a.M().s.c(this.b, (int)d3, (int)d4, (int)d5));
        }
        g1 g12 = g1.a(d3, d4, d5);
        dl_1 dl_12 = new dl_1(gS.a.M().s.a(this.b, g12.a()));
        return dl_12.f();
    }

    public dx_2 b(int n6, int n10, int n11) {
        if (V.c() == 13) {
            return new dx_2(gS.a.M().s.c(this.b, n6, n10, n11));
        }
        g1 g12 = g1.a(n6, n10, n11);
        dl_1 dl_12 = new dl_1(gS.a.M().s.a(this.b, g12.a()));
        return dl_12.f();
    }

    public List b(ex_0 ex_02, fP fP2) {
        return gS.a.M().s.c(this.b, ex_02.a(), fP2.a());
    }

    public boolean a(fP fP2) {
        return kI.b(gS.a.M().s, this.b, fP2.a());
    }

    public dl_1 a(g1 g12) {
        return new dl_1(gS.a.M().s.a(this.b, g12.a()));
    }

    public boolean b(fP fP2) {
        return kI.a(gS.a.M().s, this.b, fP2.a());
    }

    public void a(ex_0 ex_02) {
        kI.c(gS.a.M().s, this.b, ex_02.a());
    }

    public gZ g() {
        return new gZ(kI.a(gS.a.M().s, this.b));
    }

    public gb_0 a(gK gK2, gK gK3, boolean bl, boolean bl2, boolean bl3) {
        return new gb_0(gS.a.M().s.a(this.b, gK2.a(), gK3.a(), bl, bl2, bl3));
    }

    public boolean b(int n6, int n10, int n11, int n12, int n13, int n14) {
        if (V.c() == 13) {
            return kI.a(gS.a.M().s, this.b, n6, n10, n11, n12, n13, n14);
        }
        return kI.a(gS.a.M().s, this.b, g1.a(n6, n10, n11), g1.a(n12, n13, n14));
    }

    public gn_0 a(int n6, int n10) {
        return new gn_0(kI.a(gS.a.M().s, this.b, n6, n10));
    }

    public gn_0 b(g1 g12) {
        return new gn_0(gS.a.M().s.c(this.b, g12.a()));
    }

    public gn_0 b(int n6, int n10) {
        return new gn_0(gS.a.M().s.b(this.b, n6, n10));
    }

    public gi_0 f() {
        return new gi_0(gS.a.M().s.e(this.b));
    }

    public int c(int n6, int n10, int n11) {
        return kI.a(gS.a.M().s, this.b, n6, n10, n11);
    }

    public boolean a(int n6, int n10, int n11) {
        return kI.b(gS.a.M().s, this.b, n6, n10, n11);
    }

    public ex_0 a(int n6) {
        return new ex_0(kI.a(gS.a.M().s, this.b, n6));
    }

    public boolean i() {
        return kI.b(gS.a.M().s, this.b);
    }

    public void a(int n6, int n10, int n11, int n12, int n13, int n14) {
        kI.b(gS.a.M().s, this.b, n6, n10, n11, n12, n13, n14);
    }
}

