/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.zk
 */
public class zk_0
extends Module {
    private final AO x = new AO();
    private final AO w = new AO();
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Disable Speed", false, "Disable Speed when flagging.");
    private int v;

    public zk_0() {
        super("NoRotate", -2420426, CQ.f, "Prevents the server from\nsetting your view angles.");
        this.a(this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
        fS fS2 = new fS(ds_2.o());
        eJ eJ2 = ds_2.k();
        if (kF2.getPacket().a(A5.U) && fS2.d() && fS2.f() && eJ2.d() && eJ2.ad() > 20) {
            zz_0 zz_02 = on.p.H().b(zz_0.class);
            zz_02.e(-20);
            if (this.w.a(2000L)) {
                ++this.v;
                fj_0 fj_02 = new fj_0(kF2.getPacket());
                double d3 = fj_02.k();
                double d4 = fj_02.i();
                double d5 = fj_02.l();
                float f10 = fj_02.g();
                float f11 = fj_02.j();
                if (fj_02.h().contains(fC.p())) {
                    d3 += eJ2.z();
                } else {
                    eJ2.k(0.0);
                }
                if (fj_02.h().contains(fC.n())) {
                    d4 += eJ2.l();
                } else {
                    eJ2.l(0.0);
                }
                if (fj_02.h().contains(fC.m())) {
                    d5 += eJ2.g();
                } else {
                    eJ2.d(0.0);
                }
                if (fj_02.h().contains(fC.q())) {
                    f11 += eJ2.K();
                }
                if (fj_02.h().contains(fC.o())) {
                    f10 += eJ2.U();
                }
                eJ2.f(f10);
                eJ2.e(f11);
                double d6 = eJ2.ag() - f10;
                if (d6 < -180.0) {
                    eJ2.e(eJ2.ag() + 360.0f);
                }
                if (d6 >= 180.0) {
                    eJ2.e(eJ2.ag() - 360.0f);
                }
                float f12 = f10 % 360.0f;
                float f13 = f11 % 360.0f;
                if ((double)eJ2.t() > 1.25) {
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                }
                float f14 = f12 + Y.a(eJ2.U() - f12);
                eJ2.a(d3, d4, d5, f14, eJ2.K());
                eJ2.bp().a(cb_0.h ? fU.a(eJ2.z(), eJ2.Y().l(), eJ2.g(), f12, f13, false) : fU.a(eJ2.z(), eJ2.Y().l(), eJ2.l(), eJ2.g(), f12, f13, false));
                kF2.a(true);
            }
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.x.a(750L) && this.v > 3 && this.w.a(2000L)) {
            this.w.d();
            this.x.d();
            this.v = 0;
            zz_0 zz_02 = on.p.H().b(zz_0.class);
            if (this.u.x().booleanValue() && zz_02.N()) {
                zz_02.z();
            }
        }
    }
}

