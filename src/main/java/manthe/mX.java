/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import manthe.pb_0;
import manthe.rz_0;
import manthe.vK;

class mX
implements vK {
    final pb_0 a;
    final rz_0 b;

    mX(rz_0 rz_02, pb_0 pb_02) {
        this.b = rz_02;
        this.a = pb_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0 && (a.a.ib() || !this.a.c())) {
            this.b.f(true);
            this.b.a(this.a);
        }
    }
}

