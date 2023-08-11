/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cv_0;
import manthe.lZ;
import manthe.si_0;

/*
 * Renamed from manthe.sd
 */
public class sd_0
extends si_0 {
    public sd_0() {
        super("net/minecraftforge/client/event/MouseEvent", 0);
    }

    @Override
    public void a(Object object) {
        new lZ(new cv_0(object)).fire();
    }
}

