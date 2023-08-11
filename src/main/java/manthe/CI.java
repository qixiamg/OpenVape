/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.ex_0;
import manthe.nK;
import manthe.on;
import manthe.z9;
import manthe.zG;
import manthe.zM;

public abstract class CI
implements nK {
    protected zG b = on.p.H().b(zG.class);
    protected z9 d = on.p.H().b(z9.class);
    protected zM a = on.p.H().b(zM.class);
    private static String[] c;

    protected boolean a(ex_0 ex_02) {
        return ex_02.equals(ds_2.k()) && (this.d.N() || this.b.N());
    }

    protected boolean a() {
        return this.b.N() && this.b.U();
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    public static String[] b() {
        return c;
    }

    static {
        if (CI.b() == null) {
            CI.b(new String[3]);
        }
    }
}

