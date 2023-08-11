/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.ds_2;
import manthe.ej_0;
import manthe.ex_0;
import manthe.ez_0;
import manthe.iV;

/*
 * Renamed from manthe.ef
 */
public class ef_0
extends cy_0 {
    private static double g;
    private static double f;
    private static double e;

    public ef_0(Object object) {
        super(object);
    }

    public static void l() {
        ej_0 ej_02 = ds_2.B();
        float f10 = ds_2.O().g();
        g = ej_02.T() + (ej_02.z() - ej_02.T()) * (double)f10;
        f = ej_02.R() + (ej_02.l() - ej_02.R()) * (double)f10;
        e = ej_02.X() + (ej_02.g() - ej_02.X()) * (double)f10;
    }

    public static ef_0 k() {
        return new ef_0(iV.a(ef_0.a.M().aQ));
    }

    public double m() {
        return g;
    }

    public double n() {
        return f;
    }

    public double j() {
        return e;
    }

    public float g() {
        return iV.b(ef_0.a.M().aQ, this.b);
    }

    public float i() {
        return iV.d(ef_0.a.M().aQ, this.b);
    }

    public double h() {
        return iV.c(ef_0.a.M().aQ, this.b);
    }

    public double o() {
        return iV.e(ef_0.a.M().aQ, this.b);
    }

    public double f() {
        return iV.a(ef_0.a.M().aQ, this.b);
    }

    public ez_0 a(ex_0 ex_02) {
        return new ez_0(iV.a(ef_0.a.M().aQ, this.b, ex_02.a()));
    }
}

