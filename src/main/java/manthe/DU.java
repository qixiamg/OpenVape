/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bo_0;

public class DU {
    private double d;
    private double b;
    private double c;
    private double a;

    public DU(double d3, double d4, double d5, double d6) {
        this.d = d3;
        this.b = d4;
        this.c = d5;
        this.a = d6;
    }

    public boolean a(bo_0 bo_02) {
        return this.b(bo_02.a, bo_02.b);
    }

    public boolean b(double d3, double d4) {
        return d3 >= this.a() && d3 <= this.a() + this.d() && d4 >= this.b() && d4 <= this.b() + this.c();
    }

    public boolean a(DU dU) {
        return this.b(dU) > 0.0;
    }

    public double b(DU dU) {
        double d3 = Math.max(0.0, Math.min(this.a() + this.d(), dU.a() + dU.d()) - Math.max(this.a(), dU.a()));
        double d4 = Math.max(0.0, Math.min(this.b() + this.c(), dU.b() + dU.c()) - Math.max(this.b(), dU.b()));
        return d3 * d4;
    }

    public double a() {
        return this.d;
    }

    public void a(double d3) {
        this.d = d3;
    }

    public double b() {
        return this.b;
    }

    public void b(double d3) {
        this.b = d3;
    }

    public double d() {
        return this.c;
    }

    public void c(double d3) {
        this.c = d3;
    }

    public double c() {
        return this.a;
    }

    public void d(double d3) {
        this.a = d3;
    }

    public DU a(double d3, double d4) {
        return new DU(d3 + this.a(), d4 + this.b(), this.d(), this.c());
    }

    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.a(), this.b(), this.d(), this.c());
    }
}

