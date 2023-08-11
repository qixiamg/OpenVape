/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.ac_1;
import manthe.ex_0;
import manthe.fP;
import manthe.yJ;

class mT {
    private final boolean e;
    private final Color a;
    private final ex_0 g;
    private double f;
    private double b;
    private double c;
    private double d;
    final yJ h;

    mT(yJ yJ2, double d3, double d4, double d5, fP fP2, ex_0 ex_02, Color color) {
        this.h = yJ2;
        this.f = -100.0;
        this.b = -100.0;
        this.c = -100.0;
        this.d = -100.0;
        this.g = ex_02;
        this.a = color;
        double[] dArray = ac_1.a(d3 + fP2.f(), d4 + fP2.l(), d5 + fP2.j());
        double[] dArray2 = ac_1.a(d3 + fP2.h(), d4 + fP2.l(), d5 + fP2.j());
        double[] dArray3 = ac_1.a(d3 + fP2.h(), d4 + fP2.l(), d5 + fP2.i());
        double[] dArray4 = ac_1.a(d3 + fP2.f(), d4 + fP2.l(), d5 + fP2.i());
        double[] dArray5 = ac_1.a(d3 + fP2.f(), d4 + fP2.g(), d5 + fP2.j());
        double[] dArray6 = ac_1.a(d3 + fP2.h(), d4 + fP2.g(), d5 + fP2.j());
        double[] dArray7 = ac_1.a(d3 + fP2.h(), d4 + fP2.g(), d5 + fP2.i());
        double[] dArray8 = ac_1.a(d3 + fP2.f(), d4 + fP2.g(), d5 + fP2.i());
        boolean bl = this.e = dArray != null && dArray[2] >= 0.0 && dArray[2] < 1.0 && dArray2[2] >= 0.0 && dArray2[2] < 1.0 && dArray3[2] >= 0.0 && dArray3[2] < 1.0 && dArray4[2] >= 0.0 && dArray4[2] < 1.0 && dArray5[2] >= 0.0 && dArray5[2] < 1.0 && dArray6[2] >= 0.0 && dArray6[2] < 1.0 && dArray7[2] >= 0.0 && dArray7[2] < 1.0 && dArray8[2] >= 0.0 && dArray8[2] < 1.0;
        if (!this.e) {
            return;
        }
        double d6 = dArray[0];
        double d7 = dArray[1];
        double d8 = dArray8[0];
        double d10 = dArray8[1];
        double[] dArray9 = new double[]{dArray[0], dArray2[0], dArray3[0], dArray4[0], dArray5[0], dArray6[0], dArray7[0], dArray8[0]};
        double[] dArray10 = new double[]{dArray[1], dArray2[1], dArray3[1], dArray4[1], dArray5[1], dArray6[1], dArray7[1], dArray8[1]};
        for (double d11 : dArray9) {
            if (!(d11 < d6)) continue;
            d6 = d11;
        }
        for (double d11 : dArray9) {
            if (!(d11 > d8)) continue;
            d8 = d11;
        }
        for (double d11 : dArray10) {
            if (!(d11 < d7)) continue;
            d7 = d11;
        }
        for (double d11 : dArray10) {
            if (!(d11 > d10)) continue;
            d10 = d11;
        }
        this.f = d6;
        this.b = d7;
        this.c = d8;
        this.d = d10;
    }

    static boolean c(mT mT2) {
        return mT2.e;
    }

    static double b(mT mT2) {
        return mT2.f;
    }

    static double e(mT mT2) {
        return mT2.c;
    }

    static double d(mT mT2) {
        return mT2.d;
    }

    static double a(mT mT2) {
        return mT2.b;
    }

    static ex_0 g(mT mT2) {
        return mT2.g;
    }

    static Color f(mT mT2) {
        return mT2.a;
    }
}

