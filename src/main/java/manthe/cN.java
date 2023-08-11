/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.xi_0;
import manthe.xy_0;

class cN
implements pc {
    final xy_0 b;
    final xy_0 a;

    cN(xy_0 xy_02, xy_0 xy_03) {
        this.a = xy_02;
        this.b = xy_03;
    }

    @Override
    public void b() {
        xi_0 xi_02 = new xi_0(this.b, xy_0.c(this.a));
        xy_0.b(this.a).add(xi_02);
        if (xy_0.a(this.a) == null) {
            xy_0.a(this.a, xi_02);
        }
        this.a.M();
    }
}

