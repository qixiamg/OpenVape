/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.on;
import manthe.yq_0;

class B
extends Thread {
    final yq_0 a;

    B(yq_0 yq_02) {
        this.a = yq_02;
    }

    @Override
    public void run() {
        while (!on.p.x()) {
            try {
                Thread.sleep(1L);
                if (yq_0.a(this.a) == null || ds_2.k().e()) continue;
                yq_0.a(this.a).b();
                if (!yq_0.a(this.a).e()) continue;
                yq_0.a(this.a, null);
            }
            catch (Exception exception) {}
        }
        yq_0.u = null;
    }
}

