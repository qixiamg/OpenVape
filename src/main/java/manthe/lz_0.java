/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.lz
 */
public class lz_0
extends l9 {
    private final e7 g;
    private final ex_0 f;
    private final dx_2 j;
    private final double h;
    private float i;

    public lz_0(cv_0 cv_02, e7 e72, ex_0 ex_02, dx_2 dx_22, double d3, float f10) {
        super(cv_02);
        this.g = e72;
        this.f = ex_02;
        this.j = dx_22;
        this.h = d3;
        this.i = f10;
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
        return this.g;
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

    public float getDensity() {
        return this.i;
    }

    public void setDensity(float f10) {
        this.i = f10;
    }
}

