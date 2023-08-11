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
 * Renamed from manthe.xx
 */
public class xx_0
extends xU {
    private double F;
    private double E;
    private double K;
    private double J;
    private String O = "";
    private double L = 0.75;
    private int I = 1;
    private boolean S;
    private DU M = new DU(0.0, 0.0, 0.0, 0.0);
    private i_0 P = new i_0(0.0, 0.0, 0.0);
    protected i_0 N = new i_0(0.15, 7.0, 8.0);
    private Color Q;
    private xO H;
    private DF G;
    private Double R;

    public xx_0(String string, double d3, double d4, double d5) {
        super(string);
        this.Q = xx_0.b.r;
        this.R = -1.0;
        this.F = d3;
        this.E = d4;
        this.K = d5;
        this.J = (double)((int)(d4 * 100.0) - (int)(d3 * 100.0)) / 10000.0;
        this.H = new xO(this);
        this.a(this.H);
        if (d5 <= 0.01) {
            this.I = 10;
        }
    }

    public xx_0(DF dF) {
        this(dF.H(), ((sV)dF.getDefaultValue()).D(), ((sV)dF.getDefaultValue()).C(), dF.r());
        this.O = ((sV)dF.getDefaultValue()).F();
        this.G = dF;
        this.a(dF);
        dF.getRuntimeCopyException(new vw_0(this));
        this.K();
    }

    @Override
    public void a() {
        this.N();
        this.o();
        mq mq2 = this.e(this.L);
        double d3 = mq2.a(this.n());
        double d4 = this.N.o();
        double d5 = this.c() + 12.5 + d3;
        double d6 = this.d() + this.P.o();
        mq2.a(this.n(), this.d() + 5.0, this.c() + 5.0, this.Q);
        this.H.c(this.d() + this.e() - 5.0 - this.H.e());
        this.H.a(this.c() + 5.0);
        this.M = this.a(d6, d5 + 0.5, this.N.n() / 2.0);
        double d7 = this.M.a() - this.d() - 5.0;
        double d8 = this.d() + this.e() - this.M.a() - 5.0;
        if (d7 > 0.0) {
            pe_0.a(this.d() + 5.0, d5 + 0.5, d7 - 1.5, 0.5, b.e(), false, 0.5f, 1.0f);
        }
        if (d8 > 0.0) {
            pe_0.a(this.M.a() + 9.5, d5 + 0.5, d8 - 9.5, 0.5, xx_0.b.y, false, 0.5f, 1.0f);
        }
        pe_0.a((float)(d6 - d4 / 2.0), (float)(d5 + 0.5 - d4 / 2.0), (float)d4, 1.0f, b.e(), 0.0, this.I());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.S && !this.x()) {
            this.N.c();
            this.S = false;
        }
    }

    @Override
    public void a(uW uW2) {
        DU dU = new DU(this.d(), this.M.b(), this.e(), this.M.c());
        if (dU.b(uW2.a(), uW2.b())) {
            this.A = o7.b();
            this.z = true;
        }
    }

    private void N() {
        if (this.z) {
            if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
                this.z = false;
                return;
            }
            double d3 = this.e() - 10.0 - this.M.d();
            double d4 = (double)this.A.a - this.d() + this.m() - 5.0 - this.M.d() / 2.0;
            double d5 = this.a(this.F, d3, this.K, this.J, d4);
            double d6 = d4 / d3 * 100.0;
            if (d6 >= 100.0 && this.I == 10) {
                d5 = this.E;
            }
            d5 = new BigDecimal("" + d5).setScale(this.I, RoundingMode.HALF_UP).doubleValue();
            if (this.G != null) {
                if (this.G.a().equals(this.R)) {
                    return;
                }
                this.G.b(d5);
            }
        }
    }

    private void K() {
        double d3;
        double d4 = this.e() - 10.0;
        double d5 = d3 = this.G != null ? (this.G.a() - this.F) / (this.E - this.F) : 0.0;
        if (d3 > 1.0) {
            d3 = 1.0;
        } else if (d3 < 0.0) {
            d3 = 0.0;
        }
        double d6 = (d4 - this.N.n()) * d3 + 5.0 + this.N.n() / 2.0;
        double d7 = this.P.o();
        this.P = new i_0(0.05, d7, d6);
        this.P.g();
    }

    @Override
    public void i() {
        if (!this.S) {
            this.N.c();
        }
        this.S = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 25.0;
    }

    public double M() {
        return this.E;
    }

    public double J() {
        return this.F;
    }

    public double L() {
        return this.K;
    }

    public DF O() {
        return this.G;
    }

    public String P() {
        return this.O;
    }

    public void g(double d3) {
        this.E = d3;
    }

    public void f(double d3) {
        this.F = d3;
    }

    public void h(double d3) {
        this.K = d3;
    }

    static void a(xx_0 xx_02) {
        xx_02.K();
    }
}

