/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dh_1;
import manthe.l1;
import manthe.si_0;

public class ss
extends si_0 {
    public ss() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Post", 0);
    }

    @Override
    public void a(Object object) {
        dh_1 dh_12 = new dh_1(object);
        new l1(dh_12).fire();
    }
}

