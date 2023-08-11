/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.List;

public class AL {
    private final List<Module> a = new ArrayList<Module>();

    public AL() {
        cr_0 cr_02 = on.p.H();
        this.a(cr_02.b(z1.class));
        this.a(cr_02.b(zf_0.class));
        this.a(cr_02.b(zZ.class));
        this.a(cr_02.b(zi_0.class));
    }

    public List<Module> b() {
        return this.a;
    }

    private void a(Module y52) {
        if (this.a.contains(y52)) {
            return;
        }
        this.a.add(y52);
        y52.getRuntimeCopyException(true);
    }

    public void b(Module y52) {
        if (this.a.contains(y52)) {
            return;
        }
        this.a.add(y52);
        y52.getRuntimeCopyException(true);
        w0.ar();
    }

    public void c(Module y52) {
        this.a.remove(y52);
        y52.getRuntimeCopyException(false);
        w0.ar();
    }

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (Module y52 : this.a) {
            jsonArray.add((JsonElement)new JsonPrimitive(y52.H()));
        }
        jsonObject.add("modules", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.has("modules")) {
            this.a.clear();
            JsonArray jsonArray = jsonObject.get("modules").getAsJsonArray();
            for (JsonElement jsonElement : jsonArray) {
                Module y52 = on.p.H().a(jsonElement.getAsString());
                this.a(y52);
            }
        }
    }
}

