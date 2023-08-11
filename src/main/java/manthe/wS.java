/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;

class wS
extends wK {
    final VapeSettings T;
    final wp_0 S;

    wS(wp_0 wp_02, BooleanValue dB, VapeSettings cb_02) {
        this.S = wp_02;
        this.T = cb_02;
        super(dB);
    }

    @Override
    public boolean b() {
        return this.T.teamsByColor.u();
    }

    @Override
    public Color I() {
        return wS.b.u;
    }
}

