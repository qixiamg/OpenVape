/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rF;
import manthe.ry_0;
import manthe.vK;
import manthe.zu_0;

class qJ
implements vK {
    final rF a;
    final ry_0 b;

    qJ(ry_0 ry_02, rF rF2) {
        this.b = ry_02;
        this.a = rF2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        if (!ry_0.b(this.b)) {
            this.a.b(this.b);
        } else {
            zu_0.T.a(this.b);
        }
    }
}

