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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import manthe.ng;
import manthe.wF;
import manthe.yU;
import manthe.ya_0;
import manthe.yu_0;

/*
 * Renamed from manthe.v
 */
public class v_0 {
    private final Set<ya_0> a = new HashSet<ya_0>();

    public void a(ya_0 ya_02) {
        this.a.add(ya_02);
        ng.o.c(ya_02);
        wF.V.b(ya_02);
    }

    public void b(ya_0 ya_02) {
        this.a.remove(ya_02);
        ng.o.b(ya_02);
        wF.V.a(ya_02);
    }

    public ya_0 a(String string) {
        for (ya_0 ya_02 : this.a) {
            if (!ya_02.l().equalsIgnoreCase(string)) continue;
            return ya_02;
        }
        return null;
    }

    public ya_0 b(int n6) {
        for (ya_0 ya_02 : this.a) {
            if (ya_02.n() != n6) continue;
            return ya_02;
        }
        return null;
    }

    public List<ya_0> a(int n6) {
        ArrayList<ya_0> arrayList = new ArrayList<ya_0>();
        for (ya_0 ya_02 : this.a) {
            if (ya_02.n() != n6) continue;
            arrayList.add(ya_02);
        }
        return arrayList;
    }

    private void a() {
        for (ya_0 ya_02 : new HashSet<ya_0>(this.a)) {
            this.b(ya_02);
        }
    }

    public void a(JsonArray jsonArray) {
        this.a();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("name") == null || jsonObject.get("name").isJsonNull()) continue;
            String string = jsonObject.get("name").getAsString();
            ya_0 ya_02 = string.startsWith("/") ? new yU(string) : (string.equalsIgnoreCase("fishing rod") ? new yu_0(string) : new ya_0(string));
            ya_02.a(jsonObject);
            this.a(ya_02);
        }
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (ya_0 ya_02 : this.a) {
            jsonArray.add((JsonElement)ya_02.r());
        }
        return jsonArray;
    }
}

