/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.r8;
import manthe.sb_0;

class sK
extends sb_0 {
    final r8 S;

    sK(r8 r82, int n6) {
        this.S = r82;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28 && this.z().E() != null && this.z().E().equals("")) {
            r8.b(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

