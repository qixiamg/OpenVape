/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kZ
extends kl_0 {
    private final int e;
    private final boolean d;

    public kZ(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    public boolean isDown() {
        return this.d;
    }

    public int getKey() {
        return this.e;
    }

    @Override
    public boolean fire() {
        if (this.e > 0 && this.d && ds_2.x().a() == null) {
            for (ak_0 yt_02 : on.p.l().d()) {
                if (!yt_02.a(this.e)) continue;
            }
        }
        for (Module y52 : on.p.H().e()) {
            y52.a(this);
        }
        return this.d();
    }
}

