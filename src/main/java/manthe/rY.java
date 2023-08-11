/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.p1;
import manthe.r6;
import manthe.rf_0;

class rY
extends rf_0 {
    final r6 I;

    rY(r6 r62, boolean bl) {
        this.I = r62;
        super(bl);
    }

    @Override
    public void d(double d3) {
        super.d(d3 - r6.a(this.I));
    }

    @Override
    public void a(p1 p12) {
        super.a(p12);
        this.I.a((int)(-p12.b()));
    }
}

