/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.BI;
import manthe.D7;
import manthe.DW;
import manthe.dz_0;
import manthe.mX;
import manthe.my_0;
import manthe.o7;
import manthe.p1;
import manthe.pb_0;
import manthe.pd;
import manthe.qU;
import manthe.qp;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.s6;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.rz
 */
public class rz_0<T extends pb_0>
extends qp
implements qU,
s6 {
    private static final int M = 2;
    private final rf_0 G = new rf_0(false);
    private final rf_0 I = new rf_0(false);
    private final rg_0 J;
    private final int L;
    private rl_0 K;
    private double F = 0.5;
    private T H;

    public rz_0(String string, int n6, T ... TArray) {
        this.L = n6;
        this.a((T)new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        if (string != null) {
            this.K = new rl_0(string, my_0.i, 0.7);
            this.K.b(Color.WHITE);
            this.K.j(false);
        }
        this.J = new rg_0("", true);
        this.J.j(false);
        this.J.z().b(Color.WHITE);
        this.J.z().j(false);
        this.J.a(new DW(this));
        this.G.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.G.b(this.J);
        this.G.b(new Color(120, 120, 120));
        this.G.j(false);
        this.G.g(true);
        this.I.a(false);
        this.I.a(new D7(0.0, 0.0, TArray.length, n6, new pd(0, 2, 0, 2)));
        for (T t : TArray) {
            rg_0 rg_02 = ((pb_0)t).a();
            rg_02.a(new mX(this, (pb_0)t));
            if (n6 == 1) {
                rg_02.a(new dz_0(this, (pb_0)t));
            }
            this.I.b(rg_02);
        }
        this.b(this.K);
        this.b(this.G);
        this.b(this.I);
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        this.J.c(d3);
        for (p1 p12 : this.I.v()) {
            p12.c((d3 - 4.0) / (double)this.L);
        }
        if (this.K != null) {
            this.K.c(d3);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.J.b(d3);
        this.G.b(d3);
        for (p1 p12 : this.I.v()) {
            p12.b(d3);
        }
        if (this.K != null) {
            this.K.b(d3 * 0.6);
        }
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.e()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.z()) {
                o7.a(new Color(45, 45, 45), this.A(), this.G, 4);
            } else {
                o7.a(new Color(45, 45, 45), this.A(), this.G, 0, 2, 1);
                o7.a(new Color(45, 45, 45), this.A(), this.I, 0, 2, 3);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }

    @Override
    public boolean z() {
        return !this.I.e();
    }

    @Override
    public void f(boolean bl) {
        this.I.a(!bl);
    }

    public T a() {
        return this.H;
    }

    public void a(T t) {
        this.H = t;
        this.J.z().a(this.b(t));
        ((pb_0)this.H).e().d();
    }

    private String b(T t) {
        if (t instanceof BI) {
            return t.H();
        }
        return ((pb_0)t).toString();
    }

    @Override
    public double A() {
        return this.F;
    }

    @Override
    public void e(double d3) {
        this.F = d3;
    }

    static pb_0 a(rz_0 rz_02) {
        return rz_02.H;
    }
}

