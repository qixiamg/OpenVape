/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.df_2;
import manthe.ex_0;
import manthe.kS;
import manthe.si_0;

/*
 * Renamed from manthe.st
 */
public class st_0
extends si_0 {
    public st_0() {
        super("net/minecraftforge/event/entity/EntityJoinWorldEvent", 0);
    }

    @Override
    public void a(Object object) {
        df_2 df_22 = new df_2(object);
        kS kS2 = new kS(new ex_0(df_22.g()));
        kS2.fire();
    }
}

