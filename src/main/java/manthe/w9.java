/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Q;
import manthe.ag_0;
import manthe.kz_0;
import manthe.mq;
import manthe.n4;
import manthe.nN;
import manthe.nS;
import manthe.oM;
import manthe.pe_0;
import manthe.uW;
import manthe.w4;
import manthe.wF;
import manthe.wI;
import manthe.wK;
import manthe.wV;
import manthe.wW;
import manthe.wl_0;
import manthe.xc_0;
import manthe.ya_0;

public class w9
extends wI {
    private wF G;
    private ya_0 J;
    private ya_0 D;
    private boolean K;
    private wK L;
    private xc_0 I;
    private xc_0 H;
    private wl_0 M;
    private wl_0 F;
    private wW N;
    private wV O;
    private w4 E;

    public w9(wF wF2, ya_0 ya_02) {
        this.M = new wl_0("Update", 0.7, w9.b.i);
        this.F = new wl_0("Cancel", 0.7, w9.b.i);
        this.N = new wW("newtrash", 0.8, w9.b.j);
        this.O = new wV("settingdots");
        this.G = wF2;
        this.J = ya_02;
        this.E = new w4(ya_02);
        w9 w92 = this;
        this.O.c(new nN(this, wF2, w92, ya_02));
        this.I = new xc_0(ya_02.m());
        this.H = new xc_0(ya_02.k());
        this.L = new wK(ya_02.q());
        this.L.c(new kz_0(this, wF2));
        this.N.c(new n4(this, ya_02, wF2));
        this.F.c(new ag_0(this, ya_02));
        this.M.c(new Q(this, wF2));
        this.L.a(false);
        this.L.c(true);
        this.L.a(w9.b.m);
        this.I.a(false);
        this.I.c(true);
        this.I.a(w9.b.m);
        this.H.a(false);
        this.H.c(true);
        this.H.a(w9.b.m);
        this.F.a(false);
        this.F.a(w9.b.m);
        this.M.a(false);
        this.M.a(w9.b.m);
        this.N.a(false);
        this.N.a(w9.b.m);
        this.a(this.O, this.E, this.L, this.I, this.H, this.F, this.M, this.N);
    }

    @Override
    public void a(uW uW2) {
        if (this.G.ak() != null && this.G.ak().equals(this) && !this.q().b(uW2.a(), uW2.b())) {
            if (this.O == null) {
                this.G.a((w9)null);
                return;
            }
            this.O.J();
            return;
        }
        super.a(uW2);
    }

    @Override
    public void a() {
        double d3;
        mq mq2 = this.e(0.9);
        double d4 = mq2.a(this.J.l());
        double d5 = this.c() + 9.0 - d4 / 2.0;
        double d6 = this.c() + 9.0;
        double d7 = this.d() + 10.0;
        if (this.K) {
            pe_0.a(this.d() + 5.0 - 0.5, this.c() + 0.5, this.e() - 10.0 + 1.0, this.f() - 1.0, w9.b.y);
        }
        pe_0.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, w9.b.m);
        if (this.K) {
            d3 = this.d() + 5.0;
            double d8 = this.c() + 20.0;
            double d10 = this.e() - 10.0;
            this.I.c(d3);
            this.I.a(d8);
            this.I.b(d10);
            this.L.c(d3);
            this.L.a(d8 += this.I.f());
            this.L.b(d10);
            d8 += this.L.f();
            if (this.L.O().u().booleanValue()) {
                this.H.a(true);
                this.H.c(d3);
                this.H.a(d8);
                this.H.b(d10);
                d8 += this.H.f();
            } else {
                this.H.a(false);
                d8 += 5.0;
            }
            double d11 = (this.e() - 25.0) / 5.0;
            double d12 = this.d() + 10.0;
            if (this.N != null) {
                this.N.c(d12);
                this.N.a(d8);
                this.N.d(18.0);
                this.N.b(d11);
            }
            this.F.c(d12 += d11 + 2.5);
            this.F.a(d8);
            this.F.d(18.0);
            this.F.b(d11 * 2.0);
            this.M.c(d12 += d11 * 2.0 + 2.5);
            this.M.a(d8);
            this.M.d(18.0);
            this.M.b(d11 * 2.0);
        }
        d3 = this.d() + this.e() - 15.0;
        mq2.a(this.J.l(), d7, d5, w9.b.r);
        if (this.O != null) {
            this.O.d(this.K ? w9.b.a : null);
            this.O.c(d3);
            this.O.a(this.c());
            this.O.d(18.0);
            d3 -= 5.0;
        }
        if (!this.K) {
            this.E.c(d3 -= this.E.e());
            this.E.a(this.c() + 4.0);
            pe_0.a("newclock", d3 -= 9.0, d6, 8.0, 8.0, w9.b.t);
        }
    }

    public void O() {
        this.O.J();
        this.N = null;
        this.O = null;
        this.F = new wl_0("Cancel", 0.7, w9.b.j);
        this.M = new wl_0("Add", 0.7, w9.b.i);
        this.F.a(w9.b.m);
        this.M.a(w9.b.m);
        this.F.c(new oM(this));
        this.M.c(new nS(this));
        this.a(this.F, this.M);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.K ? (this.L.O().u().booleanValue() ? 120.0 : 90.0) : 18.0;
    }

    public ya_0 N() {
        return this.J;
    }

    static boolean a(w9 w92, boolean bl) {
        w92.K = bl;
        return w92.K;
    }

    static boolean i(w9 w92) {
        return w92.K;
    }

    static ya_0 a(w9 w92, ya_0 ya_02) {
        w92.D = ya_02;
        return w92.D;
    }

    static wK k(w9 w92) {
        return w92.L;
    }

    static xc_0 e(w9 w92) {
        return w92.I;
    }

    static xc_0 d(w9 w92) {
        return w92.H;
    }

    static wl_0 h(w9 w92) {
        return w92.F;
    }

    static wl_0 a(w9 w92) {
        return w92.M;
    }

    static wW c(w9 w92) {
        return w92.N;
    }

    static w4 g(w9 w92) {
        return w92.E;
    }

    static ya_0 b(w9 w92) {
        return w92.D;
    }

    static wV f(w9 w92) {
        return w92.O;
    }

    static wF l(w9 w92) {
        return w92.G;
    }

    static ya_0 b(w9 w92, ya_0 ya_02) {
        w92.J = ya_02;
        return w92.J;
    }

    static ya_0 j(w9 w92) {
        return w92.J;
    }
}

