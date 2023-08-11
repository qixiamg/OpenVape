/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.f;

/*
 * Renamed from manthe.i
 */
public class i_0
extends f<Double> {
    private double f;
    private double e;
    private double g;

    public i_0(double d3, double d4, double d5) {
        super(d3);
        this.f = d4;
        this.e = d5;
        this.g = d5 - d4;
    }

    public Double o() {
        if (this.h() == 0L) {
            return this.e;
        }
        double d3 = this.l();
        if (d3 == 0.0) {
            return this.f;
        }
        if (d3 == 100.0) {
            return this.e;
        }
        return this.f + this.l() * this.g / 100.0;
    }

    public double p() {
        return this.f;
    }

    public double n() {
        return this.e;
    }
}

