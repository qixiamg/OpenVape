/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.U;
import manthe.rM;
import manthe.rR;
import manthe.vK;

/*
 * Renamed from manthe.vx
 */
class vx_0
implements vK {
    final int c;
    final rM b;
    final rR a;

    vx_0(rR rR2, int n6, rM rM2) {
        this.a = rR2;
        this.c = n6;
        this.b = rM2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            rR.b(this.a, this.c);
        }
        if (n11 == 1) {
            this.b.B();
            rR.e(this.a).a().set(this.c, new U(0));
        }
    }
}

