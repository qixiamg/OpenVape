/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.c7;
import manthe.k9;
import manthe.my_0;
import manthe.o1;
import manthe.o7;
import manthe.on;
import manthe.pd;
import manthe.qw;
import manthe.r_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.u1;
import manthe.yI;

public class rW
extends rg_0
implements o1 {
    private final String L;
    private final Color J;
    private final c7 K;
    private final qw M;

    public rW(c7 c72, qw qw2) {
        super("", true);
        this.K = c72;
        this.L = qw2.i();
        this.J = qw2.b();
        this.M = qw2;
        this.a(this.J);
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new u1(this));
        rg_0 rg_02 = new rg_0("x", true);
        rg_02.b(12.0);
        rg_02.c(12.0);
        rW rW2 = this;
        rg_02.a(new r_0(this, rW2, qw2));
        c72.b(this);
        c72.b(rg_02);
        rl_0 rl_02 = new rl_0("", my_0.c, 1.0);
        rl_02.b(2.0);
        c72.b(rl_02);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        on.p.j().a(this.L, this.t() + 12.0, this.k() + 2.5, yI.a(this.J, 0, 240, true));
        o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, -16777216);
        if (this.M.a()) {
            Color color = yI.a(this.J, 20, 240);
            o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, yI.a(color, 20, 240, true));
            k9.a(color, (float)this.t() + 2.0f, (float)this.k() + 2.0f, "check", 8.0f, 8.0f, false);
        }
    }

    @Override
    public void F() {
        this.M.c(!this.M.a());
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void g(boolean bl) {
    }

    public c7 V() {
        return this.K;
    }

    public qw H() {
        return this.M;
    }
}

