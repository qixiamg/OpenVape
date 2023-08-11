/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dz_1;
import manthe.kc_0;
import manthe.l9;

public class lO
extends l9 {
    private final dz_1 f;

    public lO(dz_1 dz_12) {
        super(dz_12);
        this.f = dz_12;
    }

    @Override
    public boolean fire() {
        return new kc_0(this.f.m().a(), this.f.h().a(), this.f.l(), this.f.j(), this.f.i(), this.f.k()).fire();
    }
}

