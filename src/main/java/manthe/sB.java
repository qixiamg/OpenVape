/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.d4_0;
import manthe.ln_0;
import manthe.si_0;

public class sB
extends si_0 {
    public sB() {
        super("net/minecraftforge/client/event/RenderLivingEvent$Specials$Pre", 0);
    }

    @Override
    public void a(Object object) {
        d4_0 d4_02 = new d4_0(object);
        new ln_0(d4_02).fire();
    }
}

