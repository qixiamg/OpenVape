/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class lB
extends kl_0 {
    @Override
    public boolean fire() {
        fG fG2 = ds_2.k().aG();
        ka_0 ka_02 = new ka_0(fG2);
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(ka_02);
        }
        return super.fire();
    }
}

