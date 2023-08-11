/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.gK;
import manthe.gb_0;
import manthe.jj_0;

public class fP
extends cy_0 {
    public fP(Object object) {
        super(object);
    }

    public static fP a(double d3, double d4, double d5, double d6, double d7, double d8) {
        return new fP(fP.a.M().bZ.a(d3, d4, d5, d6, d7, d8));
    }

    public fP e(double d3, double d4, double d5) {
        return new fP(fP.a.M().bZ.a(this.b, d3, d4, d5));
    }

    public fP d(double d3, double d4, double d5) {
        return new fP(fP.a.M().bZ.c(this.b, d3, d4, d5));
    }

    public gb_0 a(gK gK2, gK gK3) {
        return new gb_0(fP.a.M().bZ.a(this.b, gK2.a(), gK3.a()));
    }

    public boolean a(gK gK2) {
        return fP.a.M().bZ.a(this.b, gK2.a());
    }

    public fP b(double d3, double d4, double d5) {
        return new fP(fP.a.M().bZ.b(this.b, d3, d4, d5));
    }

    public double f() {
        return fP.a.M().bZ.d(this.b);
    }

    public double l() {
        return fP.a.M().bZ.g(this.b);
    }

    public double j() {
        return fP.a.M().bZ.f(this.b);
    }

    public double h() {
        return fP.a.M().bZ.e(this.b);
    }

    public double g() {
        return fP.a.M().bZ.c(this.b);
    }

    public double i() {
        return fP.a.M().bZ.a(this.b);
    }

    public fP k() {
        return new fP(jj_0.a(fP.a.M().bZ, this.b));
    }

    public fP c(double d3, double d4, double d5) {
        if (V.c() > 13) {
            return this.b(d3, d4, d5);
        }
        return new fP(jj_0.b(fP.a.M().bZ, this.b, d3, d4, d5));
    }

    public double b(fP fP2, double d3) {
        return jj_0.c(fP.a.M().bZ, this.b, fP2.a(), d3);
    }

    public double c(fP fP2, double d3) {
        return jj_0.a(fP.a.M().bZ, this.b, fP2.a(), d3);
    }

    public double a(fP fP2, double d3) {
        return jj_0.b(fP.a.M().bZ, this.b, fP2.a(), d3);
    }

    public void b(fP fP2) {
        jj_0.a(fP.a.M().bZ, this.b, fP2.a());
    }

    public fP a(double d3, double d4, double d5) {
        return new fP(jj_0.a(fP.a.M().bZ, this.b, d3, d4, d5));
    }

    public boolean a(fP fP2) {
        return jj_0.b(fP.a.M().bZ, this.b, fP2.a());
    }
}

