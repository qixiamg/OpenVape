/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kA
extends kl_0 {
    private final ex_0 d;
    private final double g;
    private final double e;
    private final double f;

    public kA(ex_0 ex_02, double d3, double d4, double d5) {
        this.d = ex_02;
        this.g = d3;
        this.e = d4;
        this.f = d5;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().f()) {
            y52.a(this);
        }
        return super.fire();
    }

    public ex_0 getEntity() {
        return this.d;
    }

    public double getX() {
        return this.g;
    }

    public double getY() {
        return this.e;
    }

    public double getZ() {
        return this.f;
    }
}

