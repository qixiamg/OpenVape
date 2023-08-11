/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.da_0;
import manthe.ke_0;
import manthe.kl_0;

public class lR
extends kl_0 {
    private final float d;

    public lR(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        ke_0 ke_02 = new ke_0(da_0.b, this.d);
        return ke_02.fire();
    }
}

