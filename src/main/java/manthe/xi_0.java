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
import java.util.List;
import manthe.U;
import manthe.fG;
import manthe.pc;
import manthe.pe_0;
import manthe.uW;
import manthe.wE;
import manthe.wM;
import manthe.wh_0;
import manthe.xy_0;
import manthe.zu_0;

/*
 * Renamed from manthe.xi
 */
public class xi_0
extends wM {
    private wh_0 A = new wh_0("newclose");
    private List<U> C;
    private xy_0 z;
    private static String[] B;

    public xi_0(xy_0 xy_02, List<U> list) {
        this.C = list;
        this.z = xy_02;
        this.a(this.A);
    }

    @Override
    public void a() {
        boolean bl = this.z.N() != null && this.n().equals(this.z.N().n());
        pe_0.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, bl ? xi_0.b.t : xi_0.b.m);
        double d3 = this.d() + 10.0;
        for (U u6 : this.C) {
            double d4 = 9.0;
            pe_0.c(d3, this.c() + this.f() / 2.0 - d4 / 2.0, 8.5, d4, xi_0.b.u);
            fG fG2 = u6.a();
            if (fG2 != null && fG2.d()) {
                pe_0.a(fG2, 0.5, d3, this.c() + this.f() / 2.0 - 4.0);
            }
            d3 += 9.0;
        }
        this.A.c(this.d() + this.e() - 10.0 - 8.0);
        this.A.a(this.c());
        this.A.d(this.f());
    }

    public xi_0 a(pc pc2) {
        this.A.c(pc2);
        return this;
    }

    public JsonObject l() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (U u6 : this.C) {
            jsonArray.add((JsonElement)u6.b());
        }
        jsonObject.add("hotbars", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonArray("hotbars");
        int n6 = jsonArray.size();
        for (int i = 0; i < n6; ++i) {
            JsonObject jsonObject2 = jsonArray.get(i).getAsJsonObject();
            this.n().get(i).a(jsonObject2);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
        zu_0.b(wE.class).a(this);
        if (this.z.N().equals(this)) {
            zu_0.a(wE.class);
        }
        this.z.a(this);
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 15.0;
    }

    public List<U> n() {
        return this.C;
    }

    public void a(List<U> list) {
        this.C = list;
    }

    public static void b(String[] stringArray) {
        B = stringArray;
    }

    public static String[] m() {
        return B;
    }

    static {
        if (xi_0.m() != null) {
            xi_0.b(new String[5]);
        }
    }
}

