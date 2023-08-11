/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D7;
import manthe.bg_0;
import manthe.ly_0;
import manthe.my_0;
import manthe.pO;
import manthe.pd;
import manthe.qp;
import manthe.rg_0;
import manthe.rw_0;

/*
 * Renamed from manthe.rh
 */
public class rh_0
extends rg_0 {
    private final rw_0 K;
    private qp J;

    public rh_0(String string) {
        super(string, true);
        this.a(new D7(0.0, 0.0, 3, 1, new pd(0, 0, 0, 0)));
        this.K = new rw_0("ex", 0.2f, true);
        this.b(this.K);
        this.z().b(my_0.c);
        this.z().a(new bg_0(this));
        this.a(new pO(this));
        this.a(new ly_0(this));
    }

    public rw_0 B() {
        return this.K;
    }

    public qp x() {
        return this.J;
    }

    public void a(qp qp2) {
        this.J = qp2;
    }

    static rw_0 b(rh_0 rh_02) {
        return rh_02.K;
    }

    static qp a(rh_0 rh_02) {
        return rh_02.J;
    }
}

