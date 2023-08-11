/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class lf
extends l9 {
    private final e7 i;
    private final ex_0 f;
    private final dx_2 j;
    private final double h;
    private final int k;
    private final float g;

    public lf(cv_0 cv_02, e7 e72, ex_0 ex_02, dx_2 dx_22, double d3, int n6, float f10) {
        super(cv_02);
        this.i = e72;
        this.f = ex_02;
        this.j = dx_22;
        this.h = d3;
        this.k = n6;
        this.g = f10;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public e7 getRenderer() {
        return this.i;
    }

    public ex_0 getEntity() {
        return this.f;
    }

    public dx_2 getBlock() {
        return this.j;
    }

    public double getPartial() {
        return this.h;
    }

    public int getFogMode() {
        return this.k;
    }

    public float getFarPlaneDistance() {
        return this.g;
    }
}

