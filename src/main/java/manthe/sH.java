/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rg_0;
import manthe.rm_0;
import manthe.sb_0;

class sH
extends sb_0 {
    final rg_0 S;
    final rm_0 T;

    sH(rm_0 rm_02, int n6, rg_0 rg_02) {
        this.T = rm_02;
        this.S = rg_02;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (n6 == 28) {
            this.S.a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

