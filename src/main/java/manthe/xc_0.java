/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.lwjgl.input.Mouse;

/*
 * Renamed from manthe.xc
 */
public class xc_0
extends xU {
    private double U;
    private double P;
    private double S;
    private double L;
    private double O;
    private double Y;
    private double Q;
    private int X;
    private int K;
    private double N = 0.75;
    private dy_0 M;
    private xS W;
    private xS H;
    private i_0 G = new i_0(0.0, 0.0, 0.0);
    private i_0 T = new i_0(0.0, 0.0, 0.0);
    private i_0 F = new i_0(0.15, 8.0, 9.0);
    private i_0 I = new i_0(0.15, 8.0, 9.0);
    private double E = -1.0;
    private double R = -1.0;
    private DU V = new DU(0.0, 0.0, 0.0, 0.0);
    private DU Z = new DU(0.0, 0.0, 0.0, 0.0);
    private Color J;

    public xc_0(String string, double d3, double d4, double d5, double d6, double d7) {
        super(string);
        this.J = xc_0.b.r;
        this.U = d3;
        this.P = d4;
        this.O = d5;
        this.Y = (d4 - d3) / 100.0;
        this.Q = (double)(string.split("\n").length - 1) * this.s().a(string) + 5.0;
        if (d6 == 1.0 && d7 == 1.0) {
            this.J();
        } else {
            this.S = d6;
            this.L = d7;
        }
        this.W = new xS(this, DC.MINIMUM);
        this.H = new xS(this, DC.MAXIMUM);
        this.a(this.W, this.H);
    }

    public xc_0(String string, double d3, double d4, double d5) {
        this(string, d3, d4, d5, 1.0, 1.0);
    }

    public xc_0(dy_0 dy_02) {
        this(dy_02.H(), ((sk_0)dy_02.getDefaultValue()).E(), ((sk_0)dy_02.getDefaultValue()).W(), ((sk_0)dy_02.getDefaultValue()).X(), dy_02.s(), dy_02.w());
        this.M = dy_02;
        this.a(dy_02);
        dy_02.getRuntimeCopyException(new BF(this));
        this.Q();
    }

    private void J() {
        double d3;
        double d4 = (this.P + this.U) / 2.0;
        this.S = d4 - this.U;
        this.L = d4 + this.U;
        double d5 = this.S % this.O;
        if (d5 != 0.0) {
            this.S -= d5;
        }
        if ((d3 = this.L % this.O) != 0.0) {
            this.L -= d3;
        }
    }

    @Override
    public void a() {
        double d3;
        this.L();
        this.o();
        mq mq2 = this.e(this.N);
        double d4 = mq2.a(this.n());
        double d5 = this.c() + 12.5 + (double)((float)d4);
        double d6 = this.c() + 5.0;
        double d7 = this.c() + 5.0;
        for (String string : this.n().split("\n")) {
            mq2.a(string, this.d() + 5.0, d7, this.J);
            d7 += mq2.a(string) + 3.0;
        }
        double d8 = (double)(this.n().split("\n").length - 1) * (mq2.a(this.n()) + 3.0);
        d5 += d8;
        this.H.c(this.d() + this.e() - 5.0 - this.H.e());
        this.H.a(d6 += d8);
        k9.a(xc_0.b.t, (float)(this.d() + this.e() - 10.0 - this.H.e() - 8.0), (float)d6, "newrangeindicator", 0.1f, false);
        this.W.c(this.d() + this.e() - 15.0 - this.W.e() - this.H.e() - 8.0);
        this.W.a(d6);
        this.V = this.a(this.d() + this.G.o(), d5 + 0.5, this.F.o() / 2.0);
        this.Z = this.a(this.d() + this.T.o(), d5 + 0.5, this.I.o() / 2.0);
        this.V.c(this.V.d() / 2.0);
        this.Z.c(this.Z.d() / 2.0);
        this.Z.a(this.Z.a() + this.Z.d());
        double d10 = this.V.a() - this.d() - 5.0;
        double d11 = this.Z.a() - this.V.a();
        double d12 = this.d() + this.e() - this.Z.a() - 5.0;
        if (d10 > 0.0) {
            pe_0.a(this.d() + 5.0, d5 + 0.5, d10 - 1.5, 0.5, xc_0.b.y, false, 0.5f, 1.0f);
        }
        if (d11 > 0.0) {
            d3 = (this.F.o() - this.F.p()) / 2.0;
            pe_0.a(this.V.a() + 6.0 + d3, d5 + 0.5, d11 - 1.5 - 6.0 - d3, 0.5, b.e(), false, 0.5f, 1.0f);
        }
        if (d12 > 0.0) {
            d3 = (this.I.o() - this.I.p()) / 2.0;
            pe_0.a(this.Z.a() + 6.0 + d3, d5 + 0.5, d12 - 6.0 - d3, 0.5, xc_0.b.y, false, 0.5f, 1.0f);
        }
        pe_0.a("rangemin", this.V.a() + this.V.d(), d5 + 0.5, (double)this.F.o(), this.F.o(), b.e());
        pe_0.a("rangemax", this.Z.a() + this.Z.d(), d5 + 0.5, (double)this.I.o(), this.I.o(), b.e());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        switch (this.K) {
            case 1: {
                bo_0 bo_02 = o7.b();
                if (this.V.a(bo_02)) break;
                this.K = 0;
                this.F.c();
                break;
            }
            case 2: {
                bo_0 bo_03 = o7.b();
                if (this.Z.a(bo_03)) break;
                this.K = 0;
                this.I.c();
            }
        }
    }

    @Override
    public void a(uW uW2) {
        double d3 = this.Z.a() - this.V.a();
        double d4 = this.V.a() - this.d() + d3 / 2.0;
        DU dU = new DU(this.d(), this.V.b(), d4, this.V.c());
        DU dU2 = new DU(this.Z.a() - d3 / 2.0, this.Z.b(), this.e() - d4, this.Z.c());
        if (dU.b(uW2.a(), uW2.b())) {
            this.X = 1;
        } else if (dU2.b(uW2.a(), uW2.b())) {
            this.X = 2;
        }
        if (this.X != 0) {
            this.A = o7.b();
        }
    }

    private void Q() {
        float f10 = (float)this.F.n();
        double d3 = this.e() - 10.0;
        double d4 = (this.M.s() - this.U) / (this.P - this.U);
        double d5 = 1.0 - (this.M.w() - this.U) / (this.P - this.U);
        if (d4 > 1.0) {
            d4 = 1.0;
        } else if (d4 < 0.0) {
            d4 = 0.0;
        }
        if (d5 > 1.0) {
            d5 = 1.0;
        } else if (d5 < 0.0) {
            d5 = 0.0;
        }
        double d6 = 1.0 - (d4 + d5);
        double d7 = d4 * (d3 - (double)f10 - 5.0) + 5.0 + (double)(f10 / 2.0f);
        double d8 = d7 + 5.0 + d6 * (d3 - (double)f10 - 5.0);
        double d10 = this.G.o();
        double d11 = this.T.o();
        this.G = new i_0(0.05, d10, d7);
        this.G.g();
        this.T = new i_0(0.05, d11, d8);
        this.T.g();
    }

    private void L() {
        if (this.X != 0) {
            if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
                this.X = 0;
                return;
            }
            double d3 = this.e() - 15.0 - this.V.d() - this.Z.d();
            double d4 = (double)this.A.a - this.d() + this.m() - 5.0;
            if (this.X == 2) {
                d4 -= 12.0;
            }
            double d5 = this.a(this.U, d3, this.O, this.Y, d4);
            d5 = new BigDecimal("" + d5).setScale(1, RoundingMode.HALF_UP).doubleValue();
            if (this.X == 1) {
                if (d5 == this.E) {
                    return;
                }
                ((sk_0)this.M.getDefaultValue()).h(d5);
            } else {
                if (d5 == this.R) {
                    return;
                }
                ((sk_0)this.M.getDefaultValue()).f(d5);
            }
            this.E = this.M.s();
            this.R = this.M.w();
        }
    }

    @Override
    public void i() {
        bo_0 bo_02 = o7.b();
        if (this.V.a(bo_02) && this.K != 1) {
            if (this.K == 2) {
                this.I.c();
            }
            this.K = 1;
            this.F.c();
        } else if (this.Z.a(bo_02) && this.K != 2) {
            if (this.K == 1) {
                this.F.c();
            }
            this.K = 2;
            this.I.c();
        }
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0 + this.Q;
    }

    public double O() {
        return this.O;
    }

    public double M() {
        return this.U;
    }

    public double P() {
        return this.P;
    }

    public double N() {
        return this.L;
    }

    public double R() {
        return this.S;
    }

    public dy_0 K() {
        return this.M;
    }

    public void g(double d3) {
        this.O = d3;
    }

    public void f(double d3) {
        this.U = d3;
    }

    public void i(double d3) {
        this.P = d3;
    }

    public void j(double d3) {
        this.L = d3;
    }

    public void h(double d3) {
        this.S = d3;
    }

    static void a(xc_0 xc_02) {
        xc_02.Q();
    }
}

