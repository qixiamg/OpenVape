/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.d9;
import manthe.kx_0;
import manthe.si_0;

public class s0
extends si_0 {
    public s0() {
        super("net/minecraftforge/client/event/RenderWorldLastEvent", 0);
    }

    @Override
    public void a(Object object) {
        d9 d92 = new d9(object);
        new kx_0(d92.g()).fire();
    }
}

