/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.km
 */
public class km_0
extends kl_0 {
    public static ex_0 f;
    static double g;
    static boolean h;
    private static ex_0 j;
    private static float k;
    private static float d;
    private static boolean e;
    private static cy_0[] i;

    public km_0(ex_0 ex_02, int n6) {
        f = ex_02;
        if (n6 == da_0.b) {
            h = false;
            k = f.U();
            d = f.K();
            e = f.v();
            g = f.Y().l();
        }
        this.a = n6;
    }

    public static float getRotationYaw() {
        return k;
    }

    public static void setRotationYaw(float f10) {
        k = f10;
    }

    public static float getRotationPitch() {
        return d;
    }

    public static void setRotationPitch(float f10) {
        d = f10;
    }

    public static boolean isOnGround() {
        return e;
    }

    public static void setOnGround(boolean bl) {
        e = bl;
    }

    public static double getY() {
        return g;
    }

    public static void setY(double d3) {
        g = d3;
    }

    public static void setShouldAlwaysSend(boolean bl) {
    }

    public static boolean shouldAlwaysSend() {
        return h;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        if (this.a == da_0.b) {
            j = f.m();
            if (km_0.shouldAlwaysSend()) {
                f.b(new ex_0(null));
            }
        } else {
            f.b(j);
        }
        return this.d();
    }

    public static void a(cy_0[] cy_0Array) {
        i = cy_0Array;
    }

    public static cy_0[] e() {
        return i;
    }

    static {
        if (km_0.e() != null) {
            km_0.a(new cy_0[4]);
        }
    }
}

