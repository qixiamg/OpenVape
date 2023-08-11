/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bz_2;
import manthe.pc;
import manthe.we_0;
import manthe.x3;

class A2
implements pc {
    final we_0 b;
    final x3 a;

    A2(x3 x32, we_0 we_02) {
        this.a = x32;
        this.b = we_02;
    }

    @Override
    public void b() {
        if (this.b instanceof bz_2) {
            ((bz_2) this.b).n();
            x3.a(this.a, ((bz_2) this.b).m());
        }
    }
}

