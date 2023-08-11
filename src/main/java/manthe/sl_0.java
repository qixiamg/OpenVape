/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rC;
import manthe.rg_0;
import manthe.sb_0;

/*
 * Renamed from manthe.sl
 */
class sl_0
extends sb_0 {
    final rg_0 S;
    final rC T;

    sl_0(rC rC2, int n6, rg_0 rg_02) {
        this.T = rC2;
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

