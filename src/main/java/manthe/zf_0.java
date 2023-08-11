/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.Random;

/*
 * Renamed from manthe.zf
 */
public class zf_0
extends Module {
    private final DY ag = DY.a(this);
    private final BooleanValue V = BooleanValue.createValue((Object)this, "Click Aim", true, "Only aim while mouse is down");
    private final BooleanValue ae = BooleanValue.createValue((Object)this, "Aim Vertically", false, "Aims up and down as well");
    private final BooleanValue L = BooleanValue.createValue((Object)this, "Aim while on target", true, "Continue to adjust aim while hovering over target");
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Strafe increase", false, "Increase speed whiling strafing away from target");
    private final BooleanValue D = BooleanValue.createValue((Object)this, "Check block break", false, "Prevents from aiming while breaking blocks");
    private final BooleanValue N = BooleanValue.createValue((Object)this, "Limit to items", false, "AimAssist functions only while holding selected items");
    private final DD O = DD.a((Object)this, "aimassist-alloweditems", "Allowed Items", DD.m, new mD("swords"));
    private final DF ac = DF.a(this, "Vertical Speed", "#.#", "", 1.0, 5.0, 10.0);
    private final DF B = DF.a(this, "Horizontal Speed", "#.#", "", 1.0, 5.0, 10.0);
    private final DF ad = DF.a(this, "Max Angle", "#", "", 1.0, 180.0, 360.0, 1.0, "Maximum allowed angle to still aim at target");
    private final DF v = DF.a(this, "Distance", "#.#", "", 1.0, 5.0, 8.0, 0.1, "Maximum distance allowed to still aim at target");
    private final Random X = new Random();
    private final Random H = new Random();
    private float J = 0.0f;
    private float C = 0.0f;
    private boolean Z;
    private int P;
    private int Q;
    private float M;
    private float x;
    private float ai;
    private float A;
    private boolean T;
    private boolean W;
    private double Y;
    private double u;
    private double aj;
    private int F;
    private int aa;
    private boolean U;
    private float ah;
    private float ak;
    private float E;
    private float af;
    private int w;
    private int S;
    private double K;
    private boolean I;
    private ej_0 z = null;
    private int G;
    private int ab;
    private int R = 0;

    public zf_0() {
        super("AimAssist", -327674, CQ.c, "Smoothly aims to closest valid target");
        this.ae.a(new BasicValue[]{this.ac});
        this.N.a(new BasicValue[]{this.O});
        this.a(this.ag, this.V, this.L, this.y, this.D, this.ae, this.ac, this.B, this.ad, this.v, this.N, this.O);
    }

    private void W() {
        if (ds_2.t().e() || ds_2.k().e()) {
            return;
        }
        if (!this.X()) {
            this.Y();
            return;
        }
        if (this.z != null && this.z.e()) {
            this.z = null;
        }
        if (this.V.u().booleanValue() && !VapeSettings.f()) {
            this.z = null;
            this.Y();
            return;
        }
        if (this.z != null && (pf_0.c(this.z) || (double)ds_2.k().a(this.z) > this.v.a())) {
            this.Y();
            this.z = null;
        }
        if (this.V.u().booleanValue() && VapeSettings.f() && this.z == null || !this.V.u().booleanValue()) {
            ej_0 ej_02 = this.Z();
            if (!this.V.u().booleanValue()) {
                ++this.S;
                if (this.S > 700 || this.z == null) {
                    this.z = ej_02;
                    this.S = 0;
                }
            } else {
                this.z = ej_02;
            }
        }
        if (ds_2.t().a() == null) {
            return;
        }
        if (this.z != null && ds_2.x().a() == null) {
            this.e(this.I);
            this.V();
        } else {
            this.Y();
        }
    }

    void e(boolean bl) {
        ++this.w;
        if (this.w > 10) {
            this.ak = this.ah;
            this.af = this.E;
            this.E = 0.0f;
            this.ah = 0.0f;
            this.w = 0;
        }
    }

    void Y() {
        this.M = 0.0f;
        this.x = 0.0f;
        this.G = 0;
        this.ab = 0;
        this.P = 0;
        this.Q = 0;
        this.ai = 0.0f;
    }

    void a(float f10) {
        if (f10 != 0.0f) {
            f10 *= 5.0f;
            float f11 = this.ac.a().floatValue();
            float f12 = pf_0.a((ex_0)ds_2.k(), this.z);
            if (f12 <= 10.0f) {
                this.C = f11;
            }
            if (this.C > 0.0f) {
                f11 -= this.C / 3.0f;
                this.C -= f12 / 200.0f;
            }
            float f13 = 1.0f * f11 * f10;
            this.x += f13;
        } else {
            this.x = 0.0f;
        }
    }

    void b(float f10) {
        if (f10 != 0.0f) {
            f10 *= 5.0f;
            float f11 = this.B.a().floatValue();
            float f12 = pf_0.b(ds_2.k(), this.z);
            if (f12 <= 10.0f) {
                this.J = f11;
            }
            if (this.J > 0.0f) {
                f11 -= this.J / 3.0f;
                this.J -= f12 / 200.0f;
            }
            float f13 = 1.0f * f11 * f10;
            this.M += f13;
        } else {
            this.M = 0.0f;
        }
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        if (ds_2.t().e()) {
            return;
        }
        float f10 = ds_2.s().r();
        this.M += (float)this.P;
        this.x += (float)this.Q;
        int n6 = (int)this.M;
        int n10 = (int)(-this.x);
        float f11 = f10 * 0.6f + 0.2f;
        float f12 = f11 * f11 * f11 * 8.0f;
        float f13 = (float)n6 * f12;
        float f14 = (float)n10 * f12;
        oA.b(f13, f14);
        this.M = 0.0f;
        this.x = 0.0f;
        this.P = 0;
        this.Q = 0;
    }

    private void V() {
        float f10;
        this.T();
        double d3 = this.z.W();
        double d4 = this.z.ab();
        double d5 = d3 - this.Y;
        double d6 = d4 - this.u;
        this.Y = d3;
        this.u = d4;
        eJ eJ2 = ds_2.k();
        double d7 = 1.6;
        this.Z = false;
        double d8 = pf_0.b(eJ2.W(), eJ2.ab(), eJ2.U(), d3 + d5 * d7, d4 + d6 * d7);
        boolean bl = pf_0.a(eJ2.W(), eJ2.ab(), (double)eJ2.U(), d3 + d5 * d7, d4 + d6 * d7);
        int n6 = Math.abs(pf_0.a((ex_0)eJ2, this.z)) - 10;
        float f11 = 1.0f;
        float f12 = 1.0f;
        if (this.Z && !this.L.u().booleanValue()) {
            this.Y();
            return;
        }
        f11 = (float)((double)f11 + manthe.Y.a(this.X, 0.0, 2.0));
        f11 = (float)((double)f11 + d8 / 50.0);
        if (Math.abs(d8 - this.aj) > 6.0) {
            f11 = (float)((double)f11 + d8 / 35.0);
        }
        double d10 = (9.0f - eJ2.a(this.z)) / 2.5f - 2.0f;
        d10 = Math.max(0.0, d10);
        f11 = (float)((double)f11 + d10);
        if (this.y.u().booleanValue() && (!bl && eJ2.bg().h() > 0.0f || bl && eJ2.bg().h() < 0.0f)) {
            f11 = (float)((double)f11 * 1.3);
        }
        if (eJ2.a(this.z) < 0.5f) {
            f11 /= 5.0f;
        }
        float f13 = bl ? -f11 : (f11 /= 90.0f);
        boolean bl2 = pf_0.c(eJ2, this.z);
        float f14 = f10 = bl2 ? f12 : -(f12 /= 90.0f);
        if (d8 < 5.0) {
            this.aa = 0;
            f13 = 0.0f;
            this.af *= 0.7f;
            if (bl && eJ2.bg().h() > 0.0f || !bl && eJ2.bg().h() < 0.0f) {
                this.af *= 0.5f;
            }
            if (this.Z) {
                f10 = 0.0f;
                this.ak = 0.0f;
            }
        } else {
            ++this.aa;
        }
        if (bl != this.T) {
            this.af = -this.af;
            this.E = -this.E;
            this.M = 0.0f;
        }
        if (bl2 != this.W) {
            this.ak = -this.ak;
            this.ah = -this.ah;
            this.x = 0.0f;
        }
        if (n6 < 5) {
            f10 = 0.0f;
            this.ak *= 0.7f;
        }
        this.E += f13;
        this.ah += f10;
        f13 = this.af;
        f10 = this.ak;
        if (Math.abs(f13) > 10.0f) {
            this.E = 0.0f;
            this.af = 0.0f;
            return;
        }
        float f15 = f13 * 0.15f;
        if (d8 <= 9.0) {
            f15 = (float)((double)f15 / (10.0 - d8));
        }
        boolean bl3 = this.I = d8 > 5.0;
        if (Float.isNaN(f15)) {
            this.E = 0.0f;
            this.af = 0.0f;
            return;
        }
        this.b(f15);
        if (this.ae.u().booleanValue()) {
            float f16 = (float)((double)f10 * 0.15);
            if (Float.isNaN(f16)) {
                this.ah = 0.0f;
                this.ak = 0.0f;
                return;
            }
            this.a(f16);
        }
        this.W = bl2;
        this.T = bl;
        ++this.F;
        if (this.F > 10) {
            this.aj = d8;
            this.F = 0;
        }
    }

    private void T() {
        this.K += 1.0;
        if (this.K >= (double)(250 + this.H.nextInt(50))) {
            this.K = manthe.Y.a(this.H, -100, -50);
            this.G = manthe.Y.a(this.H, -1, 2);
            this.ab = manthe.Y.a(this.H, -1, 2);
        }
        int n6 = this.G;
        int n10 = this.ab;
        if (this.H.nextInt(10) < 2) {
            // empty if block
        }
        if (this.H.nextInt(10) < 2) {
            // empty if block
        }
        if (this.H.nextInt(10) < 2) {
            n6 = 0;
        }
        if (this.H.nextInt(10) < 2) {
            n10 = 0;
        }
        if (this.K < 0.0) {
            n6 = 0;
            n10 = 0;
        }
        if (this.H.nextInt(20) == 1) {
            this.P += n6;
            this.Q += n10;
        }
        if (this.M > 0.0f && this.P < 0 || this.M < 0.0f && this.P > 0) {
            this.P = 0;
        }
    }

    private boolean U() {
        if (!this.N.u().booleanValue()) {
            return true;
        }
        fG fG2 = ds_2.k().a_();
        return this.O.a(fG2, true);
    }

    private boolean X() {
        if (ds_2.k().e() || ds_2.K().e()) {
            return false;
        }
        if (this.D.u().booleanValue()) {
            if (ds_2.K().g()) {
                this.R = 250;
                return false;
            }
            if (this.R > 0) {
                --this.R;
            }
            if (this.R > 0) {
                return false;
            }
        }
        return this.U();
    }

    private ej_0 Z() {
        gO gO2 = ds_2.t();
        if (gO2.e()) {
            return null;
        }
        ej_0 ej_02 = null;
        double d3 = 360.0;
        for (Object e10 : gO2.k()) {
            double d4;
            Friend ab_02;
            if (!this.ag.a(new ex_0(e10))) continue;
            eJ eJ2 = ds_2.k();
            if (eJ2.e()) {
                return null;
            }
            ej_0 ej_03 = new ej_0(e10);
            if ((double)eJ2.a(ej_03) > this.v.a() || (ab_02 = on.p.N().b(ej_03.S())) != null && !ab_02.getTarget() || !((d4 = (double)pf_0.b(eJ2, ej_03)) < d3) || !(d4 <= this.ad.a() / 2.0)) continue;
            d3 = d4;
            ej_02 = ej_03;
        }
        return ej_02;
    }

    public ej_0 S() {
        return this.z;
    }

    @Override
    public void s() {
        if (!this.U) {
            this.U = true;
            new pk_0(this).start();
        }
    }

    static void a(zf_0 zf_02) {
        zf_02.W();
    }
}

