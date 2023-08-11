/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D0;
import manthe.ng;
import manthe.yf_0;

class D6
extends D0 {
    boolean m;
    final yf_0 n;

    D6(yf_0 yf_02, Object object, String string) {
        this.n = yf_02;
        super(object, string);
    }

    @Override
    public void l() {
        if (this.m) {
            return;
        }
        this.m = true;
        ng.i.a(this.n.b.a());
    }
}

