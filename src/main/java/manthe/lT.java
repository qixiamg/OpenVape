/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.rx_0;
import manthe.vK;
import manthe.yU;
import manthe.ya_0;
import manthe.yu_0;

class lT
implements vK {
    final rx_0 a;

    lT(rx_0 rx_02) {
        this.a = rx_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = rx_0.j(this.a).C().E();
        if (string.isEmpty() || on.p.f().a(string) != null) {
            return;
        }
        rx_0.j(this.a).C().a("");
        if (string.startsWith("/")) {
            rx_0.a(this.a, new yU(string));
            rx_0.b(this.a, false);
        } else if (string.equalsIgnoreCase("fishing rod")) {
            rx_0.b(this.a, new yu_0(string));
            rx_0.b(this.a, true);
        } else {
            rx_0.b(this.a, new ya_0(string));
            rx_0.b(this.a, true);
        }
    }
}

