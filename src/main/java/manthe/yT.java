/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class yT
extends Module {
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Speed Check", false, "Ignore falling when Speed is enabled.");
    private final DF v = DF.a((Object)this, "Fall Dist", "#.#", "m", 0.1, 2.0, 5.0, "The amount of blocks to fall before attempting to lag back.");
    private final AO u = new AO();
    private boolean x;

    public yT() {
        super("AntiFall", 16028225, CQ.f, "Helps you with your Parkinson's\nPrevents you from falling into the void.");
        this.a(this.w, this.v);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km_0 km_02) {
        eJ eJ2 = ds_2.k();
        gS gS2 = eJ2.i();
        if (eJ2.e() || gS2.e() || eJ2.j() || eJ2.o() || eJ2.a8().g() || eJ2.a8().h() || on.p.H().a(A7.class) || on.p.H().a(zM.class) || this.w.u().booleanValue() && on.p.H().a(zz_0.class)) {
            return;
        }
        if (km_02.a() == da_0.b) {
            dx_2 dx_22;
            if (!this.x && this.S()) {
                return;
            }
            if (this.x && this.u.a(250L) || eJ2.J()) {
                this.x = false;
                this.u.d();
                return;
            }
            double d3 = this.v.a();
            if ((double)eJ2.t() >= d3 && !on.p.H().b(zM.class).N() && ((dx_22 = gS2.a(eJ2.z(), eJ2.l() - 1.0, eJ2.g())).e() || dx_22.h().a(eD.h().h().a().getClass()))) {
                if (!this.x) {
                    this.x = true;
                    this.u.d();
                } else {
                    eJ2.bg().b(0.0f);
                    eJ2.bg().a(0.0f);
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                    eJ2.c(eJ2.z(), eJ2.l() + (double)eJ2.t(), eJ2.g());
                    eJ2.j(0.0f);
                }
            }
        }
    }

    @Override
    public void a(kF kF2) {
        eJ eJ2 = ds_2.k();
        if (kF2.getPacket().e() || eJ2.e() || eJ2.i().e()) {
            return;
        }
        if (kF2.getPacket().a(A5.U)) {
            eJ2.j(0.0f);
            eJ2.k(0.0);
            eJ2.d(0.0);
            this.x = false;
            this.u.d();
        }
    }

    private boolean S() {
        eJ eJ2 = ds_2.k();
        gS gS2 = eJ2.i();
        for (double d3 = eJ2.l() - 1.0; d3 > 0.0; d3 -= 1.0) {
            dx_2 dx_22 = gS2.a(eJ2.z(), d3, eJ2.g());
            if (dx_22.e() || dx_22.h().a(eD.h().h().a().getClass())) continue;
            return true;
        }
        return false;
    }
}

