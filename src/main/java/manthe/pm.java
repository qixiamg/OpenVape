/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.AE;
import manthe.BP;
import manthe.Cw;
import manthe.cb_0;
import manthe.ds_2;
import manthe.gw_0;
import manthe.ng;
import manthe.on;
import manthe.pL;
import manthe.qA;
import manthe.rD;

class pm
extends Thread {
    final rD a;

    pm(rD rD2) {
        this.a = rD2;
    }

    @Override
    public void run() {
        String string = rD.c(this.a).z().E();
        rD.d(true);
        AE aE = on.p.e();
        try {
            rD.c(this.a).z().a("Authenticating...");
            qA qA2 = new qA(rD.e(this.a).c(), rD.e(this.a).b());
            BP bP = new BP();
            boolean bl = rD.e(this.a).c().toLowerCase().endsWith("@alt.com");
            on.a("" + bl);
            aE.a(bl ? pL.d : pL.b);
            Cw cw = bP.a("authenticate", qA2, Cw.class);
            if (cw == null) {
                rD.c(this.a).z().a(cb_0.v + "cServer error");
            } else if (cw.h() != null) {
                String[] stringArray;
                String string2 = cw.h();
                if (string2.contains(".") && (stringArray = string2.split("\\.")).length >= 2) {
                    string2 = stringArray[1];
                }
                rD.c(this.a).z().a(cb_0.v + "c" + string2);
            } else {
                gw_0 gw_02 = gw_0.a(cw.b().a(), cw.b().b(), cw.d(), cw.b().c() ? "legacy" : "mojang");
                ds_2.a(gw_02);
                rD.c(this.a).z().a(cb_0.v + "aLogged in to " + gw_02.f());
                ng.i.ao().a(true);
                ng.i.u().b();
            }
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

