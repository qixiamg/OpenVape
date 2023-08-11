/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.eJ;
import manthe.oC;

public class An {
    public static float a(oC oC2, double d3) {
        eJ eJ2 = ds_2.k();
        double d4 = 0.05f;
        double d5 = oC2.a() - eJ2.z();
        double d6 = oC2.d() - eJ2.g();
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        double d8 = oC2.b() - (eJ2.l() + (double)eJ2.am());
        double d10 = 2.0 * d8 * (d3 * d3);
        double d11 = d4 * (d7 * d7);
        double d12 = Math.sqrt(d3 * d3 * d3 * d3 - d4 * (d11 + d10));
        double d13 = d3 * d3 + d12;
        double d14 = d3 * d3 - d12;
        double d15 = Math.atan2(d13, d4 * d7);
        double d16 = Math.atan2(d14, d4 * d7);
        return (float)(-Math.toDegrees(Math.min(d15, d16)));
    }
}

