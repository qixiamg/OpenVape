/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ku
 */
public class ku_0
extends kl_0 {
    private final float d;

    public ku_0(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }
}

