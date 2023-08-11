/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import rip.vape.value.BasicValue;

import java.util.List;

public class Dv
extends BasicValue<List<U>, rF> {
    private final rF m;
    private xy_0 l;

    public Dv(Object object, String string, rF rF2) {
        super(object, string, rF2);
        this.m = rF2;
    }

    public static Dv a(Object object, String string) {
        return new Dv(object, string, new rF());
    }

    public List<U> r() {
        return this.l.N().n();
    }

    @Override
    public void setType(List<U> list) {
    }

    @Override
    public void setTypeByString(String string) {
    }

    @Override
    public void a(xy_0 xy_02) {
        this.l = xy_02;
    }

    @Override
    public JsonObject getJson() {
        JsonObject jsonObject = this.l.K();
        jsonObject.addProperty("id", this.getValueName());
        return jsonObject;
    }

    @Override
    public boolean isCorrectValue(JsonObject jsonObject) {
        this.l.a(jsonObject);
        return true;
    }
}

