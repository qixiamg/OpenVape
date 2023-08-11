/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.kq
 */
public class kq_0
extends kl_0 {
    private final el_0 e;
    private final eC d;
    private final float f;

    public kq_0(Object object, Object object2, float f10) {
        this.e = new el_0(object);
        this.d = new eC(object2);
        this.f = f10;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }

    public eC getEntityPlayer() {
        return this.d;
    }

    public el_0 getRenderer() {
        return this.e;
    }

    public float getPartialTicks() {
        return this.f;
    }
}

