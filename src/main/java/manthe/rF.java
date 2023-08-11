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
import java.util.ArrayList;
import java.util.List;
import manthe.D7;
import manthe.U;
import manthe.p1;
import manthe.pd;
import manthe.qr_0;
import manthe.rf_0;
import manthe.rg_0;
import manthe.ry_0;

public class rF
extends rf_0 {
    private final rf_0 J;
    private final List<ry_0> I = new ArrayList<ry_0>();
    private ry_0 K;

    public rF() {
        super(false);
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, -1, 0, 0)));
        this.J = new rf_0(false);
        this.J.a(new D7(1.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.J.b(50.0);
        this.J.c(72.0);
        rg_0 rg_02 = new rg_0("+", true);
        rg_02.j(false);
        rg_02.b(c);
        rg_02.b(8.0);
        rg_02.c(72.0);
        rg_02.a(new qr_0(this));
        this.b(this.J);
        this.b(rg_02);
        this.x();
    }

    private List<U> z() {
        ArrayList<U> arrayList = new ArrayList<U>();
        for (int i = 0; i < 9; ++i) {
            U u6 = new U(0);
            arrayList.add(u6);
        }
        return arrayList;
    }

    public ry_0 a(List<U> list) {
        ry_0 ry_02 = new ry_0(this, list);
        this.I.add(ry_02);
        this.J.b(ry_02);
        if (this.K == null) {
            this.b(ry_02);
        }
        return ry_02;
    }

    private void a(ry_0 ry_02) {
        this.I.remove(ry_02);
        this.J.a((p1)ry_02);
    }

    public ry_0 y() {
        return this.K;
    }

    public void b(ry_0 ry_02) {
        this.K = ry_02;
        for (ry_0 ry_03 : this.I) {
            if (ry_03.equals(ry_02)) continue;
            ry_03.d(false);
        }
        ry_02.d(true);
    }

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (ry_0 ry_02 : this.I) {
            jsonArray.add((JsonElement)ry_0.a(ry_02));
        }
        if (this.K == null) {
            jsonObject.addProperty("selected", (Number)0);
        } else {
            jsonObject.addProperty("selected", (Number)this.I.indexOf(this.K));
        }
        jsonObject.add("panels", (JsonElement)jsonArray);
        return jsonObject;
    }

    private void x() {
        this.a(this.z());
        this.b(this.I.get(0));
    }

    public void a(JsonObject jsonObject) {
        ArrayList<ry_0> arrayList = new ArrayList<ry_0>();
        arrayList.addAll(this.I);
        for (ry_0 ry_02 : arrayList) {
            this.a(ry_02);
        }
        if (!jsonObject.has("panels")) {
            this.x();
            return;
        }
        JsonArray jsonArray = jsonObject.get("panels").getAsJsonArray();
        int n6 = jsonObject.get("selected").getAsInt();
        int n10 = jsonArray.size();
        for (int i = 0; i < n10; ++i) {
            ry_0 ry_03 = new ry_0(this, this.z());
            ry_03.a(jsonArray.get(i).getAsJsonObject());
            this.I.add(ry_03);
            this.J.b(ry_03);
        }
        if (this.I.isEmpty()) {
            this.x();
        } else {
            this.b(this.I.get(n6));
        }
    }

    static List a(rF rF2) {
        return rF2.z();
    }

    static void a(rF rF2, ry_0 ry_02) {
        rF2.a(ry_02);
    }
}

