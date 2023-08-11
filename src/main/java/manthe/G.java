/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wU;
import manthe.wv_0;

class G
implements pc {
    final wv_0 c;
    final wU a;
    final wU b;

    G(wU wU2, wv_0 wv_02, wU wU3) {
        this.b = wU2;
        this.c = wv_02;
        this.a = wU3;
    }

    @Override
    public void b() {
        wU.a(this.b, !wU.c(this.b));
        if (wU.c(this.b)) {
            this.c.a(this.a);
            wU.a(this.b).a(true);
            wU.d(this.b).a(true);
            wU.b(this.b).a(true);
        } else {
            this.c.a((wU)null);
            wU.a(this.b).a(false);
            wU.d(this.b).a(false);
            wU.b(this.b).a(false);
        }
        this.c.M();
    }
}

