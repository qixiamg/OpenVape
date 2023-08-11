/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class w6
extends wy_0 {
    public w6() {
        super(CQ.b);
        this.a(w6.b.u);
        this.W().e(false);
        this.W().b("wrap");
        this.P = false;
        this.a(new xb_0(this));
    }

    @Override
    public void V() {
        if (this.c() != 7.0) {
            this.aq();
        }
    }

    @Override
    public void K() {
    }

    @Override
    public void S() {
    }

    public void b(String string) {
        this.J();
        if (string == null || string.length() < 1) {
            return;
        }
        for (Module y52 : on.p.H().e()) {
            if (y52.Q().equals(CQ.b) || !y52.H().toLowerCase().contains(string.toLowerCase())) continue;
            wz_0 wz_02 = new wz_0(this, y52);
            this.a((wM)wz_02, new Object[0]);
            wz_02.R();
        }
    }

    public void aq() {
        d0_0 d0_02 = ds_2.p();
        this.a((double)d0_02.g() / 2.0 - this.e() / 2.0, 7.0);
    }

    @Override
    public void n() {
    }

    @Override
    public String ad() {
        return "ModuleSearch";
    }

    @Override
    public boolean b() {
        return zu_0.T.R.v().equals(zu_0.T.O);
    }
}

