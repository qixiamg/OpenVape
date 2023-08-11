/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kJ
extends kl_0 {
    private final ex_0 d;

    public kJ(Object object, int n6) {
        this.d = new ex_0(object);
        this.a = n6;
    }

    public ex_0 getTarget() {
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

