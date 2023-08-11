/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.cg_1;
import manthe.kF;
import manthe.ky_0;
import manthe.on;
import manthe.th_0;

public class t9
extends th_0 {
    public t9() {
        super(A5.aU);
    }

    private void i() {
        cg_1 cg_12;
        bp_1 bp_12 = on.p.M().ao.e;
        bp_1 bp_13 = on.p.M().ao.l;
        if (!bp_12.a()) {
            cg_12 = new cg_1(bp_12, kF.class);
            cg_12.b("$0, $2");
            cg_12.c("$2 = (" + A5.aH.getName() + ") $event.getPacketInstance();");
            this.a(cg_12);
        }
        cg_12 = new cg_1(bp_13, ky_0.class);
        cg_12.b("$0, $1");
        cg_12.c("$1 = (" + A5.aH.getName() + ") $event.getPacketInstance();");
        this.a(cg_12);
    }

    @Override
    public void c() {
        this.i();
    }
}

