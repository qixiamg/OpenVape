/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.do_0;
import manthe.g1;
import manthe.gg_0;
import manthe.hl_0;
import manthe.on;

/*
 * Renamed from manthe.dt
 */
public class dt_2
extends do_0 {
    public dt_2(Object object) {
        super(object);
    }

    public int m() {
        if (V.c() == 13) {
            return hl_0.e(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().h();
    }

    public int i() {
        if (V.c() == 13) {
            return hl_0.d(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().f();
    }

    public int k() {
        if (V.c() == 13) {
            return hl_0.c(on.p.M().bg, this.a());
        }
        if (this.o().e()) {
            return 0;
        }
        return this.o().g();
    }

    public int j() {
        if (V.c() == 13) {
            return hl_0.a(on.p.M().bg, this.a());
        }
        if (this.l().e()) {
            return -1;
        }
        return this.l().h();
    }

    public g1 o() {
        return new g1(hl_0.g(on.p.M().bg, this.a()));
    }

    public gg_0 l() {
        return new gg_0(hl_0.f(on.p.M().bg, this.a()));
    }

    public String n() {
        if (V.c() >= 23) {
            return "";
        }
        return hl_0.b(on.p.M().bg, this.a());
    }
}

