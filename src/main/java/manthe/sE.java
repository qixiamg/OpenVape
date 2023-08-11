/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dn_2;
import manthe.ll_0;
import manthe.si_0;

public class sE
extends si_0 {
    public sE() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$SetArmorModel", 0);
    }

    @Override
    public void a(Object object) {
        dn_2 dn_22 = new dn_2(object);
        new ll_0(dn_22, dn_22.g()).fire();
    }
}

