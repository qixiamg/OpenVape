/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rf_0;
import manthe.rq_0;

class rP
extends rf_0 {
    final rq_0 I;

    rP(rq_0 rq_02, boolean bl) {
        this.I = rq_02;
        super(bl);
    }

    @Override
    public double b() {
        return super.b() + 2.0;
    }
}

