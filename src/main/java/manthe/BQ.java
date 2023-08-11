/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wT;
import manthe.wp_0;
import manthe.xV;
import manthe.zu_0;

class BQ
implements pc {
    final xV a;

    BQ(xV xV2) {
        this.a = xV2;
    }

    @Override
    public void b() {
        wp_0 wp_02 = zu_0.b(wp_0.class);
        wT wT2 = zu_0.b(wT.class);
        if (wp_02 == null || wT2 == null) {
            return;
        }
        wp_02.a(!wp_02.b());
        if (wp_02.b()) {
            wp_02.ac();
        }
        wp_02.c(wT2.d());
        wp_02.a(wT2.c());
        wp_02.M();
    }
}

