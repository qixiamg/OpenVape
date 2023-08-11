/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Collections;
import manthe.ok_0;
import manthe.uU;

/*
 * Renamed from manthe.ui
 */
class ui_0
extends Thread {
    final ok_0 a;

    private ui_0(ok_0 ok_02) {
        this.a = ok_02;
    }

    @Override
    public void run() {
        ok_0.b(this.a).a(Collections.emptyList());
        this.a.a("Unbound");
        ok_0.a(this.a).interrupt();
        if (ok_0.c(this.a) != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
        this.a.b();
    }

    ui_0(ok_0 ok_02, uU uU2) {
        this(ok_02);
    }
}

