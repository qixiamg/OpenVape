/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.kc
 */
public class kc_0
extends kl_0 {
    private final el_0 g;
    private final eC e;
    private final float i;
    private double f;
    private double h;
    private double d;

    public kc_0(Object object, Object object2, double d3, double d4, double d5, float f10) {
        this.g = new el_0(object);
        this.e = new eC(object2);
        this.i = f10;
        this.f = d3;
        this.h = d4;
        this.d = d5;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }

    public eC getEntityPlayer() {
        return this.e;
    }

    public el_0 getRenderer() {
        return this.g;
    }

    public float getPartialTicks() {
        return this.i;
    }

    public double getX() {
        return this.f;
    }

    public double getY() {
        return this.h;
    }

    public double getZ() {
        return this.d;
    }
}

