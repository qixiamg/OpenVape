/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

class uS
implements pc {
    final wy_0 b;
    final wz_0 a;

    uS(wz_0 wz_02, wy_0 wy_02) {
        this.a = wz_02;
        this.b = wy_02;
    }

    @Override
    public void b() {
        wz_0.a(this.a, !wz_0.d(this.a));
        if (wz_0.d(this.a)) {
            this.b.a(this.a.S());
            this.a.Q();
        } else {
            this.b.a((Module)null);
            this.a.N();
        }
        this.b.M();
    }

    @Override
    public void a() {
        this.b();
    }
}

