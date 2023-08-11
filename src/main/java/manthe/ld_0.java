/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ex_0;
import manthe.kS;
import manthe.kl_0;

/*
 * Renamed from manthe.ld
 */
public class ld_0
extends kl_0 {
    private final Object d;

    public ld_0(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        kS kS2 = new kS(new ex_0(this.d));
        kS2.fire();
        return super.fire();
    }
}

