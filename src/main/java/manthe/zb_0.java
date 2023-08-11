/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.zb
 */
public class zb_0
extends Module {
    private boolean u;

    public zb_0() {
        super("PotionSaver", -256, CQ.f, "Saves your potion effect(s) duration when standing still");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ky_0 ky_02) {
        eJ eJ2 = ds_2.k();
        if (eJ2.d() && !eJ2.aJ().isEmpty() && !this.a(eJ2) && (eJ2.v() || eJ2.J())) {
            if (ky_02.getPacket().a(A5.bN)) {
                this.u = true;
                ky_02.a(true);
            }
        } else {
            this.u = false;
        }
    }

    private boolean a(eJ eJ2) {
        return eJ2.k() != 0.0 || eJ2.u() != 0.0;
    }

    @Override
    public int y() {
        return this.u ? -256 : yI.a(160);
    }
}

