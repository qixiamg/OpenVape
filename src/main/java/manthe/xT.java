/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.fG;
import manthe.mq;
import manthe.pe_0;
import manthe.uW;
import manthe.wE;
import manthe.wM;

public class xT
extends wM {
    private wE z;

    public xT(wE wE2) {
        this.z = wE2;
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.8);
        double d3 = 55.0;
        double d4 = (this.e() - d3) / 2.0;
        fG fG2 = this.z.m().n().get(this.z.ak()).a();
        pe_0.a(this.d() + d4 - 0.5, this.c() + 20.0 - 5.0, d3 + 1.0, d3 + 1.0, xT.b.y);
        pe_0.a(this.d() + d4, this.c() + 20.0 - 5.0 + 0.5, d3, d3, xT.b.u);
        if (fG2 != null && fG2.d()) {
            pe_0.a(fG2, 2.0, this.d() + d3 / 2.0 - 10.0, this.c() + d3 / 2.0);
        }
        String string = "SLOT " + (this.z.ak() + 1);
        mq2.b(string, this.d() + 5.0 + d3 / 2.0, this.c() + 20.0 + d3 + mq2.a(string), xT.b.r);
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
        return 55.0;
    }

    @Override
    public double h() {
        return 200.0;
    }
}

