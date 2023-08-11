/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bc_0;
import manthe.bl_0;
import manthe.p1;
import manthe.pd;
import manthe.yG;

public class D7
implements bl_0 {
    public static final int i = 5000;
    private final int f;
    private final double b;
    private final double g;
    private final pd d;
    private int e;
    private boolean h = true;
    private boolean c = true;
    private yG a;
    private static int j;

    public D7(double d3, double d4, int n6, int n10, pd pd2) {
        this.g = d3;
        this.b = d4;
        this.f = n6;
        this.e = n10;
        this.d = pd2;
    }

    public int i() {
        return this.e;
    }

    public void a(int n6) {
        this.e = n6;
    }

    public int e() {
        if (this.f == 5000) {
            double d3 = this.a.w().size();
            double d4 = this.i();
            return (int)Math.ceil(d3 / d4);
        }
        return this.f;
    }

    @Override
    public double c() {
        return this.b;
    }

    @Override
    public double a() {
        return this.g;
    }

    public pd f() {
        return this.d;
    }

    @Override
    public void a(yG yG2) {
        this.a = yG2;
    }

    public void h() {
        this.h = false;
    }

    public void g() {
        this.c = false;
    }

    @Override
    public void b() {
        if (this.e() * this.i() < this.a.w().size()) {
            throw new bc_0("Not enough cells to render all children!");
        }
        p1[][] p1Array = new p1[this.i()][this.e()];
        p1[][] p1Array2 = new p1[this.e()][this.i()];
        int n6 = 0;
        int n10 = 0;
        for (p1 p12 : this.a.w()) {
            int n11 = 0;
            if (n6 != 0 && (n11 = n6 % this.i()) == 0) {
                ++n10;
            }
            p1Array[n11][n10] = p12;
            p1Array2[n10][n11] = p12;
            ++n6;
        }
        if (n6 > 0) {
            p1[] p1Array3;
            Object object = new double[this.i()];
            for (int i = 0; i < p1Array.length; ++i) {
                p1[] p1Array4;
                p1Array3 = p1Array4 = p1Array[i];
                int n12 = p1Array3.length;
                for (int j = 0; j < n12; ++j) {
                    p1 p13 = p1Array3[j];
                    if (p13 == null || !(p13.q() > object[i])) continue;
                    object[i] = p13.q();
                }
            }
            double[] dArray = new double[this.e()];
            for (int i = 0; i < p1Array2.length; ++i) {
                for (p1 p14 : p1Array3 = p1Array2[i]) {
                    if (p14 == null || !(p14.q() > dArray[i])) continue;
                    dArray[i] = p14.b();
                }
            }
            double d3 = 0.0;
            for (Object object2 : object) {
                d3 += object2;
            }
            double d4 = 0.0;
            for (double d5 : dArray) {
                d4 += d5;
            }
            int n13 = this.e() - 1;
            int n14 = this.i() - 1;
            double d6 = (double)(this.d.c + this.d.e) + d3 + (double)n14 * this.g;
            double d7 = (double)(this.d.d + this.d.a) + d4 + (double)n13 * this.b;
            if (this.c) {
                this.a.m().d(d7);
            }
            if (this.h) {
                this.a.m().c(d6);
            }
            double d8 = this.a.t() + (double)this.d.c;
            double d10 = this.a.k() + (double)this.d.d;
            for (int i = 0; i < this.e(); ++i) {
                for (int j = 0; j < this.i(); ++j) {
                    p1 p15 = p1Array2[i][j];
                    if (p15 == null) continue;
                    p15.a(d8);
                    p15.d(d10);
                    d8 += object[j];
                    d8 += this.a();
                }
                d8 = this.a.t() + (double)this.d.c;
                d10 += dArray[i];
                d10 += this.c();
            }
        }
    }

    public static void b(int n6) {
        j = n6;
    }

    public static int j() {
        return j;
    }

    public static int d() {
        int n6 = D7.j();
        if (n6 == 0) {
            return 94;
        }
        return 0;
    }

    private static bc_0 a(bc_0 bc_02) {
        return bc_02;
    }

    static {
        if (D7.d() != 0) {
            D7.b(62);
        }
    }
}

