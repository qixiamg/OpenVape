/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

import java.awt.Color;
import java.util.List;

/*
 * Renamed from manthe.wp
 */
public class wp_0
extends we_0 {
    private xC V;

    public wp_0() {
        this.a(wp_0.b.k);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new xM(this, "newsettings", "Settings").a(new H(this)));
        VapeSettings cb_02 = on.p.t();
        yf_0 yf_02 = on.p.D();
        zu_0 zu_02 = zu_0.T;
        this.a((wM)new x2(wp_0.b.y), new Object[0]);
        this.a((wM)new xZ("MODULE SETTINGS"), new Object[0]);
        this.a((wM)new wK(cb_02.teamsByServer), new Object[0]);
        this.a((wM)new wK(cb_02.teamsByColor), new Object[0]);
        this.a((wM)new wS(this, cb_02.recolorVisuals, cb_02), new Object[0]);
        this.a((wM)new wO(this, cb_02.O, cb_02), new Object[0]);
        this.a((wM)new xj_0(this, ColorValue.createValue((Object)this, "Team Color", new Color(0, 190, 189)), cb_02), new Object[0]);
        this.a((wM)new wK(cb_02.y), new Object[0]);
        this.a((wM)new wK(cb_02.z), new Object[0]);
        this.a((wM)new wK(cb_02.a), new Object[0]);
        this.a((wM)new wK(cb_02.f), new Object[0]);
        this.a((wM)new wZ(this, cb_02.x), new Object[0]);
        this.a((wM)new wn_0(this, cb_02.n), new Object[0]);
        this.a((wM)new wi_0(this, cb_02.N), new Object[0]);
        this.a((wM)new wK(cb_02.k), new Object[0]);
        this.a((wM)new wN(this, cb_02.i, cb_02), new Object[0]);
        this.a((wM)new w_(this, cb_02.A, cb_02), new Object[0]);
        this.a((wM)new x2(wp_0.b.y), new Object[0]);
        this.a((wM)new xZ("GENERAL SETTINGS"), new Object[0]);
        this.a(new w5(zu_02.aj).a(new ul(this, zu_02)), new Object[0]);
        this.V = new xC(cb_02.r);
        this.a((wM)this.V, new Object[0]);
        this.a((wM)new wK(yf_02.a), new Object[0]);
        this.a((wM)new wK(zu_02.G), new Object[0]);
        this.a((wM)new wK(zu_02.aa), new Object[0]);
        this.a((wM)new wK(zu_02.y), new Object[0]);
        this.a((wM)new wK(zu_02.w), new Object[0]);
        this.a((wM)new wK(zu_02.v), new Object[0]);
        this.a((wM)new wK(zu_02.an), new Object[0]);
        this.a((wM)new wK(zu_02.F), new Object[0]);
        this.a((wM)new wH(this, zu_02.M, zu_02), new Object[0]);
        this.a((wM)new xx_0(zu_02.X), new Object[0]);
        this.a(new xB("Rebind GUI", zu_02).a("Change the bind of the GUI"), new Object[0]);
        this.a(new w5(zu_0.T.R), new Object[0]);
        this.a(new wu_0("Reset current profile", new pW(this)).a("This will set your current profile to\nthe default settings of Vape"), new Object[0]);
        this.a(new wu_0("Reset GUI positions", new aU(this)).a("This will reset your GUI back to the default"), new Object[0]);
        this.a(new wu_0("Sort GUI", new pZ(this)).a("Sorts GUI by size"), new Object[0]);
        this.a(new wu_0("Uninject", new cl_0(this)).a("Uninjects Vape from your game(Self destruct)\nNote that Vape V4 is not designed to protect against screenshares\nDisinjecting will likely not protect against one"), new Object[0]);
        this.a(false);
        this.j(false);
    }

    private void n() {
        int n6 = 10;
        for (we_0 we_02 : zu_0.T()) {
            if (we_02 instanceof wT) {
                we_02.a(10.0, 20.0);
                continue;
            }
            if (!we_02.ab() || we_02.af()) continue;
            we_02.a(zu_0.b(wT.class).e() + 10.0, n6 += 22);
        }
        ng.f.al();
        ng.f.p(true);
        for (we_0 we_02 : zu_0.T()) {
            if (we_02.af() || !we_02.ab()) continue;
            we_02.a(we_02 instanceof wT);
        }
    }

    private void m() {
        for (Module bI : on.p.H().e()) {
            if ((bI.Q() != CQ.b || bI instanceof zE) && bI.N()) {
                bI.d(false);
            }
            bI.c().clear();
            if (bI.P() != 0) {
                bI.c().add(bI.P());
            }
            if (bI.l() != null && bI.l().Y() != null) {
                bI.l().Y().g(bI.v());
            }
            for (BasicValue ds_02 : bI.r()) {
                if (ds_02.b() == null) continue;
                ds_02.q();
            }
        }
        for (BasicValue ds_03 : on.p.o().a()) {
            if (ds_03.b() == null) continue;
            ds_03.q();
        }
        this.V.l();
    }

    private void ak() {
        List<we_0> list = zu_0.T();
        list.sort(new bh_0(this));
        double d3 = 32.0;
        double d4 = 32.0;
        double d5 = 0.0;
        for (we_0 we_02 : list) {
            double d6;
            if (!we_02.b() || we_02.af() || !we_02.ab() || we_02 instanceof wT) continue;
            if (d3 + we_02.e() > (double)ds_2.p().g()) {
                d3 = 30.0;
                d4 += d5 + 4.0;
                d5 = 0.0;
            }
            double d7 = d6 = we_02.f() > we_02.L() ? we_02.L() : we_02.f();
            if (d6 > d5) {
                d5 = d6;
            }
            we_02.a(d3, d4);
            d3 += we_02.e() + 2.0;
        }
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Settings";
    }

    static void a(wp_0 wp_02) {
        wp_02.m();
    }

    static void b(wp_0 wp_02) {
        wp_02.n();
    }

    static void c(wp_0 wp_02) {
        wp_02.ak();
    }
}

