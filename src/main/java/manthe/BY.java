/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rx_0;
import manthe.vK;

class BY
implements vK {
    final rx_0 a;

    BY(rx_0 rx_02) {
        this.a = rx_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (rx_0.c(this.a) == null) {
            return;
        }
        if (rx_0.e(this.a)) {
            rx_0.a(this.a, false);
            rx_0.b(this.a, null);
        } else {
            rx_0.a(this.a, false);
            rx_0.b(this.a, false);
            rx_0.a(this.a, rx_0.c(this.a));
            rx_0.b(this.a, null);
        }
    }
}

