/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.on;
import manthe.pc;
import manthe.wa_0;

class qZ
implements pc {
    final ak_0 a;
    final wa_0 b;

    qZ(wa_0 wa_02, ak_0 ak_02) {
        this.b = wa_02;
        this.a = ak_02;
    }

    @Override
    public void b() {
        if (!this.a.k() && !this.a.o()) {
            return;
        }
        this.a.b(!this.a.k());
        on.p.p();
        on.p.l().a(this.a);
        on.p.l().b(this.a);
    }
}

