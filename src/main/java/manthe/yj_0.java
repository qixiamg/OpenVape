/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.yj
 */
public class yj_0
extends yc_0 {
    private final zz_0 v = (zz_0)this.S();

    public yj_0(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!ks_02.c()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.H()) {
            return;
        }
        if ((eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) && eJ2.J()) {
            double d3 = 0.42f;
            if (eJ2.a(fX.k())) {
                d3 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
            }
            ks_02.setY(d3);
            eJ2.l(d3);
        }
        this.v.a(ks_02, 0.4199999976158142, eJ2);
    }
}

