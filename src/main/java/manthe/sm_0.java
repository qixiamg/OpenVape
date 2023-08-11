/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dz_1;
import manthe.lS;
import manthe.si_0;

/*
 * Renamed from manthe.sm
 */
public class sm_0
extends si_0 {
    public sm_0() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Post", 0);
    }

    @Override
    public void a(Object object) {
        dz_1 dz_12 = new dz_1(object);
        new lS(dz_12).fire();
    }
}

