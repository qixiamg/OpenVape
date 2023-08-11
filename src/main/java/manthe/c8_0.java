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
import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from manthe.c8
 */
public class c8_0 {
    private final List<BasicValue> a = new ArrayList<BasicValue>();

    public void a(BasicValue ds_02) {
        this.a.add(ds_02);
    }

    public JsonArray a() {
        JsonArray jsonArray = new JsonArray();
        for (BasicValue ds_02 : this.a) {
            jsonArray.add((JsonElement)ds_02.getJson());
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("enemies", (JsonElement)on.p.b().b());
        jsonArray.add((JsonElement)jsonObject);
        return jsonArray;
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.get("id") != null && !jsonObject.get("id").isJsonNull()) {
                for (BasicValue ds_02 : this.a) {
                    if (!ds_02.getValueName().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                    ds_02.isCorrectValue(jsonObject);
                }
            }
            if (jsonObject.get("enemies") == null || jsonObject.get("enemies").isJsonNull()) continue;
            JsonArray jsonArray2 = jsonObject.get("enemies").getAsJsonArray();
            on.p.b().a(jsonArray2);
        }
    }

    public List<BasicValue> b() {
        return this.a;
    }
}

