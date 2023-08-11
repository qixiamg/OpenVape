/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cb_0;
import manthe.ds_2;
import manthe.gw_0;
import manthe.rD;

class qv
extends Thread {
    final rD a;

    qv(rD rD2) {
        this.a = rD2;
    }

    @Override
    public void run() {
        String string = rD.c(this.a).z().E();
        rD.d(true);
        try {
            rD.c(this.a).z().a("Authenticating...");
            gw_0 gw_02 = gw_0.a(rD.e(this.a).c(), "", "", "mojang");
            ds_2.a(gw_02);
            rD.c(this.a).z().a(cb_0.v + "aLogged in to " + gw_02.f() + " (Offline)");
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            Thread.sleep(2000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        rD.d(false);
        rD.c(this.a).z().a(string);
    }
}

