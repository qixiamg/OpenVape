/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.AD;
import manthe.bz_2;
import manthe.k9;
import manthe.mq;
import manthe.qn_0;
import manthe.uW;
import manthe.wC;
import manthe.wV;
import manthe.we_0;
import manthe.xg_0;

/*
 * Renamed from manthe.xh
 */
public class xh_0
extends xg_0 {
    private String E;
    private String C;
    private wV D = new wV("settingdots");
    private wV B = new wV("newpin");

    public xh_0(we_0 we_02, String string, String string2) {
        super(we_02);
        this.E = string;
        this.C = string2;
        this.B.c(new AD(this));
        this.D.c(new qn_0(this, we_02));
        this.a(this.D, this.B);
    }

    @Override
    public void a() {
        this.n();
    }

    @Override
    public void k() {
        if (this.l() instanceof bz_2 && !((bz_2)((Object)this.l())).m() && !(this.l() instanceof wC)) {
            ((bz_2)((Object)this.l())).n();
        }
    }

    private void n() {
        mq mq2 = this.e(0.9);
        Color color = xh_0.b.c;
        double d3 = mq2.a(this.C);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - 4.0;
        mq2.a(this.C, this.d() + 10.0 + 8.0, d4, color);
        k9.a(color, (float)this.d() + 5.0f, (float)d5, this.E, 8.0f, 8.0f, false);
        this.B.d(this.l().ai() ? xh_0.b.a : null);
        this.B.c(this.d() + this.e() - 10.0 - 16.0);
        this.B.a(this.c());
        this.B.d(this.f());
        this.D.d(this.l() instanceof bz_2 && !((bz_2)((Object)this.l())).m() ? xh_0.b.a : null);
        this.D.c(this.d() + this.e() - 5.0 - 8.0 + 4.0);
        this.D.a(this.c());
        this.D.d(this.f());
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
}

