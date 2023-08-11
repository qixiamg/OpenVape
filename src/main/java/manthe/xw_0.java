/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.nv_0;
import manthe.w9;
import manthe.wF;
import manthe.x4;

/*
 * Renamed from manthe.xw
 */
public class xw_0
extends x4 {
    private boolean N = false;
    private String M;
    private w9 O;

    public xw_0(wF wF2) {
        super("");
        this.I.b("newnext");
        this.a(new nv_0(this, wF2));
    }

    @Override
    public void a() {
        if (this.O != null) {
            if (!this.O.b()) {
                this.O = null;
                this.F().M();
            } else {
                this.I.a(false);
                this.O.c(this.d());
                this.O.a(this.c());
                return;
            }
        }
        this.I.a(true);
        if (this.N) {
            this.c("");
            this.b(xw_0.b.m);
            this.b("Press a key to bind");
            this.I.b("newbind");
            this.f(false);
        } else {
            this.b(xw_0.b.u);
            this.b("Type name");
            this.I.b("newnext");
            this.f(true);
        }
        super.a();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.O != null ? this.O.f() : 20.0;
    }

    @Override
    public void Q() {
        if (!this.N) {
            if (!this.L()) {
                this.c("");
                return;
            }
            this.M = this.N();
        }
        this.N = !this.N;
        this.G = this.N ? xw_0.b.t : null;
    }

    static boolean a(xw_0 xw_02) {
        return xw_02.N;
    }

    static String c(xw_0 xw_02) {
        return xw_02.M;
    }

    static w9 a(xw_0 xw_02, w9 w92) {
        xw_02.O = w92;
        return xw_02.O;
    }

    static w9 b(xw_0 xw_02) {
        return xw_02.O;
    }
}

