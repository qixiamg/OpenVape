/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_1;
import manthe.kn_0;
import manthe.si_0;

public class sA
extends si_0 {
    public sA() {
        super("net/minecraftforge/event/entity/living/LivingEvent$LivingUpdateEvent", 0);
    }

    @Override
    public void a(Object object) {
        ds_1 ds_12 = new ds_1(object);
        new kn_0(ds_12.h()).fire();
    }
}

