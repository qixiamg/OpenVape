/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.I;
import manthe.ds_2;
import manthe.ex_0;
import manthe.pf_0;

public class K
extends I {
    private final double g;
    private final double h;
    private final double i;

    public K(double d3, double d4, double d5) {
        this.g = d3;
        this.h = d4;
        this.i = d5;
    }

    @Override
    public boolean f() {
        double d3 = pf_0.a((ex_0)ds_2.k(), this.g, this.i);
        if (d3 > (double)this.b) {
            this.c = pf_0.b(ds_2.k(), this.g, this.i) ? (this.c -= this.a()) : (this.c += this.a());
            return false;
        }
        return true;
    }

    @Override
    public boolean d() {
        double d3 = pf_0.a((ex_0)ds_2.k(), this.g, this.h, this.i);
        if (d3 > (double)this.b || d3 < (double)(-this.b)) {
            this.f = pf_0.c(ds_2.k(), this.g, this.h, this.i) ? (this.f += this.a()) : (this.f -= this.a());
            return false;
        }
        return true;
    }
}

