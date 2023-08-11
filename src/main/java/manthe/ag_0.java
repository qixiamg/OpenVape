/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.w9;
import manthe.ya_0;

/*
 * Renamed from manthe.aG
 */
class ag_0
implements pc {
    final ya_0 a;
    final w9 b;

    ag_0(w9 w92, ya_0 ya_02) {
        this.b = w92;
        this.a = ya_02;
    }

    @Override
    public void b() {
        if (w9.b(this.b) != null) {
            this.a.a(w9.b(this.b).r());
        }
        w9.f(this.b).J();
    }
}

