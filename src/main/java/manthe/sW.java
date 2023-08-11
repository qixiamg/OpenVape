/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rip.vape.value.ColorValue;

public class sW
extends sV {
    private final boolean Y = false;
    private int Z = 0;
    private long aa = 0L;

    public sW(double d3, double d4, String string, String string2, String string3) {
        super(d3, d4, string, string2, string3);
        this.X = false;
        if (string3 != null && !string3.isEmpty()) {
            this.v().clear();
            this.S = true;
            this.M = new rl_0(string3, my_0.i, 0.75, false);
            this.M.b(this.r().a(string3) * 0.75);
            this.F = new sW(d3, d4, string, string2, null);
            this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
            this.b(this.M);
            this.b(this.F);
        }
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.S) {
            this.M.b(this.r().a(this.W) + 2.0);
        }
        if (this.e() && !this.S) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3553);
            o7.a(this.y() ? this.f().darker().darker().darker() : this.n(), this.A(), this, 4);
            float f10 = 0.0f;
            float f11 = this.W();
            ColorValue dE = (ColorValue)this.p();
            double d3 = this.A() + this.t() + 0.1;
            double d4 = this.k() + this.b() - this.A();
            double d5 = this.t() + this.A();
            double d6 = this.k() + this.b() - this.A();
            double d7 = this.t() + this.A();
            double d8 = this.k() + this.A();
            double d10 = this.A() + this.t() + 0.1;
            double d11 = this.k() + this.A();
            while (f10 < f11) {
                Color color = Color.WHITE;
                if (this.Z == 0) {
                    color = new Color(Color.HSBtoRGB(f10 / f11, dE.v(), dE.r()));
                } else if (this.Z == 1) {
                    color = new Color(Color.HSBtoRGB(dE.w(), dE.v(), f10 / f11));
                } else if (this.Z == 2) {
                    color = new Color(Color.HSBtoRGB(dE.w(), f10 / f11, dE.r()));
                }
                o7.a(color, d3 + (double)f10, d4, d5 + (double)f10, d6, d7 + (double)f10, d8, d10 + (double)f10, d11);
                f10 = (float)((double)f10 + 0.1);
            }
            GL11.glEnable((int)3042);
            double d12 = -2.5;
            double d13 = -1.0;
            if (this.G() <= 1.0) {
                d13 = -d12 - 1.0;
                d12 = 0.0;
            } else if (this.G() >= 1.0 && this.G() <= 3.0) {
                d13 = -d12 - 1.5;
                d12 = -0.5;
            } else if (this.G() >= 3.0 && this.G() <= 5.0) {
                d13 = -d12 - 2.0;
                d12 = -1.0;
            } else if (this.G() >= 5.0 && this.G() <= 7.0) {
                d13 = -d12 - 2.5;
                d12 = -1.5;
            }
            o7.a(this.f().darker().darker().darker(), this.t() + this.G() + this.A() + d12, this.k() + this.A() + this.z(), this.t() + this.G() + this.A() + d13, this.k() + this.A() + this.z(), this.t() + this.G() + this.A() + d13, this.k() + this.A(), this.t() + this.G() + this.A() + d12, this.k() + this.A());
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
        }
    }

    public float W() {
        return (float)(this.q() - this.A() * 2.0);
    }

    public L X() {
        return new L(Color.HSBtoRGB(this.B().floatValue() / (float)this.I, ((ColorValue)this.p()).v(), ((ColorValue)this.p()).r()));
    }

    public boolean V() {
        if (this.S) {
            return ((sW)this.F).V();
        }
        return ((ColorValue)this.p()).J();
    }

    public void f(boolean bl) {
        ((ColorValue)this.p()).d(bl);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (!this.S && this.g()) {
            if (Keyboard.isKeyDown((int)42)) {
                if (this.Z++ > 1) {
                    this.Z = 0;
                }
                this.f(this.B());
                return true;
            }
            if (System.currentTimeMillis() - this.aa < 300L) {
                this.f(!this.V());
            }
            this.aa = System.currentTimeMillis();
        }
        return super.a(n6, n10, n11);
    }

    @Override
    public Double B() {
        if (this.Z == 0) {
            return ((ColorValue)this.p()).u().a();
        }
        if (this.Z == 1) {
            return ((ColorValue)this.p()).z().a();
        }
        if (this.Z == 2) {
            return ((ColorValue)this.p()).I().a();
        }
        return super.B();
    }

    @Override
    public void f(double d3) {
        if (this.Z == 0) {
            ((ColorValue)this.p()).u().b(d3);
        } else if (this.Z == 1) {
            ((ColorValue)this.p()).z().b(d3);
        } else if (this.Z == 2) {
            ((ColorValue)this.p()).I().b(d3);
        }
        super.f(d3);
    }

    public int H() {
        return this.Z;
    }
}

