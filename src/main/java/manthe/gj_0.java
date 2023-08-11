/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rV;
import manthe.rx_0;
import manthe.vK;
import manthe.ya_0;

/*
 * Renamed from manthe.gj
 */
class gj_0
implements vK {
    final rx_0 b;
    final ya_0 a;
    final rV c;

    gj_0(rV rV2, rx_0 rx_02, ya_0 ya_02) {
        this.c = rV2;
        this.b = rx_02;
        this.a = ya_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            this.b.a(this.a);
            this.b.p(true);
            this.b.q(true);
        }
    }
}

