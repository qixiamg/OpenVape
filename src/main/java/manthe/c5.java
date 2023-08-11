/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bz_0;
import manthe.ri_0;
import manthe.vK;
import manthe.zu_0;

class c5
implements vK {
    final zu_0 a;
    final ri_0 b;

    c5(ri_0 ri_02, zu_0 zu_02) {
        this.b = ri_02;
        this.a = zu_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        ri_0.a(this.b, !ri_0.a(this.b));
        if (ri_0.a(this.b)) {
            this.b.f(false);
            bz_0 bz_02 = this.a.ak();
            bz_02.a(this.b);
            this.a.a(this.b);
        } else {
            this.b.f(true);
            bz_0 bz_03 = this.a.ak();
            bz_03.a(null);
        }
    }
}

