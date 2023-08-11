/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.BR;
import manthe.D3;
import manthe.DN;
import manthe.DZ;
import manthe.ak_0;
import manthe.my_0;
import manthe.pd;
import manthe.rQ;
import manthe.rf_0;
import manthe.rl_0;
import manthe.t3;

public class sM
extends rf_0 {
    private final ak_0 I;

    public sM(ak_0 ak_02, double d3) {
        super(true);
        this.I = ak_02;
        this.e(0.5);
        this.a(new Color(40, 40, 40, 100));
        this.a(new D3(0.0, 0.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(d3);
        this.b(75.0);
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 1)));
        rf_02.b(c);
        rf_02.j(false);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rl_0 rl_02 = new rl_0(ak_02.r(), my_0.c, 1.0);
        rl_02.c(rf_02.q() * 0.75);
        rl_02.b(10.0);
        rl_02.j(false);
        rf_02.b(rl_02);
        rl_0 rl_03 = new rl_0(ak_02.m() + "", my_0.e, 1.0);
        rl_03.b("Total profile usages");
        rl_03.c(rf_02.q() * 0.25);
        rl_03.b(10.0);
        rl_03.j(false);
        rl_03.a(new t3(this, rl_03, ak_02));
        rf_02.b(rl_03);
        this.b(rf_02);
        rf_0 rf_03 = new rf_0(false);
        rf_03.a(new D3(0.0, 0.0, 5000, 3, new pd(0, 0, 0, 0)));
        rf_03.b(c);
        rf_03.j(false);
        rf_03.c(this.q());
        rf_03.b(20.0);
        rf_0 rf_04 = new rf_0(false);
        rf_04.a(new D3(0.0, 0.0, 5000, 1, new pd(2, 0, 0, 0)));
        rf_04.b(c);
        rf_04.j(false);
        rf_04.c(this.q());
        rf_04.b(20.0);
        rf_03.b(rf_04);
        rQ rQ2 = new rQ("copy", 0.2f, 0.1f, 0.1f, true);
        rQ2.b("Copy profile UUID");
        rQ2.a(c);
        rQ2.c(7.0);
        rQ2.b(7.0);
        rQ2.j(false);
        rQ2.a(new BR(this, ak_02, rQ2));
        rf_04.b(rQ2);
        rl_0 rl_04 = new rl_0(ak_02.l().toString(), my_0.c, 0.5);
        rl_04.c(rf_03.q() * 0.8);
        rl_04.b(10.0);
        rl_04.j(false);
        rf_03.b(rl_04);
        rl_0 rl_05 = new rl_0("", my_0.c, 0.5);
        rl_05.c(rf_03.q() * 0.1);
        rl_05.b(10.0);
        rl_05.j(false);
        rf_03.b(rl_05);
        this.b(rf_03);
        rf_0 rf_05 = new rf_0(false);
        rf_05.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf_05.b(c);
        rf_05.j(false);
        rf_05.c(this.q());
        rf_05.b(20.0);
        rl_0 rl_06 = new rl_0("Updated:", my_0.c, 0.7);
        rl_06.c(rf_05.q() * 0.25);
        rl_06.b(10.0);
        rl_06.j(false);
        rf_05.b(rl_06);
        rl_0 rl_07 = new rl_0(ak_02.p().length() > 10 ? ak_02.p().substring(0, 10) : ak_02.p(), my_0.c, 0.7);
        rl_07.c(rf_05.q() * 0.75);
        rl_07.b(10.0);
        rl_07.j(false);
        rf_05.b(rl_07);
        this.b(rf_05);
        this.a();
    }

    private void a() {
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D3(2.0, 0.0, 1, 3, new pd(0, 0, 0, 0)));
        rf_02.b(c);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rf_0 rf_03 = new rf_0(true);
        rf_03.a(new D3(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        rf_03.b(c);
        rf_03.c(this.q() / 2.0 - 4.0);
        rf_03.b(17.0);
        rQ rQ2 = new rQ("download", 0.5f, 20.0f, 0.0f);
        rQ2.c(rf_03.q());
        rQ2.b(17.0);
        rQ2.e(0.5);
        rQ2.a(new Color(40, 40, 40, 100));
        rQ2.a(new DN(this, rQ2));
        rQ2.a(new DZ(this));
        rf_03.b(rQ2);
        rf_02.b(rf_03);
        this.b(rf_02);
    }

    @Override
    public Color f() {
        return c;
    }

    static ak_0 a(sM sM2) {
        return sM2.I;
    }
}

