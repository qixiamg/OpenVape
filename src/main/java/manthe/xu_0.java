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
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.xu
 */
public class xu_0
extends xU {
    private double T = 0.0;
    private double F;
    private double E = 1.0;
    private double K;
    private double J = 0.0;
    protected i_0 U = new i_0(0.15, 7.0, 8.0);
    private double I = 0.75;
    private boolean M;
    private boolean V;
    private boolean L;
    protected DU S = new DU(0.0, 0.0, 0.0, 0.0);
    private i_0 R = new i_0(0.0, 0.0, 0.0);
    private g_0 N = new g_0(0.0, Color.BLACK, Color.BLACK);
    private Color G;
    private ColorValue P;
    protected int Q;
    private int O;
    private Color[] H;

    public xu_0(String string, ColorValue dE, Color[] colorArray) {
        super(string);
        this.G = xu_0.b.r;
        this.P = dE;
        this.a(dE);
        this.H = colorArray;
        this.F = colorArray.length;
        this.K = (this.F - this.T) / 100.0;
        this.M();
    }

    @Override
    public void a() {
        double d3;
        this.X();
        mq mq2 = this.e(this.I);
        double d4 = mq2.a(this.n());
        this.J = mq2.b(this.n());
        double d5 = this.c() + 12.5 + d4;
        double d6 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d7 = 5.0;
        double d8 = d6 / (double)this.H.length;
        double d10 = this.K() - 1.0;
        mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.G);
        if (this.L) {
            d8 = (d6 - 2.0) / (double)this.H.length;
            for (d3 = 1.0; d3 < (double)(this.H.length + 1); d3 += 1.0) {
                if (d3 - 1.0 == (double)this.h(this.R.o())) {
                    pe_0.c(this.d() + d7 - 1.0, d5, d8 + 1.0, 1.0, this.I());
                    d7 += d8 + 2.5;
                    continue;
                }
                pe_0.c(this.d() + d7, d5, d8, 1.0, this.f(d3));
                d7 += d8 + 0.5;
            }
        } else {
            for (d3 = 1.0; d3 < (double)(this.H.length + 1); d3 += 1.0) {
                pe_0.c(this.d() + d7, d5, d8, 1.0, this.f(d3));
                d7 += d8 + 0.5;
            }
        }
        d3 = 0.5;
        if (!this.U()) {
            d3 = this.P != null ? (double)this.Q / d10 : 0.0;
        }
        d6 = this.e() - 10.0 + (double)(this.L ? 2 : 0);
        double d11 = this.d() + 5.0 + d6 * d3;
        this.S = this.a(d11 += (d3 - 0.5) * -1.0 * d8, d5 + 0.5, this.U.n() / 2.0);
        this.Q();
    }

    protected void Q() {
        if (this.U()) {
            pe_0.a("newcustomtheme", this.d() + (double)this.R.o().floatValue() - 3.5, this.S.b() + this.S.c() / 2.0, this.S.d() - 2.0, this.S.c() - 2.0, Color.WHITE);
            pe_0.a("toggledot", this.d() + (double)this.R.o().floatValue(), this.S.b() + this.S.c() / 2.0, this.S.d() - 4.0, this.S.c() - 4.0, xu_0.b.k);
            return;
        }
        pe_0.a("newtheme", this.d() + (double)this.R.o().floatValue() - 3.5, this.S.b() + this.S.c() / 2.0, this.S.d() - 2.0, this.S.c() - 2.0, this.N.q());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.M && !this.x()) {
            this.U.c();
            this.M = false;
        }
        this.M();
    }

    @Override
    public void a(uW uW2) {
        DU dU = new DU(this.d(), this.S.b(), this.e(), this.S.c());
        if (dU.b(uW2.a(), uW2.b())) {
            this.f(false);
            this.P.d(false);
            this.A = o7.b();
            this.z = true;
        }
    }

    private void X() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d3 = this.e() - 10.0;
            bo_0 bo_02 = o7.b();
            double d4 = (double)bo_02.a - this.d() - 5.0;
            double d5 = this.a(this.T, d3, this.E, this.K, d4);
            d5 = new BigDecimal("" + d5).setScale(3, RoundingMode.HALF_UP).doubleValue();
            if (this.P != null) {
                this.P.b(this.f(d5 + 1.0));
                this.M();
            }
        }
    }

    public void M() {
        if (!this.U()) {
            for (int i = 0; i < this.H.length; ++i) {
                if (!this.P.createValue(this.H[i])) continue;
                this.Q = i;
                if (this.Q != this.O) {
                    this.T();
                }
                this.O = this.Q;
            }
        }
    }

    public int h(double d3) {
        double d4 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d5 = 5.0;
        double d6 = d4 / (double)this.H.length;
        for (int i = 1; i < this.H.length + 1; ++i) {
            if (d3 >= d5 && d3 <= d5 + d6 + 0.5) {
                return i - 1;
            }
            d5 += d6 + 0.5;
        }
        return 0;
    }

    @Override
    public void i() {
        if (!this.M) {
            this.U.c();
        }
        this.M = true;
    }

    public void L() {
        this.P.d(false);
        int n6 = Math.round(this.H.length / 2);
        this.P.b(this.H[n6]);
        this.Q = n6;
        this.T();
        this.f(false);
    }

    public void T() {
        double d3 = this.e() - 10.0 - (double)this.H.length * 0.5;
        double d4 = d3 / (double)this.H.length;
        double d5 = this.K() - 1.0;
        double d6 = (double)this.Q / d5;
        d3 = this.e() - 10.0 - (double)(this.L ? 2 : 0);
        double d7 = 5.0 + d3 * d6;
        double d8 = this.R.o();
        this.R = new i_0(0.15, d8, (d7 += (d6 - 0.5) * -1.0 * d4) + (this.L ? 0.5 : 0.0));
        this.R.g();
        this.N = new g_0(0.15, this.H[this.O], this.H[this.Q]);
        this.N.g();
    }

    public Color f(double d3) {
        double d4 = (this.K() - this.V()) / (double)this.H.length;
        double d5 = this.V();
        Color color = Color.BLACK;
        boolean bl = false;
        for (int i = 0; i < this.H.length; ++i) {
            double d6 = d5 + (double)i * d4;
            int n6 = i + 1;
            double d7 = d5 + (double)n6 * d4;
            if (!(d3 > d6) || !(d3 <= d7)) continue;
            color = this.H[i];
            bl = true;
            break;
        }
        if (!bl) {
            color = this.H[this.H.length - 1];
        }
        return color;
    }

    public Color[] O() {
        return this.H;
    }

    public ColorValue R() {
        return this.P;
    }

    public boolean U() {
        if (this.V) {
            return true;
        }
        for (Color color : this.H) {
            if (!this.P.createValue(color)) continue;
            return false;
        }
        this.Q = Math.round(this.H.length / 2);
        this.T();
        this.O = this.Q;
        this.V = true;
        return true;
    }

    public void a(int n6) {
        Color color = this.H[n6];
        this.P.b(color);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.V = false;
    }

    public void f(boolean bl) {
        this.V = bl;
    }

    public double N() {
        return this.J;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public double K() {
        return this.F;
    }

    public double V() {
        return this.T;
    }

    public double S() {
        return this.E;
    }

    public int W() {
        return this.Q;
    }

    public DU Y() {
        return this.S;
    }

    public i_0 J() {
        return this.R;
    }

    public g_0 P() {
        return this.N;
    }

    public void g(double d3) {
        this.F = d3;
    }

    public void j(double d3) {
        this.T = d3;
    }

    public void i(double d3) {
        this.E = d3;
    }

    public void g(boolean bl) {
        this.L = bl;
    }
}

