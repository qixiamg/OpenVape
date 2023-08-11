/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.B_;
import manthe.D7;
import manthe.ds_2;
import manthe.on;
import manthe.pd;
import manthe.r1;
import manthe.rg_0;
import manthe.zu_0;

/*
 * Renamed from manthe.ru
 */
public class ru_0
extends r1 {
    private final zu_0 ae = on.p.H().b(zu_0.class);

    public ru_0() {
        super("Edit", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rg_0 rg_02 = new rg_0("Finish editing", false);
        rg_02.c(120.0);
        rg_02.b(30.0);
        rg_02.a(new B_(this));
        this.aj().b(rg_02);
        this.k(true);
        this.n(true);
    }

    @Override
    public void c(boolean bl) {
        super.c(true);
    }

    @Override
    public void c() {
        super.c();
        this.f(false);
        this.a((double)ds_2.p().g() - this.q());
        this.d(0.0);
        this.c(100.0);
        this.b(20.0);
        this.a(this.ae.Z());
    }

    @Override
    public boolean ag() {
        return false;
    }

    static zu_0 a(ru_0 ru_02) {
        return ru_02.ae;
    }
}

