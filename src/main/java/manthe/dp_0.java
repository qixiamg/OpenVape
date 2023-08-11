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
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from manthe.Dp
 */
public class dp_0
extends DP<rb_0> {
    public static final Color q = new Color(0, 170, 0);
    public static final Color o = new Color(170, 170, 170);
    public static final Color r = new Color(170, 0, 0);
    private final Color n;
    private final List<rb_0> p = new ArrayList<rb_0>();
    private final HashMap<rb_0, rf_0> m = new HashMap();
    protected r6 s;

    private dp_0(Object object, String string, Color color, rh_0 rh_02) {
        super(object, string, rh_02);
        this.n = color;
    }

    public static dp_0 a(Object object, String string, String string2, Color color, String ... stringArray) {
        return dp_0.a(object, string, string2, "List of Names/Strings", color, Arrays.asList(stringArray));
    }

    public static dp_0 a(Object object, String string, String string2, String string3, Color color, List<String> list) {
        rh_0 rh_02 = new rh_0(string2);
        rh_02.b(10.0);
        dp_0 dp_02 = new dp_0(object, string, color, rh_02);
        rh_02.a(dp_02);
        dp_0.a(rh_02, dp_02, string3);
        for (String string4 : list) {
            dp_02.c(string4);
        }
        dp_02.setType(new ArrayList<rb_0>(dp_02.t()));
        return dp_02;
    }

    private static void a(rh_0 rh_02, dp_0 dp_02, String string) {
        r0 r02 = new r0(dp_02, string, "<name / string>", 0, false);
        rh_02.a(r02);
    }

    public Color r() {
        return this.n;
    }

    public List<rb_0> t() {
        return this.p;
    }

    @Override
    public void setType(List<rb_0> list) {
        ArrayList<rb_0> arrayList = new ArrayList<rb_0>(this.p);
        this.p.clear();
        for (rb_0 rb_02 : arrayList) {
            this.a(rb_02);
        }
        for (rb_0 rb_02 : list) {
            this.c(rb_02.V());
        }
    }

    @Override
    public void setTypeByString(String string) {
    }

    public rb_0 c(String string) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(95.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 5, 0, 0)));
        rb_0 rb_02 = new rb_0(rf_02, string, this);
        this.t().add(rb_02);
        this.s.d(rf_02);
        this.m.put(rb_02, rf_02);
        return rb_02;
    }

    @Override
    public void a(rb_0 rb_02) {
        try {
            this.t().remove(rb_02);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.m.containsKey(rb_02)) {
            this.s.A().a((p1)this.m.get(rb_02));
        }
    }

    @Override
    public boolean isCorrectValue(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.getValueName())) {
            if (jsonObject.get("value").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();
                ArrayList<rb_0> arrayList = new ArrayList<rb_0>(this.t());
                for (rb_0 rb_02 : arrayList) {
                    this.a(rb_02);
                }
                for (rb_0 rb_02 : jsonArray) {
                    try {
                        rb_0 rb_03 = this.c("");
                        rb_03.a(rb_02.getAsJsonObject());
                    }
                    catch (Exception exception) {}
                }
            }
            return true;
        }
        return super.isCorrectValue(jsonObject);
    }

    @Override
    public JsonObject getJson() {
        JsonObject jsonObject = super.getJson();
        JsonArray jsonArray = new JsonArray();
        for (rb_0 rb_02 : this.t()) {
            jsonArray.add((JsonElement)rb_02.H());
        }
        jsonObject.add("value", (JsonElement)jsonArray);
        return jsonObject;
    }

    public boolean d(String string) {
        for (rb_0 rb_02 : this.t()) {
            if (!rb_02.G() || !rb_02.V().equalsIgnoreCase(string)) continue;
            return true;
        }
        return this.t().isEmpty();
    }

    public List<String> s() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (rb_0 rb_02 : this.t()) {
            if (!rb_02.G()) continue;
            arrayList.add(rb_02.V());
        }
        return arrayList;
    }

    public rb_0 b(String string, int n6) {
        return this.c(string);
    }

    @Override
    public void a(r6 r62) {
        this.s = r62;
    }
}

