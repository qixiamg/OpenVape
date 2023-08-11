/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.qw;
import manthe.xa_0;

class BS
implements pc {
    final qw b;
    final xa_0 a;

    BS(xa_0 xa_02, qw qw2) {
        this.a = xa_02;
        this.b = qw2;
    }

    @Override
    public void b() {
        this.b.c(xa_0.a(this.a).u());
    }
}

