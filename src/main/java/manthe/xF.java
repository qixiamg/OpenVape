/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.mr;
import manthe.uW;
import manthe.v3;
import manthe.wE;
import manthe.wM;
import manthe.wl_0;
import manthe.xf_0;

public class xF
extends wM {
    private xf_0 z = new xf_0("Search Item Name");
    private wl_0 A;

    public xF(wE wE2) {
        this.A = new wl_0("Save & Exit", xF.b.i);
        this.z.a(new mr(this, wE2));
        this.A.c(new v3(this, wE2));
        this.a(this.z, this.A);
    }

    @Override
    public void a() {
        double d3 = 27.5;
        this.z.c(this.d());
        this.z.a(this.c() + 20.0 - 5.0 - 2.5);
        this.z.b(d3 * 6.0 + 5.0);
        this.A.b(d3 * 2.0);
        this.A.d(15.0);
        this.A.c(this.d() + this.z.e() + d3);
        this.A.a(this.c() + 20.0 - 5.0);
    }

    @Override
    public void k() {
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
        return 220.0;
    }

    @Override
    public double h() {
        return 40.0;
    }

    static xf_0 a(xF xF2) {
        return xF2.z;
    }
}

