/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.we_0;
import manthe.xM;
import manthe.zu_0;

class CV
implements pc {
    final we_0 b;
    final xM a;

    CV(xM xM2, we_0 we_02) {
        this.a = xM2;
        this.b = we_02;
    }

    @Override
    public void b() {
        if (xM.a(this.a) != null) {
            xM.a(this.a).b();
        }
        zu_0.a(this.b.getClass());
    }
}

