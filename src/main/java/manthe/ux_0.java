/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wK;

/*
 * Renamed from manthe.ux
 */
class ux_0
implements pc {
    final wK a;

    ux_0(wK wK2) {
        this.a = wK2;
    }

    @Override
    public void b() {
        if (wK.a(this.a) != null) {
            wK.a(this.a).d();
        }
        this.a.N();
    }
}

