/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.ColorValue;

import java.awt.Color;

public class xC
extends wM {
    private boolean E = true;
    private ColorValue A;
    private xu_0 C;
    private xq_0 B;
    private xq_0 F;
    private xq_0 z;
    private wV D = new wV("", 0.3);

    public xC(ColorValue dE) {
        this.A = dE;
        this.a(dE);
        this.C = new xu_0("GUI Theme", dE, new Color[]{new Color(250, 50, 56), new Color(242, 99, 33), new Color(252, 179, 22), xC.b.i, new Color(47, 122, 229), new Color(126, 84, 217), new Color(232, 96, 152)});
        this.B = new xq_0(this.C);
        this.F = new xq_0(sp.SATURATION, dE);
        this.z = new xq_0(sp.VIBRANCE, dE);
        this.C.a(this.I());
        this.B.a(xC.b.u);
        this.F.a(xC.b.u);
        this.z.a(xC.b.u);
        this.C.a((xn_0)null);
        this.B.a("Double click for rainbow");
        this.F.a((xn_0)null);
        this.z.a((xn_0)null);
        this.D.c(new uH(this));
        this.a(this.D, this.C, this.B, this.F, this.z);
    }

    @Override
    public void a() {
        this.C.c(this.d());
        this.C.a(this.c());
        this.D.c(this.d() + this.C.N() + 5.0);
        this.D.a(this.c() + 2.5);
        this.D.d(this.C.f() / 2.0);
        this.D.b(this.E ? "downexpand" : "upcollapse");
        k9.a((Color)this.A.K(), (float)(this.d() + this.e() - 5.0 - 6.0), (float)this.c() + 5.0f, "colorpreview", 6.0f, 6.0f, false);
        if (this.E) {
            this.B.a(false);
            this.F.a(false);
            this.z.a(false);
        } else {
            float f10 = 7.0f;
            double d3 = this.C.Y().a() - (double)(f10 / 2.0f);
            double d4 = this.c() + this.C.f() + 2.5 + 3.0;
            double d5 = d3 + (double)f10;
            double d6 = d4 - 3.0;
            double d7 = d3 + (double)(f10 * 2.0f);
            double d8 = d4;
            pe_0.a(d3, d4, d5, d6, d7, d8, xC.b.u);
            this.B.a(true);
            this.B.c(this.d());
            this.B.a(this.c() + 20.0 + 5.0);
            this.F.a(true);
            this.F.c(this.d());
            this.F.a(this.c() + 40.0 + 10.0);
            this.z.a(true);
            this.z.c(this.d());
            this.z.a(this.c() + 60.0 + 15.0);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.C.f(false);
        this.C.M();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.E ? 25.0 : 100.0;
    }

    public void l() {
        this.C.L();
    }

    static boolean a(xC xC2, boolean bl) {
        xC2.E = bl;
        return xC2.E;
    }

    static boolean a(xC xC2) {
        return xC2.E;
    }
}

