/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.List;

public class AQ
extends Module {
    private boolean v;
    private boolean u;

    public AQ() {
        super("Parkour", -7719233, CQ.e, "Jumps for you at the edge of blocks.");
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        boolean bl;
        ei_0 ei_02 = ds_2.s().l();
        eJ eJ2 = ds_2.k();
        if (this.u) {
            if (!this.v) {
                ei_0.a(ei_02.i(), false);
            }
            this.u = false;
            this.v = false;
            return;
        }
        if (ei_02.f()) {
            return;
        }
        gh_0 gh_02 = eJ2.bg();
        boolean bl2 = bl = gh_02.j() > 0.0f;
        if (bl && eJ2.v()) {
            fP fP2;
            if (V.c() >= 15) {
                fP2 = eJ2.s();
            } else {
                fP fP3 = eJ2.s();
                fP2 = fP3.k();
            }
            double d3 = 0.0;
            double d4 = eJ2.U();
            double d5 = 90.0;
            double d6 = Math.cos(Math.toRadians(d4 + d5)) * d3;
            double d7 = Math.sin(Math.toRadians(d4 + d5)) * d3;
            fP fP4 = fP2.c(d6, -0.1, d7);
            List list = ds_2.t().b(eJ2, fP4);
            d3 = 1.0;
            d6 = Math.cos(Math.toRadians(d4 + d5)) * d3;
            d7 = Math.sin(Math.toRadians(d4 + d5)) * d3;
            fP4 = fP2.c(d6, -2.0, d7);
            List list2 = ds_2.t().b(eJ2, fP4);
            int n6 = list.size();
            if (n6 == 0 && list2.size() == 0) {
                this.v = ei_02.h();
                ei_0.a(ei_02.i(), true);
                ei_0.a(ei_02.i());
                this.u = true;
            }
        }
    }
}

