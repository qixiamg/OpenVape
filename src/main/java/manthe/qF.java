/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class qF
extends qE {
    private final zu_0 c = on.p.H().b(zu_0.class);

    public qF(si_0 si_02) {
        super(si_02);
    }

    @Override
    public void a(Object object) {
        dg_0 dg_02 = new dg_0(object);
        if (dg_02.f()) {
            return;
        }
        if (dg_02.g()) {
            this.c.W();
            for (Module y52 : on.p.H().f()) {
                y52.t();
            }
            on.p.r().c();
        }
    }
}

