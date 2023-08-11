/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rd_0;
import manthe.rg_0;
import manthe.sb_0;

/*
 * Renamed from manthe.sw
 */
class sw_0
extends sb_0 {
    final rg_0 S;
    final rd_0 T;

    sw_0(rd_0 rd_02, int n6, rg_0 rg_02) {
        this.T = rd_02;
        this.S = rg_02;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28) {
            this.S.a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

