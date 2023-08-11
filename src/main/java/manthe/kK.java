/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kK
extends kl_0 {
    private gQ d;

    public kK(gQ gQ2) {
        this.d = gQ2;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public gQ getMessage() {
        return this.d;
    }

    public void setMessage(gQ gQ2) {
        this.d = gQ2;
    }
}

