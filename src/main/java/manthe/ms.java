/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.zw_0;

class ms
extends Thread {
    final zw_0 a;

    ms(zw_0 zw_02) {
        this.a = zw_02;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        ds_2.O().a(1.0f);
    }
}

