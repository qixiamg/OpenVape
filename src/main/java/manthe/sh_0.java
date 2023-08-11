/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.my_0;
import manthe.o7;
import manthe.rl_0;
import manthe.sV;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.sh
 */
public class sh_0
extends sV {
    private final rl_0 Y;
    private final rl_0 ab;
    private final rl_0 Z;
    private int aa;
    private int af;
    private int ad;
    private boolean ag;
    private Color ac = new Color(101, 194, 152);
    private Color ae = new Color(208, 32, 38);

    public sh_0() {
        super(100.0, 0.0, null, null, null);
        this.b(true);
        this.Y = new rl_0("", my_0.e, 0.6);
        this.ab = new rl_0("", my_0.i, 0.6);
        this.Z = new rl_0("", my_0.c, 0.6);
        this.b(0, 0);
    }

    @Override
    public void c(boolean bl) {
        if (this.e() && !this.S && this.X) {
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            if (this.f() != null) {
                o7.a(this.f(), this.t() - 2.0, this.k() + this.b(), this.t() + this.q() + 2.0, this.k() + this.b(), this.t() + this.q() + 2.0, this.k(), this.t() - 2.0, this.k());
            }
            double d3 = 7.0;
            double d4 = 2.0;
            o7.a(e, this.t() + 0.5, this.k() + this.z() + this.A() + this.A() - d4 - 0.5, this.t() + this.q() - 0.25, this.k() + this.z() + this.A() + this.A() - d4 - 0.5, this.t() + this.q() - 0.25, this.k() + d3 + 0.5, this.t() + 0.5, this.k() + d3 + 0.5);
            o7.a(this.ag ? this.ac : this.ae, this.t() + this.A(), this.k() + this.A() + this.z() - d4, this.t() + this.q() - this.A(), this.k() + this.A() + this.z() - d4, this.t() + this.q() - this.A(), this.k() + this.A() + d3, this.t() + this.A(), this.k() + this.A() + d3);
            o7.a(this.ag ? this.ae : this.ac, this.t() + this.A(), this.k() + this.A() + this.z() - d4, this.t() + this.G() - this.A(), this.k() + this.A() + this.z() - d4, this.t() + this.G() - this.A(), this.k() + this.A() + d3, this.t() + this.A(), this.k() + this.A() + d3);
            if (this.X() != 0) {
                o7.a((this.ag ? this.ae : this.ac).darker().darker().darker(), this.t() + this.G() + this.A() - 2.25, this.k() + this.A() + this.z() - d4, this.t() + this.G() + this.A() - 1.5, this.k() + this.A() + this.z() - d4, this.t() + this.G() + this.A() - 1.5, this.k() + this.A() + d3, this.t() + this.G() + this.A() - 2.25, this.k() + this.A() + d3);
            }
            double d5 = this.q() / 2.0 + 1.0;
            o7.a(c, this.t() + d5 + this.A() - 0.5 - 2.0, this.k() + this.A() + this.z() - d4 + 1.5, this.t() + d5 + this.A() + 0.5 - 2.0, this.k() + this.A() + this.z() - d4 + 1.5, this.t() + d5 + this.A() + 0.5 - 2.0, this.k() + this.A() + d3 - 1.5, this.t() + d5 + this.A() - 0.5 - 2.0, this.k() + this.A() + d3 - 1.5);
            GL11.glEnable((int)3553);
            this.Y.c(10.0);
            this.Y.b(10.0);
            this.Y.a(this.t() + d5 - 16.0);
            this.Y.d(this.k() - 1.0);
            this.Y.c(false);
            this.ab.c(10.0);
            this.ab.b(10.0);
            this.ab.a(this.t() - 3.0);
            this.ab.d(this.k() - 1.0);
            this.ab.c(false);
            if (this.H() > this.Z()) {
                this.ab.b(this.ag ? this.ae : this.ac);
            } else if (this.Z() > this.H()) {
                this.ab.b(this.ag ? this.ac : this.ae);
            } else {
                this.ab.b(Color.WHITE);
            }
            this.Z.c(10.0);
            this.Z.b(10.0);
            this.Z.a(this.t() + d5 + 3.0);
            this.Z.d(this.k() - 1.0);
            this.Z.c(false);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
        }
    }

    public void b(int n6, int n10) {
        double d3;
        this.aa = n6;
        this.Y.a(this.aa + "");
        this.af = n10;
        this.Z.a(this.af + "");
        this.ad = this.ag ? this.af - this.aa : this.aa - this.af;
        this.ab.a(this.ad + "");
        if (this.ad > 0) {
            this.ab.a("+" + this.ad);
        }
        if ((d3 = (double)(this.aa + this.af)) == 0.0) {
            this.f(50.0);
            return;
        }
        double d4 = (double)(d3 > 0.0 ? n6 : n10) / d3;
        this.f(100.0 * d4);
    }

    public int H() {
        return this.aa;
    }

    public int Z() {
        return this.af;
    }

    public int X() {
        return this.ad;
    }

    public Color V() {
        return this.ac;
    }

    public void e(Color color) {
        this.ac = color;
    }

    public Color W() {
        return this.ae;
    }

    public void d(Color color) {
        this.ae = color;
    }

    public boolean Y() {
        return this.ag;
    }

    public void f(boolean bl) {
        this.ag = bl;
    }
}

