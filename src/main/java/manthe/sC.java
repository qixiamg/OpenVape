/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class sC
extends si_0 {
    public sC() {
        super("net/minecraftforge/event/entity/PlaySoundAtEntityEvent", 0);
    }

    @Override
    public void a(Object object) {
        d1_0 d1_02 = new d1_0(object);
        k_ k_2 = new k_(new ex_0(d1_02.g()), d1_02.h());
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(k_2);
        }
    }
}

