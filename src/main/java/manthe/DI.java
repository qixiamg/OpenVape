/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.xi_0;
import manthe.xy_0;

class DI
implements pc {
    final xi_0 a;
    final xy_0 b;

    DI(xy_0 xy_02, xi_0 xi_02) {
        this.b = xy_02;
        this.a = xi_02;
    }

    @Override
    public void b() {
        if (this.a.equals(xy_0.a(this.b)) && xy_0.b(this.b).size() > 0) {
            this.b.a((xi_0)xy_0.b(this.b).get(0));
        }
        this.b.b(this.a);
        this.b.M();
    }
}

