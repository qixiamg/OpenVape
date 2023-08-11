/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.awt.Color;

/*
 * Renamed from manthe.zw
 */
public class zw_0
extends Module {
    public zw_0() {
        super("Step", new Color(42, 175, 224).getRGB(), CQ.f);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kd_0 kd_02) {
        eJ eJ2 = ds_2.k();
        if (kd_02.c() && !eJ2.bg().f() && eJ2.J()) {
            kd_02.setStepHeight(1.0);
        } else if (!kd_02.c() && kd_02.getRealHeight() > 0.5 && kd_02.getStepHeight() > 0.0 && !eJ2.bg().f() && eJ2.J()) {
            on.p.H().b(zz_0.class).e(-4);
            if (kd_02.getRealHeight() >= 0.87) {
                double d3 = kd_02.getRealHeight();
                double d4 = d3 * 0.42;
                double d5 = d3 * 0.75;
                eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.l() + d4, eJ2.g(), eJ2.v()));
                eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.l() + d5, eJ2.g(), eJ2.v()));
            }
            ds_2.O().a(0.45f);
            ms ms2 = new ms(this);
            ms2.start();
        }
    }
}

