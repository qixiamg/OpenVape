/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.we_0;
import manthe.wp_0;

/*
 * Renamed from manthe.Bh
 */
class bh_0
implements Comparator<we_0> {
    final wp_0 a;

    bh_0(wp_0 wp_02) {
        this.a = wp_02;
    }

    public int a(we_0 we_02, we_0 we_03) {
        if (we_02.f() == we_03.f()) {
            return 0;
        }
        return we_02.f() > we_03.f() ? -1 : 1;
    }
}

