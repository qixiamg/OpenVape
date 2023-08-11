/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rq_0;
import manthe.sb_0;

class sG
extends sb_0 {
    final rq_0 S;

    sG(rq_0 rq_02, int n6) {
        this.S = rq_02;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28) {
            rq_0.a(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

