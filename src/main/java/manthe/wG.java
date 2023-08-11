/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.i_0;
import manthe.k9;
import manthe.mq;
import manthe.pe_0;
import manthe.vd;
import manthe.wI;
import manthe.we_0;
import manthe.yI;
import manthe.zu_0;

public class wG
extends wI {
    private String J;
    private String L;
    private double K;
    private boolean H;
    private boolean D;
    private i_0 I = new i_0(0.15, 0.0, 3.0);
    private float F = 4.0f;
    private Color G;
    private we_0 E;

    public wG(String string, String string2, double d3) {
        this.G = wG.b.o;
        this.J = string;
        this.L = string2;
        this.K = d3;
        this.E = zu_0.f(string);
        this.c(new vd(this, string));
        this.O();
    }

    public wG(String string, String string2) {
        this(string, string2, 0.9);
    }

    public wG(String string, String string2, Class clazz) {
        this(string, string2);
        this.E = zu_0.b(clazz);
        this.O();
    }

    private void O() {
        if (this.E != null) {
            if (this.E.b()) {
                this.I.m();
                this.H = true;
            } else if (this.I.k()) {
                this.I.e();
                this.H = false;
            }
        }
    }

    private void a(we_0 we_02) {
        if (we_02 != null) {
            if (we_02.b()) {
                if (!this.I.k()) {
                    this.I.g();
                    this.H = true;
                }
            } else if (this.I.k()) {
                this.I.b();
                this.H = false;
            }
        }
    }

    @Override
    public void a() {
        float f10 = 6.88f;
        mq mq2 = this.e(this.K);
        double d3 = mq2.a(this.J);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - (double)(f10 / 2.0f);
        double d6 = this.c() + this.f() / 2.0 - (double)(this.F / 2.0f);
        Color color = wG.b.k;
        Color color2 = wG.b.r;
        if (this.D) {
            color = wG.b.m;
            color2 = wG.b.c;
        }
        if (this.H) {
            color = wG.b.m;
            color2 = b.e();
            if (this.D) {
                color2 = yI.a(color2, 30.0);
            }
        }
        pe_0.c(this.d(), this.c(), this.e(), this.f(), color);
        k9.a(this.G, (float)this.d() + (float)this.e() - 5.0f - 5.0f + this.I.o().floatValue(), (float)d6, "expandarrow", this.F, this.F, false);
        if (this.L != null) {
            mq2.a(this.J, this.d() + 10.0 + (double)f10, d4, color2);
            k9.a(color2, (float)this.d() + 5.0f, (float)d5, this.L, f10, f10, false);
        } else {
            mq2.a(this.J, this.d() + 5.0, d4, color2);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.D = false;
        }
        this.a(this.E);
    }

    @Override
    public void i() {
        this.D = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public boolean P() {
        return this.H;
    }

    public i_0 N() {
        return this.I;
    }

    static boolean a(wG wG2, boolean bl) {
        wG2.H = bl;
        return wG2.H;
    }

    static boolean a(wG wG2) {
        return wG2.H;
    }

    static i_0 b(wG wG2) {
        return wG2.I;
    }
}

