/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.fO;
import manthe.fS;
import manthe.fn_0;
import manthe.yi_0;

/*
 * Renamed from manthe.Ck
 */
class ck_0 {
    private fn_0 a;
    private boolean c;
    private fO b;

    private ck_0(fn_0 fn_02, boolean bl, fO fO2) {
        this.a = fn_02;
        this.c = bl;
        this.b = fO2;
    }

    public fn_0 b() {
        return this.a;
    }

    public boolean a() {
        return this.c;
    }

    public void a(fS fS2) {
        if (this.a()) {
            fS2.a(this.a);
        } else {
            this.a.a(this.b.k());
        }
    }

    ck_0(fn_0 fn_02, boolean bl, fO fO2, yi_0 yi_02) {
        this(fn_02, bl, fO2);
    }
}

