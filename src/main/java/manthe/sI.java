/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.D7;
import manthe.br_0;
import manthe.mt_0;
import manthe.nX;
import manthe.o1;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qU;
import manthe.qp;
import manthe.r4;
import manthe.r9;
import manthe.rG;
import manthe.rf_0;
import manthe.rg_0;
import manthe.ue_0;
import manthe.y7;
import manthe.zu_0;
import org.lwjgl.opengl.GL11;

public abstract class sI
extends qp
implements qU,
o1 {
    public static final double N = 12.0;
    public static final int P = 5;
    protected final rG H;
    private final rf_0 F;
    private final rf_0 O = new rf_0(false);
    private final r4 I;
    private final rg_0 M;
    private final r9 G = new r9();
    private final zu_0 R;
    private final rf_0 J = new rf_0(false);
    boolean Q;
    private boolean L;
    private double S;
    private double T;
    private boolean K;
    private Color U;

    public sI(String string, List<p1> list) {
        this.a(b);
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
        this.R = on.p.H().b(zu_0.class);
        this.H = new rG("favorite", 10.0f, 10.0f, 0.8f, false);
        this.H.b(12.0);
        this.H.a(false);
        this.I = new r4(string, false);
        this.I.a(new mt_0(this));
        this.M = new rG("dots", 10.0f, 10.0f, 1.1f, true);
        ((rG)this.M).d(Color.WHITE);
        this.M.a(new Color(0, 0, 0, 0));
        this.M.a(new y7(this));
        this.a(new br_0(this));
        this.G.a(true);
        this.G.g(true);
        this.G.c(12.0);
        this.G.b(10.0);
        this.F = new rf_0(false);
        this.F.a(new D7(0.0, 0.0, 1, 4, new pd(0, 0, 0, 0)));
        this.J.a(new D7(0.0, 0.0, 1, 1, new pd(0, 1, 0, 1)));
        this.J.b(this.G);
        this.F.b(this.J);
        this.F.b(this.H);
        this.F.b(this.I);
        this.F.b(this.M);
        this.O.a(false);
        this.O.a(new D7(0.0, 2.0, 5000, 1, new pd(2, 5, 2, 5)));
        this.b(this.F);
        this.b(this.O);
        this.a(new nX(this));
        if (list != null) {
            for (p1 p12 : list) {
                this.d(p12);
            }
        }
        this.c(this.I.z().H() + 20.0);
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        this.A();
        this.S = d3;
    }

    public void a() {
        this.a((p1)this.O);
    }

    public void X() {
        this.b(this.O);
    }

    private void A() {
        this.M.c(this.S * 0.1);
        if (this.O.s().equals(this)) {
            this.O.c(this.q() - 10.0);
        }
        for (p1 p12 : this.O.v()) {
            p12.c(this.q() - 10.0);
        }
        double d3 = this.S;
        d3 -= this.M.q();
        if (!this.K && this.ab().v().size() > 0) {
            d3 -= this.M.q();
        }
        if (this.Z()) {
            if (this.R.Z()) {
                this.J.a(true);
                this.I.c(d3 - this.G.q());
                this.F.a(true);
            } else {
                this.J.a(false);
                this.I.c(d3);
            }
        } else {
            this.I.c(d3);
            this.J.a(false);
        }
    }

    @Override
    public void F() {
        this.n(!this.G());
    }

    public void n(boolean bl) {
        this.Q = bl;
        this.I.g(this.G());
        this.d(this.U);
    }

    public void d(Color color) {
        if (color == null) {
            color = on.p.t().r.K();
        }
        this.W().d(null);
        if (this.G()) {
            this.W().b(color);
        } else {
            this.W().b(new Color(128, 128, 128, 32));
        }
        this.Y().b(color);
    }

    private void o(boolean bl) {
        for (p1 p12 : this.O.v()) {
            for (ue_0 ue_02 : p12.h()) {
                ue_02.a(bl);
            }
        }
    }

    @Override
    public void b(Color color) {
        super.b(color);
        this.U = color;
        this.d(this.U);
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.O.e()) {
                o7.a(c, this.O.t() + 2.0, this.k() + this.b(), this.O.t() + this.O.q() - 2.0, this.k() + this.b(), this.O.t() + this.O.q() - 2.0, this.k() + this.W().b(), this.O.t() + 2.0, this.k() + this.W().b());
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        super.c(bl);
    }

    @Override
    public boolean z() {
        return !this.O.e();
    }

    @Override
    public void f(boolean bl) {
        this.O.a(!bl);
        if (bl) {
            this.M.a(new Color(0, 0, 0, 0));
        } else {
            this.M.a(new Color(0, 0, 0, 100));
        }
    }

    @Override
    public boolean g() {
        for (p1 p12 : this.O.v()) {
            if (!p12.g()) continue;
            return false;
        }
        return super.g();
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.T = d3;
        this.I.b(d3);
        this.M.b(d3);
        int n6 = (int)(d3 - 10.0);
        int n10 = n6 / 2;
        this.J.a(new D7(0.0, 0.0, 1, 1, new pd(n10, 1, 0, 1)));
    }

    public void d(p1 p12) {
        if (this.O.v().contains(p12)) {
            return;
        }
        this.O.b(p12);
    }

    public rf_0 ab() {
        return this.O;
    }

    public r4 W() {
        return this.I;
    }

    public rg_0 V() {
        return this.M;
    }

    public rf_0 aa() {
        return this.F;
    }

    public r9 Y() {
        return this.G;
    }

    public void m(boolean bl) {
        this.G.g(bl);
    }

    public void k(boolean bl) {
        this.L = bl;
    }

    public boolean Z() {
        return this.L;
    }

    public void l(boolean bl) {
        this.K = bl;
    }

    public double H() {
        return this.S;
    }

    @Override
    public boolean G() {
        return this.Q;
    }

    @Override
    public void g(boolean bl) {
        if (this.G() != bl) {
            this.F();
        }
    }

    static rg_0 a(sI sI2) {
        return sI2.M;
    }

    static void a(sI sI2, boolean bl) {
        sI2.o(bl);
    }

    static rf_0 c(sI sI2) {
        return sI2.O;
    }

    static void b(sI sI2) {
        sI2.A();
    }
}

