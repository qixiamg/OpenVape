/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DP;
import manthe.r0;
import manthe.sb_0;

class s4
extends sb_0 {
    final boolean S;
    final DP U;
    final r0 T;

    s4(r0 r02, int n6, boolean bl, DP dP) {
        this.T = r02;
        this.S = bl;
        this.U = dP;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (n6 == 28 && !this.C().E().equals("")) {
            String string = this.C().E().replace("_", " ");
            if (this.S) {
                this.U.a(string, this.T.K.B().intValue());
            } else {
                this.U.a(string, -1);
            }
            this.C().a("");
            return true;
        }
        return super.a(c2, n6);
    }
}

