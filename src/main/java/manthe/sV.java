/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rip.vape.value.BasicValue;

public class sV
extends qp
implements p_0,
s6,
be_0 {
    protected static final double T = 0.75;
    protected final double I;
    protected final double R;
    protected final double V;
    protected final String H;
    protected final String O;
    protected final String W;
    protected sV F;
    protected boolean S;
    protected rl_0 M;
    protected double P = 0.5;
    protected double K = 0.0;
    protected boolean J = false;
    protected boolean X = true;
    private boolean N = false;
    private qN Q;
    private double L = 0.0;
    private double G;
    private double U;

    public sV(double d3, double d4, double d5, String string, String string2, String string3) {
        this.I = d3;
        this.R = d4;
        this.V = d5;
        this.H = string2;
        this.W = string3;
        this.O = string;
        if (string != null) {
            this.Q = new qN(string);
        }
        if (string3 == null) {
            this.F = this;
            this.S = false;
        } else {
            this.S = true;
            this.M = new rl_0(string3, my_0.c, 0.75, false);
            this.M.b(this.r().a(string3) * 0.75);
            this.F = new sV(d3, d4, d5, string, string2, null);
            this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
            this.b(this.M);
            this.b(this.F);
        }
        this.a(null, new B4(this));
        this.b(this.f());
        this.a(new Color(110, 110, 110, 70));
    }

    public sV(double d3, double d4, String string, String string2, String string3) {
        this(d3, d4, 0.1, string, string2, string3);
    }

    @Override
    public void b(Color color) {
        super.b(color);
        if (this.S) {
            this.F.b(color);
        }
    }

    @Override
    public void c(boolean bl) {
        if (this.x() && !Mouse.isButtonDown((int)0)) {
            this.d(false);
        }
        if (this.S) {
            this.M.b(this.r().a(this.W) + 2.0);
        }
        if (this.e() && !this.S && this.X) {
            Object object;
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3008);
            GL11.glDisable((int)3553);
            double d3 = this.q() - 3.0;
            double d4 = 3.0;
            double d5 = 1.0;
            double d6 = this.t() - 0.5;
            double d7 = this.t() + d3 - d5;
            double d8 = this.k() + 2.0;
            Color color = Color.BLACK.brighter();
            k9.a(color, (float)d6, (float)d8, "circle", 2.0f, 3.0f, false);
            k9.a(color, (float)d7, (float)d8, "togglefront", (float)d5 * 2.0f, (float)d4, false);
            double d10 = d6 + d5;
            o7.a(color, d10, d8 + d4, d10 + d3 - d5, d8 + d4, d10 + d3 - d5, d8, d10, d8);
            double d11 = -2.5;
            if (this.G() <= 1.0) {
                d11 = 0.0;
            } else if (this.G() >= 1.0 && this.G() <= 3.0) {
                d11 = -0.5;
            } else if (this.G() >= 3.0 && this.G() <= 5.0) {
                d11 = -1.0;
            } else if (this.G() >= 5.0 && this.G() <= 7.0) {
                d11 = -1.5;
            }
            o7.a(this.f(), d10, d8 + d4, d10 + this.G() - d5, d8 + d4, d10 + this.G() - d5, d8, d10, d8);
            Color color2 = this.f();
            Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 255);
            k9.a(color3, (float)d6, (float)d8, "circle", 2.0f, 3.0f, false);
            d7 = this.t() + this.G() + this.A() + d11 - 1.0;
            k9.a(this.f(), (float)d7, (float)d8, "togglefront", (float)d5 * 2.0f, (float)d4, false);
            if (this.y()) {
                object = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 150);
                k9.a((Color)object, (float)d7 - 1.5f, (float)d8 - 2.0f, "circle", 7.0f, 7.0f, false);
            }
            k9.a(yI.a(this.f(), 80, 240), (float)d7 - 1.0f, (float)d8 - 1.5f, "circle", 6.0f, 6.0f, false);
            GL11.glEnable((int)3553);
            object = "";
            if (this.Q != null) {
                object = this.O.isEmpty() ? (int)this.K + "" : this.Q.b(this.K);
                object = (String)object + this.H;
            }
            mq mq2 = on.p.a(0.75);
            mq2.c((String)object, this.t() + (this.q() - mq2.b((String)object)) - 2.0, this.k() - this.z() + 1.0, -1);
            GL11.glDisable((int)3042);
        }
        super.c(bl);
    }

    @Override
    public mq r() {
        return on.p.E();
    }

    @Override
    public void c() {
        super.c();
        if (this.x() && !this.S) {
            boolean bl;
            bo_0 bo_02 = o7.b();
            double d3 = this.t() - this.A();
            double d4 = this.q() - this.A() * 2.0;
            double d5 = (double)bo_02.a - d3;
            double d6 = d5 / d4;
            double d7 = Math.abs(this.k() - (double)bo_02.b);
            double d8 = this.I - this.R;
            double d10 = Y.a(d6 * d8 + this.R, this.V);
            boolean bl2 = bl = this.U == 0.0;
            if (d7 < 3.0) {
                d7 = 0.0;
                this.L = d5;
                this.G = 0.0;
                this.U = d10;
            }
            if (d7 != 0.0 && !bl) {
                double d11 = (50.0 - d7) / 50.0;
                if (d11 < 0.0) {
                    d11 = 0.01;
                }
                d6 = this.L / d4;
                double d12 = Y.a(d6 * d8 + this.R, this.V);
                double d13 = d10 - this.U;
                if (d13 != 0.0) {
                    this.G += d13 * d11;
                }
                this.U = d10;
                d10 = this.G + d12;
            }
            if (d10 > this.I) {
                this.f(this.I);
            } else if (d10 < this.R) {
                this.f(this.R);
            } else {
                this.f(d10);
            }
        } else {
            this.L = 0.0;
            this.G = 0.0;
            this.U = 0.0;
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        if (this.S) {
            this.M.c(d3);
            this.F.c(d3);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        if (this.S) {
            this.F.b(d3);
        }
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (!this.g()) {
            this.e(false);
        }
        return super.a(n6, n10, n11);
    }

    public Double B() {
        if (this.S) {
            return this.F.B();
        }
        return this.K;
    }

    public void f(double d3) {
        d3 = Y.a(d3, this.V);
        if (this.S) {
            this.F.f(d3);
        } else {
            if (d3 > this.I) {
                d3 = this.I;
            } else if (d3 < this.R) {
                d3 = this.R;
            }
            this.K = d3;
        }
        this.R();
    }

    public void g(double d3) {
        d3 = Y.a(d3, this.V);
        if (this.S) {
            this.F.g(d3);
        } else {
            this.K = d3;
        }
    }

    @Override
    public boolean x() {
        return this.J && !this.d();
    }

    @Override
    public void d(boolean bl) {
        this.J = bl;
    }

    @Override
    public double A() {
        return this.P;
    }

    @Override
    public void e(double d3) {
        this.P = d3;
    }

    protected double z() {
        return this.b() - this.A() * 2.0;
    }

    protected double G() {
        return (this.K - this.R) / (this.I - this.R) * this.q();
    }

    public double C() {
        return this.I;
    }

    public double D() {
        return this.R;
    }

    @Override
    public boolean y() {
        if (this.d()) {
            return false;
        }
        if (this.S) {
            return this.F.y();
        }
        return this.N;
    }

    @Override
    public void e(boolean bl) {
        if (this.S) {
            this.F.e(bl);
        } else {
            this.N = bl;
        }
    }

    @Override
    public boolean a(char c2, int n6) {
        double d3 = 1.0;
        if (this.Q != null && this.Q.a() == 2) {
            d3 = 0.1;
        }
        double d4 = 10.0 * d3;
        double d5 = 1.0 * d3;
        double d6 = 0.1 * d3;
        if (this.y()) {
            if (n6 == 203) {
                this.f(this.B() - (Keyboard.isKeyDown((int)29) ? d4 : (Keyboard.isKeyDown((int)42) ? d6 : d5)));
                return true;
            }
            if (n6 == 205) {
                this.f(this.B() + (Keyboard.isKeyDown((int)29) ? d4 : (Keyboard.isKeyDown((int)42) ? d6 : d5)));
                return true;
            }
        }
        return super.a(c2, n6);
    }

    public String F() {
        return this.H;
    }

    public String E() {
        return this.O;
    }

    @Override
    public void a(BasicValue ds_02) {
        super.a(ds_02);
        if (this.S) {
            this.F.a(ds_02);
        }
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        if (this.S) {
            this.F.b(bl);
        }
    }
}

