/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DO;
import manthe.on;
import manthe.w9;
import manthe.wF;
import manthe.xw_0;
import manthe.ya_0;
import manthe.zu_0;

/*
 * Renamed from manthe.nv
 */
class nv_0
implements DO {
    final wF b;
    final xw_0 a;

    nv_0(xw_0 xw_02, wF wF2) {
        this.a = xw_02;
        this.b = wF2;
    }

    @Override
    public void a(char c2, int n6) {
        if (xw_0.a(this.a) && n6 != 28) {
            this.a.Q();
            if (xw_0.c(this.a) != null) {
                ya_0 ya_02 = new ya_0(xw_0.c(this.a));
                if (on.p.f().a(xw_0.c(this.a)) != null) {
                    this.a.c("");
                    zu_0.W = null;
                    return;
                }
                ya_02.d(n6);
                ya_02.c(n6);
                zu_0.W = null;
                xw_0.a(this.a, new w9(this.b, ya_02));
                xw_0.b(this.a).O();
                this.a.a(xw_0.b(this.a));
            }
            this.a.c("");
        }
    }
}

