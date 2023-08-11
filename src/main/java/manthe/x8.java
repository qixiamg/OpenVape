/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dr_0;
import manthe.uW;
import manthe.wM;
import manthe.wW;
import manthe.xl_0;

public class x8
extends wM {
    private wW z = new wW("newpublicprofiles");
    private xl_0 A = new xl_0("Type name");

    public x8() {
        this.z.c(new dr_0(this));
        this.z.a("Browse public profiles");
        this.a(this.A, this.z);
    }

    @Override
    public void a() {
        double d3 = (this.e() - 10.0) / 5.0;
        double d4 = this.e() - d3 - 7.5;
        this.A.c(this.d());
        this.A.a(this.c());
        this.A.b(d4);
        this.A.d(this.f());
        this.z.a(this.c() + 2.5);
        this.z.c(this.d() + d3 * 4.0 + 2.5);
        this.z.b(d3 + 2.5);
        this.z.d(this.f() - 5.0);
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
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

