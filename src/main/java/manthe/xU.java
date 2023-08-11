/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DU;
import manthe.bo_0;
import manthe.o7;
import manthe.wM;

public abstract class xU
extends wM {
    private String D;
    protected final double C = 1.0;
    protected boolean z;
    protected bo_0 A;
    private static String B;

    public xU(String string) {
        this.D = string;
    }

    public double a(double d3, double d4, double d5, double d6, double d7) {
        double d8 = d7 / d4 * 100.0;
        d8 = Math.min(d8, 100.0);
        d8 = Math.max(d8, 0.0);
        double d10 = d6 * d8;
        double d11 = d10 % d5;
        double d12 = d10 - d11;
        return d12 + d3;
    }

    public double m() {
        return o7.b().a - this.A.a;
    }

    public DU a(double d3, double d4, double d5) {
        return new DU(d3 - d5, d4 - d5, d5 * 2.0, d5 * 2.0);
    }

    public String n() {
        return this.D;
    }

    public void c(String string) {
        this.D = string;
    }

    public static void b(String string) {
        B = string;
    }

    public static String l() {
        return B;
    }

    static {
        if (xU.l() == null) {
            xU.b("a0BFMb");
        }
    }
}

