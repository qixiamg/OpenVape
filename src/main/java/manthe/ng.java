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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ng {
    public static rc_0 m;
    public static rq_0 g;
    public static r5 n;
    public static rd_0 k;
    public static rx_0 o;
    public static rC e;
    public static rm_0 d;
    public static rX p;
    public static rB r;
    public static rR h;
    public static rE a;
    public static ra_0 l;
    public static rL b;
    public static r2 f;
    public static rs_0 i;
    public static r8 j;
    public static rJ s;
    private final List<r1> c = new CopyOnWriteArrayList<r1>();
    private final List<r1> q = new CopyOnWriteArrayList<r1>();

    public static void b() {
        m = null;
        g = null;
        n = null;
        k = null;
        o = null;
        e = null;
        d = null;
        p = null;
        r = null;
        h = null;
        a = null;
        l = null;
        b = null;
        f = null;
        i = null;
        j = null;
        s = null;
    }

    public void c() {
        List<CQ> list = CQ.b();
        this.c.clear();
        this.d().clear();
        for (CQ bI : list) {
            if (bI.equals(CQ.b) || bI.equals(CQ.g)) continue;
            rA rA2 = new rA(bI);
            ArrayList<Module> arrayList = new ArrayList<Module>(on.p.H().e());
            Collections.sort(arrayList, new nm_0());
            for (Module y52 : arrayList) {
                if (y52.Q() != bI) continue;
                rA2.a(y52);
            }
            rA2.al();
            if (rA2.aj().v().size() <= 0) continue;
            this.c.add(rA2);
        }
        f = new r2();
        this.c.add(f);
        g = new rq_0();
        this.c.add(g);
        e = new rC();
        this.c.add(e);
        k = new rd_0();
        this.c.add(k);
        o = new rx_0();
        this.c.add(o);
        this.c.add(new rj_0());
        this.c.add(new rU());
        this.c.add(new rr_0());
        m = new rc_0();
        this.c.add(m);
        b = new rL();
        this.c.add(b);
        l = new ra_0();
        this.c.add(l);
        for (r1 r12 : this.c) {
            if (!r12.ag()) continue;
            m.e(r12.ac());
        }
        m.al();
        a = new rE();
        this.c.add(a);
        s = new rJ();
        this.c.add(s);
        p.a(new y1(this));
        h = new rR();
        this.a();
        this.d().addAll(this.c);
        zu_0.V();
        zu_0.T.U();
    }

    public void a() {
        int n6 = 0;
        List<r1> list = this.c;
        for (r1 r12 : list) {
            if (r12.ad()) continue;
            if (!r12.equals(m)) {
                r12.a(false);
                r12.f(true);
                r12.a(90.0);
                r12.d(n6 += 22);
            } else {
                r12.a(true);
                r12.f(false);
                r12.a(5.0);
                r12.d(22.0);
            }
            if (r12.ac() == null || !r12.ac().G()) continue;
            r12.ac().F();
        }
        zu_0.a(null);
    }

    public r1 a(String string) {
        for (r1 r12 : this.d()) {
            if (!r12.X().E().equalsIgnoreCase(string)) continue;
            return r12;
        }
        return null;
    }

    public List<r1> d() {
        return this.q;
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        jsonArray = jsonArray.get(0).getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                JsonObject jsonObject;
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("title") == null || jsonObject.get("title").isJsonNull()) continue;
                for (we_0 we_02 : zu_0.T()) {
                    if (!we_02.ad().equals(jsonObject.get("title").getAsString())) continue;
                    we_02.a(jsonObject);
                }
                r1 r12 = this.a(jsonObject.get("title").getAsString());
                if (r12 == null) continue;
                r12.a(jsonObject);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public JsonArray e() {
        JsonArray jsonArray = new JsonArray();
        if (zu_0.T.ab()) {
            for (we_0 we_02 : zu_0.T()) {
                jsonArray.add((JsonElement)we_02.l());
            }
        } else {
            for (r1 r12 : this.d()) {
                jsonArray.add((JsonElement)r12.ak());
            }
        }
        return jsonArray;
    }

    static {
        d = new rm_0();
        p = new rX();
        r = new rB();
        i = new rs_0();
        j = new r8();
    }
}

