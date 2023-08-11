/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.ds_2;
import manthe.p1;
import manthe.zr_0;

/*
 * Renamed from manthe.be
 */
class be_1
implements R {
    final zr_0 a;

    be_1(zr_0 zr_02) {
        this.a = zr_02;
    }

    public void a(p1 p12) {
        if (!this.a.N()) {
            return;
        }
        if (zr_0.b(this.a).v().equals(zr_0.a(this.a))) {
            ds_2.k().f(16);
        } else if (zr_0.c(this.a) != -1.0f) {
            ds_2.s().b(zr_0.c(this.a));
        }
    }
}

