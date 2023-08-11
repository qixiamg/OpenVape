/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.g_0;
import manthe.mq;
import manthe.pe_0;
import manthe.ww_0;

/*
 * Renamed from manthe.wl
 */
public class wl_0
extends ww_0 {
    private g_0 G;

    public wl_0(String string, double d3, Color color) {
        super(string, d3);
        this.G = new g_0(0.15, this.I(), color);
    }

    public wl_0(String string, Color color) {
        super(string);
        this.G = new g_0(0.15, this.I(), color);
    }

    @Override
    public void a() {
        pe_0.a(this.d(), this.c(), this.e(), this.f(), wl_0.b.y);
        pe_0.a(this.d() + 0.5, this.c() + 0.5, this.e() - 1.0, this.f() - 1.0, this.D ? this.G.q() : this.I());
        mq mq2 = this.e(this.E);
        double d3 = mq2.a(this.F);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        mq2.b(this.F.toUpperCase(), this.d() + this.e() / 2.0, d4, this.D ? wl_0.b.c : wl_0.b.r);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    @Override
    public void f(boolean bl) {
        if (this.D != bl) {
            this.G.c();
        }
        super.f(bl);
    }
}

