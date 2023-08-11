/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bh_1;
import manthe.gK;
import manthe.gf_0;
import manthe.gg_0;
import manthe.jC;

public class g1
extends gf_0 {
    public g1(Object object) {
        super(object);
    }

    public static g1 a(gK gK2) {
        return new g1(g1.a.M().bN.d(gK2.a()));
    }

    public static g1 a(bh_1 bh_12) {
        return g1.a(bh_12.d(), bh_12.c(), bh_12.a());
    }

    public static g1 a(int n6, int n10, int n11) {
        return new g1(g1.a.M().bN.a(n6, n10, n11));
    }

    public static g1 a(double d3, double d4, double d5) {
        return new g1(g1.a.M().bN.a(d3, d4, d5));
    }

    public g1 b(int n6, int n10, int n11) {
        return g1.a(this.h() + n6, this.f() + n10, this.g() + n11);
    }

    public g1 l() {
        return new g1(jC.f(g1.a.M().bN, this.b));
    }

    public g1 k() {
        return new g1(jC.c(g1.a.M().bN, this.b));
    }

    public g1 n() {
        return new g1(jC.e(g1.a.M().bN, this.b));
    }

    public g1 j() {
        return new g1(jC.d(g1.a.M().bN, this.b));
    }

    public g1 i() {
        return new g1(jC.a(g1.a.M().bN, this.b));
    }

    public g1 m() {
        return new g1(jC.b(g1.a.M().bN, this.b));
    }

    public g1 a(gg_0 gg_02) {
        return new g1(g1.a.M().bN.a(this.b, gg_02.a(), 1));
    }

    @Override
    public String toString() {
        return this.h() + " " + this.f() + " " + this.g();
    }
}

