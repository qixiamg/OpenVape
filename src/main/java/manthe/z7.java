/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class z7
extends Module {
    private double u;
    private double v;
    private zG x;
    private e6 w;

    public z7() {
        super("KeepSprint", 14828276, CQ.f, "Prevents you from losing sprint when attacking.");
    }

    @Override
    public void a(kJ kJ2) {
        eJ eJ2 = ds_2.k();
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        if (kJ2.a() == da_0.b) {
            this.u = eJ2.k();
            this.v = eJ2.u();
        }
        if (kJ2.a() == da_0.a && eJ2.k() == (this.u *= 0.6) && eJ2.u() == (this.v *= 0.6) && !eJ2.E()) {
            eJ2.k(eJ2.k() / 0.6);
            eJ2.d(eJ2.u() / 0.6);
            eJ2.l(true);
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        ev_0 ev_02 = ds_2.k().a(eT.f());
        if (ds_2.k().C() && ev_02.a(ej_0.aI().f()).e()) {
            ev_02.a(ej_0.aI());
        }
    }

    @Override
    public void a(kT kT2) {
        if (this.x == null) {
            this.x = on.p.H().b(zG.class);
        }
        if (this.x.V()) {
            return;
        }
        if (!kT2.getEntity().equals(ds_2.k())) {
            return;
        }
        if (kT2.isNewStateSprinting()) {
            return;
        }
        if (this.a(ds_2.k())) {
            kT2.a(true);
        }
    }

    @Override
    public boolean n() {
        return true;
    }

    private boolean a(eJ eJ2) {
        if (eJ2.e()) {
            return false;
        }
        return !this.x.V() && eJ2.aF() > 0.0f && !eJ2.af() && eJ2.a2().f() > 6 && !eJ2.E();
    }
}

