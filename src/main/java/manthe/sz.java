/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rx_0;
import manthe.sb_0;

class sz
extends sb_0 {
    final rx_0 S;

    sz(rx_0 rx_02, int n6) {
        this.S = rx_02;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28) {
            rx_0.h(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

