/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import rip.vape.value.BasicValue;

import java.util.Random;

/*
 * Renamed from manthe.Dy
 */
public class dy_0 extends BasicValue<Double[], sk_0> {
    private final Random l = new Random();

    public dy_0(Object object, String string, sk_0 sk_02) {
        super(object, string, sk_02);
    }

    public static dy_0 createValue(Object object, String string, String string2, String string3, String string4, double d3, double d4, double d5, double d6, double d7) {
        sk_0 sk_02 = new sk_0(d6, d3, d7, string3, string4, string2);
        sk_02.b(7.0);
        sk_02.f(d5);
        sk_02.h(d4);
        dy_0 dy_02 = new dy_0(object, string, sk_02);
        dy_02.setType(new Double[]{d4, d5});
        sk_02.a(dy_02);
        return dy_02;
    }

    public static dy_0 createValue(Object object, String string, String string2, String string3, double d3, double d4, double d5, double d6) {
        sk_0 sk_02 = new sk_0(d6, d3, 0.1, string2, " " + string3, string);
        sk_02.b(7.0);
        sk_02.f(d5);
        sk_02.h(d4);
        dy_0 dy_02 = new dy_0(object, string, sk_02);
        dy_02.setType(new Double[]{d4, d5});
        sk_02.a(dy_02);
        return dy_02;
    }

    public static dy_0 createValue(Object object, String string, String string2, String string3, double d3, double d4, double d5, double d6, double d7) {
        sk_0 sk_02 = new sk_0(d6, d3, d7, string2, " " + string3, string);
        sk_02.b(7.0);
        sk_02.f(d5);
        sk_02.h(d4);
        dy_0 dy_02 = new dy_0(object, string, sk_02);
        dy_02.setType(new Double[]{d4, d5});
        sk_02.a(dy_02);
        return dy_02;
    }

    public static dy_0 createValue(Object object, String string, String string2, String string3, double d3, double d4, double d5, double d6, double d7, String string4) {
        sk_0 sk_02 = new sk_0(d6, d3, d7, string2, " " + string3, string);
        sk_02.b(7.0);
        sk_02.f(d5);
        sk_02.h(d4);
        dy_0 dy_02 = new dy_0(object, string, sk_02);
        sk_02.a(dy_02);
        dy_02.setType(new Double[]{d4, d5});
        sk_02.b(string4);
        return dy_02;
    }

    public Double[] v() {
        return new Double[]{((sk_0)this.getDefaultValue()).F(), ((sk_0)this.getDefaultValue()).z()};
    }

    @Override
    public void setType(Double[] doubleArray) {
        if (this.b() == null) {
            this.setType(doubleArray);
        }
        boolean bl = true;
        if (this.s() == ((Double[])this.b())[0].doubleValue() && this.w() == ((Double[])this.b())[1].doubleValue()) {
            bl = false;
        }
        if (bl) {
            ((sk_0)this.getDefaultValue()).h(doubleArray[0]);
            ((sk_0)this.getDefaultValue()).f(doubleArray[1]);
        } else {
            ((sk_0)this.getDefaultValue()).g(doubleArray[0]);
            ((sk_0)this.getDefaultValue()).i(doubleArray[1]);
        }
        this.d();
    }

    @Override
    public void setTypeByString(String string) {
    }

    @Override
    public JsonObject getJson() {
        JsonObject jsonObject = super.getJson();
        jsonObject.remove("value");
        jsonObject.addProperty("minimum", (Number)this.v()[0]);
        jsonObject.addProperty("maximum", (Number)this.v()[1]);
        return jsonObject;
    }

    @Override
    public boolean isCorrectValue(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.getValueName())) {
            if (!jsonObject.has("minimum")) {
                return false;
            }
            double d3 = jsonObject.get("minimum").getAsDouble();
            double d4 = jsonObject.get("maximum").getAsDouble();
            this.setType(new Double[]{d3, d4});
            return true;
        }
        return false;
    }

    public String r() {
        return ((sk_0)this.getDefaultValue()).B().b(this.v()[0]);
    }

    public String u() {
        return ((sk_0)this.getDefaultValue()).B().b(this.v()[1]);
    }

    public double t() {
        double d3 = this.v()[0];
        double d4 = this.v()[1];
        return d3 + (d4 - d3) * this.l.nextDouble();
    }

    public double s() {
        return this.v()[0];
    }

    public double w() {
        return this.v()[1];
    }
}

