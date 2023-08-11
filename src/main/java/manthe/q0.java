/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.da_0;
import manthe.dl_2;
import manthe.du_1;
import manthe.ke_0;
import manthe.qE;
import manthe.si_0;

public class q0
extends qE {
    public q0(si_0 si_02) {
        super(si_02);
    }

    @Override
    public void a(Object object) {
        dl_2 dl_22 = new dl_2(object);
        ke_0 ke_02 = dl_22.g().equals(du_1.g()) ? new ke_0(da_0.b, dl_22.h()) : new ke_0(da_0.a, dl_22.h());
        ke_02.fire();
    }
}

