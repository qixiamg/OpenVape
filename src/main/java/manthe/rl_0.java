/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.Bj;
import manthe.mq;
import manthe.my_0;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.qp;
import manthe.vl;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.rl
 */
public class rl_0
extends qp
implements vl {
    private final String M;
    private final boolean K;
    private int G;
    private int L = Bj.a;
    private String F;
    private double H;
    private boolean J = false;
    private p1 I = this;

    public rl_0(String string, int n6, double d3) {
        this.M = string;
        this.F = string;
        this.G = n6;
        this.H = d3;
        this.b(Color.WHITE);
        this.K = true;
    }

    public rl_0(String string, int n6, double d3, boolean bl) {
        this.M = string;
        this.F = string;
        this.G = n6;
        this.H = d3;
        this.b(Color.WHITE);
        this.K = bl;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.e()) {
            Color color;
            GL11.glPushMatrix();
            Color color2 = color = this.K ? this.f() : Color.white;
            if (this.F()) {
                String[] stringArray = this.E().split("\n");
                double d3 = 0.0;
                double d4 = 0.0;
                for (String string : stringArray) {
                    this.a(string, this.t() + d4, this.k() + d3, color);
                    d3 += this.r().a(string) + 1.0;
                }
            } else {
                this.a(this.F, this.t(), this.k(), color);
            }
            GL11.glPopMatrix();
        }
    }

    @Override
    public mq r() {
        return on.p.a(this.H);
    }

    public void a(String string, double d3, double d4, Color color) {
        o7.a(color);
        mq mq2 = this.r();
        if (!this.F()) {
            d4 += this.b() / 2.0;
            d4 -= mq2.a(string) / 2.0;
        }
        if (this.G == my_0.i) {
            if (this.L == Bj.a) {
                mq2.b(string, this.I.t() + this.I.q() / 2.0, d4, color);
            } else if (this.L == Bj.b) {
                mq2.d(string, this.I.t() + this.I.q() / 2.0, d4, color);
            }
        } else if (this.G == my_0.c) {
            if (this.L == Bj.a) {
                mq2.a(string, d3 + 2.0, d4, color);
            } else if (this.L == Bj.b) {
                mq2.c(string, d3 + 2.0, d4, color);
            }
        } else if (this.L == Bj.a) {
            mq2.a(string, d3 + this.q() - mq2.b(string), d4, color);
        } else if (this.L == Bj.b) {
            mq2.c(string, d3 + this.q() - mq2.b(string), d4, color);
        }
    }

    @Override
    public double q() {
        if (this.F()) {
            double d3 = 0.0;
            for (String string : this.E().split("\n")) {
                double d4 = this.r().b(string);
                if (!(d4 > d3)) continue;
                d3 = d4;
            }
            return d3;
        }
        return super.q();
    }

    public double H() {
        return this.r().b(this.F);
    }

    @Override
    public double b() {
        if (this.F()) {
            String[] stringArray = this.E().split("\n");
            if (stringArray.length == 0) {
                return super.b();
            }
            double d3 = -1.0;
            for (String string : stringArray) {
                d3 += this.r().a(string);
            }
            return d3 + (double)stringArray.length;
        }
        return super.b();
    }

    @Override
    public String D() {
        return this.M;
    }

    @Override
    public String E() {
        return this.F;
    }

    @Override
    public void a(String string) {
        this.F = string;
    }

    public double V() {
        return this.H;
    }

    public void e(double d3) {
        this.H = d3;
    }

    public int G() {
        return this.L;
    }

    public void a(int n6) {
        this.L = n6;
    }

    public boolean F() {
        return this.J;
    }

    public void d(boolean bl) {
        this.J = bl;
    }

    public void b(int n6) {
        this.G = n6;
    }

    public void d(p1 p12) {
        this.I = p12;
    }
}

