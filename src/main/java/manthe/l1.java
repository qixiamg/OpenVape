/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class l1
extends l9 {
    private final dh_1 f;

    public l1(dh_1 dh_12) {
        super(dh_12);
        this.f = dh_12;
    }

    public ex_0 getEntity() {
        return this.f.g();
    }

    public double getX() {
        return this.f.k();
    }

    public double getY() {
        return this.f.h();
    }

    public double getZ() {
        return this.f.i();
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().f()) {
            y52.a(this);
        }
        return this.d();
    }
}

