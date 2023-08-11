/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kU
extends kl_0 {
    private final dv_0 e;
    private final Object d;

    public kU(dv_0 dv_02) {
        this.e = dv_02;
        this.d = dv_02.g();
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public Object getOverlayType() {
        return this.d;
    }

    public dv_0 getEvent() {
        return this.e;
    }
}

