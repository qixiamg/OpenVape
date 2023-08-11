/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.D7;
import manthe.V;
import manthe.f4;
import manthe.fE;
import manthe.fG;
import manthe.fb_0;
import manthe.fh_0;
import manthe.fk_0;
import manthe.fz_0;
import manthe.g9;
import manthe.gC;
import manthe.my_0;
import manthe.pG;
import manthe.pd;
import manthe.qD;
import manthe.rM;
import manthe.rf_0;
import manthe.rl_0;
import manthe.yH;

public class U {
    private int i;
    private int f = 0;
    private boolean b;
    private boolean g;
    private boolean e;
    private rf_0 a;
    private rM d;
    private qD c;
    private qD h;

    public U(int n6) {
        this.i = n6;
        this.f();
    }

    private void f() {
        this.a = new rf_0(false);
        this.a.a(new D7(0.0, 0.0, 3, 1, new pd(0, 0, 2, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 0.0, 2, 1, new pd(2, 22, 2, 0)));
        this.d = new rM(0, false);
        this.d.i(false);
        this.d.b(22.0);
        this.d.c(22.0);
        rf_02.b(this.d);
        this.a.b(rf_02);
        rl_0 rl_02 = new rl_0("", my_0.i, 0.75);
        rl_02.c(65.0);
        rl_02.b(20.0);
        rl_02.d(true);
        this.a.b(rl_02);
        rl_02.a(new pG(this, rl_02));
        rf_0 rf_03 = new rf_0(false);
        rf_03.a(new D7(0.0, 0.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.a.b(rf_03);
        this.c = new qD("Prioritize strongest", 10.0);
        this.c.b(10.0);
        this.c.a().a(new yH(this));
        this.c.g(this.g);
        this.h = new qD("Allow any of type", 10.0);
        this.h.b(10.0);
        this.h.a().a(new gC(this));
        this.h.g(this.e);
        fk_0 fk_02 = this.g();
        if (fk_02.d()) {
            List list = new ArrayList();
            if (V.c() >= 23) {
                list = (List)g9.f().a();
            }
            fk_02.a(fk_02, list);
            if (list.size() <= 1) {
                this.b = true;
            }
            if (fk_02.a(A5.aP) || fk_02.a(A5.bO) || fk_02.a(A5.cZ) || fk_02.a(A5.c0)) {
                rf_03.b(this.c);
            }
            if (fk_02.a(A5.aP) || fk_02.a(A5.bO) || fk_02.a(A5.c0) || fk_02.a(A5.av)) {
                rf_03.b(this.h);
            }
            if (fk_02.a(A5.dx)) {
                this.g = true;
            }
        }
    }

    public rf_0 d() {
        return this.a;
    }

    public int c() {
        return this.i;
    }

    public fk_0 g() {
        return fk_0.a(this.c());
    }

    public int h() {
        return this.f;
    }

    public U a(int n6) {
        this.f = n6;
        return this;
    }

    private fz_0 a(fk_0 fk_02) {
        fz_0 fz_02 = null;
        if (fk_02.a(A5.aP)) {
            fz_02 = new f4(fk_02.a()).m();
        }
        if (fk_02.a(A5.bO)) {
            fz_02 = new fb_0(fk_02.a()).k();
        }
        return fz_02;
    }

    public boolean b(fG fG2) {
        if (fG2.d()) {
            fk_0 fk_02 = fG2.k();
            if (fk_02.h() == this.c()) {
                if (this.b || fG2.m() == this.f) {
                    return true;
                }
                if (fk_02.a(A5.dx)) {
                    fh_0 fh_02 = new fh_0(this.g());
                    fh_0 fh_03 = new fh_0(fG2.k());
                    fG fG3 = fG.a(fh_02);
                    fG3.a(this.f);
                    List<fE> list = fh_02.f(fG3);
                    List<fE> list2 = fh_03.f(fG2);
                    if (Boolean.compare(fh_0.d(fG3), fh_0.d(fG2)) == 0 && list.size() > 0) {
                        fE fE2 = list.get(0);
                        for (fE fE3 : list2) {
                            if (fE3.g() != fE2.g()) continue;
                            return true;
                        }
                    }
                }
            }
            if (this.e) {
                return fk_02.a().getClass().equals(this.g().a().getClass());
            }
        }
        return false;
    }

    public boolean e() {
        return this.g;
    }

    public JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", (Number)this.i);
        jsonObject.addProperty("meta", (Number)this.f);
        jsonObject.addProperty("anyMeta", Boolean.valueOf(this.b));
        jsonObject.addProperty("anyMaterial", Boolean.valueOf(this.e));
        jsonObject.addProperty("onlyBest", Boolean.valueOf(this.g));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.i = jsonObject.get("item-id").getAsInt();
        }
        if (jsonObject.get("meta") != null) {
            this.f = jsonObject.get("meta").getAsInt();
        }
        if (jsonObject.get("anyMeta") != null) {
            this.b = jsonObject.get("anyMeta").getAsBoolean();
        }
        if (jsonObject.get("anyMaterial") != null) {
            this.e = jsonObject.get("anyMaterial").getAsBoolean();
        }
        if (jsonObject.get("onlyBest") != null) {
            this.g = jsonObject.get("onlyBest").getAsBoolean();
        }
        this.f();
    }

    public fG a() {
        fk_0 fk_02 = fk_0.a(this.i);
        if (fk_02.e()) {
            return null;
        }
        fG fG2 = fG.a(fk_02);
        if (fG2.d()) {
            fG2.a(this.h());
        }
        return fG2;
    }

    public static U a(fG fG2) {
        if (fG2.e()) {
            return new U(0);
        }
        U u6 = new U(fG2.k().h());
        u6.a(fG2.m());
        return u6;
    }

    static rM c(U u6) {
        return u6.d;
    }

    static int d(U u6) {
        return u6.f;
    }

    static qD a(U u6) {
        return u6.c;
    }

    static boolean a(U u6, boolean bl) {
        u6.g = bl;
        return u6.g;
    }

    static qD b(U u6) {
        return u6.h;
    }

    static boolean b(U u6, boolean bl) {
        u6.e = bl;
        return u6.e;
    }
}

