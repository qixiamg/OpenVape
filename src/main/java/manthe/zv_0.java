/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from manthe.zv
 */
public class zv_0
extends Module {
    private final pb_0 C = new pb_0("On bind");
    private final pb_0 z = new pb_0("Aggro");
    private final DX w = DX.a((Object)this, "Mode", "On bind - searches for thrown pearls and throws upon pressing bind\nAggro - Throws pearl as soon as enemy throws theirs", this.C, this.C, this.z);
    private final DF K = DF.a((Object)this, "Angle Limit", "#", "", 30.0, 180.0, 360.0, 5.0);
    private final DF u = DF.a(this, "Distance Limit", "#.#", "m", 0.0, 6.0, 10.0, 0.1, "The minimum distance a pearl needs to land away from you\nin order to pearl towards it.");
    private final DF E = DF.a((Object)this, "Horizontal Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private final DF v = DF.a((Object)this, "Vertical Speed", "#.#", "", 0.1, 5.0, 15.0, 0.5);
    private final BooleanValue F = BooleanValue.createValue((Object)this, "Silent Throw", false, "Throws the enderpearl without swapping your hand.");
    private final BooleanValue J = BooleanValue.createValue((Object)this, "Vertical Check", false, "Checks if the pearl landing positions Y is higher a certain amount above you.");
    private final AO B = new AO();
    private final qs G = new qs(Collections.singleton(A5.af), Color.WHITE);
    private boolean M;
    private boolean x;
    private boolean y;
    private eX L;
    private int H;
    private boolean A;
    private float D;
    private float I;

    public zv_0() {
        super("AutoPearl", -16711936, CQ.a, "Aims and throws a pearl at an enemies pearl trajectory.");
        this.a(this.w, this.E, this.v, this.K, this.u, this.J, this.F);
    }

    @Override
    public void s() {
        eJ eJ2 = ds_2.k();
        if (eJ2.d()) {
            this.D = eJ2.U();
            this.I = eJ2.K();
        }
        if (this.M && this.w.v().equals(this.C)) {
            this.d(false);
            return;
        }
        if (this.T() || this.w.v().equals(this.z)) {
            this.M = true;
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.M = false;
    }

    private void a(eP eP2, eJ eJ2, int n6) {
        eP2.a(n6);
        if (this.F.u().booleanValue()) {
            eJ2.bp().a(f5.a(n6));
            ds_2.K().h();
        }
    }

    private ca_0 a(eX eX2) {
        if (eX2.v()) {
            return null;
        }
        for (ca_0 ca_02 : this.U()) {
            if (!ca_02.a(eX2)) continue;
            return ca_02;
        }
        return null;
    }

    private List<ca_0> U() {
        ArrayList<ca_0> arrayList = new ArrayList<ca_0>();
        arrayList.add(this.G);
        return arrayList;
    }

    private gK b(eX eX2) {
        if (!eX2.a(A5.bn)) {
            return null;
        }
        gO gO2 = ds_2.t();
        double d3 = eX2.z();
        double d4 = eX2.l();
        double d5 = eX2.g();
        double d6 = eX2.k();
        double d7 = eX2.D();
        double d8 = eX2.u();
        while (true) {
            gK gK2 = gK.b(d3, d4, d5);
            gK gK3 = gK.b(d3 + d6, d4 + d7, d5 + d8);
            gb_0 gb_02 = gO2.a(gK2, gK3, false, eX2.a(A5.c9), false);
            d3 += d6;
            d4 += d7;
            d5 += d8;
            if (gb_02.d()) {
                d3 = gb_02.k().g();
                d4 = gb_02.k().h();
                d5 = gb_02.k().f();
                eJ eJ2 = ds_2.k();
                return (double)Math.abs(this.a(d3, d5)) <= this.K.a() / 2.0 && eJ2.a(d3, d4, d5) > this.u.a() && (this.J.u() == false || d4 - eJ2.l() < 7.0) ? gK.b(d3, d4, d5) : null;
            }
            if (d4 < -128.0) break;
            d6 *= eX2.H() ? 0.8 : 0.99;
            d7 *= eX2.H() ? 0.8 : 0.99;
            d8 *= eX2.H() ? 0.8 : 0.99;
            d7 -= 0.05;
        }
        return null;
    }

    private float a(double d3, double d4) {
        eJ eJ2 = ds_2.k();
        double d5 = d3 - eJ2.z();
        double d6 = d4 - eJ2.g();
        double d7 = d6 < 0.0 && d5 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d6 / d5)) : (d6 < 0.0 && d5 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d6 / d5)) : Math.toDegrees(-Math.atan(d5 / d6)));
        return Y.a(-(eJ2.U() - (float)d7));
    }

    @Override
    public void a(kS kS2) {
        if (!this.w.v().equals(this.z)) {
            return;
        }
        ex_0 ex_02 = kS2.getEntity();
        eJ eJ2 = ds_2.k();
        if (ex_02.a(A5.bn)) {
            eE eE2 = new eE(ex_02.a());
            eX eX2 = new eX(ex_02.a());
            ca_0 ca_02 = this.a(eE2);
            if (ca_02 != null) {
                oC oC2;
                float f10;
                e2 e22 = this.S();
                if (e22.e()) {
                    return;
                }
                float f11 = eJ2.a(eX2);
                float f12 = e22.a(eX2);
                if (f12 < f11 && !Float.isNaN(f10 = An.a(oC2 = new oC(eX2.z(), eX2.l(), ex_02.g()), 1.5))) {
                    this.L = eX2;
                    this.B.d();
                }
            }
        }
    }

    private e2 S() {
        float f10 = 999.0f;
        int n6 = 0;
        gO gO2 = ds_2.t();
        eJ eJ2 = ds_2.k();
        for (Object e10 : gO2.l()) {
            float f11;
            ex_0 ex_02 = new ex_0(e10);
            if (ex_02.equals(eJ2) || !ex_02.a(A5.L) || !((f11 = eJ2.a(ex_02)) < f10)) continue;
            n6 = ex_02.q();
            f10 = f11;
        }
        if (n6 == 0) {
            return new e2(null);
        }
        return new e2(gO2.a(n6));
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if (!this.y) {
            return;
        }
        for (int i = 36; i < 45; ++i) {
            fk_0 fk_02;
            if (!eJ2.aY().a(i).h() || !(fk_02 = eJ2.aY().a(i).f().k()).a(A5.an)) continue;
            eP eP2 = eJ2.aU();
            this.H = eP2.i();
            if (eP2.i() != i - 36) {
                this.a(eP2, eJ2, i - 36);
            }
            if (!ds_2.K().a(eJ2, eJ2.i(), eJ2.aY().a(i).f())) continue;
            if (this.w.v().equals(this.C)) {
                if (this.F.u().booleanValue()) {
                    this.a(eP2, eJ2, this.H);
                }
                this.d(false);
            } else {
                this.A = true;
            }
            this.L = null;
            this.x = false;
            this.y = false;
            return;
        }
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        cy_0 cy_02;
        eJ eJ2 = ds_2.k();
        if (eJ2.e()) {
            return;
        }
        if (this.B.a(1000L) && this.L != null) {
            this.L = null;
        }
        if (this.A) {
            cy_02 = eJ2.aU();
            this.a((eP)cy_02, eJ2, this.H);
            this.A = false;
            this.L = null;
        }
        cy_02 = ds_2.t();
        cy_0 cy_03 = null;
        if (this.w.v().equals(this.z)) {
            if (this.L != null) {
                if (!this.T()) {
                    this.L = null;
                    return;
                }
                cy_03 = this.b(this.L);
            }
        } else {
            for (Object e10 : ((gO)cy_02).l()) {
                ex_0 ex_02 = new ex_0(e10);
                if (!ex_02.a(A5.bn)) continue;
                eE eE2 = new eE(ex_02.a());
                eX eX2 = new eX(ex_02.a());
                ca_0 ca_02 = this.a(eE2);
                if (ca_02 == null) continue;
                cy_03 = this.b(eX2);
            }
        }
        if (cy_03 != null && cy_03.d()) {
            float f10 = this.a(((gK)cy_03).g(), ((gK)cy_03).f());
            if (f10 > this.E.a().floatValue()) {
                f10 = this.E.a().floatValue();
            } else if (f10 < -this.E.a().floatValue()) {
                f10 = -this.E.a().floatValue();
            }
            float f11 = this.D + f10;
            float f12 = -(this.I - An.a(((gK)cy_03).i(), 1.5));
            if (f12 > this.v.a().floatValue()) {
                f12 = this.v.a().floatValue();
            } else if (f12 < -this.v.a().floatValue()) {
                f12 = -this.v.a().floatValue();
            }
            float f13 = this.I + f12;
            this.D = f11;
            eJ2.i(this.D);
            if (!Float.isNaN(f13)) {
                this.I = f13;
                eJ2.d(this.I);
            }
            if (!this.x) {
                this.x = (double)Math.abs(this.a(((gK)cy_03).g(), ((gK)cy_03).f())) < 0.5 && (double)Math.abs(f12) < 0.5;
                return;
            }
            if (!this.y) {
                return;
            }
        } else {
            this.D = eJ2.U();
            this.I = eJ2.K();
        }
        if (this.w.v().equals(this.C)) {
            this.d(false);
        }
    }

    @Override
    public void a(kn_0 kn_02) {
        if (this.x && !this.y) {
            this.y = true;
        }
    }

    private boolean T() {
        eJ eJ2 = ds_2.k();
        for (int i = 36; i < 45; ++i) {
            fk_0 fk_02;
            if (!eJ2.aY().a(i).h() || !(fk_02 = eJ2.aY().a(i).f().k()).a(A5.an)) continue;
            return true;
        }
        return false;
    }
}

