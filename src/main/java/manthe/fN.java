/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ex_0;
import manthe.fB;
import manthe.fn_0;
import manthe.gS;
import manthe.jW;

public class fN
extends fn_0 {
    public fN(Object object) {
        super(object);
    }

    public static fN a(ex_0 ex_02, fB fB2) {
        return new fN(jW.a(fN.a.M().m, ex_02.a(), fB2.a()));
    }

    public static fN a(ex_0 ex_02) {
        return new fN(jW.b(fN.a.M().m, ex_02.a()));
    }

    public fB g() {
        return new fB(jW.a(fN.a.M().m, this.b), null);
    }

    public ex_0 a(gS gS2) {
        return gS2.a(fN.a.M().m.a(this.b));
    }
}

