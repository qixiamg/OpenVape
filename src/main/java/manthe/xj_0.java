/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.ColorValue;

import java.awt.Color;

/*
 * Renamed from manthe.xj
 */
class xj_0
extends xd {
    final VapeSettings G;
    final wp_0 F;

    xj_0(wp_0 wp_02, ColorValue dE, VapeSettings cb_02) {
        this.F = wp_02;
        this.G = cb_02;
        super(dE);
    }

    @Override
    public boolean b() {
        return this.G.teamsByColor.u();
    }

    @Override
    public Color I() {
        return xj_0.b.u;
    }
}

