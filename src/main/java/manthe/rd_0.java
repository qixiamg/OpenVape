/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D7;
import manthe.ak_0;
import manthe.p1;
import manthe.pd;
import manthe.q3;
import manthe.q5;
import manthe.r1;
import manthe.r6;
import manthe.rQ;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.rp_0;
import manthe.sb_0;
import manthe.so_0;
import manthe.sw_0;
import manthe.u4;

/*
 * Renamed from manthe.rd
 */
public class rd_0
extends r1 {
    private static final double ah = 20.0;
    private static final double ag = 14.0;
    private static final double af = 12.0;
    public final r6 ae;
    private final sb_0 ai;

    public rd_0() {
        super("Profiles", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf_02.c(120.0);
        this.d(rf_02);
        rp_0 rp_02 = new rp_0(this, false);
        rg_0 rg_02 = new rg_0("Add", false);
        rg_02.b(12.0);
        rg_02.c(20.0);
        rg_02.a(new u4(this));
        this.ai = new sw_0(this, 16, rg_02);
        this.ai.b(12.0);
        this.ai.a("<name>");
        rQ rQ2 = new rQ("world", 0.3f, 1.0f, 1.0f);
        rQ2.b("Open public profiles");
        rQ2.b(12.0);
        rQ2.c(12.0);
        rQ2.a(new q5(this));
        rp_02.a(new D7(1.0, 0.0, 1, 3, new pd(0, 0, 0, 0)));
        rp_02.b(rQ2);
        rp_02.b(this.ai);
        rp_02.b(rg_02);
        rf_02.b(rp_02);
        this.ae = new r6(false);
        this.ae.b(150.0);
        rf_02.b(this.ae);
        this.c(120.0);
        this.b(20.0);
        this.X().b("A profile is a configuration which allows you to have multiple sets of different settings\n\nAdding a profile will make a copy of your current settings and save them into a new profile");
    }

    @Override
    public void c(double d3) {
        super.c(d3 + 7.0);
        double d4 = (d3 -= 12.0) - 0.0;
        double d5 = d3 - 0.0;
        this.ae.c(d4);
        this.ai.c(d4 - 20.0);
        for (p1 p12 : this.ae.A().v()) {
            rf_0 rf_02 = (rf_0)p12;
            p1 p13 = rf_02.v().get(0);
            p1 p14 = rf_02.v().get(1);
            p13.c(d5 - 14.0 - 5.0 - 20.0);
            p14.c(-6.0);
        }
    }

    public void a(ak_0 ak_02) {
        so_0 so_02 = new so_0(ak_02);
        so_02.b(10.0);
        so_02.c(120.0);
        this.ae.d(so_02);
        this.ae.c();
    }

    private void a(rl_0 rl_02, String string, String string2, long l6) {
        new q3(this, rl_02, string, l6, string2).start();
    }

    public void b(ak_0 ak_02) {
        so_0 so_02 = null;
        rf_0 rf_02 = this.ae.A();
        for (p1 p12 : rf_02.v()) {
            so_0 so_03;
            if (!(p12 instanceof so_0) || !(so_03 = (so_0)p12).x().equals(ak_02)) continue;
            so_02 = so_03;
            break;
        }
        if (so_02 != null) {
            rf_02.a((p1)so_02);
            rf_02.c();
        }
    }

    static sb_0 a(rd_0 rd_02) {
        return rd_02.ai;
    }
}

