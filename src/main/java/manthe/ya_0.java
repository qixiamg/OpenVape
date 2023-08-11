/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from manthe.ya
 */
public class ya_0
extends yt_0 {
    private String g;
    private int j = 0;
    private dy_0 i = dy_0.createValue(this, "Delay", "#", "", 1.0, 100.0, 200.0, 1000.0, 1.0);
    private BooleanValue doubleClick = BooleanValue.createValue(this, "Double Click", false);
    private dy_0 e = dy_0.createValue(this, "Double Click\nDelay", "#", "", 1.0, 100.0, 200.0, 1000.0);
    private rf_0 h;
    private static int[] f;

    public ya_0(String string) {
        this.g = string;
        this.doubleClick.t().add(this.e);
    }

    public String l() {
        return this.g;
    }

    public int n() {
        return this.j;
    }

    public void d(int n6) {
        this.j = n6;
    }

    public dy_0 m() {
        return this.i;
    }

    public void a(dy_0 dy_02) {
        this.i = dy_02;
    }

    public dy_0 k() {
        return this.e;
    }

    public void b(dy_0 dy_02) {
        this.e = dy_02;
    }

    public BooleanValue q() {
        return this.doubleClick;
    }

    public void a(BooleanValue dB) {
        this.doubleClick = dB;
    }

    public JsonObject r() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.g);
        jsonObject.addProperty("key", this.j);
        jsonObject.add("delay", this.i.getJson());
        jsonObject.add("double_click_enabled", this.doubleClick.getJson());
        jsonObject.add("double_click", this.e.getJson());
        return jsonObject;
    }

    public ya_0 a(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.g = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("key") != null && !jsonObject.get("key").isJsonNull()) {
            this.a(Collections.singletonList(jsonObject.get("key").getAsInt()));
        }
        if (jsonObject.get("double_click_enabled") != null && !jsonObject.get("double_click_enabled").isJsonNull()) {
            this.doubleClick.isCorrectValue(jsonObject.get("double_click_enabled").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("delay").isJsonNull()) {
            this.i.isCorrectValue(jsonObject.get("delay").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("double_click").isJsonNull()) {
            this.e.isCorrectValue(jsonObject.get("double_click").getAsJsonObject());
        }
        return this;
    }

    public rf_0 p() {
        return this.h;
    }

    public void a(rf_0 rf_02) {
        this.h = rf_02;
    }

    @Override
    public void h() {
    }

    @Override
    public String g() {
        return String.format(" %s7[%sr%s%s7]%sr %s", cb_0.v, cb_0.v, this.b(this.j), cb_0.v, cb_0.v, this.l());
    }

    @Override
    public void a(List<Integer> list) {
        if (list.isEmpty()) {
            this.j = 0;
            return;
        }
        this.j = list.get(0);
        super.a(Collections.singletonList(this.j));
    }

    @Override
    public boolean j() {
        return false;
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    public static int[] o() {
        return f;
    }

    static {
        if (ya_0.o() != null) {
            ya_0.b(new int[2]);
        }
    }
}

