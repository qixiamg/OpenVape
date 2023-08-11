/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Y;
import manthe.g1;
import manthe.gg_0;

/*
 * Renamed from manthe.bH
 */
public class bh_1 {
    private final int c;
    private final int b;
    private final int a;
    private static String d;

    public bh_1(int n6, int n10, int n11) {
        this.c = n6;
        this.b = n10;
        this.a = n11;
    }

    public bh_1(double d3, double d4, double d5) {
        this(Y.c(d3), Y.c(d4), Y.c(d5));
    }

    public static bh_1 a(g1 g12) {
        return new bh_1(g12.h(), g12.f(), g12.g());
    }

    public int d() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public bh_1 a(gg_0 gg_02) {
        return new bh_1(this.d() + gg_02.i(), this.c() + gg_02.j(), this.a() + gg_02.k());
    }

    public bh_1 a(int n6, int n10, int n11) {
        return new bh_1(this.d() + n6, this.c() + n10, this.a() + n11);
    }

    public static void b(String string) {
        d = string;
    }

    public static String b() {
        return d;
    }

    static {
        if (bh_1.b() == null) {
            bh_1.b("HAs3");
        }
    }
}

