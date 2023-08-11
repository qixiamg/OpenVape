/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dz_1;
import manthe.kq_0;
import manthe.l9;

public class lS
extends l9 {
    private final dz_1 f;

    public lS(dz_1 dz_12) {
        super(dz_12);
        this.f = dz_12;
    }

    @Override
    public boolean fire() {
        return new kq_0(this.f.m().a(), this.f.h().a(), this.f.k()).fire();
    }
}

