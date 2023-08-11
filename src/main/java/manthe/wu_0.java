/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.uW;
import manthe.wM;
import manthe.wl_0;

/*
 * Renamed from manthe.wu
 */
public class wu_0
extends wM {
    private wl_0 z;

    public wu_0(String string, pc pc2) {
        this.z = new wl_0(string, wu_0.b.m);
        this.z.c(pc2);
        this.a(this.z);
    }

    @Override
    public void a() {
        this.z.c(this.d() + 5.0);
        this.z.a(this.c() + 1.0);
        this.z.b(this.e() - 10.0);
        this.z.d(this.f() - 2.0);
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
        return 15.0;
    }
}

