/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.r5;
import manthe.sb_0;

class s9
extends sb_0 {
    final r5 S;

    s9(r5 r52, int n6) {
        this.S = r52;
        super(n6);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.y() && n6 == 28) {
            r5.b(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c2, n6);
    }
}

