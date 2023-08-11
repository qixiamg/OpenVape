/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dm_1;
import manthe.lf;
import manthe.si_0;

public class sL
extends si_0 {
    public sL() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$RenderFogEvent", 0);
    }

    @Override
    public void a(Object object) {
        dm_1 dm_12 = new dm_1(object);
        new lf(dm_12, dm_12.h(), dm_12.g(), dm_12.j(), dm_12.i(), dm_12.k(), dm_12.l()).fire();
    }
}

