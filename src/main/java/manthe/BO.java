/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.so_0;
import manthe.vK;

class BO
implements vK {
    final so_0 a;

    BO(so_0 so_02) {
        this.a = so_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        so_0.a(this.a, !so_0.b(this.a));
        so_0.a(this.a).a(so_0.b(this.a));
    }
}

