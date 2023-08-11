/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wG;
import manthe.zu_0;

class vd
implements pc {
    final String b;
    final wG a;

    vd(wG wG2, String string) {
        this.a = wG2;
        this.b = string;
    }

    @Override
    public void b() {
        wG.a(this.a, !wG.a(this.a));
        wG.b(this.a).c();
        zu_0.e(this.b);
    }
}

