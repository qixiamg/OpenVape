/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.g_0;
import manthe.h_0;
import manthe.pe_0;
import manthe.wV;
import manthe.yI;

public class wW
extends wV {
    private g_0 J;
    private boolean K;
    private boolean I;

    public wW(String string, double d3, Color color) {
        super(string, d3);
        this.J = new g_0(0.15, this.I(), color);
    }

    public wW(String string, Color color) {
        super(string);
        this.J = new g_0(0.15, this.I(), color);
    }

    public wW(String string) {
        super(string);
        this.J = new h_0(0.15, this.I());
    }

    @Override
    public void a() {
        double d3 = 1.0;
        if (this.I && this.E) {
            d3 = this.K ? 0.9 : 0.5;
        }
        pe_0.a(this.d(), this.c(), this.e(), this.f(), wW.b.y);
        if (this.E || this.K) {
            Color color = this.J.q();
            color = yI.a(color, (int)(d3 * 255.0));
            pe_0.a(this.d() + 0.5, this.c() + 0.5, this.e() - 1.0, this.f() - 1.0, color);
        } else {
            pe_0.a(this.d() + 0.5, this.c() + 0.5, this.e() - 1.0, this.f() - 1.0, this.I());
        }
        super.a();
    }

    @Override
    public void g(boolean bl) {
        if (this.E != bl && !this.K) {
            this.J.c();
        }
        super.g(bl);
    }

    public void h(boolean bl) {
        this.K = bl;
    }

    public void i(boolean bl) {
        this.I = bl;
    }

    public g_0 Q() {
        return this.J;
    }
}

