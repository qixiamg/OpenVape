/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class z4
extends Module {
    private final DF u = DF.a(this, "Health", "#.#", "", 0.5, 8.0, 10.0, 0.5, "Minimum health to regen at\nMay not bypass Anti-Cheats");

    public z4() {
        super("Regen", 8919359, CQ.f, "Regenerates health quicker.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if ((double)eJ2.aD() < this.u.a() * 2.0 && eJ2.a2().f() > 16 && !eJ2.bd() && eJ2.J() && eJ2.v() && !ds_2.s().l().h() && !eJ2.H() && eJ2.ad() % 5 == 1 && !eJ2.j()) {
            f_ f_2 = f_.a(false);
            for (int i = 0; i < 40; ++i) {
                eJ2.bp().a(f_2);
            }
        }
    }
}

