/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class pE {
    private double a;
    private double b;

    public pE(double d3, double d4) {
        this.a = d3;
        this.b = d4;
    }

    public double b() {
        return this.b;
    }

    public double a() {
        return this.a;
    }

    public String toString() {
        return String.format("[%s, %s]", this.a, this.b);
    }
}

