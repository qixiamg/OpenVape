/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.ColorValue;

import java.awt.Color;

public class xA
extends wM {
    private boolean F = true;
    private ColorValue D;
    private xq_0 G;
    private xq_0 B;
    private xq_0 A;
    private wV z = new wV("", 0.3);
    private DU E = new DU(0.0, 0.0, 0.0, 0.0);
    private boolean C;

    public xA(ColorValue dE) {
        this.D = dE;
        this.a(dE);
        this.G = new xq_0(sp.RAINBOW, dE);
        this.G.a((wM)this);
        this.B = new xq_0(sp.SATURATION, dE);
        this.A = new xq_0(sp.VIBRANCE, dE);
        this.G.a(Color.WHITE);
        this.B.a(xA.b.u);
        this.A.a(xA.b.u);
        this.G.a("Double click for rainbow");
        this.B.a((xn_0)null);
        this.A.a((xn_0)null);
        this.z.c(new n_(this));
        this.a(this.z, this.G, this.B, this.A);
    }

    @Override
    public void a() {
        this.o();
        this.G.c(this.d());
        this.G.a(this.c());
        this.z.c(this.d() + this.G.O() + 5.0);
        this.z.a(this.c() + 2.5 - 2.0);
        this.z.d(this.G.f() / 2.0);
        this.z.b(this.F ? "downexpand" : "upcollapse");
        k9.a((Color)this.D.K(), (float)(this.d() + this.e() - 5.0 - 6.0), (float)this.c() + 5.0f, "colorpreview", 6.0f, 6.0f, false);
        this.E = new DU(this.d() + this.e() - 10.0 - 5.0 - 6.0, this.c() + 5.0, 6.0, 6.0);
        k9.a(this.D.J() ? (this.C ? xA.b.a : xA.b.o) : (this.C ? xA.b.a : xA.b.o), (float)this.E.a(), (float)this.E.b(), "rainbow_4", (float)this.E.d(), (float)this.E.c(), false);
        k9.a(this.D.J() ? xA.b.j : (this.C ? xA.b.a : xA.b.o), (float)this.E.a(), (float)this.E.b(), "rainbow_3", (float)this.E.d(), (float)this.E.c(), false);
        k9.a(this.D.J() ? xA.b.w : (this.C ? xA.b.a : xA.b.o), (float)this.E.a(), (float)this.E.b(), "rainbow_2", (float)this.E.d(), (float)this.E.c(), false);
        k9.a(this.D.J() ? xA.b.i : (this.C ? xA.b.a : xA.b.o), (float)this.E.a(), (float)this.E.b(), "rainbow_1", (float)this.E.d(), (float)this.E.c(), false);
        if (this.F) {
            this.B.a(false);
            this.A.a(false);
        } else {
            k9.a(xA.b.u, (float)this.G.J().a() - 3.5f, (float)(this.c() + this.G.f() - 2.0), "dropdownnotch", 7.0f, 3.0f, false);
            this.B.a(true);
            this.B.c(this.d());
            this.B.a(this.c() + 20.0 + 5.0);
            this.A.a(true);
            this.A.c(this.d());
            this.A.a(this.c() + 40.0 + 10.0);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.C && !this.E.a(o7.b())) {
            this.C = false;
        }
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void b(uW uW2) {
        if (this.E.b(uW2.a(), uW2.b())) {
            this.D.d(!this.D.J());
            return;
        }
        for (wM wM2 : this.w()) {
            if (!wM2.b() || !wM2.x()) continue;
            wM2.b(uW2);
            if (wM2 instanceof xg_0) continue;
            return;
        }
    }

    @Override
    public void i() {
        bo_0 bo_02 = o7.b();
        if (this.E.a(bo_02)) {
            this.C = true;
        }
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.F ? 25.0 : 75.0;
    }

    static boolean a(xA xA2, boolean bl) {
        xA2.F = bl;
        return xA2.F;
    }

    static boolean a(xA xA2) {
        return xA2.F;
    }
}

