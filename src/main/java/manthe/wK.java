/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;

public class wK
extends wI {
    protected String I;
    protected double E;
    private boolean H;
    private float O = 6.0f;
    private float D = 6.0f;
    private float R = 4.0f;
    private float K = 1.0f;
    private g_0 P;
    private h_0 Q;
    private i_0 G;
    protected Color L;
    protected Color M;
    private Color N;
    private boolean J;
    private BooleanValue F;

    public wK(String string, double d3) {
        this.P = new g_0(0.15, wK.b.t, wK.b.o);
        this.Q = new h_0(0.15, wK.b.o);
        this.G = new i_0(0.15, 0.0, this.O - this.K);
        this.L = wK.b.r;
        this.M = wK.b.s;
        this.N = wK.b.u;
        this.J = false;
        this.I = string;
        this.E = d3;
        this.c(new ux_0(this));
    }

    public wK(String string) {
        this(string, 0.9);
    }

    public wK(BooleanValue dB) {
        this(((qD)dB.getDefaultValue()).z().E());
        this.F = dB;
        this.a(dB);
    }

    @Override
    public void a() {
        Color color;
        this.o();
        double d3 = this.d() + this.e() - 10.0 - (double)this.O;
        if (this.g() != this.e()) {
            d3 = this.d() + this.e() - (double)(this.O * 2.0f);
        }
        double d4 = this.c() + this.f() / 2.0 - (double)(this.D / 2.0f);
        Color color2 = color = this.Q.l() > 0.0 ? this.Q.q() : this.P.q();
        if (this.H && this.J && this.Q.l() > 0.0) {
            color = yI.a(color, 30.0);
        }
        this.R();
        if (this.F != null && this.F.w()) {
            k9.a(color, (float)d3 - 10.0f, (float)d4, "newblatant", this.O, this.D, false);
        }
        k9.a(color, (float)d3, (float)d4, "togglebg", this.O, this.D, false);
        k9.a(this.N, (float)d3 + this.K + (float)this.G.o().doubleValue(), (float)d4 + this.K, "toggledot", this.R, this.R, false);
        if (this.D() != null && this.D() instanceof DR && ((DR)this.D()).getValues().size() > 0 && ((DR)this.D()).s() && this.F() != null) {
            k9.a(wK.b.u, (float)(this.d() + this.e() / 8.0), (float)(this.c() + this.f() - 2.0), "dropdownnotch", 7.0f, 3.0f, false);
        }
    }

    protected void R() {
        mq mq2 = this.e(this.E);
        double d3 = mq2.a(this.I);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        mq2.a(this.I, this.d() + 5.0, d4, this.F != null && this.F.w() ? this.M : this.L);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.H && !this.x()) {
            this.P.c();
            this.H = false;
        }
        this.S();
    }

    @Override
    public void i() {
        if (this.F != null && this.F.w()) {
            return;
        }
        if (!this.H) {
            this.P.c();
        }
        this.H = true;
    }

    protected void S() {
        if (this.F != null && !this.F.u().equals(this.T()) && !this.P()) {
            this.N();
        }
    }

    @Override
    public double g() {
        return 110.0;
    }

    public void N() {
        if (this.F != null && this.F.w()) {
            return;
        }
        if (this.F != null) {
            if (this.F.u().equals(this.T())) {
                this.F.setType((Boolean)(this.F.u() == false ? 1 : 0));
            }
            if (this.F.getValues().size() > 0 && this.F() != null) {
                this.F().M();
            }
        }
        this.Q.c();
        this.G.c();
    }

    public void f(boolean bl) {
        if (this.F != null) {
            this.F.setType((Boolean)bl);
            if (this.F.getValues().size() > 0 && this.F() != null) {
                this.F().M();
            }
        }
        if (bl) {
            this.Q.g();
            this.G.g();
        } else {
            this.Q.b();
            this.G.b();
        }
    }

    public boolean T() {
        return this.G.k();
    }

    public boolean P() {
        return !this.G.o().equals(this.G.p()) && !this.G.o().equals(this.G.n());
    }

    public i_0 U() {
        return this.G;
    }

    @Override
    public double h() {
        return 15.0;
    }

    public String Q() {
        return this.I;
    }

    public BooleanValue O() {
        return this.F;
    }

    public void g(boolean bl) {
        this.J = bl;
    }

    static BooleanValue a(wK wK2) {
        return wK2.F;
    }
}

