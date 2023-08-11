/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

class pS
implements vK {
    final r_ a;

    pS(r_ r_2) {
        this.a = r_2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        for (Module bI : on.p.H().e()) {
            if ((bI.Q() != CQ.b || bI instanceof zE) && bI.N()) {
                bI.d(false);
            }
            bI.c().clear();
            if (bI.P() != 0) {
                bI.c().add(bI.P());
            }
            if (bI.l() != null && bI.l().Y() != null) {
                bI.l().Y().g(bI.v());
            }
            for (BasicValue ds_02 : bI.r()) {
                if (ds_02.b() == null) continue;
                ds_02.q();
            }
        }
        for (BasicValue ds_03 : on.p.o().a()) {
            if (ds_03.b() == null) continue;
            ds_03.q();
        }
    }
}

