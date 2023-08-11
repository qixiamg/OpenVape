/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.mq;
import manthe.wI;

/*
 * Renamed from manthe.ww
 */
public class ww_0
extends wI {
    protected String F;
    protected double E;
    protected boolean D;

    public ww_0(String string, double d3) {
        this.F = string;
        this.E = d3;
    }

    public ww_0(String string) {
        this(string, 0.9);
    }

    @Override
    public void a() {
        mq mq2 = this.e(this.E);
        double d3 = mq2.a(this.F);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        mq2.a(this.F.toUpperCase(), this.d(), d4, this.D ? ww_0.b.c : ww_0.b.r);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.D && !this.x()) {
            this.f(false);
        }
        if (this.e() < 0.0) {
            this.b(this.N());
        }
    }

    @Override
    public void i() {
        this.f(true);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    public double N() {
        mq mq2 = this.e(this.E);
        return mq2.b(this.F);
    }

    public String O() {
        return this.F;
    }

    public void f(boolean bl) {
        this.D = bl;
    }

    public void b(String string) {
        this.F = string;
        this.b(this.N());
    }

    public void f(double d3) {
        this.E = d3;
    }
}

