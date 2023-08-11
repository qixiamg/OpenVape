/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.di_0;
import manthe.dx_1;
import manthe.lw_0;
import manthe.si_0;

/*
 * Renamed from manthe.sq
 */
public class sq_0
extends si_0 {
    public sq_0() {
        super("net/minecraftforge/client/event/GuiOpenEvent", 0);
    }

    @Override
    public void a(Object object) {
        di_0 di_02 = new di_0(object);
        lw_0 lw_02 = new lw_0(di_02, di_02.g());
        lw_02.fire();
        dx_1 dx_12 = lw_02.getGui();
        di_02.a(dx_12);
    }
}

