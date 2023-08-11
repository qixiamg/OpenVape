/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import rip.vape.value.BasicValue;

public class qD
extends qp
implements o1 {
    private final r9 H;
    private final rg_0 G;
    private final rl_0 I;
    private double J;
    private double F = 8.0;
    private static int[] K;

    public qD(String string, double d3) {
        this(string, new r9());
        this.J = d3;
        this.H.c(d3);
    }

    public qD(String string, r9 r92) {
        this.J = r92.q();
        D7 d7 = new D7(1.0, 0.0, 1, 3, new pd(0, 0, 0, 0));
        this.a(d7);
        this.I = new rl_0(string, my_0.c, 0.75, false);
        this.H = r92;
        r92.e(0.5);
        this.G = new rG("dots", (float)this.F, 10.0f, 1.0f, false);
        this.G.a(new uy(this));
        this.b(r92);
        this.b(this.I);
        this.b(this.G);
    }

    @Override
    public void b(Color color) {
        super.b(color);
        this.H.b(color);
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        this.I.c(d3 - this.J - this.F - this.u().a() * 2.0);
        this.H.c(this.J);
        this.G.c(this.F);
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.H.b(d3);
        this.I.b(d3);
        this.G.b(d3);
    }

    @Override
    public void c(boolean bl) {
        if (this.p() != null && this.e()) {
            Object c2;
            BasicValue ds_02;
            BooleanValue dB = (BooleanValue)this.p();
            if (dB.t().size() == 0) {
                this.G.a(false);
            }
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            this.G.e(dB.y());
            if (dB.y() && !dB.t().isEmpty() && (ds_02 = dB.r()) != null && (c2 = dB.r().getDefaultValue()) != null) {
                GL11.glColor4d((double)0.25, (double)0.25, (double)0.25, (double)0.2);
                GL11.glBegin((int)7);
                GL11.glVertex2d((double)(this.t() - 1.0), (double)(c2.k() + c2.b()));
                GL11.glVertex2d((double)(this.t() + this.q() + 1.0), (double)(c2.k() + c2.b()));
                GL11.glVertex2d((double)(this.t() + this.q() + 1.0), (double)this.k());
                GL11.glVertex2d((double)(this.t() - 1.0), (double)this.k());
                GL11.glEnd();
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        super.c(bl);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.d()) {
            return false;
        }
        if (this.g()) {
            if (!this.H.g() && !this.G.g()) {
                this.H.a().a(n6, n10, n11);
            }
            this.R();
        }
        return super.a(n6, n10, n11);
    }

    @Override
    public void F() {
        this.H.F();
    }

    @Override
    public boolean G() {
        return this.H.G();
    }

    @Override
    public void g(boolean bl) {
        this.H.g(bl);
    }

    public r9 a() {
        return this.H;
    }

    public rl_0 z() {
        return this.I;
    }

    public static void b(int[] nArray) {
        K = nArray;
    }

    public static int[] y() {
        return K;
    }

    static {
        if (qD.y() == null) {
            qD.b(new int[1]);
        }
    }
}

