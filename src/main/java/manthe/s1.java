/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rR;
import manthe.sb_0;

class s1
extends sb_0 {
    final rR S;

    s1(rR rR2) {
        this.S = rR2;
    }

    @Override
    public boolean a(char c2, int n6) {
        boolean bl = super.a(c2, n6);
        rR.a(this.S, rR.c(this.S).z().E());
        return bl;
    }
}

