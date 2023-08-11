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
import java.util.ArrayList;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.DI;
import manthe.Dv;
import manthe.U;
import manthe.cN;
import manthe.uW;
import manthe.wM;
import manthe.wk_0;
import manthe.xi_0;

/*
 * Renamed from manthe.xy
 */
public class xy_0
extends wM {
    private Dv B;
    private wk_0 C = new wk_0();
    private List<xi_0> A = new ArrayList<xi_0>();
    private xi_0 D;
    private static boolean z;

    public xy_0(Dv dv) {
        this.B = dv;
        dv.a(this);
        xy_0 xy_02 = this;
        this.C.c(new cN(this, xy_02));
        this.a(this.C);
    }

    @Override
    public void a() {
        this.o();
        this.C.c(this.d());
        this.C.a(this.c());
        double d3 = this.C.c() + this.C.f();
        for (xi_0 xi_02 : this.m()) {
            xi_02.c(this.d());
            xi_02.a(d3);
            d3 += xi_02.f();
        }
    }

    public void M() {
        this.w().clear();
        this.a(this.C);
        for (xi_0 xi_02 : this.m()) {
            xi_0 xi_03 = xi_02.a(new DI(this, xi_02));
            this.a(new wM[]{xi_03});
        }
        this.F().M();
    }

    public JsonObject K() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (xi_0 xi_02 : this.A) {
            jsonArray.add((JsonElement)xi_02.l());
        }
        if (this.D == null) {
            jsonObject.addProperty("selected", (Number)0);
        } else {
            jsonObject.addProperty("selected", (Number)this.A.indexOf(this.D));
        }
        jsonObject.add("panels", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        this.A.clear();
        if (!jsonObject.has("panels")) {
            return;
        }
        JsonArray jsonArray = jsonObject.get("panels").getAsJsonArray();
        int n6 = jsonObject.get("selected").getAsInt();
        int n10 = jsonArray.size();
        for (int i = 0; i < n10; ++i) {
            xi_0 xi_02 = new xi_0(this, this.n());
            xi_02.a(jsonArray.get(i).getAsJsonObject());
            this.A.add(xi_02);
        }
        if (this.A.size() > 0) {
            this.D = this.m().get(n6);
        }
        this.M();
    }

    private List<U> n() {
        ArrayList<U> arrayList = new ArrayList<U>();
        for (int i = 0; i < 9; ++i) {
            U u6 = new U(0);
            arrayList.add(u6);
        }
        return arrayList;
    }

    public void b(xi_0 xi_02) {
        this.m().remove(xi_02);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
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
        double d3 = this.C.f();
        for (xi_0 xi_02 : this.m()) {
            d3 += xi_02.f();
        }
        return d3;
    }

    public List<xi_0> m() {
        return this.A;
    }

    public Dv L() {
        return this.B;
    }

    public xi_0 N() {
        return this.D;
    }

    public void a(xi_0 xi_02) {
        this.D = xi_02;
    }

    static List c(xy_0 xy_02) {
        return xy_02.n();
    }

    static List b(xy_0 xy_02) {
        return xy_02.A;
    }

    static xi_0 a(xy_0 xy_02) {
        return xy_02.D;
    }

    static xi_0 a(xy_0 xy_02, xi_0 xi_02) {
        xy_02.D = xi_02;
        return xy_02.D;
    }

    public static void f(boolean bl) {
        z = bl;
    }

    public static boolean l() {
        return z;
    }

    public static boolean J() {
        boolean bl = xy_0.l();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (xy_0.J()) {
            xy_0.f(true);
        }
    }
}

