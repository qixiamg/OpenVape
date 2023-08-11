/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class s2
extends si_0 {
    public s2() {
        super("net/minecraftforge/event/entity/player/PlayerInteractEvent", 0);
    }

    @Override
    public void a(Object object) {
        dt_2 dt_22 = new dt_2(object);
        if (dt_22.m() == 0 && dt_22.i() == 0 && dt_22.k() == 0 && dt_22.j() == -1 && dt_22.n().equals("RIGHT_CLICK_AIR")) {
            fG fG2 = ds_2.k().aG();
            ka_0 ka_02 = new ka_0(fG2);
            for (Module y52 : on.p.H().e()) {
                if (!y52.N()) continue;
                y52.a(ka_02);
            }
        }
    }
}

