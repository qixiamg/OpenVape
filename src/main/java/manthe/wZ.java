/*
 * Decompiled with CFR 0.152.
 */
package manthe;

class wZ
extends wK {
    final wp_0 S;

    wZ(wp_0 wp_02, BooleanValue dB) {
        this.S = wp_02;
        super(dB);
    }

    @Override
    public void N() {
        if (on.C) {
            return;
        }
        on.p.S();
        super.N();
    }

    @Override
    public void j() {
        if (on.C != this.T()) {
            super.N();
        }
        super.j();
    }
}

