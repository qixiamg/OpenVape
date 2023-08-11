/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.Collections;

public class Ag
extends Module {
    private final int[] w = new int[]{313, 309, 317, 305, 301};
    private final int[] y = new int[]{311, 307, 315, 303, 299};
    private final int[] A = new int[]{310, 306, 314, 302, 298};
    private final int[] E = new int[]{312, 308, 316, 304, 300};
    private final BooleanValue z = BooleanValue.createValue((Object)this, "Check in Menu", false, "This will attempt to ignore Menus such as\nServer selectors, and settings inventory menus\nThis may not work 100% on all servers");
    private final BooleanValue F = BooleanValue.createValue((Object)this, "Best Only", true, "Only takes an item if it is better than what you have equipped.");
    private final BooleanValue G = BooleanValue.createValue((Object)this, "Keep open", false, "Keep chest open after clearing");
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Shuffle", false, "Take items in a random order");
    private final dy_0 D = dy_0.createValue(this, "Click Delay", "#", "", 0.0, 150.0, 200.0, 300.0, 5.0);
    private final DD B = DD.a((Object)this, "cheatsteal-blacklisted", "Blacklisted", DD.n, Collections.emptyList());
    private final AO x = new AO();
    boolean C = false;
    private int u = -1;

    public Ag() {
        super("ChestSteal", -208, CQ.e, "Take items upon opening a chest");
        this.a(this.z, this.F, this.G, this.v, this.D, this.B);
    }

    public boolean U() {
        return this.N() && this.C;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (on.p.H().b(z6.class).S() || on.p.H().b(zY.class).V() || on.p.H().b(zP.class).S() || on.p.t().c()) {
            this.C = false;
            return;
        }
        if (ds_2.x().a(A5.aN)) {
            int n6;
            df_1 df_12 = new df_1(ds_2.x());
            if (this.z.u().booleanValue() && !this.a(df_12)) {
                this.C = false;
                return;
            }
            eJ eJ2 = ds_2.k();
            if (!this.G.u().booleanValue() && this.S()) {
                eJ2.aX();
                this.C = false;
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            f3 f32 = df_12.r();
            for (n6 = 0; n6 < f32.h(); ++n6) {
                fG fG2 = f32.a(n6);
                if (fG2.e() || fG2.toString().contains("tile.air") || this.B.a(fG2, true) || this.F.u().booleanValue() && this.d(fG2)) continue;
                arrayList.add(n6);
            }
            if (!arrayList.isEmpty()) {
                if (this.v.u().booleanValue()) {
                    Collections.shuffle(arrayList);
                    arrayList.sort(new qk_0(this.u));
                }
                n6 = (Integer)arrayList.get(0);
                int n10 = this.a(this.u, n6);
                if (this.x.a(aa_0.a(this.D) + n10)) {
                    this.C = true;
                    ds_2.K().a(df_12.l().g(), n6, 0, 1, eJ2);
                    this.u = n6;
                    this.x.d();
                }
            } else {
                this.C = false;
                if (!this.G.u().booleanValue() && this.x.a(aa_0.a(this.D))) {
                    eJ2.aX();
                }
            }
        }
    }

    private int a(int n6, int n10) {
        int n11 = n10 % 9;
        int n12 = (n10 - n11) / 9;
        int n13 = n6 % 9;
        int n14 = (n6 - n13) / 9;
        double d3 = pf_0.a(n11, n12, n13, n14);
        if (d3 < 3.0) {
            d3 = 0.0;
        }
        return (int)(d3 * 30.0);
    }

    private boolean a(df_1 df_12) {
        f3 f32 = df_12.r();
        String string = df_12.r().g();
        String string2 = gk_0.a("container.chest", new Object[0]).g().toLowerCase();
        String string3 = gk_0.a("container.chestDouble", new Object[0]).g().toLowerCase();
        return !f32.f() || string.equalsIgnoreCase(string2) || string.equalsIgnoreCase(string3);
    }

    private boolean d(fG fG2) {
        if (fG2.k().d() && fG2.k().a(A5.bO)) {
            return this.a(fG2) <= this.T();
        }
        if (fG2.k().d() && fG2.k().a(A5.cN)) {
            if (this.b(fG2) == -1) {
                return true;
            }
            if (this.b(fG2) != -1) {
                return !this.a(this.b(fG2), fG2);
            }
        }
        if (fG2.k().d() && fG2.k().a(A5.dx)) {
            return this.c(fG2);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n6, fG fG2) {
        eJ eJ2 = ds_2.k();
        if (fG2.e()) return false;
        if (fG2.k().e()) {
            return false;
        }
        fV fV2 = new fV(fG2.k().a());
        if (n6 == 8 && fG2.g().contains("boots")) {
            fG fG3 = new fG(eJ2.aU().g()[0]);
            if (fG3.e()) return true;
            fV fV3 = new fV(fG2.k());
            if (!(this.e(fG2) + (double)fV2.m() > this.e(fG3) + (double)fV3.m())) return false;
            return true;
        }
        if (n6 == 7 && fG2.g().contains("leggings")) {
            fG fG4 = new fG(eJ2.aU().g()[1]);
            if (fG4.e()) return true;
            fV fV4 = new fV(fG2.k());
            if (!(this.e(fG2) + (double)fV2.m() > this.e(fG4) + (double)fV4.m())) return false;
            return true;
        }
        if (n6 == 6 && fG2.g().contains("chestplate")) {
            fG fG5 = new fG(eJ2.aU().g()[2]);
            if (fG5.e()) return true;
            fV fV5 = new fV(fG2.k());
            if (!(this.e(fG2) + (double)fV2.m() > this.e(fG5) + (double)fV5.m())) return false;
            return true;
        }
        if (n6 != 5) return false;
        if (!fG2.g().contains("helmet")) return false;
        fG fG6 = new fG(eJ2.aU().g()[3]);
        if (fG6.e()) return true;
        fV fV6 = new fV(fG2.k());
        if (!(this.e(fG2) + (double)fV2.m() > this.e(fG6) + (double)fV6.m())) return false;
        return true;
    }

    private int b(fG fG2) {
        for (int n6 : this.w) {
            if (fG2.k().h() != n6) continue;
            return 8;
        }
        for (int n6 : this.E) {
            if (fG2.k().h() != n6) continue;
            return 7;
        }
        for (int n6 : this.y) {
            if (fG2.k().h() != n6) continue;
            return 6;
        }
        for (int n6 : this.A) {
            if (fG2.k().h() != n6) continue;
            return 5;
        }
        return -1;
    }

    private double e(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            int n6 = fV2.m();
            return (double)n6 + (double)((100 - n6 * 4) * eq_0.a(0, fG2) * 4) * 0.0075;
        }
        return 0.0;
    }

    private boolean S() {
        fI fI2 = ds_2.k().aY();
        for (int i = 9; i <= 44; ++i) {
            fG fG2 = fI2.a(i).f();
            if (!fG2.e() && !fG2.toString().contains("tile.air")) continue;
            return false;
        }
        return true;
    }

    private float T() {
        eJ eJ2 = ds_2.k();
        float f10 = 0.0f;
        for (int i = 0; i < 45; ++i) {
            fG fG2;
            if (!eJ2.aY().a(i).h() || !(fG2 = eJ2.aY().a(i).f()).k().d() || !fG2.k().a(A5.bO) || !(this.a(fG2) > f10)) continue;
            f10 = this.a(fG2);
        }
        return f10;
    }

    private boolean c(fG fG2) {
        if (fG2.k().d() && fG2.k().a(A5.dx)) {
            fh_0 fh_02 = new fh_0(fG2.k().a());
            if (fh_0.d(fG2)) {
                for (Object e10 : fh_02.c(fG2)) {
                    fE fE2 = new fE(e10);
                    if (fE2.g() != 19 && fE2.g() != 7 && fE2.g() != 2 && fE2.g() != 18 && fE2.g() != 15) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private float a(fG fG2) {
        if (fG2.k().e() || !fG2.k().a(A5.bO)) {
            return 0.0f;
        }
        fb_0 fb_02 = new fb_0(fG2.k().a());
        return (float)eq_0.a(e5.f().l(), fG2) * 1.25f + (fb_02.l() + 1.0f) + (float)eq_0.a(e5.g().l(), fG2) * 0.01f;
    }
}

