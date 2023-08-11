/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.k9;
import manthe.mq;
import manthe.uW;
import manthe.wC;
import manthe.wM;

/*
 * Renamed from manthe.xr
 */
public class xr_0
extends wM {
    private wC z;

    public xr_0(wC wC2) {
        this.z = wC2;
    }

    @Override
    public void a() {
        this.l();
    }

    @Override
    public void k() {
        this.l();
    }

    private void l() {
        mq mq2 = this.e(0.9);
        double d3 = mq2.a("Aim");
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - 3.0;
        k9.a(xr_0.b.r, (float)this.d() + 5.0f, (float)d5, "newaim", 6.0f, 6.0f, false);
        mq2.a(this.z.ao(), this.d() + 8.0 + 10.0, d4, xr_0.b.r);
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
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

