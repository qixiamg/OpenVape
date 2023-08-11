/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class zP
extends Module {
    private final Queue<Integer> v = new ArrayDeque<Integer>();
    private final AO I = new AO();
    private final dy_0 B = dy_0.createValue(this, "Delay", "#", "", 1.0, 100.0, 120.0, 200.0, 1.0);
    private final BooleanValue A = BooleanValue.createValue((Object)this, "Best Items", true, "Keeps the best set of armor, sword, axe, pickaxe and bow");
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Remove Negative Potions", true, "Will always throw out negative potions");
    private final BooleanValue N = BooleanValue.createValue((Object)this, "Remove Food", true, "Remove Food except for Golden Apples");
    private final BooleanValue G = BooleanValue.createValue((Object)this, "Open Inventory", true, "Opens your inventory when cleaning.");
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Inventory Only", true, "Only cleans while your inventory is open.");
    private final DD F = DD.a((Object)this, "invcleaner-whitelisted", "Whitelisted", DD.m, 1, Collections.emptyList());
    private final DD x = DD.a((Object)this, "invcleaner-blacklisted", "Blacklisted", DD.n, Collections.emptyList());
    private final pb_0 w = new pb_0("On Key");
    private final pb_0 y = new pb_0("Toggle");
    private final DX E = DX.a((Object)this, "Activation", this.w, this.w, this.y);
    private fG[] z;
    private fG J;
    private fG D;
    private fG u;
    private fG L;
    private boolean K;
    private static String[] M;

    public zP() {
        super("InvCleaner", -13181746, CQ.a, "Cleans blacklisted items from your inventory.\nDoes not throw out whitelisted items.");
        this.E.a(this.G, this.H);
        this.E.a((BasicValue)this.G, this.w);
        this.E.a((BasicValue)this.H, this.y);
        this.a(this.E, this.B, this.G, this.H, this.A, this.C, this.N, this.F, this.x);
    }

    private static double a(fG fG2) {
        int n6 = 0;
        if (fG2.e()) {
            return n6;
        }
        if (fG2.k().d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            n6 = fV2.m();
        }
        return n6 += eq_0.a(new fG[]{fG2}, fp_0.a(ds_2.k()));
    }

    public static double b(fG fG2) {
        double d3 = zP.a(fG2);
        d3 += (double)eq_0.a(32, fG2);
        d3 += (double)eq_0.a(16, fG2);
        d3 += (double)eq_0.a(19, fG2);
        d3 += (double)eq_0.a(20, fG2);
        d3 += (double)eq_0.a(48, fG2);
        return d3 += (double)eq_0.a(34, fG2);
    }

    @Override
    public boolean p() {
        return this.E.v() == this.w;
    }

    public boolean S() {
        return this.N() && this.K && (this.G.u() != false || ds_2.x().e());
    }

    @Override
    public void m() {
        this.F.b("344", 1);
        this.F.b("384", 1);
        this.F.b("332", 1);
        this.F.b("346", 1);
        this.F.b("368", 1);
        this.x.b("280", -1);
        this.x.b("287", -1);
        this.x.b("318", -1);
        this.x.b("345", -1);
        this.x.b("288", -1);
        this.x.b("374", -1);
        this.x.b("116", -1);
        this.x.b("54", -1);
        this.x.b("145", -1);
    }

    @Override
    public void s() {
        this.v.clear();
        this.K = false;
    }

    private boolean W() {
        Object object;
        eJ eJ2 = ds_2.k();
        if (!ds_2.x().a(A5.bt) && this.G.u().booleanValue() && this.E.v() == this.w) {
            int n6 = ds_2.s().t().i();
            ei_0.a(n6, true);
            ei_0.a(n6);
            ei_0.a(n6, false);
            return false;
        }
        this.z = this.V();
        this.J = this.a(A5.bO, new BE(this));
        this.D = this.a(A5.dW, new p9(this));
        this.L = this.a(A5.cZ, new AW(this));
        this.u = this.a(A5.cW, new vj(this));
        if (eJ2.aY().e()) {
            return false;
        }
        HashMap<Integer, u8> hashMap = new HashMap<Integer, u8>();
        block4: for (fQ object2 : eJ2.aY().f()) {
            try {
                if (!object2.h() || object2.f().e()) continue;
                for (Object object3 : eJ2.aU().g()) {
                    if (object3 != null && object3.equals(object2.f())) continue block4;
                }
                object = object2.f().k();
                int list = fk_0.a((fk_0)object);
                mD mD2 = this.F.d(object2.f().k().h() + "");
                if (mD2 == null) {
                    mD2 = this.F.d(object2.f().k().a(object2.f()));
                }
                if (mD2 != null && mD2.c()) {
                    Object object3;
                    if (hashMap.containsKey(list)) {
                        object3 = (u8)hashMap.get(list);
                    } else {
                        u8 u82 = new u8(list, mD2.f());
                        hashMap.put(list, u82);
                        object3 = u82;
                    }
                    ((u8)object3).a(object2.g());
                }
                if (!this.c(object2.f())) continue;
                this.e(object2.g());
            }
            catch (Exception exception) {
                on.a(exception);
            }
        }
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                object = (u8)entry.getValue();
                ((u8)object).c();
                List<Integer> list = ((u8)object).a();
                if (list.size() <= 0) continue;
                for (int i = u8.a((u8)object); i < list.size(); ++i) {
                    this.e(list.get(i));
                }
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        return true;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (on.p.H().b(Ag.class).U() || on.p.H().b(zY.class).V() || on.p.H().b(z6.class).S() || on.p.t().c()) {
            this.K = false;
            return;
        }
        eJ eJ2 = ds_2.k();
        if (!this.K) {
            if (this.W() && !this.K && this.E.v() == this.w) {
                this.d(false);
                if (this.G.u().booleanValue()) {
                    eJ2.aX();
                }
            }
            return;
        }
        if (this.E.v() == this.y && this.H.u().booleanValue() && (!ds_2.x().a(A5.bt) || eJ2.a8().g())) {
            return;
        }
        if (this.K && this.G.u().booleanValue() && !ds_2.x().a(A5.bt)) {
            this.z();
            return;
        }
        if (!this.v.isEmpty()) {
            if (this.I.a((long)this.B.t())) {
                this.I.d();
                int n6 = this.v.poll();
                ds_2.K().a(eJ2.aY().g(), n6, 0, 0, eJ2);
            }
            return;
        }
        if (this.E.v() == this.w) {
            this.d(false);
            if (this.G.u().booleanValue()) {
                eJ2.aX();
            }
        } else {
            this.K = false;
        }
        if (eJ2.a8().g() && ds_2.x().a(A5.bt) && this.E.v() == this.w) {
            this.d(false);
        }
    }

    private void e(int n6) {
        if (this.v.contains(n6)) {
            return;
        }
        this.v.add(n6);
        this.v.add(-999);
        this.K = true;
    }

    private boolean c(fG fG2) {
        fV fV2;
        fk_0 fk_02 = fG2.k();
        if (fk_02.a(A5.cN) && this.z[(fV2 = new fV(fk_02)).k()] != null && !this.z[fV2.k()].equals(fG2)) {
            return true;
        }
        boolean bl = true;
        if (this.A.u().booleanValue()) {
            bl = fk_02.a(A5.cZ) && !this.L.equals(fG2) || fk_02.a(A5.dW) && !this.D.equals(fG2) || fk_02.a(A5.bO) && !this.J.equals(fG2) || fk_02.a(A5.cW) && !this.u.equals(fG2);
        }
        return this.x.a(fG2) || bl || this.N.u() != false && fk_02.a(A5.c0) && !fk_02.a(A5.cf) || this.C.u() != false && fk_02.a(A5.dx) && this.d(fG2);
    }

    private fG a(Class clazz, Comparator comparator) {
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (fQ fQ2 : ds_2.k().aY().f()) {
            if (!fQ2.h() || !fQ2.f().d() || !fQ2.f().k().a(clazz)) continue;
            arrayList.add(fQ2.f());
        }
        arrayList.sort(comparator);
        Collections.reverse(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (fG)arrayList.get(0);
    }

    private fG[] V() {
        fG[] fGArray = new fG[4];
        ArrayList<fG> arrayList = new ArrayList<fG>();
        List<fQ> list = ds_2.k().aY().f();
        for (fQ cy_02 : list) {
            if (!cy_02.h() || !cy_02.f().k().a(A5.cN)) continue;
            arrayList.add(cy_02.f());
        }
        for (fG fG2 : arrayList) {
            fV fV2 = new fV(fG2.k());
            fG fG3 = fGArray[fV2.k()];
            if (fG3 != null && !(zP.a(fG2) > zP.a(fG3))) continue;
            fGArray[fV2.k()] = fG2;
        }
        return fGArray;
    }

    private boolean d(fG fG2) {
        if (!fG2.k().a(A5.dx)) {
            return false;
        }
        fh_0 fh_02 = new fh_0(fG2.k());
        List<fE> list = fh_02.f(fG2);
        for (fE fE2 : list) {
            fX fX2 = fX.a(fE2.g());
            if (!fX2.r()) continue;
            return true;
        }
        return false;
    }

    public DD X() {
        return this.F;
    }

    public DD U() {
        return this.x;
    }

    @Override
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        super.a(jsonObject);
        if (jsonObject.get("whitelisted-items") != null) {
            jsonArray = jsonObject.get("whitelisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.F.getValueName());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.F.isCorrectValue(jsonObject2);
        }
        if (jsonObject.get("blacklisted-items") != null) {
            jsonArray = jsonObject.get("blacklisted-items").getAsJsonArray();
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("id", this.x.getValueName());
            jsonObject2.add("value", (JsonElement)jsonArray);
            this.x.isCorrectValue(jsonObject2);
        }
    }

    public static void b(String[] stringArray) {
        M = stringArray;
    }

    public static String[] T() {
        return M;
    }

    static {
        if (zP.T() != null) {
            zP.b(new String[2]);
        }
    }
}

