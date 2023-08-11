/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.da_2;
import manthe.kN;
import manthe.si_0;

/*
 * Renamed from manthe.sj
 */
public class sj_0
extends si_0 {
    public sj_0() {
        super("net/minecraftforge/event/entity/player/PlayerEvent$NameFormat", 0);
    }

    @Override
    public void a(Object object) {
        da_2 da_22 = new da_2(object);
        kN kN2 = new kN(da_22.g(), da_22.h());
        kN2.fire();
        da_22.a(kN2.getDisplayName());
    }
}

