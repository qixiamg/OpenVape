/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bo_0;
import manthe.o7;
import manthe.pc;
import manthe.wz_0;
import manthe.zu_0;

/*
 * Renamed from manthe.Dc
 */
class dc_0
implements pc {
    final wz_0 b;
    final wz_0 a;

    dc_0(wz_0 wz_02, wz_0 wz_03) {
        this.a = wz_02;
        this.b = wz_03;
    }

    @Override
    public void b() {
        bo_0 bo_02 = o7.b();
        wz_0.a(this.a, bo_02.b);
        wz_0.b(this.a, this.a.c());
        wz_0.b(this.a, true);
        zu_0.W = this.b;
    }
}

