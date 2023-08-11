/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.g_0;
import manthe.pe_0;
import manthe.wV;

/*
 * Renamed from manthe.wh
 */
public class wh_0
extends wV {
    private g_0 I;

    public wh_0(String string) {
        super(string, 1.0);
        this.I = new g_0(0.1, this.I(), wh_0.b.s);
    }

    public wh_0(String string, double d3) {
        super(string, d3);
        this.I = new g_0(0.1, this.I(), wh_0.b.s);
    }

    @Override
    public void a() {
        float f10 = 8.0f * (float)this.H;
        if (this.E) {
            pe_0.b(this.d() + this.e() / 2.0 - (double)(f10 / 2.0f), this.c() + this.f() / 2.0 - (double)(f10 / 2.0f), (double)f10, 1.0, this.I.q());
        }
        super.a();
    }

    @Override
    public void j() {
        if (this.E && !this.x()) {
            this.E = false;
            this.I.c();
        }
    }

    @Override
    public void i() {
        if (!this.E) {
            this.I.c();
        }
        super.i();
    }
}

