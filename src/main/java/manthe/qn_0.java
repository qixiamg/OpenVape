/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bz_2;
import manthe.pc;
import manthe.we_0;
import manthe.xh_0;

/*
 * Renamed from manthe.qn
 */
class qn_0
implements pc {
    final we_0 a;
    final xh_0 b;

    qn_0(xh_0 xh_02, we_0 we_02) {
        this.b = xh_02;
        this.a = we_02;
    }

    @Override
    public void b() {
        if (this.a instanceof bz_2) {
            ((bz_2)((Object)this.a)).n();
        }
    }
}

