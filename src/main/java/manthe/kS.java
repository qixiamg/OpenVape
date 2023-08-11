/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kS
extends kl_0 {
    private final ex_0 d;

    public kS(ex_0 ex_02) {
        this.d = ex_02;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return super.fire();
    }

    public ex_0 getEntity() {
        return this.d;
    }
}

