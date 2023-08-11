/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.CV;
import manthe.k9;
import manthe.mq;
import manthe.pc;
import manthe.uW;
import manthe.we_0;
import manthe.wh_0;
import manthe.xg_0;

public class xM
extends xg_0 {
    private float F;
    private String D;
    private String C;
    private wh_0 B = new wh_0("newclose", 1.5);
    private pc E;

    public xM(we_0 we_02, String string, String string2, double d3) {
        super(we_02);
        this.F = (float)d3;
        this.D = string;
        this.C = string2;
        this.B.c(new CV(this, we_02));
        this.a(this.B);
    }

    public xM(we_0 we_02, String string, String string2) {
        this(we_02, string, string2, 1.0);
    }

    public xM a(pc pc2) {
        this.E = pc2;
        return this;
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        Color color = xM.b.c;
        double d3 = mq2.a(this.C);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        if (this.D != null) {
            double d5 = this.c() + this.f() / 2.0 - (double)(8.0f * this.F / 2.0f);
            mq2.a(this.C, this.d() + 10.0 + 8.0, d4, color);
            k9.a(color, (float)this.d() + 5.0f, (float)d5, this.D, 8.0f * this.F, 8.0f * this.F, false);
        } else {
            mq2.a(this.C, this.d() + 5.0, d4, color);
        }
        this.B.c(this.d() + this.e() - 7.5 - 8.0);
        this.B.a(this.c());
        this.B.d(this.f());
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

    public wh_0 n() {
        return this.B;
    }

    static pc a(xM xM2) {
        return xM2.E;
    }
}

