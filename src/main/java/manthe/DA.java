/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.on;
import manthe.so_0;
import manthe.vK;
import manthe.zu_0;

class DA
implements vK {
    final ak_0 a;
    final so_0 b;

    DA(so_0 so_02, ak_0 ak_02) {
        this.b = so_02;
        this.a = ak_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        if (on.p.l().d().size() == 1) {
            return;
        }
        on.p.l().a(this.a);
        zu_0.a(null);
    }
}

