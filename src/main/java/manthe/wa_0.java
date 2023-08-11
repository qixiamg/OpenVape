/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.ar_0;
import manthe.mI;
import manthe.mq;
import manthe.pe_0;
import manthe.qZ;
import manthe.wI;
import manthe.wV;

/*
 * Renamed from manthe.wa
 */
public class wa_0
extends wI {
    private ak_0 D;
    private wV E = new wV("newworld", 0.8);
    private wV G = new wV("newcopy", 0.8);
    private wV F = new wV("newupdateprofile", 0.8);

    public wa_0(ak_0 ak_02) {
        this.D = ak_02;
        this.E.c(new qZ(this, ak_02));
        this.E.a("Publish this profile");
        this.G.c(new mI(this, ak_02));
        this.G.a("Copy this profiles UUID");
        this.F.c(new ar_0(this));
        this.F.a("Update (save) this profile");
        this.a(this.E, this.G, this.F);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        double d3 = mq2.a(this.D.r());
        double d4 = this.c() + 9.0 - d3 / 2.0;
        double d5 = this.d() + 10.0;
        pe_0.a(this.d() + 5.0 + 1.0, this.c() + 1.0, this.e() - 10.0 - 2.0, this.f() - 2.0, wa_0.b.m);
        mq2.a(this.D.r(), d5, d4, wa_0.b.r);
        double d6 = this.d() + this.e() - 10.0 - 8.0;
        double d7 = this.c() + this.f() / 2.0 - 4.0;
        this.E.d(this.D.k() ? wa_0.b.g : null);
        this.E.b(8.0);
        this.E.d(8.0);
        this.E.c(d6);
        this.E.a(d7);
        if (this.D.k()) {
            this.G.b(8.0);
            this.G.d(8.0);
            this.G.c(d6 -= 5.0 + this.E.e());
            this.G.a(d7);
            this.F.b(8.0);
            this.F.d(8.0);
            this.F.c(d6 -= 5.0 + this.G.e());
            this.F.a(d7);
        } else {
            this.G.a(false);
            this.F.a(false);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
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
        return 18.0;
    }

    public ak_0 N() {
        return this.D;
    }
}

