/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class k_
extends kl_0 {
    private final ex_0 e;
    private final String d;

    public k_(ex_0 ex_02, String string) {
        this.e = ex_02;
        this.d = string;
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
        return this.e;
    }

    public String getName() {
        return this.d;
    }
}

