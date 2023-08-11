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
import java.util.List;

public class DD
extends DP<mD> {
    public static final Color m = new Color(0, 170, 0);
    public static final Color r = new Color(170, 170, 170);
    public static final Color n = new Color(170, 0, 0);
    private final Color q;
    private final int p;
    protected r6 s;
    private List<mD> o = new ArrayList<mD>();

    private DD(Object object, String string, Color color, int n6, rh_0 rh_02) {
        super(object, string, rh_02);
        this.q = color;
        this.p = n6;
    }

    public static DD a(Object object, String string, String string2, Color color, List<mD> list) {
        return DD.a(object, string, string2, color, -1, list);
    }

    public static DD a(Object object, String string, String string2, Color color, mD ... mDArray) {
        return DD.a(object, string, string2, color, -1, Arrays.asList(mDArray));
    }

    public static DD a(Object object, String string, String string2, Color color, int n6, List<mD> list) {
        rh_0 rh_02 = new rh_0(string2);
        rh_02.b(10.0);
        DD dD = new DD(object, string, color, n6, rh_02);
        dD.setType(list);
        rh_02.a(dD);
        DD.a(rh_02, dD, n6 != -1);
        dD.o.addAll(list);
        return dD;
    }

    private static void a(rh_0 rh_02, DD dD, boolean bl) {
        r0 r02 = new r0(dD, "Common item names: hand, swords, shovels, axes, pickaxes, blocks, slot[1-9]", "<item name / id>", dD.t(), bl);
        rh_02.a(r02);
    }

    public Color r() {
        return this.q;
    }

    public List<mD> s() {
        return this.o;
    }

    @Override
    public void setType(List<mD> list) {
        this.o = list;
    }

    @Override
    public void setTypeByString(String string) {
    }

    public mD b(String string, int n6) {
        return this.b(new mD(string, n6));
    }

    public mD b(mD mD2) {
        this.s().add(mD2);
        if (this.p == -1) {
            mD2.b(-1);
        }
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(95.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 5, 0, 0)));
        new ro_0(rf_02, mD2, this);
        this.s.d(rf_02);
        return mD2;
    }

    @Override
    public void a(r6 r62) {
        this.s = r62;
    }

    @Override
    public void a(mD mD2) {
        try {
            this.s().remove(mD2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        p1 p12 = null;
        block2: for (p1 p13 : this.s.A().v()) {
            if (!(p13 instanceof rf_0)) continue;
            rf_0 rf_02 = (rf_0)p13;
            for (p1 p14 : rf_02.v()) {
                ro_0 ro_02;
                if (!(p14 instanceof ro_0) || !(ro_02 = (ro_0)p14).H().equals(mD2) && !ro_02.H().d().equalsIgnoreCase(mD2.d())) continue;
                p12 = p13;
                continue block2;
            }
        }
        if (p12 != null) {
            this.s.A().a(p12);
        }
    }

    @Override
    public boolean isCorrectValue(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.getValueName())) {
            if (jsonObject.get("value").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();
                ArrayList<mD> arrayList = new ArrayList<mD>(this.s());
                for (mD mD2 : arrayList) {
                    this.a(mD2);
                }
                for (mD mD2 : jsonArray) {
                    try {
                        mD mD3 = new mD("", -1);
                        mD3.a(mD2.getAsJsonObject());
                        this.b(mD3);
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
        for (mD mD2 : this.s()) {
            jsonArray.add((JsonElement)mD2.g());
        }
        jsonObject.add("value", (JsonElement)jsonArray);
        return jsonObject;
    }

    public boolean a(fG fG2, boolean bl) {
        if (bl && this.o.isEmpty()) {
            return false;
        }
        for (mD mD2 : this.s()) {
            if (!mD2.a(fG2)) continue;
            return true;
        }
        return false;
    }

    public boolean a(fG fG2) {
        return this.a(fG2, false);
    }

    public boolean c(String string) {
        boolean bl = true;
        for (mD mD2 : this.o) {
            if (!mD2.c()) continue;
            if (mD2.d().toLowerCase().equals(string.toLowerCase())) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public mD d(String string) {
        for (mD mD2 : this.o) {
            if (!mD2.d().toLowerCase().equals(string.toLowerCase())) continue;
            return mD2;
        }
        return null;
    }

    public int t() {
        return this.p;
    }
}

