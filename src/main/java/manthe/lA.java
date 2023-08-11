/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ex_0;
import manthe.kl_0;
import manthe.kn_0;

public class lA
extends kl_0 {
    private final Object d;

    public lA(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        return new kn_0(new ex_0(this.d)).fire();
    }
}

