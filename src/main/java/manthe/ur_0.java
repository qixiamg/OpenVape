/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.cm_0;
import manthe.kO;
import manthe.lB;
import manthe.lc_0;
import manthe.lq_0;
import manthe.lu_0;
import manthe.on;
import manthe.u2;
import manthe.y9;
import manthe.y_0;

/*
 * Renamed from manthe.ur
 */
public class ur_0
extends u2 {
    private static String[] g;

    public ur_0() {
        super(A5.d0);
    }

    @Override
    public void c() {
        bp_1 bp_12 = on.p.M().bW.k;
        this.a(bp_12, lc_0.class, new y_0[0]);
        this.b(bp_12, lq_0.class, new y_0[0]);
        this.a(on.p.M().bW.i, lu_0.class, new y_0[0]);
        this.a(on.p.M().bW.h, kO.class, new y9(1, cm_0.a(A5.aE)).b(Object.class));
        this.a(on.p.M().bW.P, lB.class, new y_0[0]);
    }

    public static void b(String[] stringArray) {
        g = stringArray;
    }

    public static String[] i() {
        return g;
    }

    static {
        if (ur_0.i() == null) {
            ur_0.b(new String[4]);
        }
    }
}

