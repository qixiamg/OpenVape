/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cd_0;
import manthe.lG;
import manthe.si_0;

public class sU
extends si_0 {
    public sU() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$FogColors", 0);
    }

    @Override
    public void a(Object object) {
        cd_0 cd_02 = new cd_0(object);
        lG lG2 = new lG(cd_02, cd_02.h(), cd_02.g(), cd_02.j(), cd_02.i(), cd_02.m(), cd_02.l(), cd_02.k());
        lG2.fire();
        cd_02.a(lG2.getRed());
        cd_02.b(lG2.getGreen());
        cd_02.c(lG2.getBlue());
    }
}

