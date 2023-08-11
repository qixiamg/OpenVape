/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ex_0;
import manthe.kA;
import manthe.kl_0;

public class l8
extends kl_0 {
    private final Object d;
    private final double e;
    private final double f;
    private final double g;

    public l8(Object object, double d3, double d4, double d5) {
        this.d = object;
        this.e = d3;
        this.f = d4;
        this.g = d5;
    }

    @Override
    public boolean fire() {
        boolean bl = new kA(new ex_0(this.d), this.e, this.f, this.g).fire();
        return bl;
    }
}

