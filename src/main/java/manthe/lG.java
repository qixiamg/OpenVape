/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class lG
extends l9 {
    private final e7 k;
    private final ex_0 g;
    private final dx_2 h;
    private final double j;
    private float f;
    private float i;
    private float l;

    public lG(cv_0 cv_02, e7 e72, ex_0 ex_02, dx_2 dx_22, double d3, float f10, float f11, float f12) {
        super(cv_02);
        this.k = e72;
        this.g = ex_02;
        this.h = dx_22;
        this.j = d3;
        this.f = f10;
        this.i = f11;
        this.l = f12;
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
        return this.k;
    }

    public ex_0 getEntity() {
        return this.g;
    }

    public dx_2 getBlock() {
        return this.h;
    }

    public double getPartial() {
        return this.j;
    }

    public float getRed() {
        return this.f;
    }

    public void setRed(float f10) {
        this.f = f10;
    }

    public float getGreen() {
        return this.i;
    }

    public void setGreen(float f10) {
        this.i = f10;
    }

    public float getBlue() {
        return this.l;
    }

    public void setBlue(float f10) {
        this.l = f10;
    }
}

