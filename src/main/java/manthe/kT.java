/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kT
extends kl_0 {
    private final ex_0 e;
    private final boolean d;

    public kT(Object object, boolean bl) {
        this.e = new ex_0(object);
        this.d = bl;
    }

    public ex_0 getEntity() {
        return this.e;
    }

    public boolean isNewStateSprinting() {
        return this.d;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }
}

