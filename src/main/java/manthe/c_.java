/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import rip.vape.value.ColorValue;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class c_ {
    private final Set<pr> a = new HashSet<pr>();
    public BooleanValue f = BooleanValue.createValue(this, "Use Enemies", true);
    public BooleanValue d = BooleanValue.createValue(this, "Use Alias", true);
    public BooleanValue b = BooleanValue.createValue((Object)this, "Spoof alias", false, "This will make the enemies name be replaced in chat with their alias.\nApplies on regular Nametags as well");
    public BooleanValue c = BooleanValue.createValue((Object)this, "Use color", true, "Re-colors certain render modules to use \"Enemies Color\" on enemies");
    public ColorValue e = ColorValue.createValue((Object)this, "Enemies Color", new Color(244, 66, 66));
    private static String g;

    public c_() {
        vK vK2 = ((qD)this.b.getDefaultValue()).a().a();
        ((qD)this.b.getDefaultValue()).a().a(new uE(this, vK2));
    }

    public Set<pr> e() {
        return this.a;
    }

    public void b(pr pr2) {
        pr pr3 = this.c(pr2.b());
        if (pr3 != null) {
            this.a.remove(pr3);
        }
        this.a.add(pr2);
        ng.n.a(pr2);
        this.d();
    }

    public void a() {
        gb_0 gb_02 = ds_2.I();
        if (gb_02.e()) {
            return;
        }
        ex_0 ex_02 = gb_02.h();
        if (ex_02.e()) {
            return;
        }
        if (ex_02.a(A5.L)) {
            e2 e22 = new e2(ex_02);
            String string = e22.S();
            pr pr2 = this.c(string);
            if (pr2 != null) {
                this.a(pr2);
            } else {
                this.b(new pr(string, string));
            }
        }
    }

    public void a(pr pr2) {
        this.a.remove(pr2);
        ng.n.b(pr2);
        this.d();
    }

    public pr c(String string) {
        for (pr pr2 : this.a) {
            if (!pr2.b().equalsIgnoreCase(string)) continue;
            return pr2;
        }
        return null;
    }

    public boolean a(String string) {
        if (!this.f.u().booleanValue()) {
            return false;
        }
        pr pr2 = this.c(string);
        return pr2 != null;
    }

    public boolean a(ej_0 ej_02) {
        return this.a(ej_02.S());
    }

    public boolean b(ej_0 ej_02) {
        pr pr2 = this.d(ej_02.S());
        if (pr2 != null) {
            return pr2.e();
        }
        return false;
    }

    public pr a(String string, boolean bl) {
        if (this.f.u().booleanValue() || !bl) {
            pr pr2 = this.c(string);
            if (pr2 != null) {
                return null;
            }
            return pr2;
        }
        return null;
    }

    public pr d(String string) {
        return this.a(string, true);
    }

    public void c() {
        this.e().clear();
        ng.n.ag.A().v().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        this.c();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                pr pr2 = pr.a(jsonElement.getAsJsonObject());
                this.b(pr2);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        zu_0.b(wm_0.class).ak();
    }

    public JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (pr pr2 : this.e()) {
            jsonArray.add((JsonElement)pr2.d());
        }
        return jsonArray;
    }

    public void d() {
        if (ds_2.t().e()) {
            return;
        }
        for (Object e10 : ds_2.t().j()) {
            new eC(e10).aZ();
        }
    }

    public static void b(String string) {
        g = string;
    }

    public static String f() {
        return g;
    }

    static {
        if (c_.f() != null) {
            c_.b("JUHpeb");
        }
    }
}

