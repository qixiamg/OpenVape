/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.da_0;
import manthe.ke_0;
import manthe.kl_0;

/*
 * Renamed from manthe.ls
 */
public class ls_0
extends kl_0 {
    private final float d;

    public ls_0(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        ke_0 ke_02 = new ke_0(da_0.a, this.d);
        return ke_02.fire();
    }
}

