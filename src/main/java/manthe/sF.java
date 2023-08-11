/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dn_1;
import manthe.lK;
import manthe.si_0;

public class sF
extends si_0 {
    public sF() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Specials$Pre", 0);
    }

    @Override
    public void a(Object object) {
        dn_1 dn_12 = new dn_1(object);
        new lK(dn_12, dn_12.h(), dn_12.k()).fire();
    }
}

