/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.cg_1;
import manthe.lV;
import manthe.on;
import manthe.th_0;

public class tf
extends th_0 {
    public tf() {
        super(A5.ae);
    }

    @Override
    public void c() {
        bp_1 bp_12 = on.p.M().a.i;
        cg_1 cg_12 = new cg_1(bp_12, lV.class);
        cg_12.b("$0");
        cg_12.a("($r) $event.getBlockLayer()");
        this.a(cg_12);
    }
}

