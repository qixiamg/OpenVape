/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.a;
import java.util.Set;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class A7
extends Module {
    private final AO D = new AO();
    private final DF B = DF.a((Object)this, "Speed", "#.#", "", 1.0, 3.0, 5.0, 0.1);
    private final BooleanValue Y = BooleanValue.createValue((Object)this, "Spawn Fake", true, "Spawns an entity on where your player is server-sided.\nUsing this will allow for simulated physics.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Move Fake", false, "Move your fake entity with your arrow keys.");
    private boolean F;
    private int P;
    private int I;
    private e2 U;
    private double R;
    private double y;
    private double O;
    private double L;
    private double M;
    private double z;
    private float Q;
    private float H;
    private double C;
    private double V;
    private double S;
    private double J;
    private double N;
    private boolean W;
    private d8_0 w;
    private double u;
    private int K;
    private boolean E;
    private double T;
    private double X;
    private double v;
    private float A;
    private float G;

    public A7() {
        super("Freecam", 3248986, CQ.e, "Lets you fly and clip through walls freely\nwithout moving your player server-sided.");
        this.Y.a(new BasicValue[]{this.x});
        this.a(this.B, this.Y, this.x);
    }

    private boolean T() {
        return a.ib();
    }

    @Override
    public void a(kO kO2) {
        dx_1 dx_12 = kO2.getGuiScreen();
        if (dx_12.a(A5.O) || dx_12.a(A5.cn) || dx_12.a(A5.B)) {
            this.d(false);
        }
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        if (ds_2.t().a() == null || this.T()) {
            return;
        }
        if (this.Y.u().booleanValue() && ds_2.t().a(-420).e()) {
            ds_2.t().a(-420, this.U);
            this.U.r(this.Q);
        }
        this.V();
        if (this.D.a(10L)) {
            this.Y();
            this.D.d();
        }
        this.W();
        if (manthe.V.c() == 13) {
            ds_2.a(null);
        }
        if (this.w == null) {
            this.w = new d8_0(a.grh());
        }
        if (!on.p.h()) {
            ds_2.t().g().a(this.w);
        }
    }

    @Override
    public void a(ke_0 ke_02) {
        if (ds_2.t().a() == null || this.T()) {
            return;
        }
        this.S();
        ds_2.k().t(ds_2.k().K());
        ds_2.k().u(ds_2.k().U());
        if (this.U != null) {
            eJ eJ2 = ds_2.k();
            this.U.a(eJ2.z(), cb_0.h ? eJ2.l() : eJ2.l() - 1.5, eJ2.g(), this.Q, this.H);
        }
        if (!on.p.h()) {
            ds_2.t().g().a(new d8_0(null));
        }
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!this.T()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        eJ2.i(true);
        if (eJ2.bg().f()) {
            ks_02.setY(0.42f);
        } else if (eJ2.bg().g()) {
            ks_02.setY(-0.42);
        } else {
            ks_02.setY(0.0);
        }
        eJ2.l(ks_02.getY());
        double d3 = this.B.a() / 5.0;
        double d4 = eJ2.bg().j();
        double d5 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d4 == 0.0 && d5 == 0.0) {
            ks_02.setX(0.0);
            ks_02.setZ(0.0);
        } else {
            if (d4 != 0.0) {
                if (d5 > 0.0) {
                    f10 += (float)(d4 > 0.0 ? -45 : 45);
                } else if (d5 < 0.0) {
                    f10 += (float)(d4 > 0.0 ? 45 : -45);
                }
                d5 = 0.0;
                d4 = d4 > 0.0 ? 1.0 : -1.0;
            }
            ks_02.setX(d4 * d3 * Math.cos(Math.toRadians(f10 + 90.0f)) + d5 * d3 * Math.sin(Math.toRadians(f10 + 90.0f)));
            ks_02.setZ(d4 * d3 * Math.sin(Math.toRadians(f10 + 90.0f)) - d5 * d3 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    @Override
    public void a(ky_0 ky_02) {
        if (!this.T() || ds_2.t().e()) {
            return;
        }
        if (this.U == null || this.U.e() || ds_2.t().a(-420).e()) {
            if (ky_02.getPacket().a(A5.bN)) {
                if (this.K < 20) {
                    ky_02.setPacket(f_.a(this.W));
                    ++this.K;
                } else {
                    if (cb_0.h) {
                        ky_02.setPacket(ft_0.a(this.R, this.O, this.M, this.W));
                    } else {
                        double d3 = ds_2.k().s().l() - ds_2.k().l();
                        ky_02.setPacket(ft_0.a(this.R, this.O + d3, this.O, this.M, this.W));
                    }
                    this.K = 0;
                }
            }
            return;
        }
        fn_0 fn_02 = ky_02.getPacket();
        if (!this.E && (fn_02.a(A5.bN) || fn_02.a(A5.G) || fn_02.a(A5.dE) || fn_02.a(A5.bH))) {
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.x.u().booleanValue()) {
                if (Keyboard.isKeyDown((int)200)) {
                    f10 += 1.0f;
                }
                if (Keyboard.isKeyDown((int)208)) {
                    f10 -= 1.0f;
                }
                if (Keyboard.isKeyDown((int)203)) {
                    f11 += 1.0f;
                }
                if (Keyboard.isKeyDown((int)205)) {
                    f11 -= 1.0f;
                }
            }
            f11 = (float)((double)f11 * 0.98);
            f10 = (float)((double)f10 * 0.98);
            this.a(this.U, f11, f10);
            this.a(this.U, ky_02);
        }
    }

    @Override
    public void a(kF kF2) {
        fn_0 fn_02;
        if (this.U == null || !this.T() || ds_2.t().e()) {
            return;
        }
        fn_0 fn_03 = kF2.getPacket();
        if (fn_03.a(A5.U)) {
            fn_02 = new fj_0(fn_03.a());
            e2 e22 = this.U;
            double d3 = ((fj_0)fn_02).k();
            double d4 = ((fj_0)fn_02).i();
            double d5 = ((fj_0)fn_02).l();
            float f10 = ((fj_0)fn_02).g();
            float f11 = ((fj_0)fn_02).j();
            if (manthe.V.c() > 13) {
                Set set = ((fj_0)fn_02).h();
                for (Object e10 : set) {
                    fC fC2 = new fC(e10);
                    if (fC2.r() == fC.p()) {
                        d3 += e22.z();
                    } else {
                        e22.k(0.0);
                    }
                    if (fC2.r() == fC.n()) {
                        d4 += e22.l();
                    } else {
                        e22.l(0.0);
                    }
                    if (fC2.r() == fC.m()) {
                        d5 += e22.g();
                    } else {
                        e22.d(0.0);
                    }
                    if (fC2.r() == fC.q()) {
                        f11 += e22.K();
                    }
                    if (fC2.r() != fC.o()) continue;
                    f10 += e22.U();
                }
            }
            this.U.a(d3, d4, d5, f10, f11);
            this.E = true;
            ds_2.k().bp().a(cb_0.h ? fU.a(e22.z(), e22.Y().l(), e22.g(), e22.U(), e22.K(), false) : fU.a(e22.z(), e22.s().l(), e22.l(), e22.g(), e22.U(), e22.K(), false));
            this.E = false;
            kF2.a(true);
        }
        if (fn_03.a(A5.cQ)) {
            fn_02 = new f2(fn_03.a());
            if (((f2)fn_02).h() == ds_2.k().q()) {
                this.U.e((double)((f2)fn_02).j() / 8000.0, (double)((f2)fn_02).g() / 8000.0, (double)((f2)fn_02).i() / 8000.0);
            }
        } else if (fn_03.a(A5.cJ)) {
            fn_02 = new fs_0(fn_03.a());
            this.U.k(this.U.k() + (double)((fs_0)fn_02).i());
            this.U.l(this.U.D() + (double)((fs_0)fn_02).h());
            this.U.d(this.U.u() + (double)((fs_0)fn_02).g());
        }
    }

    @Override
    public void s() {
        this.U();
        this.F = true;
        this.I = ds_2.s().v();
        ds_2.s().a(0);
        eJ eJ2 = ds_2.k();
        if (this.Y.u().booleanValue()) {
            this.U = e2.b(ds_2.t(), eJ2.aV());
            this.U.a(eJ2, true);
            this.X();
            ds_2.t().a(-420, this.U);
            this.K = eJ2.bh();
            this.A = eJ2.bi();
            this.G = eJ2.bl();
            this.T = eJ2.bo();
            this.X = eJ2.bj();
            this.v = eJ2.bk();
        }
        ds_2.G().f();
        if (this.T()) {
            this.V();
            this.K = 0;
        }
    }

    private void X() {
        eJ eJ2 = ds_2.k();
        this.U.r(eJ2.aP());
        this.U.e(eJ2.v());
        this.U.k(eJ2.k());
        this.U.l(eJ2.v() ? 0.0 : eJ2.D());
        this.U.d(eJ2.u());
        this.U.a(eJ2.z(), cb_0.h ? eJ2.l() : eJ2.s().l(), eJ2.g(), eJ2.U(), eJ2.K());
    }

    @Override
    public void J() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || eJ2.i().e()) {
            this.U = null;
            return;
        }
        eJ2.i(this.Q);
        eJ2.d(this.H);
        if (this.T()) {
            this.S();
            if (this.U == null) {
                eJ2.k(0.0);
                eJ2.l(0.0);
                eJ2.d(0.0);
            } else {
                eJ2.k(this.U.k());
                eJ2.l(this.U.D());
                eJ2.d(this.U.u());
            }
        }
        ds_2.s().a(this.I);
        if (this.U != null) {
            ds_2.t().a(this.U);
        }
        this.U = null;
        eJ2.i(false);
        ds_2.G().f();
    }

    public void a(eC eC2, ky_0 ky_02) {
        double d3 = eC2.z() - this.T;
        double d4 = (cb_0.h ? eC2.Y().l() : eC2.s().l()) - this.X;
        double d5 = eC2.g() - this.v;
        double d6 = eC2.U() - this.A;
        double d7 = eC2.K() - this.G;
        boolean bl = d3 * d3 + d4 * d4 + d5 * d5 > 9.0E-4 || this.K >= 20;
        boolean bl2 = d6 != 0.0 || d7 != 0.0;
        this.E = true;
        if (eC2.m().e()) {
            if (bl && bl2) {
                ky_02.setPacket(cb_0.h ? fU.a(eC2.z(), eC2.Y().l(), eC2.g(), eC2.U(), eC2.K(), eC2.v()) : fU.a(eC2.z(), eC2.s().l(), eC2.l(), eC2.g(), eC2.U(), eC2.K(), eC2.v()));
            } else if (bl) {
                ky_02.setPacket(cb_0.h ? ft_0.a(eC2.z(), eC2.Y().l(), eC2.g(), eC2.v()) : ft_0.a(eC2.z(), eC2.s().l(), eC2.l(), eC2.g(), eC2.v()));
            } else if (bl2) {
                ky_02.setPacket(fa_0.a(eC2.U(), eC2.K(), eC2.v()));
            } else {
                ky_02.setPacket(f_.a(eC2.v()));
            }
        } else {
            ky_02.setPacket(cb_0.h ? fU.a(eC2.k(), -999.0, eC2.u(), eC2.U(), eC2.K(), eC2.v()) : fU.a(eC2.z(), -999.0, -999.0, eC2.g(), eC2.U(), eC2.K(), eC2.v()));
            bl = false;
        }
        this.E = false;
        ++this.K;
        if (bl) {
            this.T = eC2.z();
            this.X = cb_0.h ? eC2.l() : eC2.s().l();
            this.v = eC2.g();
            this.K = 0;
        }
        if (bl2) {
            this.A = eC2.U();
            this.G = eC2.K();
        }
    }

    private dx_2 a(bh_1 bh_12) {
        return ds_2.k().i().b(bh_12.d(), bh_12.c(), bh_12.a());
    }

    public void a(eC eC2, float f10, float f11) {
        float f12;
        eC2.i(false);
        if (!eC2.H() || eC2.a8().h()) {
            if (!eC2.w() || eC2.a8().h()) {
                boolean bl;
                float f13 = 0.91f;
                if (eC2.v()) {
                    if (manthe.V.c() > 13) {
                        f13 = ds_2.t().a(g1.a(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.Y().l()) - 1, manthe.Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bh_1 bh_12 = new bh_1(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.s().l()) - 1, manthe.Y.c(eC2.g()));
                        f13 = this.a(bh_12).f() * 0.91f;
                    }
                }
                float f14 = 0.16277136f / (f13 * f13 * f13);
                f12 = eC2.v() ? eC2.a6() * f14 : eC2.az();
                if (manthe.V.c() < 23) {
                    eC2.a(f10, f11, f12);
                }
                f13 = 0.91f;
                if (eC2.v()) {
                    if (manthe.V.c() > 13) {
                        f13 = ds_2.t().a(g1.a(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.Y().l()) - 1, manthe.Y.c(eC2.g()))).f().f() * 0.91f;
                    } else {
                        bh_1 bh_13 = new bh_1(manthe.Y.c(eC2.z()), manthe.Y.c(eC2.s().l()) - 1, manthe.Y.c(eC2.g()));
                        f13 = this.a(bh_13).f() * 0.91f;
                    }
                }
                if (eC2.aQ()) {
                    boolean bl2;
                    float f15 = 0.15f;
                    eC2.k(manthe.Y.a(eC2.k(), (double)(-f15), (double)f15));
                    eC2.d(manthe.Y.a(eC2.u(), (double)(-f15), (double)f15));
                    eC2.j(0.0f);
                    if (eC2.D() < -0.15) {
                        eC2.l(-0.15);
                    }
                    if ((bl2 = eC2.af()) && eC2.D() < 0.0) {
                        eC2.l(0.0);
                    }
                }
                eC2.d(eC2.k(), eC2.D(), eC2.u());
                if (eC2.E() && eC2.aQ()) {
                    eC2.l(0.2);
                }
                if (manthe.V.c() > 13) {
                    bl = !ds_2.t().c(g1.a((int)eC2.z(), 0, (int)eC2.g())) || !ds_2.t().b(g1.a((int)eC2.z(), 0, (int)eC2.g())).f();
                } else {
                    boolean bl3 = bl = !ds_2.t().a((int)eC2.z(), 0, (int)eC2.g()) || !ds_2.t().b((int)eC2.z(), (int)eC2.g()).f();
                }
                if (ds_2.t().i() && bl) {
                    if (eC2.l() > 0.0) {
                        eC2.l(-0.1);
                    } else {
                        eC2.l(0.0);
                    }
                } else {
                    eC2.l(eC2.D() - 0.08);
                }
                eC2.l(eC2.D() * (double)0.98f);
                eC2.k(eC2.k() * (double)f13);
                eC2.d(eC2.u() * (double)f13);
            } else {
                double d3 = eC2.l();
                if (manthe.V.c() < 23) {
                    eC2.a(f10, f11, 0.02f);
                }
                eC2.d(eC2.k(), eC2.D(), eC2.u());
                eC2.k(eC2.k() * 0.5);
                eC2.l(eC2.D() * 0.5);
                eC2.d(eC2.u() * 0.5);
                eC2.l(eC2.D() - 0.02);
                if (eC2.E() && eC2.b(eC2.k(), eC2.D() + (double)0.6f - eC2.l() + d3, eC2.u())) {
                    eC2.l((double)0.3f);
                }
            }
        } else {
            float f16;
            double d4 = eC2.l();
            f12 = 0.8f;
            float f17 = 0.02f;
            float f18 = f16 = (float)manthe.V.c() > 13.0f ? (float)eq_0.a(eC2) : 0.0f;
            if (f16 > 3.0f) {
                f16 = 3.0f;
            }
            if (!eC2.v()) {
                f16 *= 0.5f;
            }
            if (f16 > 0.0f) {
                f12 += (0.54600006f - f12) * f16 / 3.0f;
                f17 += (eC2.a6() * 1.0f - f17) * f16 / 3.0f;
            }
            if (manthe.V.c() < 23) {
                eC2.a(f10, f11, f17);
            }
            eC2.d(eC2.k(), eC2.D(), eC2.u());
            eC2.k(eC2.k() * (double)f12);
            eC2.l(eC2.D() * (double)0.8f);
            eC2.d(eC2.u() * (double)f12);
            eC2.l(eC2.D() - 0.02);
            if (eC2.E() && eC2.b(eC2.k(), eC2.D() + (double)0.6f - eC2.l() + d4, eC2.u())) {
                eC2.l((double)0.3f);
            }
        }
        eC2.q(eC2.aL());
        double d5 = eC2.z() - eC2.aq();
        double d6 = eC2.g() - eC2.ap();
        float f19 = manthe.Y.e(d5 * d5 + d6 * d6) * 4.0f;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        eC2.p(eC2.aL() + (f19 - eC2.aL()) * 0.4f);
        eC2.l(eC2.aA() + eC2.aL());
    }

    private void U() {
        eJ eJ2 = ds_2.k();
        this.C = eJ2.z();
        this.V = eJ2.l();
        this.S = eJ2.g();
        this.J = eJ2.T();
        this.N = eJ2.R();
        this.u = eJ2.X();
        this.Q = eJ2.U();
        this.H = eJ2.K();
        this.W = eJ2.v();
        this.F = false;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.T()) {
            return;
        }
        if (this.F) {
            this.U();
        }
        if (ds_2.x().d()) {
            return;
        }
        int n6 = ds_2.s().j().i();
        int n10 = ds_2.s().A().i();
        int n11 = ds_2.s().g().i();
        int n12 = ds_2.s().n().i();
        int n13 = ds_2.s().l().i();
        int n14 = ds_2.s().u().i();
        ei_0.a(n6, false);
        ei_0.a(n10, false);
        ei_0.a(n11, false);
        ei_0.a(n12, false);
        ei_0.a(n13, false);
        ei_0.a(n14, false);
    }

    @Override
    public void a(kt_0 kt_02) {
        if (this.T()) {
            return;
        }
        if (this.F) {
            this.U();
        }
    }

    private void W() {
        ds_2.k().h(this.C);
        ds_2.k().b(this.J);
        ds_2.k().i(this.V);
        ds_2.k().c(this.N);
        ds_2.k().e(this.S);
        ds_2.k().f(this.u);
    }

    private void V() {
        this.R = ds_2.k().z();
        this.y = ds_2.k().T();
        this.O = ds_2.k().l();
        this.L = ds_2.k().R();
        this.M = ds_2.k().g();
        this.z = ds_2.k().X();
    }

    private void S() {
        eJ eJ2 = ds_2.k();
        if (this.T() && this.U != null) {
            eJ2.i(this.U.U());
            eJ2.d(this.U.K());
            eJ2.g(this.K);
            eJ2.u(this.A);
            eJ2.t(this.G);
            eJ2.s(this.T);
            eJ2.u(this.X);
            eJ2.t(this.v);
            eJ2.h(this.U.z());
            eJ2.b(this.U.T());
            eJ2.i(this.U.l());
            eJ2.c(this.U.R());
            eJ2.e(this.U.g());
            eJ2.f(this.U.X());
            if (manthe.V.c() > 13) {
                eJ2.a(this.U.z(), this.U.l(), this.U.g(), this.U.U(), this.U.K());
            } else {
                eJ2.a(this.U.s());
            }
            eJ2.e(this.U.k(), this.U.D(), this.U.u());
        } else {
            eJ2.h(this.R);
            eJ2.b(this.y);
            eJ2.i(this.O);
            eJ2.c(this.L);
            eJ2.e(this.M);
            eJ2.f(this.z);
            eJ2.c(this.R, this.O, this.M);
        }
    }

    private void Y() {
        boolean bl;
        if (ds_2.x().d()) {
            return;
        }
        int n6 = ds_2.s().j().i();
        int n10 = ds_2.s().A().i();
        int n11 = ds_2.s().g().i();
        int n12 = ds_2.s().n().i();
        double d3 = this.B.a() / 5.0;
        if (cb_0.a(ds_2.s().l()) && ds_2.N()) {
            this.V += d3;
            this.N += d3;
        } else if (cb_0.a(ds_2.s().u()) && ds_2.N()) {
            this.V -= d3;
            this.N -= d3;
        }
        double d4 = ds_2.k().U() + 90.0f;
        boolean bl2 = Keyboard.isKeyDown((int)n6) && ds_2.N();
        boolean bl3 = Keyboard.isKeyDown((int)n10) && ds_2.N();
        boolean bl4 = Keyboard.isKeyDown((int)n11) && ds_2.N();
        boolean bl5 = bl = Keyboard.isKeyDown((int)n12) && ds_2.N();
        if (bl2) {
            if (bl4) {
                d4 -= 45.0;
            } else if (bl) {
                d4 += 45.0;
            }
        } else if (bl3) {
            d4 += 180.0;
            if (bl4) {
                d4 += 45.0;
            } else if (bl) {
                d4 -= 45.0;
            }
        } else if (bl4) {
            d4 -= 90.0;
        } else if (bl) {
            d4 += 90.0;
        }
        if (bl2 || bl4 || bl3 || bl) {
            this.C += Math.cos(Math.toRadians(d4)) * d3;
            this.S += Math.sin(Math.toRadians(d4)) * d3;
            this.J += Math.cos(Math.toRadians(d4)) * d3;
            this.u += Math.sin(Math.toRadians(d4)) * d3;
        }
    }

    @Override
    public void a(kU kU2) {
        if (kU2.getOverlayType().toString().toUpperCase().equals("BLOCK")) {
            kU2.getEvent().a(true);
        }
    }
}

