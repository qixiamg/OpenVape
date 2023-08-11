/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.gK;

public class oC {
    public double b;
    public double a;
    public double d;
    private static String[] c;

    public oC() {
        this.b = 0.0;
        this.a = 0.0;
        this.d = 0.0;
    }

    public oC(gK gK2) {
        this.b = gK2.g();
        this.a = gK2.h();
        this.d = gK2.f();
    }

    public oC(double d3, double d4, double d5) {
        this.b = d3;
        this.a = d4;
        this.d = d5;
    }

    public double a() {
        return this.b;
    }

    public void b(double d3) {
        this.b = d3;
    }

    public double b() {
        return this.a;
    }

    public void a(double d3) {
        this.a = d3;
    }

    public double d() {
        return this.d;
    }

    public void c(double d3) {
        this.d = d3;
    }

    public void a(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d3 = this.b;
        double d4 = this.a * (double)f11 + this.d * (double)f12;
        double d5 = this.d * (double)f11 - this.a * (double)f12;
        this.b = d3;
        this.a = d4;
        this.d = d5;
    }

    public void b(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d3 = this.b * (double)f11 + this.d * (double)f12;
        double d4 = this.a;
        double d5 = this.d * (double)f11 - this.b * (double)f12;
        this.b = d3;
        this.a = d4;
        this.d = d5;
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    public static String[] c() {
        return c;
    }

    static {
        if (oC.c() != null) {
            oC.b(new String[2]);
        }
    }
}

