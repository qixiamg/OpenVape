/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.re_0;
import manthe.sb_0;
import manthe.vK;
import manthe.zP;

class C9
implements vK {
    final sb_0 b;
    final zP a;
    final re_0 c;

    C9(re_0 re_02, sb_0 sb_02, zP zP2) {
        this.c = re_02;
        this.b = sb_02;
        this.a = zP2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = this.b.C().E();
        if (this.a.X().c(string) || this.a.U().c(string)) {
            re_0.a(this.c).d();
            re_0.b(this.c).a("This item already exists.");
            return;
        }
        this.b.C().a("");
        this.a.U().b(string, -1);
    }
}

