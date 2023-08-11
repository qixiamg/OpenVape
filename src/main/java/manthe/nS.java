/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.pc;
import manthe.w9;
import manthe.ya_0;

class nS
implements pc {
    final w9 a;

    nS(w9 w92) {
        this.a = w92;
    }

    @Override
    public void b() {
        w9.b(this.a, new ya_0(w9.j(this.a).l()).a(w9.j(this.a).r()));
        on.p.f().a(w9.j(this.a));
        this.a.a(false);
        w9.l(this.a).a((w9)null);
    }
}

