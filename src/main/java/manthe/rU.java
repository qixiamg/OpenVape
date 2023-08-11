/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.D7;
import manthe.bx_0;
import manthe.ds_2;
import manthe.eC;
import manthe.eF;
import manthe.eJ;
import manthe.fG;
import manthe.gO;
import manthe.gS;
import manthe.kS;
import manthe.k_;
import manthe.ka_0;
import manthe.my_0;
import manthe.nH;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.rQ;
import manthe.rf_0;
import manthe.rl_0;
import manthe.sh_0;
import manthe.yk_0;

public class rU
extends r1 {
    private final rl_0 ak;
    private final sh_0 ap;
    private final sh_0 aj;
    double ae;
    double al;
    double an;
    private gS ah;
    private int am;
    private int ag;
    private int aq;
    private int ao;
    private int af;
    private eC ai;

    public rU() {
        super("Duel Info", true);
        this.aj().a(new D7(0.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(130.0);
        double d3 = this.q() - 0.0;
        rf_0 rf_02 = new rf_0(true);
        rf_02.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf_02.b(a);
        rf_02.j(false);
        rf_02.b(15.0);
        rQ rQ2 = new rQ("di_target", 0.45f, 0.0f, 0.0f);
        rQ2.b("Current target");
        rQ2.e(true);
        rQ2.b(15.0);
        rQ2.c(15.0);
        rf_02.b(rQ2);
        this.ak = new rl_0("Archyb0t", my_0.i, 1.0);
        this.ak.b(15.0);
        this.ak.c(d3 - rQ2.q());
        this.ak.j(false);
        rf_02.b(this.ak);
        this.d(rf_02);
        rf_0 rf_03 = new rf_0(true);
        rf_03.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf_03.b(a);
        rf_03.j(false);
        rf_03.b(15.0);
        rQ rQ3 = new rQ("di_pot", 0.45f, 0.0f, 0.0f);
        rQ3.b("Difference of potions used");
        rQ3.e(true);
        rQ3.b(15.0);
        rQ3.c(15.0);
        rf_03.b(rQ3);
        rf_0 rf_04 = new rf_0(false);
        rf_04.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.ap = new sh_0();
        rf_04.b(this.ap);
        this.ap.c(d3 - rQ3.q() - 4.0);
        this.ap.b(15.0);
        this.ap.j(false);
        this.ap.f(true);
        this.ap.a(new yk_0(this, rf_03));
        rf_03.b(rf_04);
        this.d(rf_03);
        rf_0 rf_05 = new rf_0(true);
        rf_05.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rf_05.b(a);
        rf_05.j(false);
        rf_05.b(15.0);
        rQ rQ4 = new rQ("di_hit", 0.45f, 0.0f, 0.0f);
        rQ4.b("Difference of hits landed");
        rQ4.e(true);
        rQ4.b(15.0);
        rQ4.c(15.0);
        rf_05.b(rQ4);
        rf_04 = new rf_0(false);
        rf_04.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.aj = new sh_0();
        rf_04.b(this.aj);
        this.aj.c(d3 - rQ4.q() - 4.0);
        this.aj.b(15.0);
        this.aj.j(false);
        this.aj.a(new bx_0(this, rf_05));
        rf_05.b(rf_04);
        this.d(rf_05);
        this.am();
        this.c(135.0);
        this.b(21.0);
        this.o(false);
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        for (p1 p12 : this.aj().v()) {
            p12.c(d3 - 0.0);
        }
    }

    private boolean an() {
        gO gO2 = ds_2.t();
        if (this.ah == null) {
            this.ah = gO2;
            return true;
        }
        boolean bl = gO2.d() && !gO2.a().equals(this.ah.a());
        this.ah = gO2;
        return bl;
    }

    private void am() {
        this.ak.a("Searching...");
        this.ai = null;
        this.am = 0;
        this.ag = 0;
        this.af = 0;
        this.aq = 0;
        this.ao = 0;
        this.ap.b(0, 0);
        this.ap.b((Color)null);
        this.aj.b(0, 0);
        this.aj.b((Color)null);
    }

    private void ao() {
        this.ap.b(this.am, this.ag);
        this.aj.b(this.aq, this.ao);
    }

    private void al() {
        if (ds_2.t().e()) {
            return;
        }
        if (ds_2.k().e()) {
            return;
        }
        this.ak.a("Searching...");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(ds_2.t().j());
        ArrayList<eC> arrayList = new ArrayList<eC>();
        for (Object e10 : copyOnWriteArrayList) {
            eC eC2;
            if (!A5.cc.isInstance(e10) || (eC2 = new eC(e10)).ae() || eC2.a().equals(ds_2.k().a()) || eC2.j() || eC2.q() == -420) continue;
            arrayList.add(eC2);
        }
        if (arrayList.size() > 1) {
            this.ak.a("More than one target");
        } else if (arrayList.size() == 1) {
            this.ai = (eC)arrayList.get(0);
            this.ak.a(this.ai.S());
            this.ao();
        }
    }

    public void a(k_ k_2) {
        if (this.ai == null || this.ai.e()) {
            return;
        }
        if (!k_2.getName().equals("game.player.hurt")) {
            return;
        }
        if (ds_2.k().a(this.ai) > 6.0f) {
            return;
        }
        if (k_2.getEntity().a().equals(ds_2.k().a())) {
            ++this.ao;
        }
        if (k_2.getEntity().a().equals(this.ai.a())) {
            ++this.aq;
        }
        this.ao();
    }

    public void a(kS kS2) {
        if (!kS2.getEntity().a(A5.aX)) {
            return;
        }
        if (this.ai == null || this.ai.e()) {
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
        if (this.af > 0) {
            ++this.am;
            --this.af;
        } else {
            ++this.ag;
        }
        this.ao();
    }

    public void a(ka_0 ka_02) {
        if (this.ai == null || this.ai.e()) {
            return;
        }
        fG fG2 = ka_02.getItemStack();
        if (fG2.d() && A5.dx.isInstance(fG2.k().a()) && nH.a(fG2)) {
            ++this.af;
        }
    }

    @Override
    public void c() {
        super.c();
        this.b(20.0);
    }

    @Override
    public void W() {
        try {
            eJ eJ2 = ds_2.k();
            if (!this.ai() || this.z()) {
                this.am();
                return;
            }
            if (ds_2.k().e()) {
                return;
            }
            boolean bl = Math.abs(eJ2.z() - this.ae) > 120.0 || Math.abs(eJ2.l() - this.al) > 120.0 || Math.abs(eJ2.g() - this.an) > 120.0;
            this.ae = eJ2.z();
            this.al = eJ2.l();
            this.an = eJ2.g();
            if (this.an() || bl) {
                this.am();
                return;
            }
            if (ds_2.t().e()) {
                return;
            }
            if (this.ai == null || this.ai.e()) {
                this.al();
            } else {
                if (eJ2.j() || this.ai.j()) {
                    this.am();
                    return;
                }
                boolean bl2 = false;
                for (Object e10 : ds_2.t().j()) {
                    if (this.ai.a().equals(e10)) {
                        bl2 = true;
                        break;
                    }
                    eC eC2 = new eC(e10);
                    if (this.ai.a().equals(eC2.a()) || !this.ai.S().equalsIgnoreCase(eC2.S())) continue;
                    this.ai = eC2;
                }
                if (!bl2) {
                    this.ai = null;
                    this.al();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static sh_0 a(rU rU2) {
        return rU2.ap;
    }

    static sh_0 b(rU rU2) {
        return rU2.aj;
    }
}

