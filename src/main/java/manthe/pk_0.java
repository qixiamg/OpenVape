/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.zf_0;

/*
 * Renamed from manthe.pk
 */
class pk_0
extends Thread {
    final zf_0 a;

    pk_0(zf_0 zf_02) {
        this.a = zf_02;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(1L);
                if (!this.a.N()) continue;
                zf_0.a(this.a);
            }
            catch (Exception exception) {}
        }
    }
}

