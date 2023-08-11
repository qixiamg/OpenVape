/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dg_1;
import manthe.lz_0;
import manthe.si_0;

/*
 * Renamed from manthe.su
 */
public class su_0
extends si_0 {
    public su_0() {
        super("net/minecraftforge/client/event/EntityViewRenderEvent$FogDensity", 0);
    }

    @Override
    public void a(Object object) {
        dg_1 dg_12 = new dg_1(object);
        lz_0 lz_02 = new lz_0(dg_12, dg_12.h(), dg_12.g(), dg_12.j(), dg_12.i(), dg_12.k());
        lz_02.fire();
        dg_12.a(lz_02.getDensity());
    }
}

