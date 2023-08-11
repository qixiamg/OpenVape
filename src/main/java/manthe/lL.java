/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.kl_0;
import manthe.ku_0;
import manthe.kx_0;

public class lL
extends kl_0 {
    private final float d;

    public lL(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        kx_0 kx_02 = new kx_0(this.d);
        boolean bl = kx_02.fire();
        ku_0 ku_02 = new ku_0(this.d);
        boolean bl2 = ku_02.fire();
        return bl || bl2;
    }
}

