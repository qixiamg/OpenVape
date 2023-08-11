/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rg_0;
import manthe.rs_0;
import manthe.sb_0;

/*
 * Renamed from manthe.sf
 */
class sf_0
extends sb_0 {
    final rg_0 T;
    final rs_0 S;

    sf_0(rs_0 rs_02, rg_0 rg_02) {
        this.S = rs_02;
        this.T = rg_02;
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28) {
            this.T.a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

