/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.rx_0;
import manthe.vK;

class B8
implements vK {
    final rx_0 a;

    B8(rx_0 rx_02) {
        this.a = rx_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (rx_0.c(this.a) == null) {
            return;
        }
        on.p.f().b(rx_0.c(this.a));
        rx_0.a(this.a, false);
        rx_0.b(this.a, null);
    }
}

