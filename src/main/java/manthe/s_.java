/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.da_0;
import manthe.du_1;
import manthe.dz_2;
import manthe.kf_0;
import manthe.si_0;

public class s_
extends si_0 {
    public s_() {
        super(A5.b0, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        dz_2 dz_22 = new dz_2(object);
        kf_0 kf_02 = dz_22.g().equals(du_1.g()) ? new kf_0(da_0.b) : new kf_0(da_0.a);
        kf_02.fire();
    }
}

