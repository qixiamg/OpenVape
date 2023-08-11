/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.kt
 */
public class kt_0
extends kl_0 {
    private final eC d;

    public kt_0(eC eC2, int n6) {
        this.d = eC2;
        this.a = n6;
    }

    @Override
    public boolean fire() {
        if (!this.getPlayer().a(A5.u)) {
            return false;
        }
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            if (this.a() == da_0.b) {
                y52.getRuntimeCopyException(this);
                continue;
            }
            y52.a(this);
        }
        return this.d();
    }

    public eC getPlayer() {
        return this.d;
    }
}

