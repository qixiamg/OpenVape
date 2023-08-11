/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector2f
 */
package manthe;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import org.lwjgl.util.vector.Vector2f;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class zG
extends Module {
    private final pb_0 w = new pb_0("Legit");
    private final pb_0 J = new pb_0("Blatant");
    private final BooleanValue N = BooleanValue.createValue((Object)this, "Tower", false, "Builds a tower upwards when you're standing still.");
    private final BooleanValue Q = BooleanValue.createValue((Object)this, "Block Count", false, "Renders your block count on\nthe center of your screen.\nBlatant counts inventory.");
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Stop Motion", false, "Force stops your motion to tower.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Stop Sprinting", false, "Stops you from sprinting when scaffolding.\nThis is required to bypass AAC/GWEN");
    private final BooleanValue K = BooleanValue.createValue((Object)this, "Whitelist Only", false, "Only activates scaffold when\nwhitelisted blocks are held.");
    private final BooleanValue z = BooleanValue.createValue((Object)this, "Use blacklist", true, "Scaffold will not use these blocks for scaffolding");
    private final DF D = DF.a(this, "Delay", "#", "ms", 0.0, 100.0, 500.0, 50.0, "Blatant scaffold place delay.");
    private final dy_0 H = dy_0.createValue((Object)this, "Sneak delay", "#", "", 0.0, 100.0, 200.0, 500.0, 1.0, "Delay until standing after sneaking");
    private final DD P = DD.a((Object)this, "scaffold-allowedblocks", "Held whitelist", DD.m, new mD("blocks"));
    private final DD M = DD.a((Object)this, "scaffold-blacklist", "Block blacklist", DD.n, new mD[0]);
    private final DX F = DX.a((Object)this, "Mode", "Legit - Automatically shifts at edge of block when backwards (fastbridge)\nBlatant - Automatically place blocks under you", this.w, this.w, this.J);
    private final AO y = new AO();
    private final AO R = new AO();
    private final AO E = new AO();
    private final List<Integer> v = Arrays.asList(0, 6, 8, 9, 10, 11, 26, 27, 28, 31, 32, 37, 38, 39, 40, 51, 65, 66, 83, 92, 96, 120, 111, 131, 132, 171, 78, 146, 147, 148, 149, 150, 151, 154, 54, 50, 71, 64, 63, 69, 75, 76, 77, 143);
    private final List<Integer> u = Arrays.asList(23, 25, 30, 46, 52, 116, 85, 84, 103, 137, 145, 102, 160, 101, 79, 174, 145, 152, 14, 15, 16, 21, 73, 74, 163, 72, 70, 138);
    private boolean A;
    private long L;
    private boolean I;
    private Vector2f B = new Vector2f(-1337.0f, -1337.0f);
    private float G;
    private int O = -1;

    public zG() {
        super("Scaffold", 49630, CQ.f, "Helps you make bridges/scaffold walk.");
        this.N.a(new BasicValue[]{this.C});
        this.K.a(new BasicValue[]{this.P});
        this.z.a(new BasicValue[]{this.M});
        this.J.a(true);
        this.F.a(this.N, this.x, this.D, this.H, this.z);
        this.F.a((BasicValue)this.N, this.J);
        this.F.a((BasicValue)this.x, this.J);
        this.F.a((BasicValue)this.D, this.J);
        this.F.a((BasicValue)this.z, this.J);
        this.F.a((BasicValue)this.H, this.w);
        this.a(this.F, this.H, this.N, this.C, this.x, this.D, this.Q, this.K, this.P, this.z, this.M);
        ((rh_0)this.P.getDefaultValue()).b("Scaffold will not function unless you are currently holding an item whitelisted here");
        for (int n6 : this.u) {
            this.M.b(new mD(n6));
        }
    }

    public boolean V() {
        return this.N() && this.x.u() != false && this.F.v() == this.J;
    }

    public boolean U() {
        return this.F.v().equals(this.w);
    }

    @Override
    public void t() {
        Object object;
        if (!this.Q.u().booleanValue()) {
            return;
        }
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        float f10 = d0_02.g();
        float f11 = d0_02.h();
        dr_1 dr_12 = ds_2.m();
        int n6 = 0;
        int n10 = new Color(255, 0, 0).getRGB();
        if (this.F.v().equals(this.J)) {
            n6 = this.S();
            if (n6 >= 128) {
                n10 = new Color(9, 255, 198).getRGB();
            } else if (n6 >= 64) {
                n10 = new Color(255, 249, 18).getRGB();
            }
        } else {
            fk_0 fk_02;
            object = ds_2.k();
            fG fG2 = ((ej_0)object).aG();
            if (fG2.d() && (fk_02 = fG2.k()).d() && fk_02.a(A5.av)) {
                n6 = fG2.n();
            }
            if (n6 >= 48) {
                n10 = new Color(9, 255, 198).getRGB();
            } else if (n6 >= 24) {
                n10 = new Color(255, 249, 18).getRGB();
            }
        }
        object = String.valueOf(n6);
        dr_12.d((String)object, (double)(f10 / 2.0f - (float)dr_12.c((String)object) / 2.0f), (double)(f11 / 2.0f - 20.0f), n10);
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.B = new Vector2f(-1337.0f, -1337.0f);
        this.y.d();
        this.L = (long)this.H.t();
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || !this.F.v().equals(this.J)) {
            this.O = -1;
            return;
        }
        this.O = eJ2.aU().i();
        if (this.V() && eJ2.C()) {
            eJ2.l(false);
            if (ds_2.s().o().h()) {
                ei_0.a(ds_2.s().o().i(), false);
                ei_0.a(ds_2.s().o().i());
            }
        }
    }

    @Override
    public void J() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || !this.F.v().equals(this.J)) {
            this.O = -1;
            return;
        }
        if (this.O != -1) {
            eJ2.aU().a(this.O);
            ds_2.K().h();
            this.O = -1;
        }
    }

    @Override
    public void a(kn_0 kn_02) {
        boolean bl;
        if (!this.U()) {
            return;
        }
        if (ds_2.x().d()) {
            return;
        }
        if (!this.T()) {
            return;
        }
        if (!kn_02.getEntity().equals(ds_2.k())) {
            return;
        }
        if (!Thread.currentThread().getName().equals("Client thread")) {
            return;
        }
        eJ eJ2 = ds_2.k();
        gh_0 gh_02 = eJ2.bg();
        en_0 en_02 = ds_2.s();
        ei_0 ei_02 = en_02.u();
        if (eJ2.aQ()) {
            return;
        }
        this.A = ei_02.f();
        boolean bl2 = false;
        boolean bl3 = bl = gh_02.j() <= 0.0f;
        if (bl) {
            fP fP2;
            fP fP3;
            if (V.c() >= 15) {
                fP3 = eJ2.s();
            } else {
                fP2 = eJ2.s();
                fP3 = fP2.k();
            }
            fP2 = fP3.d(-0.2, 0.0, -0.2).c(eJ2.k(), -1.0, eJ2.u());
            int n6 = ds_2.t().b(eJ2, fP2).size();
            if (n6 == 0) {
                bl2 = true;
            }
        }
        boolean bl4 = false;
        if (!bl2 && !this.E.a(this.L) && this.L > 30L) {
            bl2 = true;
            bl4 = true;
        }
        if (bl2 && eJ2.v()) {
            if (!eJ2.af()) {
                this.L = (long)this.H.t();
            }
            ei_0.a(ei_02.i(), true);
            ei_0.a(ei_02.i());
            if (!bl4) {
                this.E.d();
            }
        } else if (!this.A) {
            ei_0.a(ei_02.i(), false);
            ei_0.a(ei_02.i());
        }
    }

    @Override
    public void a(kf_0 kf_02) {
        if (!this.U()) {
            return;
        }
        if (kf_02.a() != da_0.a) {
            return;
        }
        if (ds_2.x().d()) {
            return;
        }
        if (!this.T()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.aQ()) {
            return;
        }
        en_0 en_02 = ds_2.s();
        ei_0 ei_02 = en_02.u();
        ei_0.a(ei_02.i(), this.A);
        ei_0.a(ei_02.i());
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!this.T()) {
            return;
        }
        if (this.U()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (ks_02.c()) {
            this.I = eJ2.bg().g();
            fP fP2 = V.c() >= 15 ? eJ2.s() : eJ2.s().k();
            if (eJ2.i().b(eJ2, fP2.d(-0.05, 0.0, -0.05).c(eJ2.k(), -1.0, eJ2.u())).isEmpty()) {
                eJ2.bg().e(true);
            }
        } else {
            eJ2.bg().e(this.I);
        }
    }

    @Override
    public void a(km_0 km_02) {
        this.a(this.F.v().H());
        if (!this.F.v().equals(this.J)) {
            return;
        }
        eJ eJ2 = ds_2.k();
        en_0 en_02 = ds_2.s();
        bh_1 bh_12 = new bh_1(eJ2.z(), eJ2.l() - 1.0, eJ2.g());
        if (km_02.c()) {
            if (this.V() && eJ2.C()) {
                ei_0.a(ds_2.s().o().i(), false);
                eJ2.l(false);
            }
            gK gK2 = this.c(bh_12);
            if (this.B.x == -1337.0f) {
                float f10 = Y.a(eJ2.U());
                this.B.x = eJ2.U();
                this.G = eJ2.U() + (float)(f10 > 0.0f ? 180 : -180);
                km_0.setRotationYaw(this.G);
                this.B.y = 70.0f;
                km_0.setRotationPitch(70.0f);
            }
            int n6 = this.W();
            if (gK2 != null && this.e(bh_12).f() && n6 != -1) {
                float[] fArray = this.a(gK2);
                this.G = fArray[0];
                this.B.y = Math.min(fArray[1], ds_2.s().l().h() ? 90.0f : 70.0f);
                km_0.setRotationPitch(this.B.y);
                this.B.y = km_0.getRotationPitch();
            }
            if (this.B.x != -1337.0f) {
                float f11 = 35.0f + (float)(10.0 * Math.random());
                this.B.x += Y.a(Y.a(this.G - this.B.x), -f11, f11);
                km_0.setRotationYaw(this.B.x);
                km_0.setRotationPitch(this.B.y);
            }
            if (this.X()) {
                for (int i = 9; i < 36; ++i) {
                    fG fG2;
                    if (!eJ2.aY().a(i).h() || !this.a(fG2 = eJ2.aY().a(i).f()) || !fG2.k().a(A5.av) || this.a(fG2.k())) continue;
                    this.e(i);
                    break;
                }
            }
        } else {
            boolean bl;
            boolean bl2 = bl = eJ2.bg().j() == 0.0f && eJ2.bg().h() == 0.0f;
            if (en_02.l().h() && this.S() > 0 && this.N.u().booleanValue() && this.C.u().booleanValue()) {
                eJ2.h(eJ2.z());
                eJ2.e(eJ2.g());
                eJ2.b(eJ2.z());
                eJ2.f(eJ2.g());
                eJ2.k(0.0);
                eJ2.d(0.0);
            }
            if (!bl) {
                this.y.d();
            }
            if (!this.e(bh_12).f()) {
                return;
            }
            int n10 = this.W();
            if (n10 == -1) {
                return;
            }
            int n11 = eJ2.aU().i();
            eJ2.aU().a(n10);
            if (en_02.l().h() && this.N.x().booleanValue() && this.S() > 0) {
                if (this.C.u().booleanValue()) {
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                }
                if (eJ2.l() != (double)(bh_12.c() + 1) && !eJ2.i().a((double)bh_12.d(), (double)bh_12.c() - 0.5, (double)bh_12.a()).h().equals(dj_0.i()) && bl) {
                    eJ2.l((double)0.42f);
                    eJ2.k(0.0);
                    eJ2.d(0.0);
                    if (this.y.a(1000L)) {
                        eJ2.l(-0.28);
                        this.y.d();
                    }
                }
            }
            if (eJ2.aU().b(n10).k().a(A5.av) && !this.a(eJ2.aU().b(n10).k()) && this.R.a(this.D.a().longValue()) && !eJ2.i().b(bh_12.d(), bh_12.c(), bh_12.a()).a(A5.bK)) {
                if (!(this.a(bh_12) || this.a(bh_12.a(1, 0, 0)) || this.a(bh_12.a(0, 0, 1)) || this.a(bh_12.a(-1, 0, 0)))) {
                    this.a(bh_12.a(0, 0, -1));
                }
                this.R.d();
            }
        }
    }

    private void e(int n6) {
        eJ eJ2 = ds_2.k();
        ds_2.K().a(eJ2.aY().g(), n6, 7, 2, eJ2);
    }

    private int W() {
        if (this.T()) {
            for (int i = 0; i < 9; ++i) {
                fG fG2 = ds_2.k().aU().b(i);
                if (!this.a(fG2) || !this.b(fG2) || !fG2.k().a(A5.av) || this.a(fG2.k())) continue;
                return i;
            }
        }
        return -1;
    }

    private boolean X() {
        eJ eJ2 = ds_2.k();
        for (int i = 36; i < 45; ++i) {
            if (!eJ2.aY().a(i).h()) continue;
            fG fG2 = eJ2.aY().a(i).f();
            fk_0 fk_02 = fG2.k();
            if (!this.a(fG2) || !fk_02.a(A5.av) || this.a(fk_02)) continue;
            return false;
        }
        return true;
    }

    private boolean a(bh_1 bh_12) {
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        gK gK2 = gK.b(eJ2.z(), eJ2.l() + (double)eJ2.am(), eJ2.g());
        gg_0[] gg_0Array = gg_0.f();
        if (V.c() > 13) {
            g1 g12 = g1.a(bh_12.d(), bh_12.c(), bh_12.a());
            for (gg_0 gg_02 : gg_0Array) {
                gK gK3;
                g1 g13 = g12.a(gg_02);
                gg_0 gg_03 = gg_02.g();
                if (!(gK2.b(gK.b(g12.h(), g12.f(), g12.g()).a(0.5, 0.5, 0.5)) < gK2.b(gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5))) || !this.d(new bh_1(g13.h(), g13.f(), g13.g())).a(this.a(g13), false).booleanValue() || !(gK2.b(gK3 = gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5).c(gK.b(gg_03.l().h(), gg_03.l().f(), gg_03.l().g()).a(0.5))) <= 18.0)) continue;
                if (ds_2.K().a(eJ2, gO2, eJ2.a_(), bh_1.a(g13), gg_03, gK3)) {
                    eJ2.bp().a(fq_0.g());
                    this.R.d();
                }
                return true;
            }
        } else {
            for (gg_0 gg_04 : gg_0Array) {
                gK gK4;
                double d3;
                bh_1 bh_13 = bh_12.a(gg_04);
                gg_0 gg_05 = gg_04.g();
                double d4 = gK2.b(gK.b(bh_12.d(), bh_12.c(), bh_12.a()).a(0.5, 0.5, 0.5));
                if (!(d4 < (d3 = gK2.b(gK.b(bh_13.d(), bh_13.c(), bh_13.a()).a(0.5, 0.5, 0.5)))) || !(gK2.b(gK4 = gK.b(bh_13.d(), bh_13.c(), bh_13.a()).a(0.5, 0.5, 0.5).c(gK.b(gg_05.i(), gg_05.j(), gg_05.k()).a(0.5))) <= 18.0)) continue;
                if (ds_2.K().a(eJ2, gO2, eJ2.a_(), bh_13, gg_05, gK4)) {
                    eJ2.bp().a(fq_0.g());
                    this.R.d();
                }
                return true;
            }
        }
        return false;
    }

    private gK b(bh_1 bh_12) {
        eJ eJ2 = ds_2.k();
        gK gK2 = gK.b(eJ2.z(), eJ2.l() + (double)eJ2.am(), eJ2.g());
        gg_0[] gg_0Array = gg_0.f();
        if (V.c() > 13) {
            g1 g12 = g1.a(bh_12.d(), bh_12.c(), bh_12.a());
            for (gg_0 gg_02 : gg_0Array) {
                gK gK3;
                g1 g13 = g12.a(gg_02);
                gg_0 gg_03 = gg_02.g();
                if (!(gK2.b(gK.b(g12.h(), g12.f(), g12.g()).a(0.5, 0.5, 0.5)) < gK2.b(gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5))) || !this.d(new bh_1(g13.h(), g13.f(), g13.g())).a(this.a(g13), false).booleanValue() || !(gK2.b(gK3 = gK.b(g13.h(), g13.f(), g13.g()).a(0.5, 0.5, 0.5).c(gK.b(gg_03.l().h(), gg_03.l().f(), gg_03.l().g()))) <= 18.0)) continue;
                return gK3;
            }
        } else {
            for (gg_0 gg_04 : gg_0Array) {
                gK gK4;
                double d3;
                bh_1 bh_13 = bh_12.a(gg_04);
                gg_0 gg_05 = gg_04.g();
                double d4 = gK2.b(gK.b(bh_12.d(), bh_12.c(), bh_12.a()).a(0.5, 0.5, 0.5));
                if (!(d4 < (d3 = gK2.b(gK.b(bh_13.d(), bh_13.c(), bh_13.a()).a(0.5, 0.5, 0.5)))) || !(gK2.b(gK4 = gK.b(bh_13.d(), bh_13.c(), bh_13.a()).a(0.5, 0.5, 0.5).c(gK.b(gg_05.i(), gg_05.j(), gg_05.k()))) <= 18.0)) continue;
                return gK4;
            }
        }
        return null;
    }

    private gK c(bh_1 bh_12) {
        gK gK2 = this.b(bh_12);
        if (gK2 == null && (gK2 = this.b(bh_12.a(1, 0, 0))) == null && (gK2 = this.b(bh_12.a(0, 0, 1))) == null && (gK2 = this.b(bh_12.a(-1, 0, 0))) == null) {
            gK2 = this.b(bh_12.a(0, 0, -1));
        }
        return gK2;
    }

    private float[] a(gK gK2) {
        eJ eJ2 = ds_2.k();
        double d3 = gK2.g() - eJ2.z();
        double d4 = gK2.h() - (eJ2.l() + (double)eJ2.am());
        double d5 = gK2.f() - eJ2.g();
        double d6 = Y.e(d3 * d3 + d5 * d5);
        float f10 = (float)Math.toDegrees(Math.atan2(d5, d3)) - 90.0f;
        float f11 = (float)(-Math.toDegrees(Math.atan2(d4, d6)));
        float f12 = this.B.x + Y.a(f10 - this.B.x);
        float f13 = this.B.y + Y.a(f11 - this.B.y);
        return new float[]{f12, f13};
    }

    private boolean T() {
        return this.K.u() == false || ds_2.k().aG().d() && this.P.a(ds_2.k().aG());
    }

    private boolean b(fG fG2) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        if (fG2.g().equalsIgnoreCase("tile.cactus")) {
            return false;
        }
        return fG2.k().a(A5.av);
    }

    private dl_1 a(g1 g12) {
        return ds_2.t().a(g12);
    }

    private dx_2 d(bh_1 bh_12) {
        return ds_2.t().b(bh_12.d(), bh_12.c(), bh_12.a());
    }

    public dj_0 e(bh_1 bh_12) {
        return this.d(bh_12).h();
    }

    private boolean a(fG fG2) {
        return fG2.d();
    }

    private int S() {
        eJ eJ2 = ds_2.k();
        int n6 = 0;
        for (int i = 0; i < 45; ++i) {
            if (!eJ2.aY().a(i).h()) continue;
            fG fG2 = eJ2.aY().a(i).f();
            fk_0 fk_02 = fG2.k();
            if (!fG2.k().a(A5.av) || this.a(fk_02)) continue;
            n6 += fG2.n();
        }
        return n6;
    }

    private boolean a(fk_0 fk_02) {
        if (!this.z.u().booleanValue()) {
            return false;
        }
        return this.M.c(String.valueOf(fk_02.h())) || this.v.contains(fk_02.h());
    }
}

