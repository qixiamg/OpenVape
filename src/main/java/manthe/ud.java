/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import manthe.ak_0;
import manthe.dy_0;
import manthe.ng;
import manthe.on;
import manthe.p1;
import manthe.qp;
import manthe.r1;
import manthe.sV;
import manthe.sk_0;
import manthe.wv_0;
import manthe.zu_0;

public class ud {
    private final List<ak_0> b = new ArrayList<ak_0>();
    private ak_0 a;

    public List<ak_0> d() {
        return this.b;
    }

    public ak_0 a(String string) {
        for (ak_0 ak_02 : this.b) {
            if (!ak_02.r().equalsIgnoreCase(string)) continue;
            return ak_02;
        }
        return null;
    }

    public ak_0 a(UUID uUID) {
        for (ak_0 ak_02 : this.b) {
            if (!ak_02.l().toString().equalsIgnoreCase(uUID.toString())) continue;
            return ak_02;
        }
        return null;
    }

    public ak_0 a() {
        if (this.a == null || !this.d().contains(this.a)) {
            if (this.d().size() > 0) {
                this.c(this.d().get(0));
            } else {
                ak_0 ak_02 = new ak_0("default", "4.06");
                ak_02.B();
                this.b(ak_02);
                this.c(ak_02);
            }
        }
        return this.a;
    }

    public ak_0 c() {
        return this.a;
    }

    public void c(ak_0 ak_02) {
        this.a = ak_02;
        this.a.s();
        on.p.D().c.b(ak_02.r());
    }

    public void b(ak_0 ak_02) {
        this.b.add(ak_02);
        ng.k.a(ak_02);
        ng.p.b(ak_02);
        zu_0.b(wv_0.class).a(ak_02);
    }

    public void a(ak_0 ak_02) {
        this.b.remove(ak_02);
        ng.k.b(ak_02);
        ng.p.a(ak_02);
        zu_0.b(wv_0.class).b(ak_02);
    }

    public void f() {
        this.b.clear();
        ng.k.ae.A().v().clear();
        ng.p.ao().A().v().clear();
        ng.p.am().A().v().clear();
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        if (jsonObject.entrySet().size() == 0) {
            ak_0 ak_02 = new ak_0("default", "4.06");
            ak_02.B();
            this.b(ak_02);
            return;
        }
        for (Map.Entry entry : jsonObject.entrySet()) {
            JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
            ak_0 ak_03 = new ak_0("", "", true).a(jsonObject2);
            this.b(ak_03);
        }
    }

    public JsonObject e() {
        JsonObject jsonObject = new JsonObject();
        for (ak_0 ak_02 : this.d()) {
            jsonObject.add(ak_02.l().toString(), (JsonElement)ak_02.y());
        }
        return jsonObject;
    }

    public int b() {
        int n6 = 0;
        for (ak_0 ak_02 : this.b) {
            if (!ak_02.k()) continue;
            ++n6;
        }
        return n6;
    }

    public void d(ak_0 ak_02) {
        if (this.a() != null) {
            this.a().B();
        }
        this.c(ak_02);
        for (r1 r12 : on.p.F().d()) {
            for (p1 p12 : r12.aj().v()) {
                if (!(p12 instanceof qp)) continue;
                this.a((qp)p12);
            }
        }
        this.c(ak_02);
    }

    private void a(qp qp2) {
        for (p1 p12 : qp2.v()) {
            qp qp3;
            if (p12 instanceof sV && (qp3 = (sV)p12).p() != null) {
                ((sV)qp3).f((Double)qp3.p().n());
                ((sV)qp3).c();
            }
            if (p12 instanceof sk_0 && (qp3 = (sk_0)p12).p() != null) {
                dy_0 dy_02 = (dy_0)qp3.p();
                ((sk_0)qp3).h(dy_02.s());
                ((sk_0)qp3).f(dy_02.w());
                ((sk_0)qp3).c();
            }
            if (!(p12 instanceof qp)) continue;
            this.a((qp)p12);
        }
    }
}

