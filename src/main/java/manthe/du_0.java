/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DU;
import manthe.rH;

/*
 * Renamed from manthe.Du
 */
class du_0
extends DU {
    final rH e;

    du_0(rH rH2, double d3, double d4, double d5, double d6) {
        this.e = rH2;
        super(d3, d4, d5, d6);
    }

    @Override
    public double a() {
        return this.e.t();
    }

    @Override
    public double b() {
        return this.e.k();
    }

    @Override
    public double d() {
        return this.e.q();
    }

    @Override
    public double c() {
        return this.e.b();
    }
}

