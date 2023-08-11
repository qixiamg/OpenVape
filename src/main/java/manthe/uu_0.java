/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import java.util.Random;

import org.lwjgl.input.Keyboard;

/*
 * Renamed from manthe.uu
 */
class uu_0 {
    private final int c;
    private final boolean h;
    private final boolean j;
    private final Random r;
    private final Random e;
    private final Random s;
    private final Random i;
    private final Random n;
    private boolean f;
    private long t;
    private int p;
    private boolean u;
    private int g;
    private boolean a;
    private int m;
    private int l;
    private int d;
    private int q;
    private int k;
    private final boolean b;
    final z1 o;

    public uu_0(z1 z12, int n6, boolean bl, boolean bl2) {
        this.o = z12;
        this.r = new Random();
        this.e = new Random();
        this.s = new Random();
        this.i = new Random();
        this.n = new Random();
        this.a = true;
        this.c = n6;
        this.h = bl;
        this.j = bl2;
        int n10 = ds_2.s().m().i();
        this.b = n10 != -100;
    }

    private void f() {
        u5.b(this.b ? 1 : 0);
    }

    private void h() {
        u5.a(this.b ? 1 : 0);
    }

    private void b() {
        u5.b(this.b ? 0 : 1);
    }

    private void a() {
        u5.a(this.b ? 0 : 1);
    }

    private void d() {
        if (this.c == 0) {
            this.f();
        } else {
            this.b();
        }
    }

    private void c() {
        if (this.c == 0) {
            this.h();
        } else {
            this.a();
        }
    }

    public void e() throws Exception {
        boolean bl;
        dx_1 dx_12 = ds_2.x();
        boolean bl2 = bl = this.h && z1.j(this.o).u() != false && dx_12.a(A5.bt);
        if (ds_2.x().a() != null && !bl) {
            this.f = true;
            return;
        }
        if (this.c == 0 && !this.o.T() && !bl) {
            return;
        }
        if (this.c == 1 && !z1.g(this.o)) {
            return;
        }
        if (this.c == 1) {
            if (!VapeSettings.d()) {
                this.f = true;
                Thread.sleep(50L);
                return;
            }
        } else if (!VapeSettings.f()) {
            this.f = true;
            return;
        }
        if (this.f) {
            this.f = false;
            Thread.sleep(50L);
            return;
        }
        long l6 = this.g() - 5L;
        if (l6 - 50L <= 0L) {
            l6 = 45L;
        }
        double d3 = (double)(100L - Math.min(l6, 99L) + 45L) / 100.0;
        double d4 = 40.0 * d3;
        double d5 = ((double)(30 + this.n.nextInt(10)) + d4) / 100.0;
        long l10 = (long)((double)l6 * (1.0 - d5));
        long l11 = (long)((double)l6 * d5);
        if (this.c == 1 ? !VapeSettings.d() : !VapeSettings.f()) {
            return;
        }
        if (bl && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54) && z1.i(this.o).size() > 0)) {
            z1.a(this.o, new de_1(dx_12.a()));
            return;
        }
        if (dx_12.e()) {
            this.d();
            if (this.j && z1.m(this.o).u().booleanValue() && VapeSettings.d()) {
                this.b();
            }
            Thread.sleep(l10);
            if (!this.o.N()) {
                return;
            }
            if (this.j && ds_2.k().aT() && z1.m(this.o).u().booleanValue()) {
                this.a();
            }
            this.c();
        }
        Thread.sleep(l11);
    }

    long g() {
        int n6;
        dy_0 dy_02 = z1.d(this.o);
        if (this.c == 1) {
            dy_02 = z1.e(this.o);
        }
        int n10 = dy_02.v()[0].intValue();
        int n11 = dy_02.v()[1].intValue();
        int n12 = n11 - n10;
        int n13 = n6 = n12 <= 0 ? n10 : this.r.nextInt(n12) + n10 + 1;
        if (n6 == 0) {
            n6 = 1;
        }
        if (!this.u) {
            this.t = 1000 / n6;
            if (this.i.nextInt(4) == 1) {
                this.u = true;
                this.g = 1 + this.i.nextInt(5);
            } else if (this.i.nextInt(10) != 1 && this.i.nextInt(10) == 1) {
                this.u = true;
                this.g = 5 + this.i.nextInt(10);
            }
        }
        if (this.u) {
            ++this.p;
            if (this.p >= this.g) {
                this.p = 0;
                this.u = false;
            }
        }
        if (this.a) {
            ++this.l;
            if (this.l >= this.d) {
                this.q = 75 + this.r.nextInt(125);
                this.a = false;
                this.l = 0;
            }
            int n14 = this.e.nextInt(5) == 3 ? 50 : 25;
            return this.t + (long)n14;
        }
        ++this.m;
        if (this.m >= this.q) {
            this.a = true;
            this.d = 7 + this.r.nextInt(8);
            this.m = 0;
        }
        return this.t;
    }

    static void a(uu_0 uu_02) {
        uu_02.d();
    }

    static void b(uu_0 uu_02) {
        uu_02.c();
    }
}

