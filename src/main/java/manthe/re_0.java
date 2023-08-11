/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.AO;
import manthe.C9;
import manthe.D7;
import manthe.mD;
import manthe.my_0;
import manthe.n_0;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.ro_0;
import manthe.s7;
import manthe.sV;
import manthe.sb_0;
import manthe.zP;

/*
 * Renamed from manthe.re
 */
public class re_0
extends r1 {
    private final rl_0 ae;
    private final AO ag = new AO();
    private final r6 af;

    public re_0() {
        super("InvCleaner", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(100.0);
        this.b(20.0);
        zP zP2 = on.p.H().b(zP.class);
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf_02.c(this.q());
        this.d(rf_02);
        double d3 = rf_02.q() - 0.0;
        rf_02.b(new s7(on.p.H().b(zP.class))).c(d3);
        sb_0 sb_02 = new sb_0(64);
        sb_02.c(d3);
        sb_02.b(12.0);
        sb_02.a("<item name>");
        rf_02.b(sb_02);
        sV sV2 = new sV(10.0, 1.0, "", " stacks", "Allowed Stacks");
        sV2.f(1.0);
        sV2.c(d3);
        sV2.b(8.0);
        rf_02.b(sV2);
        rf_0 rf_03 = new rf_0(false);
        rf_03.j(false);
        rf_03.b(c);
        rf_03.a(new D7(2.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        rf_03.c(d3);
        rf_02.b(rf_03);
        rg_0 rg_02 = new rg_0("Whitelist", true);
        rg_02.c(rf_03.q() / 2.0);
        rg_02.b(12.0);
        rg_02.z().j(false);
        rg_02.b("Allow the item to be in your inventory.\nIt will only drop if it exceeds the allowed stack limits.");
        rg_02.a(new n_0(this, sb_02, zP2, sV2));
        rf_03.b(rg_02);
        rg_0 rg_03 = new rg_0("Blacklist", true);
        rg_03.c(rf_03.q() / 2.0 - 2.0);
        rg_03.b(12.0);
        rg_03.z().j(false);
        rg_03.b("Always remove this item from your inventory,\nregardless of item stacks");
        rg_03.a(new C9(this, sb_02, zP2));
        rf_03.b(rg_03);
        this.af = new r6(false);
        this.af.b(80.0);
        this.af.c(d3 - 0.0);
        this.d(this.af);
        this.ae = new rl_0("", my_0.i, 0.8);
        this.ae.c(d3);
        this.ae.b(15.0);
        this.ae.a(false);
        this.d(this.ae);
    }

    @Override
    public void c() {
        super.c();
        if (this.ae.e() && this.ag.a(2000L)) {
            this.ae.a("");
            this.ag.d();
        }
        this.ae.a(!this.ae.E().isEmpty());
    }

    public void a(mD mD2) {
        double d3 = this.q() - 0.0;
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(d3);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        this.af.d(rf_02);
    }

    public void b(mD mD2) {
        p1 p12 = null;
        block0: for (p1 p13 : this.af.A().v()) {
            if (!(p13 instanceof rf_0)) continue;
            rf_0 rf_02 = (rf_0)p13;
            for (p1 p14 : rf_02.v()) {
                ro_0 ro_02;
                if (!(p14 instanceof ro_0) || !(ro_02 = (ro_0)p14).H().equals(mD2) && !ro_02.H().d().equalsIgnoreCase(mD2.d())) continue;
                p12 = p13;
                continue block0;
            }
        }
        if (p12 != null) {
            this.af.A().a(p12);
        }
    }

    static AO a(re_0 re_02) {
        return re_02.ag;
    }

    static rl_0 b(re_0 re_02) {
        return re_02.ae;
    }
}

