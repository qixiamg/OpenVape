/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.uO;
import manthe.uW;
import manthe.wM;
import manthe.wP;
import manthe.wq_0;
import manthe.xZ;
import manthe.xf_0;

public class x6
extends wM {
    private xZ A = new xZ("PUBLIC PROFILES");
    private xf_0 z = new xf_0("Type Profile Name / UUID");
    private wq_0 B = new wq_0();

    public x6(wP wP2) {
        this.z.a(new uO(this, wP2));
        this.a(this.z, this.A, this.B);
    }

    @Override
    public void a() {
        this.A.c(this.d());
        this.A.a(this.c());
        this.z.c(this.d());
        this.z.a(this.c() + this.A.f());
        this.z.b(this.e() - 50.0);
        this.B.c(this.d() + this.z.e());
        this.B.a(this.c() + this.A.f());
        this.B.b(50.0);
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

    static xf_0 a(x6 x62) {
        return x62.z;
    }
}

