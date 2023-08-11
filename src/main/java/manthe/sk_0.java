/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rip.vape.value.BasicValue;

import java.awt.*;

/*
 * Renamed from manthe.sk
 */
public class sk_0 extends qp implements p_0, s6, be_0 {
    private static final double J = 0.8;
    private final sk_0 F;
    private final qN G;
    private final double I;
    private final double O;
    private final String S;
    private final String M;
    private final boolean P;
    private final String V;
    private final double T;
    private rl_0 W;
    private double Q = 1.0;
    private double H = 0.0;
    private double X = 0.0;
    private boolean U = false;
    private int L = 0;
    private boolean Z = false;
    private double K = 0.0;
    private double N = 0.0;
    private double Y;
    private double R;

    public sk_0(double d3, double d4, double d5, String string, String string2, String string3) {
        this.I = d3;
        this.O = d4;
        this.T = d5;
        this.S = string2;
        this.M = string;
        this.V = string3;
        this.G = new qN(string);
        if (string3 == null) {
            this.F = this;
            this.P = false;
        } else {
            this.P = true;
            this.W = new rl_0(string3, my_0.i, 0.8, false);
            this.W.b(this.r().a(string3) * 0.8);
            this.F = new sk_0(d3, d4, d5, string, string2, null);
            this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
            this.b(this.W);
            this.b(this.F);
        }
        this.a(new D5(this, 0.0, 0.0, 0.0, 100.0), new vn(this));
        this.a(new Dq(this, 0.0, 0.0, 0.0, 100.0), new mU(this));
        this.e(0.5);
        this.b(Color.green);
        this.a(new Color(110, 110, 110, 70));
    }

    static double a(sk_0 sk_02) {
        return sk_02.K;
    }

    static int a(sk_0 sk_02, int n6) {
        sk_02.L = n6;
        return sk_02.L;
    }

    @Override
    public void b(Color color) {
        super.b(color);
        if (this.P) {
            this.F.b(color);
        }
    }

