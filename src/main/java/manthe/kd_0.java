/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.kd
 */
public class kd_0
extends kl_0 {
    private static float e;
    private final ex_0 d;

    public kd_0(int n6, Object object) {
        this.d = new ex_0(object);
        this.a = n6;
        if (n6 == da_0.b) {
            e = this.d.x();
        }
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public double getStepHeight() {
        return this.d.x();
    }

    public void setStepHeight(double d3) {
        this.d.c((float)d3);
    }

    public double getRealHeight() {
        return e;
    }

    static float access$000() {
        return e;
    }
}

