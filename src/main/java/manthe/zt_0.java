/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from manthe.zt
 */
public class zt_0
extends Module {
    private HashMap<Integer, tB> v = new HashMap();
    private List<eF> w = new ArrayList<eF>();
    private Object u;

    public zt_0() {
        super("CombatPrediction", 0, 0, CQ.b, "Estimates player health on pvp servers\nBy default attacks and health pots will be estimated\nNOTE: This feature may not always be accurate!");
    }

    public boolean S() {
        return on.p.t().i.u();
    }

    public boolean T() {
        return on.p.t().A.u();
    }

    @Override
    public boolean N() {
        return on.p.t().k.u();
    }

    @Override
    public void a(kf_0 kf_02) {
        if (kf_02.c()) {
            return;
        }
        gO gO2 = ds_2.t();
        if (gO2.e()) {
            return;
        }
        if (this.u == null) {
            this.u = gO2.a();
        }
        if (!gO2.a().equals(this.u)) {
            this.w.clear();
            this.v.clear();
            this.u = gO2.a();
        }
        for (Object object : gO2.k()) {
            if (!A5.cc.isAssignableFrom(object.getClass()) || A5.u.isAssignableFrom(object.getClass())) continue;
            eC ex_02 = new eC(object);
            if (this.v.containsKey(ex_02.q())) {
                tB tB2 = this.v.get(ex_02.q());
                tB2.a();
                continue;
            }
            this.v.put(ex_02.q(), new tB(ex_02));
        }
        ArrayList arrayList = new ArrayList();
        for (eF eF2 : this.w) {
            if (gO2.k().contains(eF2.a())) continue;
            double d3 = eF2.z();
            double d4 = eF2.l();
            double d5 = eF2.g();
            for (Map.Entry<Integer, tB> entry : this.v.entrySet()) {
                ex_0 ex_02 = ((gS)gO2).a(entry.getKey());
                if (!ex_02.d() || !ex_02.a(A5.cc)) continue;
                boolean bl = false;
                if (eF2.l() > ex_02.l() + 0.5 && (double)ex_02.a(eF2) < 2.2 && eF2.ad() >= 5) {
                    bl = true;
                }
                float f10 = zt_0.a(new eC(ex_02.a()), eF2.at(), d3, d4, d5, bl);
                tB tB3 = entry.getValue();
                tB.b(tB3, tB.b(tB3) + f10);
            }
            arrayList.add(eF2);
        }
        if (arrayList.size() > 0) {
            this.w.removeAll(arrayList);
        }
    }

    @Override
    public void a(kJ kJ2) {
        tB tB2;
        if (kJ2.getTarget().a(A5.cc) && (tB2 = (tB)this.v.getOrDefault(kJ2.getTarget().q(), null)) != null) {
            tB.b(tB2, new eC(kJ2.getTarget().a()).aT());
            tB.c(tB2, 0);
            tB.a(tB2, true);
            tB.a(tB2, ds_2.k().aG());
        }
    }

    @Override
    public void a(kS kS2) {
        if (kS2.getEntity().a(A5.cc)) {
            tB tB2 = this.v.getOrDefault(kS2.getEntity().q(), new tB(new eC(kS2.getEntity())));
            if (tB2 != null) {
                tB.a(tB2, new eC(kS2.getEntity().a()));
                if (tB.a(tB2).a(10000L)) {
                    tB.b(tB2, 20.0f);
                    tB.b(tB2, 20);
                    tB.a(tB2, 0);
                    tB.a(tB2, 0.0f);
                    tB.c(tB2, 5.0f);
                    tB.a(tB2, null);
                    tB.a(tB2, false);
                    tB.a(tB2).d();
                }
            }
            return;
        }
        if (!kS2.getEntity().a(A5.aX)) {
            return;
        }
        if (ds_2.k().e()) {
            return;
        }
        eF eF2 = new eF(kS2.getEntity());
        if (eF2.at().e()) {
            return;
        }
        boolean bl = nH.a(eF2.at());
        if (!bl) {
            return;
        }
        this.w.add(new eF(kS2.getEntity().a()));
    }

    @Override
    public void a(k_ k_2) {
        tB tB2;
        if (!k_2.getName().equals("game.player.hurt")) {
            return;
        }
        if (k_2.getEntity().a(A5.cc) && ds_2.k().a(k_2.getEntity()) < 6.0f && (tB2 = (tB)this.v.getOrDefault(k_2.getEntity().q(), null)) != null) {
            tB.c(tB2, true);
        }
    }

    public float b(eC eC2) {
        tB tB2 = this.v.getOrDefault(eC2.q(), null);
        return !this.N() || tB2 == null ? eC2.aD() : tB.b(tB2);
    }

    private static float a(eC eC2, fG fG2, double d3, double d4, double d5, boolean bl) {
        fh_0 fh_02;
        double d6 = zt_0.a(eC2, d3, d4, d5);
        int n6 = 0;
        if (fG2.k().a(A5.dx) && (fh_02 = new fh_0(fG2.k().a())).c(fG2) != null && fh_0.d(fG2)) {
            for (fE fE2 : fh_02.f(fG2)) {
                if (fE2.g() != 6) continue;
                n6 = fE2.h();
            }
        }
        if (d6 < 16.0) {
            double d7 = 1.0 - Math.sqrt(d6) / 4.0;
            if (bl) {
                d7 = 1.0;
            }
            return zt_0.a(n6, d7);
        }
        return 0.0f;
    }

    private static float a(int n6, double d3) {
        return (int)(d3 * (double)(4 << n6) + 0.5);
    }

    private static double a(ex_0 ex_02, double d3, double d4, double d5) {
        double d6 = ex_02.z() - d3;
        double d7 = ex_02.l() - d4;
        double d8 = ex_02.g() - d5;
        return d6 * d6 + d7 * d7 + d8 * d8;
    }

    private static float b(fG fG2, eC eC2, boolean bl, boolean bl2) {
        d5_0 d5_02;
        float f10 = 1.0f;
        if (fG2.d() && (d5_02 = fG2.f()).f() > 0) {
            e6 e62 = new e6(d5_02.g().toArray()[0]);
            f10 += (float)e62.g();
        }
        float f11 = 0.0f;
        f11 = eq_0.b(fG2, ey_0.f());
        if (f10 > 0.0f || f11 > 0.0f) {
            if (bl2 && f10 > 0.0f) {
                f10 *= 1.5f;
            }
            float f12 = zt_0.a(eC2, bl, f10 += f11);
            return f12;
        }
        return 0.0f;
    }

    private static float a(eC eC2, boolean bl, float f10) {
        if (bl && f10 > 0.0f) {
            f10 = (1.0f + f10) * 0.5f;
        }
        f10 = zt_0.a(eC2, f10);
        f10 = zt_0.b(eC2, f10);
        return f10;
    }

    private static float a(eC eC2, float f10) {
        int n6 = 25 - zt_0.a(eC2);
        float f11 = f10 * (float)n6;
        f10 = f11 / 25.0f;
        return f10;
    }

    private static int a(eC eC2) {
        int n6 = 0;
        for (Object object : eC2.aU().g()) {
            fG fG2 = new fG(object);
            if (!fG2.d() || !fG2.k().a(A5.cN)) continue;
            fV fV2 = new fV(fG2.k().a());
            int n10 = fV2.m();
            n6 += n10;
        }
        return n6;
    }

    private static float b(eC eC2, float f10) {
        if (eC2.a(fX.l())) {
            int n6 = (eC2.b(fX.l()).h() + 1) * 5;
            int n10 = 25 - n6;
            float f11 = f10 * (float)n10;
            f10 = f11 / 25.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (Object object : eC2.aU().g()) {
            arrayList.add(new fG(object));
        }
        int n11 = zt_0.a(arrayList.toArray(new fG[0]), fp_0.a(ds_2.k()));
        if (n11 > 20) {
            n11 = 20;
        }
        if (n11 > 0) {
            int n12 = 25 - n11;
            float f12 = f10 * (float)n12;
            f10 = f12 / 25.0f;
        }
        return f10;
    }

    private static int a(fG[] fGArray, fp_0 fp_02) {
        eq_0.f().a(0);
        eq_0.f().a(fp_02);
        eq_0.a(eq_0.f(), fGArray);
        if (eq_0.f().g() > 25) {
            eq_0.f().a(25);
        } else if (eq_0.f().g() < 0) {
            eq_0.f().a(0);
        }
        return (eq_0.f().g() + 1 >> 1) + ((eq_0.f().g() >> 1) + 1) / 2;
    }

    static float a(fG fG2, eC eC2, boolean bl, boolean bl2) {
        return zt_0.b(fG2, eC2, bl, bl2);
    }

    static float b(eC eC2, boolean bl, float f10) {
        return zt_0.a(eC2, bl, f10);
    }
}

