/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.B8;
import manthe.BW;
import manthe.BY;
import manthe.D7;
import manthe.bi_0;
import manthe.lT;
import manthe.m3;
import manthe.mp_0;
import manthe.mx_0;
import manthe.my_0;
import manthe.nB;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qo;
import manthe.r1;
import manthe.r6;
import manthe.rV;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.sb_0;
import manthe.sz;
import manthe.vf_0;
import manthe.ya_0;
import manthe.z;

/*
 * Renamed from manthe.rx
 */
public class rx_0
extends r1 {
    private static final double ar = 20.0;
    private rf_0 ap;
    private sb_0 aq;
    private rg_0 ah;
    private rf_0 al;
    private rf_0 an;
    private rf_0 ak;
    private rf_0 ao;
    private r6 ai;
    private ya_0 af = null;
    private ya_0 ag = null;
    private boolean aj = false;
    private boolean am = false;
    private static int[] ae;

    public rx_0() {
        super("Macros", false);
        this.aj().a(new D7(0.0, 0.0, 4, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf_02.c(125.0);
        this.d(rf_02);
        this.b(rf_02);
        this.a(rf_02);
        this.c(rf_02);
        this.c(100.0);
        this.b(20.0);
    }

    private void b(rf_0 rf_02) {
        this.al = new rf_0(false);
        this.al.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.al.b(70.0);
        this.ap = new rf_0(false);
        this.ap.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.ah = new rg_0("Add", false);
        this.ah.b(12.0);
        this.ah.c(20.0);
        this.ah.a(new lT(this));
        this.aq = new sz(this, 16);
        this.aq.b(12.0);
        this.aq.c(79.0);
        this.aq.a("<item name>");
        this.ap.b(this.aq);
        this.ap.b(this.ah);
        this.ai = new r6(false);
        this.ai.b(130.0);
        this.al.b(this.ap);
        this.al.b(this.ai);
        this.al.a(new bi_0(this));
        rf_02.b(this.al);
    }

    private void a(rf_0 rf_02) {
        this.ao = new rf_0(false);
        this.ao.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ao.b(70.0);
        rl_0 rl_02 = new rl_0("Press a key", my_0.i, 1.0);
        rl_02.c(50.0);
        rl_02.b(10.0);
        this.ao.b(rl_02);
        this.ao.a(new mp_0(this));
        rf_02.b(this.ao);
    }

    private void c(rf_0 rf_02) {
        this.an = new rf_0(false);
        this.an.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.an.b(70.0);
        this.ak = new rf_0(false);
        this.ak.a(new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ak.b(70.0);
        this.ak.a(new BW(this));
        rl_0 rl_02 = new rl_0("<macro name>", my_0.i, 0.9);
        rl_02.c(50.0);
        rl_02.b(10.0);
        rl_02.a(new vf_0(this, rl_02));
        rg_0 rg_02 = new rg_0("Add", false);
        rg_02.c(50.0);
        rg_02.b(10.0);
        rg_02.a(new BY(this));
        rg_02.a(new mx_0(this, rg_02));
        rg_0 rg_03 = new rg_0("Cancel", false);
        rg_03.c(50.0);
        rg_03.b(10.0);
        rg_03.a(new z(this));
        rg_0 rg_04 = new rg_0("Delete Macro", false);
        rg_04.c(50.0);
        rg_04.b(10.0);
        rg_04.a(new B8(this));
        rg_04.a(new nB(this, rg_04));
        this.an.b(rl_02);
        this.an.b(this.ak);
        this.an.b(rg_02);
        this.an.b(rg_03);
        this.an.b(rg_04);
        this.an.a(new qo(this));
        rf_02.b(this.an);
    }

    @Override
    public void c(double d3) {
        super.c(d3 + 3.0);
        this.a(this.aj(), new m3(this, d3));
        this.aq.c(d3 - 2.0 - 20.0);
        this.ah.c(20.0);
    }

    public void c(ya_0 ya_02) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(this.q() - 8.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new rV(rf_02, this, ya_02);
        this.ai.d(rf_02);
    }

    public void b(ya_0 ya_02) {
        rf_0 rf_02 = this.ai.A();
        rf_02.a((p1)ya_02.p());
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.ag != null) {
            this.ag.d(n6);
            on.p.f().a(this.ag);
            this.ag = null;
            return true;
        }
        return super.a(c2, n6);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.ag != null) {
            this.ag.d(-100 + n11);
            on.p.f().a(this.ag);
            this.ag = null;
            return true;
        }
        return super.a(n6, n10, n11);
    }

    public void p(boolean bl) {
        this.aj = bl;
    }

    public void q(boolean bl) {
        this.am = bl;
    }

    public void a(ya_0 ya_02) {
        this.af = ya_02;
    }

    static sb_0 j(rx_0 rx_02) {
        return rx_02.aq;
    }

    static ya_0 a(rx_0 rx_02, ya_0 ya_02) {
        rx_02.ag = ya_02;
        return rx_02.ag;
    }

    static boolean b(rx_0 rx_02, boolean bl) {
        rx_02.am = bl;
        return rx_02.am;
    }

    static ya_0 b(rx_0 rx_02, ya_0 ya_02) {
        rx_02.af = ya_02;
        return rx_02.af;
    }

    static rg_0 h(rx_0 rx_02) {
        return rx_02.ah;
    }

    static ya_0 c(rx_0 rx_02) {
        return rx_02.af;
    }

    static ya_0 f(rx_0 rx_02) {
        return rx_02.ag;
    }

    static rf_0 g(rx_0 rx_02) {
        return rx_02.al;
    }

    static rf_0 d(rx_0 rx_02) {
        return rx_02.ao;
    }

    static boolean b(rx_0 rx_02) {
        return rx_02.am;
    }

    static rf_0 i(rx_0 rx_02) {
        return rx_02.ak;
    }

    static boolean e(rx_0 rx_02) {
        return rx_02.aj;
    }

    static boolean a(rx_0 rx_02, boolean bl) {
        rx_02.aj = bl;
        return rx_02.aj;
    }

    static rf_0 a(rx_0 rx_02) {
        return rx_02.an;
    }

    public static void b(int[] nArray) {
        ae = nArray;
    }

    public static int[] al() {
        return ae;
    }

    static {
        if (rx_0.al() == null) {
            rx_0.b(new int[2]);
        }
    }
}

