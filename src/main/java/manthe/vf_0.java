/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.rl_0;
import manthe.rx_0;

/*
 * Renamed from manthe.vf
 */
class vf_0
implements R {
    final rl_0 b;
    final rx_0 a;

    vf_0(rx_0 rx_02, rl_0 rl_02) {
        this.a = rx_02;
        this.b = rl_02;
    }

    public void a(p1 p12) {
        if (rx_0.c(this.a) != null) {
            this.b.a(rx_0.c(this.a).l());
        } else {
            this.b.a("N/A");
        }
    }
}

