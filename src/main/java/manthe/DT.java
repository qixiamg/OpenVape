/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D0;
import manthe.ng;
import manthe.yf_0;

class DT
extends D0 {
    boolean n;
    final yf_0 m;

    DT(yf_0 yf_02, Object object, String string) {
        this.m = yf_02;
        super(object, string);
    }

    @Override
    public void l() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (!this.m.d.a().equals("")) {
            ng.j.ag.z().a(this.m.d.a());
        }
    }
}

