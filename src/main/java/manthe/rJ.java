/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D7;
import manthe.d0_0;
import manthe.pd;
import manthe.r1;
import manthe.rh_0;
import manthe.zu_0;

public class rJ
extends r1 {
    private rh_0 ae;

    public rJ() {
        super("panel", false);
        this.aj().a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.l(false);
        this.f(false);
        this.a(true);
    }

    @Override
    public void c(boolean bl) {
        if (this.ae == null) {
            return;
        }
        zu_0.T.a(this);
        super.c(true);
    }

    public void a(rh_0 rh_02) {
        this.aj().J();
        if (rh_02 == this.ae) {
            rh_02 = null;
        }
        this.ae = rh_02;
        if (rh_02 == null) {
            this.a(false);
            return;
        }
        this.a(true);
        this.aj().b(rh_02.x());
    }

    @Override
    public void c() {
        super.c();
        if (!this.ae.I()) {
            this.a((rh_0)null);
        }
        if (this.ae == null) {
            return;
        }
        r1 r12 = this.ae.Q();
        int n6 = (int)(r12.k() + r12.b()) - 5;
        this.a(this.ae.t() + this.ae.q() + 5.0);
        this.d(Math.min(this.ae.k(), (double)n6));
    }

    @Override
    public boolean a(d0_0 d0_02) {
        return false;
    }
}

