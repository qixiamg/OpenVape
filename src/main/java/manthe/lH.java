/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dh_1;
import manthe.ew_0;
import manthe.ex_0;
import manthe.k5;
import manthe.l9;

public class lH
extends l9 {
    private final dh_1 f;

    public lH(dh_1 dh_12) {
        super(dh_12);
        this.f = dh_12;
    }

    public ew_0 getRenderer() {
        return this.f.j();
    }

    public ex_0 getEntity() {
        return this.f.g();
    }

    public double getX() {
        return this.f.k();
    }

    public double getY() {
        return this.f.h();
    }

    public double getZ() {
        return this.f.i();
    }

    @Override
    public boolean fire() {
        k5 k52 = new k5(this.getEntity().a());
        k52.fire();
        return k52.d();
    }
}

