/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.g_0;
import manthe.pe_0;
import manthe.wI;

/*
 * Renamed from manthe.wk
 */
public class wk_0
extends wI {
    private g_0 E;
    protected boolean D;

    public wk_0() {
        this.E = new g_0(0.15, wk_0.b.y, wk_0.b.s);
    }

    @Override
    public void a() {
        pe_0.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.E.q());
        pe_0.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 1.0 - 5.0, wk_0.b.k);
        pe_0.a("newadd", this.d() + this.e() / 2.0, this.c() + this.f() / 2.0, 6.0, 6.0, wk_0.b.i);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.D = false;
            this.E.c();
        }
    }

    @Override
    public void i() {
        if (!this.D) {
            this.E.c();
        }
        this.D = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

