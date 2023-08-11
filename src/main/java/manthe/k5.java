/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class k5
extends kl_0 {
    private ex_0 d;

    public k5(Object object) {
        this.d = new ex_0(object);
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().f()) {
            y52.a(this);
        }
        return super.fire();
    }

    public ex_0 getEntity() {
        return this.d;
    }
}

