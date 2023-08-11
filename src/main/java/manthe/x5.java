/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.ColorValue;

import java.awt.Color;

class x5
extends xu_0 {
    final xd W;

    x5(xd xd2, String string, ColorValue dE, Color[] colorArray) {
        this.W = xd2;
        super(string, dE, colorArray);
    }

    @Override
    protected void Q() {
        pe_0.a("teamdot", this.d() + (double)this.J().o().floatValue(), this.S.b() + this.S.c() / 2.0, this.S.d(), this.S.c(), this.P().q());
    }

    @Override
    public boolean U() {
        return false;
    }
}

