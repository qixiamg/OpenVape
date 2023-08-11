/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.kl_0;
import manthe.ku_0;
import manthe.kx_0;

public class le
extends kl_0 {
    private String d;

    public le(String string) {
        this.d = string;
    }

    @Override
    public boolean fire() {
        if (this.d.equals("hand")) {
            float f10 = ds_2.O().g();
            kx_0 kx_02 = new kx_0(f10);
            boolean bl = kx_02.fire();
            ku_0 ku_02 = new ku_0(f10);
            boolean bl2 = ku_02.fire();
        }
        return super.fire();
    }
}

