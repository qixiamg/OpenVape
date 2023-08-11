/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.cg_1;
import manthe.kB;
import manthe.kR;
import manthe.kT;
import manthe.on;
import manthe.th_0;

/*
 * Renamed from manthe.tb
 */
public class tb_0
extends th_0 {
    public tb_0() {
        super(A5.ba);
    }

    private void j() {
        bp_1 bp_12 = on.p.M().M.a;
        String string = V.c() >= 23 ? "$2, $3, $4" : "$1, $2, $3";
        String string2 = V.c() >= 23 ? "$2 = $event.getX();\n $3 = $event.getY();\n $4 = $event.getZ();" : "$1 = $event.getX();\n $2 = $event.getY();\n $3 = $event.getZ();";
        cg_1 cg_12 = new cg_1(bp_12, kB.class);
        cg_12.b(string);
        cg_12.c(string2);
        cg_12.a(A5.u);
        this.a(cg_12);
        cg_12 = new cg_1(bp_12, kR.class);
        cg_12.a(false);
        cg_12.b(string);
        cg_12.a(A5.u);
        this.a(cg_12);
    }

    private void i() {
    }

    private void k() {
        bp_1 bp_12 = on.p.M().M.ag;
        this.a(bp_12, kT.class, "$0, $1");
    }

    @Override
    public void c() {
        this.j();
        this.k();
    }
}

