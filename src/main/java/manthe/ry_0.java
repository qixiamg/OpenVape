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
import java.util.HashMap;
import java.util.List;
import manthe.D7;
import manthe.U;
import manthe.ch_0;
import manthe.on;
import manthe.pd;
import manthe.qJ;
import manthe.r3;
import manthe.rF;
import manthe.rM;
import manthe.rf_0;
import manthe.rg_0;

/*
 * Renamed from manthe.ry
 */
public class ry_0
extends rf_0 {
    private final List<U> J;
    private final HashMap<U, rM> K = new HashMap();
    private boolean I;

    public ry_0(rF rF2, List<U> list) {
        super(false);
        this.j(false);
        this.J = list;
        this.b(on.p.t().r.K());
        this.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 1, 0)));
        rg_0 rg_02 = new rg_0("x", false);
        rg_02.b(10.0);
        rg_02.c(8.0);
        rg_02.j(false);
        rg_02.a(new ch_0(this, rF2));
        r3 r32 = new r3(this, true, list);
        r32.b(10.0);
        r32.c(65.0);
        r32.a(new qJ(this, rF2));
        this.b(r32);
        this.b(rg_02);
    }

    public List<U> a() {
        return this.J;
    }

    public void a(List<U> list) {
        this.J.clear();
        for (int i = 0; i < 9; ++i) {
            U u6 = list.get(i);
            this.J.add(u6);
            this.K.put(u6, new rM(0, false).a(u6));
        }
    }

    public void d(boolean bl) {
        this.I = bl;
    }

    private JsonObject x() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (U u6 : this.J) {
            jsonArray.add((JsonElement)u6.b());
        }
        jsonObject.add("hotbars", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonArray("hotbars");
        int n6 = jsonArray.size();
        for (int i = 0; i < n6; ++i) {
            JsonObject jsonObject2 = jsonArray.get(i).getAsJsonObject();
            this.a().get(i).a(jsonObject2);
        }
    }

    static JsonObject a(ry_0 ry_02) {
        return ry_02.x();
    }

    static boolean b(ry_0 ry_02) {
        return ry_02.I;
    }
}