    @Override
    public void c(boolean bl) {
        if (this.x() && !Mouse.isButtonDown((int) 0)) {
            this.d(false);
        }
        mq mq2 = on.p.a(0.6f);
        if (this.P) {
            this.W.b(mq2.a(this.V) + this.A() + 3.0);
        }
        if (this.e() && !this.P) {
            GL11.glEnable((int) 3042);
            GL11.glBlendFunc((int) 770, (int) 771);
            GL11.glDisable((int) 3553);
            double d3 = this.q() - 3.0;
            double d4 = 3.0;
            double d5 = 1.0;
            double d6 = this.t() - 0.5;
            double d7 = this.t() + d3 - d5;
            double d8 = this.k() + 2.0;
            Color color = Color.BLACK.brighter();
            k9.a(color, (float) d6, (float) d8, "togglefront", (float) d5 * 2.0f, (float) d4, false);
            k9.a(color, (float) d7, (float) d8, "togglefront", (float) d5 * 2.0f, (float) d4, false);
            double d10 = d6 + d5;
            o7.a(color, d10, d8 + d4, d10 + d3 - d5, d8 + d4, d10 + d3 - d5, d8, d10, d8);
            o7.a(this.f(), this.t() + this.V() + d5, d8 + d4, d10 + this.D() - d5, d8 + d4, d10 + this.D() - d5, d8, this.t() + this.V() + d5, d8);
            double d11 = -2.5;
            double d12 = -1.0;
            o7.a(yI.a(this.f(), 80, 150), this.t() + this.D() + this.A() + d11, this.k() + this.A() + this.G(), this.t() + this.D() + this.A() + d12, this.k() + this.A() + this.G(), this.t() + this.D() + this.A() + d12, this.k() + this.A(), this.t() + this.D() + this.A() + d11, this.k() + this.A());
            double d13 = 0.0;
            double d14 = 1.5;
            o7.a(yI.a(this.f(), 80, 150), this.t() + this.V() + this.A() + d13, this.k() + this.A() + this.G(), this.t() + this.V() + this.A() + d14, this.k() + this.A() + this.G(), this.t() + this.V() + this.A() + d14, this.k() + this.A(), this.t() + this.V() + this.A() + d13, this.k() + this.A());
            GL11.glEnable((int) 3553);
            String string = this.G.b(this.H);
            mq2.c(string, this.t(), this.k() - this.G() / 2.0 - 1.0, -1);
            String string2 = this.G.b(this.X);
            mq2.c(string2, this.t() + (this.q() - mq2.b(string2)) - 2.0, this.k() - this.G() / 2.0 - 1.0, -1);
            GL11.glDisable((int) 3042);
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
        if (!this.P) {
            Object object;
            if (this.x()) {
                object = o7.b();
                double d3 = this.t() - this.A();
                double d4 = this.q() - this.A() * 2.0;
                if (this.L == 1) {
                    boolean bl;
                    double d5 = (double) (((bo_0) object).a - 1) - d3;
                    double d6 = d5 / d4;
                    double d7 = this.I - this.O;
                    double d8 = d6 * d7 + this.O;
                    double d10 = Math.abs(this.k() - (double) ((bo_0) object).b);
                    boolean bl2 = bl = this.R == 0.0;
                    if (d10 < 3.0) {
                        d10 = 0.0;
                        this.N = d5;
                        this.Y = 0.0;
                        this.R = d8;
                    }
                    if (d10 != 0.0 && !bl) {
                        double d11 = (50.0 - d10) / 50.0;
                        if (d11 < 0.0) {
                            d11 = 0.01;
                        }
                        d6 = this.N / d4;
                        double d12 = d6 * d7 + this.O;
                        double d13 = d8 - this.R;
                        if (d13 != 0.0) {
                            this.Y += d13 * d11;
                        }
                        this.R = d8;
                        d8 = this.Y + d12;
                    }
                    if (d8 > this.W()) {
                        this.h(this.W());
                    } else if (d8 < this.E()) {
                        this.h(this.E());
                    } else {
                        this.h(d8);
                    }
                } else if (this.L == 2) {
                    boolean bl;
                    double d14 = (double) (((bo_0) object).a - 1) - d3;
                    double d15 = d14 / d4;
                    double d16 = this.I - this.O;
                    double d17 = d15 * d16 + this.O;
                    double d18 = Math.abs(this.k() - (double) ((bo_0) object).b);
                    boolean bl3 = bl = this.R == 0.0;
                    if (d18 < 3.0) {
                        d18 = 0.0;
                        this.N = d14;
                        this.Y = 0.0;
                        this.R = d17;
                    }
                    if (d18 != 0.0 && !bl) {
                        double d19 = (50.0 - d18) / 50.0;
                        if (d19 < 0.0) {
                            d19 = 0.01;
                        }
                        d15 = this.N / d4;
                        double d20 = d15 * d16 + this.O;
                        double d21 = d17 - this.R;
                        if (d21 != 0.0) {
                            this.Y += d21 * d19;
                        }
                        this.R = d17;
                        d17 = this.Y + d20;
                    }
                    if (d17 > this.W()) {
                        this.f(this.W());
                    } else if (d17 < this.E()) {
                        this.f(this.E());
                    } else {
                        this.f(d17);
                    }
                }
            } else {
                this.N = 0.0;
                this.Y = 0.0;
                this.R = 0.0;
            }
            object = (dy_0) this.p();
            if (((dy_0) object).r().equals(((dy_0) object).u())) {
                if (this.L == 2) {
                    this.f(this.z() + this.T);
                } else {
                    this.h(this.F() - this.T);
                }
            }
            this.K = (this.V() + this.D()) / 2.0;
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        if (this.P) {
            this.W.c(d3);
            this.F.c(d3);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        if (this.P) {
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

    @Override
    public boolean a(char c2, int n6) {
        if (this.y()) {
            double d3 = this.T;
            double d4 = 10.0 * d3;
            double d5 = 1.0 * d3;
            double d6 = 0.1 * d3;
            if (n6 == 203) {
                if (this.L == 1) {
                    this.h(this.F() - (Keyboard.isKeyDown((int) 29) ? d4 : (Keyboard.isKeyDown((int) 42) ? 1.0 : d5)));
                } else {
                    this.f(this.z() - (Keyboard.isKeyDown((int) 29) ? d4 : (Keyboard.isKeyDown((int) 42) ? 1.0 : d5)));
                }
                return true;
            }
            if (n6 == 205) {
                if (this.L == 1) {
                    this.h(this.F() + (Keyboard.isKeyDown((int) 29) ? d4 : (Keyboard.isKeyDown((int) 42) ? 1.0 : d5)));
                } else {
                    this.f(this.z() + (Keyboard.isKeyDown((int) 29) ? d4 : (Keyboard.isKeyDown((int) 42) ? 1.0 : d5)));
                }
                return true;
            }
        }
        return super.a(c2, n6);
    }

    public Double F() {
        if (this.P) {
            return this.F.F();
        }
        return this.H;
    }

    public void h(double d3) {
        if (this.P) {
            this.F.h(manthe.Y.a(d3, this.T));
        } else {
            if (d3 > this.Y()) {
                d3 = this.Y() - this.T;
            } else if (d3 > this.I) {
                d3 = this.I;
            } else if (d3 < this.O) {
                d3 = this.O;
            }
            this.H = manthe.Y.a(d3, this.T);
            this.R();
        }
    }

    public void g(double d3) {
        d3 = manthe.Y.a(d3, this.T);
        if (this.P) {
            this.F.g(d3);
        } else {
            this.H = d3;
        }
        this.R();
    }

    public Double z() {
        if (this.P) {
            return this.F.z();
        }
        return this.X;
    }

    public void f(double d3) {
        if (this.P) {
            this.F.f(manthe.Y.a(d3, this.T));
        } else {
            if (d3 < this.C()) {
                d3 = this.C() + this.T;
            } else if (d3 > this.I) {
                d3 = this.I;
            } else if (d3 < this.O) {
                d3 = this.O;
            }
            this.X = manthe.Y.a(d3, this.T);
        }
        this.R();
    }

    public void i(double d3) {
        d3 = manthe.Y.a(d3, this.T);
        if (this.P) {
            this.F.i(d3);
        } else {
            this.X = d3;
        }
        this.R();
    }

    public double E() {
        return this.O;
    }

    public double W() {
        return this.I;
    }

    @Override
    public boolean x() {
        return this.U && !this.d();
    }

    @Override
    public void d(boolean bl) {
        this.U = bl;
    }

    @Override
    public double A() {
        return this.Q;
    }

    @Override
    public void e(double d3) {
        this.Q = d3;
    }

    @Override
    public boolean y() {
        return this.Z;
    }

    @Override
    public void e(boolean bl) {
        if (this.d()) {
            return;
        }
        this.Z = bl;
    }

    private double G() {
        return this.b() - this.A() * 2.0;
    }

    private double V() {
        return (this.H - this.O) / (this.I - this.O) * this.q();
    }

    private double D() {
        return (this.X - this.O) / (this.I - this.O) * this.q();
    }

    private double C() {
        return this.H;
    }

    private double Y() {
        return this.X;
    }

    public qN B() {
        return this.G;
    }

    public Double[] H() {
        return new Double[]{this.F(), this.z()};
    }

    @Override
    public void a(BasicValue ds_02) {
        if (this.P) {
            this.F.a(ds_02);
        }
        super.a(ds_02);
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        if (this.P) {
            this.F.b(bl);
        }
    }

    public double X() {
        return this.T;
    }
}

