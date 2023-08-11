/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;
import java.util.UUID;
import manthe.Bx;
import manthe.ak_0;
import manthe.on;
import manthe.sM;
import manthe.vK;

class DZ
implements vK {
    final sM a;

    DZ(sM sM2) {
        this.a = sM2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        ak_0 ak_02 = on.p.l().a(sM.a(this.a).l());
        String string = new String(Bx.a(a.a.gp(sM.a(this.a).l().toString())));
        if (string.length() == 0) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            JsonObject jsonObject2 = jsonObject.get("profiles").getAsJsonObject();
            Map.Entry entry = (Map.Entry)jsonObject2.entrySet().iterator().next();
            String string2 = (String)entry.getKey();
            JsonObject jsonObject3 = jsonObject2.get(string2).getAsJsonObject();
            jsonObject3.addProperty("is_public", Boolean.valueOf(false));
            jsonObject3.addProperty("uuid", UUID.randomUUID().toString());
            jsonObject3.addProperty("original_uuid", string2);
            if (ak_02 != null) {
                ak_02.a(jsonObject3);
            } else {
                ak_0 ak_03 = new ak_0("", "");
                ak_03.a(jsonObject3);
                on.p.l().b(ak_03);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }
}

