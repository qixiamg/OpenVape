/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import rip.vape.friend.Friend;
import rip.vape.module.Module;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class zS
extends Module {
    private pb_0 F = new pb_0("Distance");
    private pb_0 D = new pb_0("FOV");
    private DX v = DX.a((Object)this, "Sort Target", this.F, this.F, this.D);
    private DF B = DF.a((Object)this, "Max angle", "#", "", 35.0, 90.0, 360.0, 5.0);
    private DF E = DF.a(this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private DF z = DF.a(this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.1, "Use a lower value if blatant is disabled.");
    private DF w = DF.a((Object)this, "Distance", "#.#", "m", 1.0, 0.1, 128.0, 0.1);
    private BooleanValue C = BooleanValue.createValue((Object)this, "Invisibles", "Aim at invisible entities", false);
    private BooleanValue u = BooleanValue.createValue((Object)this, "Through Blocks", false, "Aim through blocks at entities");
    private BooleanValue G = BooleanValue.createValue((Object)this, "Silent Aim", false, "Aims silently server side\nMay not bypass anti-cheats well");
    private BooleanValue x = BooleanValue.createValue((Object)this, "Check Block Break", false, "Prevents from aiming while breaking blocks");
    private float A;
    private float H;
    private HashMap<Integer, o9> y = new HashMap();

    public zS() {
        super("BowAimbot", new Color(198, 53, 53).getRGB(), CQ.c, "Aims at a target with prediction + correction.");
        this.G.d(true);
        this.a(this.v, this.G, this.x, this.C, this.E, this.z, this.w, this.B);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.c()) {
            this.b(km_02);
        }
    }

    private void b(km_0 km_02) {
        boolean bl;
        ej_0 ej_02 = this.S();
        eJ eJ2 = ds_2.k();
        boolean bl2 = bl = eJ2.bd() && eJ2.aG().d() && eJ2.aG().k().a(A5.cZ);
        if (bl && ej_02 != null && ej_02.d()) {
            float[] fArray = this.a(ej_02, 1.0f, this.A, this.H);
            float f10 = fArray[0];
            float f11 = fArray[1];
            float f12 = this.E.a().floatValue() / 2.0f;
            float f13 = this.z.a().floatValue() / 2.0f;
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
            float f19 = this.A + f17;
            float f20 = this.H + f18;
            if (this.G.x().booleanValue()) {
                this.A = f19;
                km_0.setRotationYaw(this.A);
                if (!Float.isNaN(f20)) {
                    this.H = f20;
                    km_0.setRotationPitch(this.H);
                }
            } else {
                this.A = f19;
                eJ2.i(this.A);
                if (!Float.isNaN(f20)) {
                    this.H = f20;
                    eJ2.d(this.H);
                }
            }
        } else {
            this.A = eJ2.U();
            this.H = eJ2.K();
            this.y.clear();
        }
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        boolean bl;
        if (a.ib() || ds_2.t().e()) {
            return;
        }
        ej_0 ej_02 = this.S();
        eJ eJ2 = ds_2.k();
        boolean bl2 = bl = eJ2.bd() && eJ2.aG().d() && eJ2.aG().k().a(A5.cZ);
        if (ej_02 != null && ej_02.d() && bl) {
            float[] fArray = this.a(ej_02, 1.0f, eJ2.U(), eJ2.K());
            float f10 = fArray[0];
            float f11 = fArray[1];
            float f12 = this.E.a().floatValue() / 5.0f;
            float f13 = this.z.a().floatValue() / 5.0f;
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
            eJ2.i(f19);
            if (!Float.isNaN(f20)) {
                eJ2.d(f20);
            }
        } else {
            this.y.clear();
        }
    }

    private boolean T() {
        if (this.x.u().booleanValue() && ds_2.I().d() && ds_2.I().g().equals(g4.f())) {
            if (VapeSettings.f()) {
                ei_0 ei_02 = ds_2.s().m();
                ei_0.a(ei_02.i(), true);
            }
            return true;
        }
        return false;
    }

    private float[] a(ex_0 ex_02, float f10, float f11, float f12) {
        double[] dArray;
        double d3 = ex_02.z() - ex_02.T();
        double d4 = ex_02.g() - ex_02.X();
        double d5 = ex_02.l() - ex_02.R();
        eJ eJ2 = ds_2.k();
        if (d3 != 0.0 || d4 != 0.0) {
            if (this.y.containsKey(ex_02.q())) {
                this.y.put(ex_02.q(), o9.a(this.y.get(ex_02.q()), d3, d4, eJ2.ad()));
            } else {
                this.y.put(ex_02.q(), new o9(this, d3, d4, null));
            }
        }
        if (d3 == 0.0 && d4 == 0.0) {
            double[] dArray2 = new double[2];
            dArray2[0] = 0.0;
            dArray = dArray2;
            dArray2[1] = 0.0;
        } else {
            dArray = o9.a(this.y.get(ex_02.q()));
        }
        double[] dArray3 = dArray;
        double d6 = eJ2.a(ex_02);
        d6 -= d6 % 0.8;
        double d7 = d6 / 0.8 * dArray3[0] * 0.66;
        double d8 = d6 / 0.8 * dArray3[1] * 0.66;
        double d10 = 0.0;
        if (!ex_02.v() && !ex_02.J() && d5 < 0.0 && ex_02.t() > 1.0f) {
            d7 *= 0.15;
            d8 *= 0.15;
            d10 = d6 / 0.8 * d5 * 0.5;
            d10 += d10 * 0.98 - 0.08;
        }
        double d11 = ex_02.z() + d7 - eJ2.z();
        double d12 = ex_02.g() + d8 - eJ2.g();
        float f13 = this.a(d11, d12, f11);
        float f14 = An.a(new oC(ex_02.z() + d7, ex_02.l() + (double)ex_02.am() + d10, ex_02.g() + d8), (double)f10 * 2.93) - f12;
        return new float[]{f13, f14};
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
        if (this.v.v() == this.D) {
            arrayList.sort(new vH(this, null));
        }
        if (this.v.v() == this.F) {
            arrayList.sort(new nd(this, null));
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
        if (pf_0.b(ds_2.k(), ej_02) > this.B.a().intValue() / 2) {
            return false;
        }
        Friend ab_02 = on.p.N().b(ej_02.S());
        if (ab_02 != null && !ab_02.getTarget()) {
            return false;
        }
        return (this.u.u() != false || ds_2.k().c(ej_02)) && (double)ds_2.k().a(ej_02) < this.w.a();
    }

    private boolean b(ej_0 ej_02) {
        return on.p.t().a(ej_02, this.C.u() == false);
    }
}

