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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pV {
    private final List<Class<? extends Object>> c = Arrays.asList(Module.class, y8.class, ya_0.class, rC.class);
    private final List<Class<? extends Object>> a = Arrays.asList(zu_0.class);
    private final List<BasicValue> b = new ArrayList<BasicValue>();

    public void a(BasicValue ds_02) {
        this.b.add(ds_02);
    }

    public List<BasicValue> a() {
        return this.b;
    }

    public void a(JsonArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("id") == null || jsonObject.get("id").isJsonNull()) continue;
            for (BasicValue ds_02 : this.a()) {
                if (!this.a.contains(ds_02.getBase().getClass().getSuperclass()) && !this.a.contains(ds_02.getBase().getClass()) && this.c.contains(ds_02.getBase().getClass().getSuperclass()) || this.c.contains(ds_02.getBase().getClass()) || !ds_02.getValueName().equalsIgnoreCase(jsonObject.get("id").getAsString())) continue;
                ds_02.isCorrectValue(jsonObject);
            }
            for (BasicValue ds_02 : on.p.T().b()) {
                if (!ds_02.getValueName().equalsIgnoreCase(jsonObject.get("id").getAsString()) || on.p.L()) continue;
                ds_02.isCorrectValue(jsonObject);
            }
        }
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (BasicValue ds_02 : this.a()) {
            if (this.c.contains(ds_02.getBase().getClass()) || !ds_02.f()) continue;
            jsonArray.add((JsonElement)ds_02.getJson());
        }
        for (BasicValue ds_02 : on.p.T().b()) {
            if (!ds_02.f()) continue;
            jsonArray.add((JsonElement)ds_02.getJson());
        }
        return jsonArray;
    }
}

