/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ye
 */
public class ye_0
extends yc_0 {
    private final z3 v = (z3)this.S();

    public ye_0(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.c()) {
            if (this.v.aa.u().booleanValue() && ds_2.x().d()) {
                return;
            }
            if (ds_2.t().e()) {
                return;
            }
            if (this.v.E.u().booleanValue() && !VapeSettings.f()) {
                this.v.R.clear();
                return;
            }
            boolean bl = V.c() < 23;
            eJ eJ2 = ds_2.k();
            boolean bl2 = V.c() > 15 && this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : this.v.Q.a(this.v.U());
            this.v.T();
            boolean bl3 = false;
            boolean bl4 = false;
            yP yP2 = on.p.H().b(yP.class);
            for (ej_0 ej_02 : this.v.R) {
                boolean bl5;
                double d3;
                if (!this.v.a(ej_02) || !((d3 = (double)eJ2.a(ej_02)) <= this.v.am.a())) continue;
                boolean bl6 = bl5 = this.v.T.v() == this.v.L;
                if (!yq_0.u.V() && this.v.T.v() != this.v.v) {
                    float[] fArray = this.v.c(ej_02);
                    float f10 = this.v.a(ej_02.z(), ej_02.g(), km_0.getRotationYaw());
                    float f11 = fArray[1];
                    if (this.v.T.v() == this.v.I) {
                        float f12 = ds_2.s().r();
                        float f13 = f12 * 0.6f + 0.2f;
                        float f14 = f13 * f13 * f13 * 8.0f;
                        int n6 = Math.round(f10 / f14);
                        int n10 = Math.round((f11 - km_0.getRotationPitch()) / f14);
                        float f15 = (float)n6 * f14;
                        float f16 = (float)n10 * f14;
                        km_0.setRotationYaw(km_0.getRotationYaw() + f15);
                        km_0.setRotationPitch(km_0.getRotationPitch() + f16);
                    } else {
                        km_0.setRotationYaw(km_0.getRotationYaw() + f10);
                        km_0.setRotationPitch(f11);
                    }
                    if (bl5) {
                        eJ2.i(km_0.getRotationYaw());
                        eJ2.d(km_0.getRotationPitch());
                    }
                }
                if (!bl2) continue;
                bl3 = true;
                if (bl) {
                    eJ2.aO();
                }
                if (d3 <= this.v.W.a()) {
                    ds_2.K().a(eJ2, ej_02);
                    if (!bl) {
                        eJ2.aO();
                        eJ2.a4();
                    }
                    if (bl4 || !yP2.N()) continue;
                    bl4 = true;
                    yP2.e(true);
                    continue;
                }
                if (bl) continue;
                eJ2.aO();
                eJ2.a4();
            }
            if (bl4) {
                yP2.e(false);
            }
            if (bl3) {
                this.v.Q.d();
            }
        }
    }
}

