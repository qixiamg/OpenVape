/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

import java.util.ArrayList;

/*
 * Renamed from manthe.ys
 */
public class ys_0
extends y8 {
    private final pb_0 B = new pb_0("Distance");
    private final pb_0 w = new pb_0("FOV");
    private final DX A = DX.a((Object)this, "Sort Target", this.B, this.B, this.w);
    private final DF v = DF.a((Object)this, "Max angle", "#", "", 35.0, 90.0, 360.0, 5.0);
    private final DF x = DF.a((Object)this, "Distance", "#.#", "m", 1.0, 5.0, 7.0, 0.1);
    private final DF C = DF.a(this, "Horizontal Speed", "#.#", "", 1.0, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private final DF D = DF.a(this, "Vertical Speed", "#.#", "", 1.0, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private final AO z = new AO();
    private int u = -1;
    private boolean E;
    private boolean y;

    public ys_0() {
        super("RodAimbot", "Aims at a target with prediction + correction.");
        this.a(this.C, this.D, this.v, this.x, this.A);
    }

    @Override
    public void s() {
        this.E = false;
        this.y = false;
        this.u = -1;
    }

    @Override
    public void J() {
        if (this.u != -1) {
            int n6 = ds_2.s().s().i();
            ei_0.a(n6, false);
            ei_0.a(n6);
            ds_2.k().aU().a(this.u);
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if (eJ2.aW().e() && this.y && !this.E && this.z.a(50L)) {
            for (int i = 36; i < 45; ++i) {
                fG fG2;
                if (!eJ2.aY().a(i).h() || !(fG2 = eJ2.aY().a(i).f()).k().d() || !fG2.k().a(A5.cX)) continue;
                this.u = ds_2.k().aU().i();
                eJ2.aU().a(i - 36);
                int n6 = ds_2.s().s().i();
                ei_0.a(n6, true);
                ei_0.a(n6);
                ei_0.a(n6, false);
                this.E = true;
                this.z.d();
                return;
            }
        }
        if (eJ2.aW().d()) {
            boolean bl;
            em_0 em_02 = eJ2.aW();
            double d3 = Math.abs(em_02.k());
            double d4 = Math.abs(em_02.D());
            double d5 = Math.abs(em_02.u());
            boolean bl2 = bl = d3 < 0.001 && d4 < 0.001 && d5 < 0.001;
            if (eJ2.aU().i() == this.u) {
                this.d(false);
            }
            if (em_02.au().d() || bl || this.z.a(500L)) {
                this.E = false;
                this.d(false);
            }
        }
    }

    @Override
    public void a(kt_0 kt_02) {
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        if (ds_2.t().e()) {
            return;
        }
        if (this.E) {
            return;
        }
        ej_0 ej_02 = this.S();
        eJ eJ2 = ds_2.k();
        if (ej_02 != null && ej_02.d() && eJ2.aW().e()) {
            float[] fArray = this.a(ej_02, 1.4f);
            if (!Float.isNaN(fArray[1])) {
                float f10 = fArray[0];
                float f11 = fArray[1];
                float f12 = this.C.a().floatValue() / 3.0f;
                float f13 = this.D.a().floatValue() / 3.0f;
                if (f10 > f12) {
                    f10 = f12;
                } else if (f10 < -f12) {
                    f10 = -f12;
                }
                if (f11 > f13) {
                    f11 = f13;
                } else if (f11 < -f13) {
                    f11 = -f13;
                }
                float f14 = ds_2.s().r();
                float f15 = f14 * 0.6f + 0.2f;
                float f16 = f15 * f15 * f15 * 8.0f;
                int n6 = Math.round(f10 / f16);
                int n10 = Math.round(f11 / f16);
                float f17 = (float)n6 * f16;
                float f18 = (float)n10 * f16;
                float f19 = eJ2.U() + f17;
                float f20 = eJ2.K() + f18;
                boolean bl = this.y;
                boolean bl2 = this.y = Math.abs(fArray[0]) <= 3.0f && Math.abs(fArray[1]) <= 3.0f && eJ2.aW().e();
                if (!bl && this.y) {
                    this.z.d();
                }
                eJ2.i(f19);
                eJ2.d(f20);
            }
        } else {
            if (!this.E) {
                this.d(false);
            }
            this.y = false;
        }
    }

    private float[] a(ex_0 ex_02, float f10) {
        double d3 = ex_02.z() - ex_02.T();
        double d4 = ex_02.g() - ex_02.X();
        double d5 = ex_02.l() - ex_02.R();
        eJ eJ2 = ds_2.k();
        double d6 = eJ2.a(ex_02);
        d6 -= d6 % 0.8;
        double d7 = d6 / 0.32 * d3 * 0.87;
        double d8 = d6 / 0.32 * d4 * 0.87;
        double d10 = 0.0;
        double d11 = ex_02.z() + d7 - eJ2.z();
        double d12 = ex_02.g() + d8 - eJ2.g();
        float f11 = this.a(d11, d12, eJ2.U());
        float f12 = An.a(new oC(ex_02.z() + d7, ex_02.l() + 1.0 + d10, ex_02.g() + d8), f10) - eJ2.K();
        return new float[]{f11, f12};
    }

    private float a(double d3, double d4, float f10) {
        double d5 = d4 < 0.0 && d3 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d4 / d3)) : (d4 < 0.0 && d3 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d4 / d3)) : Math.toDegrees(-Math.atan(d3 / d4)));
        return Y.a(-(f10 - (float)d5));
    }

    private ej_0 S() {
        ArrayList<ej_0> arrayList = new ArrayList<ej_0>();
        ArrayList arrayList2 = new ArrayList(ds_2.t().k());
        for (Object e10 : arrayList2) {
            ej_0 ej_02;
            ex_0 ex_02 = new ex_0(e10);
            if (VapeSettings.h && ex_02.a(A5.a8) || !ex_02.a(A5.cF) || !this.a(ej_02 = new ej_0(e10))) continue;
            arrayList.add(ej_02);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.A.v() == this.w) {
            arrayList.sort(new tm(this, null));
        }
        if (this.A.v() == this.B) {
            arrayList.sort(new vF(this, null));
        }
        return (ej_0)arrayList.get(0);
    }

    private boolean a(ej_0 ej_02) {
        if (ej_02.e()) {
            return false;
        }
        if (ej_02.equals(ds_2.k())) {
            return false;
        }
        if (!this.b(ej_02)) {
            return false;
        }
        if (ej_02.aD() <= 0.0f || ej_02.j()) {
            return false;
        }
        if (pf_0.b(ds_2.k(), ej_02) > this.v.a().intValue() / 2) {
            return false;
        }
        Friend ab_02 = on.p.N().b(ej_02.S());
        if (ab_02 != null && !ab_02.getTarget()) {
            return false;
        }
        float f10 = ds_2.k().a(ej_02);
        return f10 >= 1.0f && (double)f10 < this.x.a();
    }

    private boolean b(ej_0 ej_02) {
        return on.p.t().a(ej_02, true);
    }
}

