/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pe_0;
import manthe.wV;
import manthe.x4;

/*
 * Renamed from manthe.xf
 */
public class xf_0
extends x4 {
    protected wV M = new wV("newsearch");

    public xf_0(String string) {
        super(string);
        this.I.a(false);
        this.a(this.M);
    }

    @Override
    public void a() {
        this.M.c(this.d() + this.n() - 10.0 - 8.0);
        this.M.a(this.c());
        this.M.d(this.f());
        this.M.b(8.0);
        pe_0.a(this.d() + 5.0, this.c() + 2.5, this.n() - 10.0, this.f() - 5.0, this.K.q());
        pe_0.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.n() - 10.0 - 1.0, this.f() - 5.0 - 1.0, xf_0.b.m);
        this.K();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    @Override
    public double l() {
        return this.n() - 35.0;
    }

    @Override
    public void Q() {
    }
}

