/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class lK
extends l9 {
    private final eC f;
    private final float g;

    public lK(cv_0 cv_02, eC eC2, float f10) {
        super(cv_02);
        this.f = eC2;
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

    public eC getClientPlayer() {
        return this.f;
    }

    public float getPartial() {
        return this.g;
    }
}

