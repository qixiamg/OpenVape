/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.AO;
import manthe.cy_0;
import manthe.ds_2;
import manthe.e3;
import manthe.eN;
import manthe.ex_0;
import manthe.o7;
import org.lwjgl.opengl.GL11;

public class Cp {
    private static boolean d;
    private final eN e;
    private final AO j = new AO();
    public float m;
    public float c;
    public double k;
    public double o;
    public double i;
    private int h = 720;
    private int f = 400;
    private int a = 30;
    private int l;
    private boolean n;
    private boolean b;
    private static cy_0[] g;

    public Cp() {
        this(false);
    }

    public Cp(boolean bl) {
        this.b = bl;
        this.e = eN.a(this.h, this.f, true);
        this.a();
    }

    public static boolean e() {
        return d;
    }

    public static void c(boolean bl) {
        d = bl;
    }

    protected void b(boolean bl) {
        if (bl) {
            this.e.a(true);
        } else {
            this.e.h();
        }
        d = bl;
    }

    public void f() {
        try {
            if (d || !this.c()) {
                return;
            }
            if (ds_2.s().w() > 0 || !ds_2.s().z()) {
                return;
            }
            if (ds_2.s().f() || ds_2.s().f()) {
                return;
            }
            if (ds_2.B().e()) {
                return;
            }
            int n6 = ds_2.F();
            int n10 = ds_2.H();
            float f10 = ds_2.B().U();
            float f11 = ds_2.B().ag();
            float f12 = ds_2.B().K();
            float f13 = ds_2.B().aa();
            boolean bl = ds_2.s().h();
            int n11 = ds_2.s().i();
            boolean bl2 = ds_2.s().q();
            double d3 = ds_2.B().z();
            double d4 = ds_2.B().aq();
            double d5 = ds_2.B().T();
            double d6 = ds_2.B().l();
            double d7 = ds_2.B().an();
            double d8 = ds_2.B().R();
            double d10 = ds_2.B().g();
            double d11 = ds_2.B().ap();
            double d12 = ds_2.B().X();
            float f14 = ds_2.s().k();
            float f15 = ds_2.M().g();
            float f16 = ds_2.M().f();
            ds_2.B().h(this.k);
            ds_2.B().a(this.k);
            ds_2.B().b(this.k);
            ds_2.B().i(this.o);
            ds_2.B().j(this.o);
            ds_2.B().f(this.o);
            ds_2.B().e(this.i);
            ds_2.B().g(this.i);
            ds_2.B().f(this.i);
            ds_2.c(this.h);
            ds_2.d(this.f);
            ds_2.B().i(this.m);
            ds_2.B().f(this.m);
            ds_2.B().d(this.c);
            ds_2.B().e(this.c);
            ds_2.s().b(0);
            ds_2.s().c(false);
            ds_2.s().a(true);
            ds_2.s().a((float)this.l);
            ds_2.M().a(1.0f);
            ds_2.M().b(1.0f);
            this.b(true);
            this.e.j();
            if (this.j.a(this.a)) {
                ds_2.M().a(ds_2.O().g(), 0L);
                this.j.d();
            }
            this.b(false);
            ds_2.c(n6);
            ds_2.d(n10);
            ds_2.B().i(f10);
            ds_2.B().f(f11);
            ds_2.B().d(f12);
            ds_2.B().e(f13);
            ds_2.s().b(n11);
            ds_2.s().a(bl);
            ds_2.s().c(bl2);
            ds_2.B().h(d3);
            ds_2.B().a(d4);
            ds_2.B().b(d5);
            ds_2.B().i(d6);
            ds_2.B().j(d7);
            ds_2.B().c(d8);
            ds_2.B().e(d10);
            ds_2.B().g(d11);
            ds_2.B().f(d12);
            ds_2.s().a(f14);
            ds_2.M().a(f15);
            ds_2.M().b(f16);
            this.e.h();
            ds_2.w().a(true);
            this.n = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private boolean c() {
        return true;
    }

    public void a(boolean bl, double d3, double d4, double d5, double d6) {
        GL11.glEnable((int)2903);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        boolean bl3 = GL11.glIsEnabled((int)2896);
        boolean bl4 = GL11.glIsEnabled((int)3008);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        if (!bl2) {
            e3.p();
        }
        if (bl3) {
            e3.l();
        }
        e3.i();
        e3.f();
        if (bl) {
            this.e.j();
            if (this.b) {
                o7.b(d3, d4, d5, d6);
            }
            this.e.g();
        }
        if (!bl2) {
            e3.j();
        }
        if (bl3) {
            e3.n();
        }
        if (bl4) {
            e3.k();
        }
        if (bl5) {
            e3.r();
        }
    }

    protected void a(ex_0 ex_02) {
        this.k = ex_02.T() - (ex_02.T() - ex_02.z()) * (double)ds_2.O().f();
        this.o = ex_02.R() - (ex_02.R() - ex_02.l()) * (double)ds_2.O().f();
        this.i = ex_02.X() - (ex_02.X() - ex_02.g()) * (double)ds_2.O().f();
    }

    protected void b(ex_0 ex_02) {
        this.a(ex_02);
        this.m = ex_02.U();
        this.c = ex_02.K();
    }

    public void a() {
        this.e.b(this.h, this.f);
    }

    public int d() {
        return this.h;
    }

    public void d(int n6) {
        this.h = n6;
        this.n = false;
    }

    public int b() {
        return this.f;
    }

    public void c(int n6) {
        this.f = n6;
        this.n = false;
    }

    public boolean g() {
        return this.n;
    }

    public Cp a(boolean bl) {
        this.b = bl;
        return this;
    }

    public void a(int n6) {
        this.a = n6;
    }

    public void b(int n6) {
        this.l = n6;
    }

    public static void b(cy_0[] cy_0Array) {
        g = cy_0Array;
    }

    public static cy_0[] h() {
        return g;
    }

    static {
        if (Cp.h() != null) {
            Cp.b(new cy_0[4]);
        }
    }
}

