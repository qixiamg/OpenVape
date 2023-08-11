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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.module.Module;

/*
 * Renamed from manthe.cr
 */
public class cr_0 {
    private final Map<Class, Module> a = new HashMap<Class, Module>();
    private final HashSet<Module> b = new HashSet();

    public void g() {
        int n6;
        block9: {
            int n10;
            int n11;
            block8: {
                this.b(new zx_0());
                this.b(new zu_0());
                this.b(new z1());
                this.b(new zi_0());
                this.b(new zZ());
                this.b(new yF());
                this.b(new yX());
                this.b(new z0());
                this.b(new zR());
                this.b(new zE());
                this.b(new z2());
                this.b(new Ag());
                this.b(new z7());
                this.b(new z5());
                this.b(new AI());
                this.b(new zO());
                int n12 = Module.o();
                this.b(new zo_0());
                n6 = n12;
                this.b(new zF());
                this.b(new zy_0());
                this.b(new A7());
                this.b(new zG());
                this.a(new yp_0(), false);
                this.b(new zr_0());
                this.b(new zn_0());
                this.b(new zN());
                this.b(new z6());
                this.a(new zl_0(), false);
                this.b(new zP());
                this.b(new yE());
                this.b(new zD());
                this.b(new zf_0());
                this.b(new zU());
                this.b(new zT());
                this.a(new zA(), false);
                this.b(new z9());
                this.b(new za_0());
                this.b(new zc_0());
                this.b(new zt_0());
                this.b(new z_());
                this.b(new zm_0());
                this.b(new zM());
                n11 = V.c();
                n10 = 13;
                if (n6 != 0) {
                    if (n11 > n10) {
                        this.b(new yy_0());
                    }
                    n11 = V.c();
                    n10 = 15;
                }
                if (n6 == 0) break block8;
                if (n11 <= n10) {
                    this.a(new zI(), false);
                    this.b(new zK());
                }
                this.b(new zz_0());
                this.a(new zk_0(), false);
                this.b(new z3());
                this.b(new zV());
                this.b(new zC());
                this.b(new yT());
                this.b(new zQ());
                this.b(new yP());
                this.b(new zd_0());
                this.a(new zb_0(), false);
                this.b(new yv_0());
                this.a(new yD(), false);
                this.b(new zv_0());
                this.b(new yR());
                this.b(new ze_0());
                this.b(new yB());
                this.b(new zh_0());
                this.b(new z8());
                this.b(new yq_0());
                this.b(new A3());
                this.b(new zY());
                this.b(new zH());
                this.b(new zX());
                this.b(new AQ());
                this.b(new zs_0());
                this.b(new zp_0());
                this.b(new zB());
                this.b(new ao_0());
                this.b(new zJ());
                if (n6 == 0) break block9;
                n11 = V.c();
                n10 = 13;
            }
            if (n11 > n10) {
                this.b(new y0());
            }
            this.b(new zL());
            this.b(new zj_0());
        }
        if (n6 == 0) {
            cy_0.b(!cy_0.b());
        }
    }

    public void d() {
        for (Module y52 : this.a.values()) {
            y52.m();
        }
    }

    public void a() {
        for (Module y52 : this.a.values()) {
            y52.k();
        }
    }

    private void a(Module y52, boolean bl) {
        this.a.put(y52.getClass(), y52);
        y52.c(bl);
    }

    private void b(Module y52) {
        this.a(y52, true);
    }

    public Collection<Module> e() {
        return this.a.values();
    }

    public <T extends Module> T b(Class<T> clazz) {
        return (T)this.a.get(clazz);
    }

    public Module a(String string) {
        for (Map.Entry<Class, Module> entry : this.a.entrySet()) {
            if (!entry.getValue().H().equals(string)) continue;
            return entry.getValue();
        }
        return null;
    }

    public boolean a(Class clazz) {
        for (Module y52 : this.e()) {
            if (!y52.getClass().equals(clazz)) continue;
            return y52.N();
        }
        return false;
    }

    public void a(JsonArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(i);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("name") == null || jsonObject.get("name").isJsonNull()) continue;
            String string = jsonObject.get("name").getAsString();
            for (Module y52 : this.e()) {
                try {
                    if (!y52.H().equalsIgnoreCase(string)) continue;
                    y52.a(jsonObject);
                }
                catch (Exception exception) {
                    on.a(y52.H());
                    on.a(exception);
                }
            }
        }
    }

    public void a(Module y52) {
        if (y52.N()) {
            this.b.add(y52);
        } else {
            this.b.remove(y52);
        }
        for (Module y53 : this.f()) {
            y53.a(y52);
        }
    }

    public HashSet<Module> f() {
        return this.b;
    }

    public JsonArray h() {
        JsonArray jsonArray = new JsonArray();
        for (Module y52 : this.e()) {
            jsonArray.add((JsonElement)y52.R());
        }
        return jsonArray;
    }

    public void c() {
        int n6 = 0;
        for (Module y52 : this.e()) {
            if (y52.l() == null || y52.x() || y52 instanceof zu_0 || y52.y() == 0 || !y52.N()) continue;
            ++n6;
            y52.z();
        }
        if (n6 > 0) {
            on.p.r().addNotification("Hidden Disabled", n6 + " module(s) have been disabled!", pJ.WARNING, 2500L);
        }
    }

    public void a(JsonObject jsonObject) {
        for (Module y52 : this.e()) {
            if (jsonObject.has(y52.H())) {
                if (y52.l() == null || y52.l().Y() == null || !y52.l().Y().G()) continue;
                y52.d(jsonObject.get(y52.H()).getAsBoolean());
                continue;
            }
            if (y52 instanceof zu_0 || y52.y() == 0 || !y52.N()) continue;
            y52.z();
        }
    }

    public List<Module> b(JsonObject jsonObject) {
        ArrayList<Module> arrayList = new ArrayList<Module>();
        for (Module y52 : this.e()) {
            if (!jsonObject.has(y52.H()) || y52.l() == null || y52.l().Y() == null || !y52.l().Y().G()) continue;
            arrayList.add(y52);
        }
        return arrayList;
    }

    public JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        for (Module y52 : this.e()) {
            if (!y52.N()) continue;
            jsonObject.addProperty(y52.H(), Boolean.valueOf(y52.N()));
        }
        return jsonObject;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

