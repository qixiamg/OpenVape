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
 * Renamed from manthe.xq
 */
public class xq_0
extends xU {
    private double Q;
    private double M;
    private double P;
    private double R;
    private double W = 0.0;
    private i_0 G = new i_0(0.0, 0.0, 0.0);
    protected i_0 N = new i_0(0.15, 7.0, 8.0);
    private double T = 0.75;
    private boolean F;
    private long H;
    private double U = -1.0;
    private DU X = new DU(0.0, 0.0, 0.0, 0.0);
    private Color I;
    private ColorValue J;
    private Double V;
    private sp L;
    private ww_0 S;
    private wM O;
    private final float E;
    private static int[] K;

    public xq_0(sp sp2, ColorValue dE, String string, double d3, double d4) {
        super(string);
        this.I = xq_0.b.r;
        this.V = -1.0;
        this.J = dE;
        this.L = sp2;
        this.M = d3;
        this.P = d4;
        this.R = (d3 - this.Q) / 100.0;
        if (sp2.equals((Object)sp.RAINBOW)) {
            this.a("Double click for rainbow");
        }
        this.E = (float)(d3 / ((sW)dE.getDefaultValue()).C());
    }

    public xq_0(sp sp2, ColorValue dE) {
        this(sp2, dE, dE.H(), ((sW)dE.getDefaultValue()).C(), 1.0);
        this.a(dE);
        dE.getRuntimeCopyException(new q2(this));
        this.Q();
    }

    public xq_0(xu_0 xu_02) {
        this(sp.BLOCK_CHILD, xu_02.R());
        this.S = new ww_0("RESET");
        this.S.c(new cn_0(this, xu_02));
        this.a(new wM[]{this.S});
    }

    @Override
    public void a() {
        double d3;
        this.M();
        if (!this.I().equals(Color.WHITE)) {
            this.o();
        }
        double d4 = 0.0;
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                d4 = this.J.x() / this.M;
                break;
            }
            case 3: {
                d4 = this.J.I().a() / this.M;
                break;
            }
            case 4: {
                d4 = this.J.z().a() / this.M;
            }
        }
        if ((d4 *= (double)this.E) != this.V) {
            this.Q();
        }
        mq mq2 = this.e(this.T);
        String string = this.L.equals((Object)sp.RAINBOW) ? this.n() : this.L.a();
        double d5 = mq2.a(string);
        this.W = mq2.b(this.n());
        double d6 = this.c() + 12.5 + d5;
        double d7 = this.e() - 10.0;
        double d8 = this.d() + this.G.o();
        if (this.L.equals((Object)sp.RAINBOW)) {
            mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.I);
        } else {
            mq2.a(this.L.a(), this.d() + 5.0, this.c() + 5.0, this.I);
        }
        if (this.S != null) {
            d3 = mq2.b(this.S.O());
            this.S.c(this.d() + this.e() - 5.0 - d3 - 2.0);
            this.S.a(this.c() + 2.0);
            this.S.d(10.0);
            this.S.b(d3);
            this.S.f(0.8);
        }
        this.X = this.a(d8, d6 + 0.5, this.N.n() / 2.0);
        d3 = 5.0;
        double d10 = this.e() - d3 * 2.0;
        for (double d11 = 0.0; d11 < d10; d11 += 1.0) {
            pe_0.c(this.d() + d11 + d3, d6, 1.0, 1.0, this.a(d11, d10));
        }
        Color color = this.I().equals(Color.WHITE) ? this.O.I() : this.I();
        double d12 = this.N.o();
        pe_0.a((float)(this.X.a() + this.X.d() / 2.0 - d12 / 2.0), (float)(this.X.b() + this.X.c() / 2.0 - d12 / 2.0), (float)d12, 1.0f, xq_0.b.c, 12.0, color);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.F && !this.x()) {
            this.N.c();
            this.F = false;
        }
    }

    @Override
    public void a(uW uW2) {
        DU dU;
        if ((this.L.equals((Object)sp.RAINBOW) || this.L.equals((Object)sp.BLOCK_CHILD)) && this.H + 300L > System.currentTimeMillis()) {
            this.J.d(!this.J.J());
        }
        if ((dU = new DU(this.d(), this.X.b(), this.e(), this.X.c())).b(uW2.a(), uW2.b())) {
            this.A = o7.b();
            this.z = true;
        }
        this.H = System.currentTimeMillis();
    }

    private void M() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d3 = this.e() - 10.0 - this.X.d();
            double d4 = (double)this.A.a - this.d() + this.m() - 5.0 - this.X.d() / 2.0;
            double d5 = this.a(this.Q, d3, this.P, this.R, d4);
            d5 = new BigDecimal("" + d5).setScale(3, RoundingMode.HALF_UP).doubleValue();
            if (this.J != null) {
                switch (n0.a[this.L.ordinal()]) {
                    case 1: 
                    case 2: {
                        if (this.J.u().a().equals(this.V)) {
                            return;
                        }
                        this.J.u().b(d5);
                        break;
                    }
                    case 3: {
                        if (this.J.I().a().equals(this.V)) {
                            return;
                        }
                        this.J.I().b(d5);
                        break;
                    }
                    case 4: {
                        if (this.J.u().a().equals(this.V)) {
                            return;
                        }
                        this.J.z().b(d5);
                    }
                }
            }
        }
    }

    private void Q() {
        double d3 = this.e() - 10.0;
        double d4 = 0.0;
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                d4 = this.J.x() / this.M;
                break;
            }
            case 3: {
                d4 = this.J.I().a() / this.M;
                break;
            }
            case 4: {
                d4 = this.J.z().a() / this.M;
            }
        }
        double d5 = (d3 - this.N.n()) * (d4 *= (double)this.E) + 5.0 + this.N.n() / 2.0;
        double d6 = this.G.o();
        double d7 = 0.05;
        if (this.L == sp.BLOCK_CHILD || this.L == sp.RAINBOW) {
            if (this.J.J() && d4 == 0.0) {
                d7 = 0.0;
            }
        } else if (this.J.J() && this.J.createValue()) {
            d7 = 1.0;
        }
        this.G = new i_0(d7, d6, d5);
        this.U = d4;
        this.G.g();
    }

    @Override
    public void i() {
        if (!this.F) {
            this.N.c();
        }
        this.F = true;
    }

    public Color a(double d3, double d4) {
        switch (n0.a[this.L.ordinal()]) {
            case 1: 
            case 2: {
                return new Color(Color.HSBtoRGB((float)(d3 / d4), 1.0f, 1.0f));
            }
            case 3: {
                return new Color(Color.HSBtoRGB(this.J.w(), (float)(d3 / d4), this.J.r()));
            }
            case 4: {
                return new Color(Color.HSBtoRGB(this.J.w(), this.J.v(), (float)(d3 / d4)));
            }
        }
        return new Color(0, 0, 0);
    }

    public double O() {
        return this.W;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 25.0;
    }

    public double P() {
        return this.M;
    }

    public double K() {
        return this.Q;
    }

    public double N() {
        return this.P;
    }

    public DU J() {
        return this.X;
    }

    public void g(double d3) {
        this.M = d3;
    }

    public void h(double d3) {
        this.Q = d3;
    }

    public void f(double d3) {
        this.P = d3;
    }

    public void a(wM wM2) {
        this.O = wM2;
    }

    static void a(xq_0 xq_02) {
        xq_02.Q();
    }

    public static void b(int[] nArray) {
        K = nArray;
    }

    public static int[] L() {
        return K;
    }

    static {
        if (xq_0.L() != null) {
            xq_0.b(new int[2]);
        }
    }
}

