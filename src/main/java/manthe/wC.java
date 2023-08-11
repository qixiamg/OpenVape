/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
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
import manthe.nH;
import manthe.pe_0;
import manthe.wY;
import manthe.wj_0;
import manthe.xe_0;
import manthe.xh_0;
import manthe.xr_0;
import manthe.zu_0;

public class wC
extends wj_0 {
    private eC ab;
    private String ae;
    private int aa;
    private int ad;
    private int ag;
    private int al;
    private int ak;
    private double ac;
    private double ah;
    private double ai;
    private gS af;
    private xr_0 Y = new xr_0(this);
    private xe_0 Z = new xe_0("Potions");
    private xe_0 X = new xe_0("Sword Hits");
    private static String[] aj;

    public wC() {
        this.a(new xh_0(this, "newduelinfo", "Duel Info"));
        if (this.m()) {
            this.n();
        }
        this.b(this.Y, this.Z, this.X);
        this.am();
    }

    @Override
    public String ad() {
        return "Duel Info";
    }

    @Override
    public void S() {
        eJ eJ2 = ds_2.k();
        if (!this.ai() || ds_2.k().e()) {
            this.am();
            return;
        }
        boolean bl = Math.abs(eJ2.z() - this.ac) > 120.0 || Math.abs(eJ2.l() - this.ah) > 120.0 || Math.abs(eJ2.g() - this.ai) > 120.0;
        this.ac = eJ2.z();
        this.ah = eJ2.l();
        this.ai = eJ2.g();
        if (this.an() || bl) {
            this.am();
            return;
        }
        if (ds_2.t().e()) {
            return;
        }
        if (this.ab == null || this.ab.e()) {
            this.as();
        } else {
            if (eJ2.j() || this.ab.j()) {
                this.am();
                return;
            }
            boolean bl2 = false;
            for (Object e10 : ds_2.t().j()) {
                if (this.ab.a().equals(e10)) {
                    bl2 = true;
                    break;
                }
                eC eC2 = new eC(e10);
                if (this.ab.a().equals(eC2.a()) || !this.ab.S().equalsIgnoreCase(eC2.S())) continue;
                this.ab = eC2;
            }
            if (!bl2) {
                this.ab = null;
                this.as();
            }
        }
    }

    private void as() {
        if (ds_2.t().e() || ds_2.k().e()) {
            return;
        }
        this.ae = "Searching...";
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(ds_2.t().j());
        ArrayList<eC> arrayList = new ArrayList<eC>();
        for (Object e10 : copyOnWriteArrayList) {
            eC eC2;
            if (!A5.cc.isInstance(e10) || (eC2 = new eC(e10)).ae() || eC2.a().equals(ds_2.k().a()) || eC2.j() || eC2.q() == -420) continue;
            arrayList.add(eC2);
        }
        if (arrayList.size() > 1) {
            this.ae = "More than one target";
        } else if (arrayList.size() == 1) {
            this.ab = (eC)arrayList.get(0);
            this.ae = this.ab.S();
            this.ar();
        }
    }

    private void am() {
        this.ae = "Searching...";
        this.ab = null;
        this.aa = 0;
        this.ad = 0;
        this.ak = 0;
        this.ag = 0;
        this.al = 0;
        this.ar();
    }

    private boolean an() {
        gO gO2 = ds_2.t();
        if (this.af == null) {
            this.af = gO2;
            return true;
        }
        boolean bl = gO2.d() && !gO2.a().equals(this.af.a());
        this.af = gO2;
        return bl;
    }

    public void a(k_ k_2) {
        if (this.ab == null || this.ae == null) {
            return;
        }
        if (!k_2.getName().equals("game.player.hurt") || ds_2.k().a(this.ab) > 6.0f) {
            return;
        }
        if (k_2.getEntity().a().equals(ds_2.k().a())) {
            ++this.al;
        }
        if (k_2.getEntity().a().equals(this.ab.a())) {
            ++this.ag;
        }
        this.ar();
    }

    public void a(kS kS2) {
        if (this.ab == null || this.ab.e() || ds_2.k().e()) {
            return;
        }
        if (!kS2.getEntity().a(A5.aX)) {
            return;
        }
        eF eF2 = new eF(kS2.getEntity());
        if (eF2.at().e() || !nH.a(eF2.at())) {
            return;
        }
        if (this.ak > 0) {
            ++this.aa;
            --this.ak;
        } else {
            ++this.ad;
        }
        this.ar();
    }

    public void a(ka_0 ka_02) {
        if (this.ab == null || this.ab.e()) {
            return;
        }
        fG fG2 = ka_02.getItemStack();
        if (fG2.d() && A5.dx.isInstance(fG2.k().a()) && nH.a(fG2)) {
            ++this.ak;
        }
    }

    private void ar() {
        this.X.a(this.ag);
        this.X.b(this.al);
        this.Z.a(this.ad);
        this.Z.b(this.aa);
    }

    public eC ap() {
        return this.ab;
    }

    public String ao() {
        return this.ae;
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
        double d3 = this.Y().f();
        Color color = new Color(wC.b.m.getRed(), wC.b.m.getGreen(), wC.b.m.getBlue(), 240);
        pe_0.a(this.d(), this.c() + d3, this.e(), this.f() - d3, color);
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu_0.b(wY.class).ak().f(this.b());
    }

    public static void a(String[] stringArray) {
        aj = stringArray;
    }

    public static String[] aq() {
        return aj;
    }

    static {
        if (wC.aq() != null) {
            wC.a(new String[5]);
        }
    }
}

