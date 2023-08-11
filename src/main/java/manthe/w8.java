/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.w7;
import manthe.wM;
import manthe.wc_0;
import manthe.we_0;
import manthe.zu_0;

public abstract class w8<T extends w7>
extends we_0 {
    private T V;
    private double X;
    private double W;

    public w8(T t) {
        this.a(w8.b.k);
        this.W().e(false);
        this.W().b("wrap");
        this.c(300.0);
        this.a(100.0);
        this.V = t;
        this.k(false);
        this.j(false);
    }

    public void n() {
        if (((wM)this.V).d() != this.X || ((wM)this.V).c() != this.W) {
            double d3 = ((wM)this.V).c();
            wc_0 wc_02 = ((wM)this.V).F();
            if (wc_02.U()) {
                d3 = Math.min(d3, wc_02.c() + wc_02.L() - ((wM)this.V).f());
                d3 = Math.max(d3, wc_02.c() + wc_02.Y().f());
            }
            if (((wM)this.V).d() + ((wM)this.V).e() + this.e() > (double)ds_2.p().g()) {
                this.a(((wM)this.V).d() - this.e(), d3);
            } else {
                this.a(((wM)this.V).d() + ((wM)this.V).e(), d3);
            }
            this.X = ((wM)this.V).d();
            this.W = ((wM)this.V).c();
        }
    }

    public T m() {
        return this.V;
    }

    @Override
    public void V() {
        if (zu_0.ap().equals(((wM)this.V).F())) {
            zu_0.a(this);
        }
    }

    @Override
    public boolean b() {
        return ((wM)this.V).b() && ((wM)this.V).F().b() && ((w7)this.V).O();
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "sidecar_" + this.V.hashCode();
    }
}

