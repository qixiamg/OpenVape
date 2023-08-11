/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.cg_1;
import manthe.l4;
import manthe.lW;
import manthe.lo_0;
import manthe.on;
import manthe.th_0;

public class tH
extends th_0 {
    public tH() {
        super(A5.F);
    }

    @Override
    public void c() {
        bp_1 bp_12 = on.p.M().a.q;
        cg_1 cg_12 = new cg_1(bp_12, l4.class);
        cg_12.b("$0");
        cg_12.a("true");
        this.a(cg_12);
        bp_1 bp_13 = on.p.M().a.i;
        cg_1 cg_13 = new cg_1(bp_13, lo_0.class);
        cg_13.b("$0");
        cg_13.a("($r) $event.getBlockLayer()");
        this.a(cg_13);
        bp_1 bp_14 = on.p.M().a.j;
        cg_1 cg_14 = new cg_1(bp_14, lW.class);
        cg_14.a(true);
        cg_14.a("($r) 1");
        this.a(cg_14);
    }
}

