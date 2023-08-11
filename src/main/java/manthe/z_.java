/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class z_
extends Module {
    public z_() {
        super("CPSMod", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
    }

    public rO S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rO)) continue;
            return (rO)r12;
        }
        return null;
    }

    @Override
    public void a(ki_0 ki_02) {
        rO rO2 = this.S();
        if (rO2 == null) {
            return;
        }
        int n6 = ds_2.s().m().i();
        if (ki_02.getButtonState() && ki_02.getButton() == n6 + 100) {
            rO2.a(System.currentTimeMillis());
        }
    }
}

