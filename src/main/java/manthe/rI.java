/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.Ac;
import manthe.D7;
import manthe.c7;
import manthe.k9;
import manthe.my_0;
import manthe.nC;
import manthe.o1;
import manthe.o7;
import manthe.on;
import manthe.pd;
import manthe.pr;
import manthe.rg_0;
import manthe.rl_0;
import manthe.yI;

public class rI
extends rg_0
implements o1 {
    private final pr K;
    private boolean J = true;

    public rI(c7 c72, pr pr2) {
        super("", true);
        this.K = pr2;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new Ac(this));
        rg_0 rg_02 = new rg_0("x", true);
        rg_02.b(12.0);
        rg_02.c(12.0);
        rg_02.a(new nC(this, pr2));
        c72.b(this);
        c72.b(rg_02);
        rl_0 rl_02 = new rl_0("", my_0.c, 1.0);
        rl_02.b(2.0);
        c72.b(rl_02);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        String string = this.K.b();
        if (!this.K.c().equals(this.K.b()) && !this.g()) {
            string = "*" + this.K.a();
        }
        on.p.j().a(string, this.t() + 12.0, this.k() + 3.0, -1);
        o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, -16777216);
        if (this.J) {
            o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, yI.a());
            k9.a((Color)on.p.t().r.K(), (float)this.t() + 2.0f, (float)this.k() + 2.0f, "check", 8.0f, 8.0f, false);
        }
    }

    @Override
    public void F() {
        this.J = !this.J;
        this.K.a(this.J);
    }

    @Override
    public boolean G() {
        return this.J;
    }

    @Override
    public void g(boolean bl) {
    }

    public String H() {
        return this.K.b();
    }
}

