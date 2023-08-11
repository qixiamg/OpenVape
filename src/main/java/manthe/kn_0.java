/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.kn
 */
public class kn_0
extends kl_0 {
    private final ex_0 d;

    public kn_0(ex_0 ex_02) {
        this.d = ex_02;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public ex_0 getEntity() {
        return this.d;
    }
}

