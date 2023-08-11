/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.zc
 */
public class zc_0
extends Module {
    public zc_0() {
        super("TargetInfo", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    public rr_0 S() {
        for (r1 r12 : on.p.F().d()) {
            if (!(r12 instanceof rr_0)) continue;
            return (rr_0)r12;
        }
        return null;
    }

    @Override
    public void a(kJ kJ2) {
        rr_0 rr_02 = this.S();
        if (rr_02 == null) {
            return;
        }
        rr_02.a(kJ2);
    }
}

