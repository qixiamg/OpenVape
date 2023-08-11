/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.zo
 */
public class zo_0
extends Module {
    private final pb_0 w = new pb_0("Normal");
    private final pb_0 u = new pb_0("AntiCheat");
    private final DX v = DX.a((Object)this, "Mode", "NoFall method to prevent you from taking fall damage.\nNormal - Works on vanilla/some anti-cheats (Does not Bypass AntiCheat)\nAntiCheat - Works and bypasses on various anti-cheats", this.w, this.w, this.u);
    private float x;

    public zo_0() {
        super("NoFall", 8919359, CQ.f, "Prevents taking fall damage.\nThis may not bypass AntiCheats.");
        ((rz_0)this.v.getDefaultValue()).a(new vQ(this));
        this.a(this.v);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km_0 km_02) {
        eJ eJ2 = ds_2.k();
        this.a(this.v.v().H());
        if (eJ2.e() || eJ2.i().e() || eJ2.j() || eJ2.a8().g() || eJ2.a8().h() || on.p.H().a(zM.class)) {
            return;
        }
        if (this.v.v() == this.w) {
            boolean bl;
            boolean bl2 = bl = (double)eJ2.t() > 2.224 && eJ2.D() < 0.0;
            if (km_02.a() == da_0.b) {
                if (bl) {
                    km_0.setOnGround(true);
                    eJ2.e(10);
                    if (ds_2.s().l().g()) {
                        ei_0.a(ds_2.s().l().i(), false);
                        ei_0.a(ds_2.s().l().i());
                    }
                }
            } else if (bl) {
                eJ2.e(false);
            }
        }
        if (this.v.v() == this.u) {
            if (this.x > eJ2.t()) {
                this.x = 0.0f;
            }
            if ((double)eJ2.t() > 2.124 && eJ2.D() < 0.0 && km_02.a() == da_0.b && eJ2.t() >= 3.0f && eJ2.t() - this.x > 3.0f) {
                this.x = eJ2.t();
                eJ2.bp().a(f_.a(true));
                eJ2.bp().a(f_.a(false));
            }
        }
    }

    static DX a(zo_0 zo_02) {
        return zo_02.v;
    }
}

