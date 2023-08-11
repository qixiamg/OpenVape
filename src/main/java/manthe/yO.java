/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.oC;

public class yO {
    public static final double a = 2.6;

    public static double a(oC oC2, double d3, oC oC3, double d4, double d5, double d6, double d7, double d8, double d10) {
        return yO.a(oC2.a(), oC2.b() + d3, oC2.d(), oC3.a(), oC3.b(), oC3.d(), d4, d5, d6, d7, d8, d10);
    }

    public static double a(double d3, double d4, double d5, double d6, double d7, double d8, double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = Math.sqrt(d6 * d6 + d7 * d7 + d8 * d8);
        if (d16 == 0.0) {
            d16 = 1.0;
        }
        double d17 = d10 - d3;
        double d18 = d11 - d4;
        double d19 = d12 - d5;
        double d20 = Math.sqrt(d17 * d17 + d18 * d18 + d19 * d19);
        double d21 = d20 * d6 / d16;
        double d22 = d20 * d7 / d16;
        double d23 = d20 * d8 / d16;
        double d24 = 0.0;
        d24 += Math.max(Math.abs(d17 - d21) - (d13 / 2.0 + d15), 0.0);
        d24 += Math.max(Math.abs(d19 - d23) - (d13 / 2.0 + d15), 0.0);
        if ((d24 += Math.max(Math.abs(d18 - d22) - (d14 / 2.0 + d15), 0.0)) > 1.0) {
            d24 = Math.sqrt(d24);
        }
        return d24;
    }
}

