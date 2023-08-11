/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cb_0;
import manthe.ds_2;
import manthe.eJ;
import manthe.ft_0;

/*
 * Renamed from manthe.pa
 */
public class pa_0 {
    private void a() {
        eJ eJ2 = ds_2.k();
        if (!eJ2.v() || !eJ2.J()) {
            return;
        }
        for (int i = 0; i < 60; ++i) {
            double d3 = 0.13029834580989086 + 7.045809890852092E-4 * Math.random();
            ft_0 ft_02 = cb_0.h ? ft_0.a(eJ2.z(), eJ2.l() + d3, eJ2.g(), false) : ft_0.a(eJ2.z(), eJ2.s().l() + d3, eJ2.l() + d3, eJ2.g(), false);
            double d4 = 0.07029834580989085 + 7.045809890852092E-4 * Math.random();
            ft_0 ft_03 = cb_0.h ? ft_0.a(eJ2.z(), eJ2.l() + d3, eJ2.g(), false) : ft_0.a(eJ2.z(), eJ2.s().l() + d4, eJ2.l() + d4, eJ2.g(), false);
            eJ2.bp().a(ft_02);
            eJ2.bp().a(ft_03);
        }
        eJ2.bp().a(cb_0.h ? ft_0.a(eJ2.z(), eJ2.l(), eJ2.g(), true) : ft_0.a(eJ2.z(), eJ2.s().l(), eJ2.l(), eJ2.g(), true));
    }
}

