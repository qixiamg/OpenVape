/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rB
extends r1 {
    private final rl_0 ah = new rl_0("Profile preview", my_0.i, 0.7);
    private final Module[] ai = new Module[]{on.p.H().b(z1.class), on.p.H().b(zf_0.class), on.p.H().b(zZ.class), on.p.H().b(zi_0.class), on.p.H().b(zN.class), on.p.H().b(yF.class), on.p.H().b(yX.class), on.p.H().b(zO.class), on.p.H().b(z3.class)};
    private final boolean[] ae = new boolean[this.ai.length];
    private rf_0 aj;
    private r6 ag;
    private ak_0 af;

    public rB() {
        super("viewer", false);
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.am();
        this.c(90.0);
        this.b(200.0);
        this.a(new yK(this));
    }

    private void am() {
        this.aj = new rf_0(false);
        this.aj.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 0)));
        this.d(this.aj);
        this.ah.c(65.0);
        this.ah.b(12.0);
        this.aj.b(this.ah);
        this.ag = new r6(false);
        this.ag.c(80.0);
        this.ag.b(210.0);
        this.d(this.ag);
    }

    @Override
    public void c() {
        this.a(this.af != null);
        this.d(false);
        this.f(false);
        this.Z().a(false);
        this.a(ng.d.t() - this.q());
        this.d(ng.d.k());
        this.ag.b(198.0);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void a(ak_0 ak_02) {
        this.af = ak_02;
        if (ak_02 == null) {
            return;
        }
        this.ag.A().J();
        this.ah.a(ak_02.r());
        String string = new String(Bx.a(a.gp(ak_02.l().toString())));
        if (string.length() == 0) {
            return;
        }
        JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
        jsonReader.setLenient(true);
        JsonElement jsonElement = (JsonElement)new Gson().fromJson(jsonReader, JsonElement.class);
        if (jsonElement == null || jsonElement.isJsonNull() || !jsonElement.isJsonArray()) {
            return;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() == 0) {
            return;
        }
        JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
        this.b(jsonObject);
    }

    public void b(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject.get("data").getAsJsonObject();
        JsonArray jsonArray = jsonObject2.get("modules").getAsJsonArray();
        int n6 = 0;
        for (Module y52 : this.ai) {
            try {
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    try {
                        JsonElement jsonElement = (JsonElement)iterator.next();
                        JsonObject jsonObject3 = jsonElement.getAsJsonObject();
                        String string = jsonObject3.get("name").getAsString();
                        if (!string.equals(y52.H())) continue;
                        this.a(y52, jsonObject3.get("values").getAsJsonArray(), n6);
                    }
                    catch (Exception exception) {}
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n6;
        }
    }

    private void a(Module y52, JsonArray jsonArray, int n6) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.b(c);
        rf_02.j(false);
        rf_02.a(new D3(0.0, 4.0, 5000, 1, new pd(0, 2, 0, 2)));
        rf_02.b(15.0);
        rf_02.c(80.0);
        rf_0 rf_03 = new rf_0(false);
        rf_03.a(new D3(0.0, 4.0, 5000, 1, new pd(1, 0, 1, 0)));
        rf_03.c(80.0);
        rf_03.b(15.0);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<p1> arrayList2 = new ArrayList<p1>();
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String string = jsonObject.get("id").getAsString();
            if (arrayList.contains(string)) continue;
            for (BasicValue ds_02 : y52.r()) {
                if (ds_02.getBaseValue() != null || !string.equals(ds_02.getValueName())) continue;
                this.a(arrayList2, ds_02, jsonObject, jsonArray);
                break;
            }
            arrayList.add(string);
        }
        sQ sQ2 = new sQ(n6, y52.H(), arrayList2);
        if (this.ae[n6]) {
            ((sI)sQ2).F();
        }
        sQ2.W().e(true);
        sQ2.V().e(true);
        sQ2.c(80.0);
        sQ2.b(12.0);
        rf_02.b(sQ2);
        rf_03.b(rf_02);
        this.ag.d(rf_03);
    }

    private void a(List<p1> list, BasicValue ds_02, JsonObject jsonObject, JsonArray jsonArray) {
        double d3;
        BasicValue ds_03;
        if (ds_02 instanceof dy_0) {
            ds_03 = (dy_0)ds_02;
            d3 = jsonObject.get("minimum").getAsDouble();
            double d4 = jsonObject.get("maximum").getAsDouble();
            sk_0 object = new sk_0(((sk_0)ds_03.getDefaultValue()).W(), ((sk_0)ds_03.getDefaultValue()).E(), 0.1, "#.#", "", ds_03.H());
            object.b(on.p.t().r.K());
            object.b(true);
            dy_0 dy_02 = new dy_0((Object)null, ds_02.getValueName(), object);
            dy_02.setType(new Double[]{d3, d4});
            object.a(dy_02);
            object.h(d3);
            object.f(d4);
            object.c(78.0);
            object.b(7.0);
            list.add(object);
        }
        if (ds_02 instanceof DF) {
            ds_03 = (DF)ds_02;
            d3 = jsonObject.get("value").getAsDouble();
            sV sV2 = new sV(((sV)ds_03.getDefaultValue()).C(), ((sV)ds_03.getDefaultValue()).D(), "#.#", "", ds_03.H());
            sV2.b(on.p.t().r.K());
            sV2.b(true);
            DF dF = new DF((Object)null, ds_02.getValueName(), sV2);
            dF.b(d3);
            sV2.a(dF);
            sV2.f(d3);
            sV2.c(78.0);
            sV2.b(7.0);
            list.add(sV2);
        }
        if (ds_02 instanceof BooleanValue) {
            ds_03 = (BooleanValue)ds_02;
            boolean bl = jsonObject.get("value").getAsBoolean();
            qD qD2 = new qD(ds_02.getValueName(), 10.0);
            qD2.b(true);
            qD2.b(on.p.t().r.K());
            BooleanValue dB = new BooleanValue((Object)null, ds_02.getValueName(), qD2);
            dB.setType((Boolean)bl);
            qD2.a(dB);
            qD2.b(10.0);
            list.add(qD2);
            if (bl) {
                for (BasicValue ds_04 : ((DR)ds_03).getValues()) {
                    for (JsonElement jsonElement : jsonArray) {
                        JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                        String string = jsonObject2.get("id").getAsString();
                        if (!string.equals(ds_04.getValueName())) continue;
                        this.a(list, ds_04, jsonObject2, jsonArray);
                    }
                }
            }
        }
    }

    public ak_0 al() {
        return this.af;
    }

    static boolean[] a(rB rB2) {
        return rB2.ae;
    }
}

