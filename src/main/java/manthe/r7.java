/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

import java.awt.Color;

public class r7
extends rg_0
implements o1 {
    private final Friend K;
    private boolean J = true;

    public r7(c7 c72, Friend ab_02) {
        super("", true);
        this.K = ab_02;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new n2(this));
        rg_0 rg_02 = new rg_0("x", true);
        rg_02.b(12.0);
        rg_02.c(12.0);
        rg_02.a(new M(this, ab_02));
        c72.b(this);
        c72.b(rg_02);
        rl_0 rl_02 = new rl_0("", my_0.c, 1.0);
        rl_02.b(2.0);
        c72.b(rl_02);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        String string = this.K.getName();
        if (!this.K.getNameOrAlias().equals(this.K.getName()) && !this.g()) {
            string = "*" + this.K.getAlias();
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
        this.K.setAlias(this.J);
    }

    @Override
    public boolean G() {
        return this.J;
    }

    @Override
    public void g(boolean bl) {
    }

    public String H() {
        return this.K.getName();
    }
}

