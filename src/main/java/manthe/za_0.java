/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.za
 */
public class za_0
extends Module {
    public za_0() {
        super("DuelInfo", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    public rU S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rU)) continue;
            return (rU)r12;
        }
        return null;
    }

    @Override
    public void a(kS kS2) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(kS2);
        if (zu_0.b(wC.class) != null) {
            zu_0.b(wC.class).a(kS2);
        }
    }

    @Override
    public void a(k_ k_2) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(k_2);
        if (zu_0.b(wC.class) != null) {
            zu_0.b(wC.class).a(k_2);
        }
    }

    @Override
    public void a(ka_0 ka_02) {
        rU rU2 = this.S();
        if (rU2 == null) {
            return;
        }
        rU2.a(ka_02);
        if (zu_0.b(wC.class) != null) {
            zu_0.b(wC.class).a(ka_02);
        }
    }
}

