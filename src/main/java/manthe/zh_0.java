/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.awt.Color;

/*
 * Renamed from manthe.zh
 */
public class zh_0
extends Module {
    private final p4 u = new p4("AntiCheat", new yA(this, "AntiCheat"));

    public zh_0() {
        super("Phase", new Color(73, 208, 176).getRGB(), CQ.f, "Phase/Clip through walls.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void t() {
    }

    @Override
    public void a(km_0 km_02) {
        ((Module)this.u.f()).a(km_02);
    }

    @Override
    public void a(kU kU2) {
        if (kU2.getOverlayType().toString().toUpperCase().equals("BLOCK")) {
            kU2.getEvent().a(true);
        }
    }
}

