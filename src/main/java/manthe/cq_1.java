/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.z5;

/*
 * Renamed from manthe.cq
 */
class cq_1
extends Thread {
    final z5 a;

    cq_1(z5 z52) {
        this.a = z52;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(5L);
                if (!this.a.N()) continue;
                this.a.W();
            }
            catch (Exception exception) {}
        }
    }
}

