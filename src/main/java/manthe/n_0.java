/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.re_0;
import manthe.sV;
import manthe.sb_0;
import manthe.vK;
import manthe.zP;

/*
 * Renamed from manthe.n
 */
class n_0
implements vK {
    final sb_0 c;
    final zP d;
    final sV a;
    final re_0 b;

    n_0(re_0 re_02, sb_0 sb_02, zP zP2, sV sV2) {
        this.b = re_02;
        this.c = sb_02;
        this.d = zP2;
        this.a = sV2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = this.c.C().E();
        if (this.d.X().c(string) || this.d.U().c(string)) {
            re_0.a(this.b).d();
            re_0.b(this.b).a("This item already exists.");
            return;
        }
        this.c.C().a("");
        this.d.X().b(string, this.a.B().intValue());
    }
}

