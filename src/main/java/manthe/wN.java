/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;

class wN
extends wK {
    final cb_0 S;
    final wp_0 T;

    wN(wp_0 wp_02, BooleanValue dB, cb_0 cb_02) {
        this.T = wp_02;
        this.S = cb_02;
        super(dB);
    }

    @Override
    public boolean b() {
        return this.S.k.u();
    }

    @Override
    public Color I() {
        return wN.b.u;
    }
}

