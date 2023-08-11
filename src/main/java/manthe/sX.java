/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dz_1;
import manthe.lO;
import manthe.si_0;

public class sX
extends si_0 {
    public sX() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dz_1 dz_12 = new dz_1(object);
        lO lO2 = new lO(dz_12);
        if (lO2.fire()) {
            lO2.getForgeEvent().a(true);
        }
    }
}

