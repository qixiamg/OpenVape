/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import rip.vape.module.Module;

public class wT
extends wy_0 {
    private xV ab;

    public wT() {
        super(CQ.b);
        this.a(wT.b.u);
        this.c(100.0);
        this.a(100.0);
        this.W().e(false);
        this.W().b("wrap");
        this.ab = new xV(this);
        this.a(this.ab);
        this.ar();
    }

    private void aq() {
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new wG("Combat", "newcombat"), new Object[0]);
        this.a((wM)new wG("Blatant", "newblatant"), new Object[0]);
        this.a((wM)new wG("Render", "newrender"), new Object[0]);
        this.a((wM)new wG("Utility", "newutility"), new Object[0]);
        this.a((wM)new wG("World", "newworld"), new Object[0]);
        this.a((wM)new wG("Minigames", "minigames"), new Object[0]);
        this.a((wM)new xZ("MISC"), new Object[0]);
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new wG("Friends", null, wX.class).c(new ad_0(this, wX.class)), new Object[0]);
        this.a((wM)new wG("Profiles", null, wv_0.class).c(new ad_0(this, wv_0.class)), new Object[0]);
        this.a((wM)new wG("Macros", null, wF.class).c(new ad_0(this, wF.class)), new Object[0]);
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new xL(), new Object[0]);
    }

    public void ar() {
        this.J();
        if (zu_0.T.R.v().equals(zu_0.T.ad) && this.ab.n().N().length() > 0) {
            for (Module y52 : on.p.H().e()) {
                String string;
                if (y52.Q().equals(CQ.b) || !(string = y52.H().toLowerCase()).contains(this.ab.n().N().toLowerCase())) continue;
                wz_0 wz_02 = new wz_0(this, y52);
                this.a((wM)wz_02, new Object[0]);
                wz_02.R();
            }
        } else {
            this.aq();
        }
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        this.ar();
        zu_0.an();
    }

    @Override
    public void b(uW uW2) {
        wY wY2 = zu_0.b(wY.class);
        if (wY2.m() == 3 || wY2.m() == 4) {
            return;
        }
        if (wY2.b()) {
            wY2.a(3);
            wY2.ac();
            return;
        }
        super.b(uW2);
    }

    @Override
    public void E() {
        if (zu_0.b(wY.class).b()) {
            return;
        }
        super.E();
    }

    @Override
    public void j() {
        wp_0 wp_02 = zu_0.b(wp_0.class);
        if (wp_02.b()) {
            this.a(false);
            this.a(wp_02.d(), wp_02.c());
        } else if (!this.b() && !zu_0.aq()) {
            this.a(true);
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
        return "GUI";
    }
}

