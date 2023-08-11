/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.gj_0;
import manthe.my_0;
import manthe.nz;
import manthe.o1;
import manthe.pd;
import manthe.qK;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.rx_0;
import manthe.us_0;
import manthe.yU;
import manthe.ya_0;

public class rV
extends rg_0
implements o1 {
    public rV(rf_0 rf_02, rx_0 rx_02, ya_0 ya_02) {
        super("", true);
        ya_02.a(rf_02);
        this.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(rf_02.q());
        rl_0 rl_02 = new rl_0("", my_0.c, 1.0);
        rl_02.b(2.0);
        rf_02.b(rl_02);
        this.a(new gj_0(this, rx_02, ya_02));
        rl_0 rl_03 = new rl_0(ya_02.l(), my_0.c, 0.8);
        double d3 = this.q() - 5.0 - 0.0;
        rl_03.b(Color.WHITE);
        rl_03.j(false);
        rl_03.b(8.0);
        rl_03.c(d3);
        this.b(rl_03);
        rl_0 rl_04 = new rl_0("", my_0.c, 0.8);
        rl_04.b(Color.LIGHT_GRAY);
        rl_04.j(false);
        rl_04.b(6.0);
        rl_04.c(d3);
        rl_04.a(new us_0(this, ya_02, rl_04));
        this.b(rl_04);
        rl_0 rl_05 = new rl_0("", my_0.c, 0.8);
        rl_05.b(Color.LIGHT_GRAY);
        rl_05.j(false);
        rl_05.b(6.0);
        rl_05.c(d3);
        rl_05.a(new qK(this, rl_05, ya_02));
        if (!(ya_02 instanceof yU)) {
            this.b(rl_05);
        }
        rl_0 rl_06 = new rl_0("", my_0.c, 0.8);
        rl_06.b(Color.LIGHT_GRAY);
        rl_06.j(false);
        rl_06.b(6.0);
        rl_06.c(d3);
        rl_06.a(new nz(this, rl_06, ya_02));
        if (!(ya_02 instanceof yU)) {
            this.b(rl_06);
        }
        rf_02.b(this);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
    }

    @Override
    public void F() {
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void g(boolean bl) {
    }
}

