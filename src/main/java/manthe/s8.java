/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dw_1;
import manthe.ku_0;
import manthe.si_0;

public class s8
extends si_0 {
    public s8() {
        super("net/minecraftforge/client/event/RenderHandEvent", 0);
    }

    @Override
    public void a(Object object) {
        dw_1 dw_12 = new dw_1(object);
        new ku_0(dw_12.g()).fire();
    }
}

