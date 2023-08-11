/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.da_0;
import manthe.ds_2;
import manthe.du_1;
import manthe.dw_2;
import manthe.kt_0;
import manthe.si_0;

public class sJ
extends si_0 {
    public sJ() {
        super(A5.cV, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        dw_2 dw_22 = new dw_2(object);
        if (!dw_22.h().equals(ds_2.k())) {
            return;
        }
        kt_0 kt_02 = dw_22.g().equals(du_1.g()) ? new kt_0(dw_22.h(), da_0.b) : new kt_0(dw_22.h(), da_0.a);
        kt_02.fire();
    }
}

