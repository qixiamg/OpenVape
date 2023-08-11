/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dh_1;
import manthe.lH;
import manthe.si_0;

public class sR
extends si_0 {
    public sR() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dh_1 dh_12 = new dh_1(object);
        new lH(dh_12).fire();
    }
}

