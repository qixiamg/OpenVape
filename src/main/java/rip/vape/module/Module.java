/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package rip.vape.module;

import a.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javassist.bytecode.CodeAttribute.RuntimeCopyException;
import manthe.*;
import rip.vape.gui.Notification;
import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Module extends yt_0 implements BI {
    private static int t;

    static {
        if (Module.o() == 0) {
            Module.d(61);
        }
    }

    private final String h;
    private final int s;
    private final int j;
    private final List<BasicValue> f = new ArrayList<>();
    private final List<p1> n = new ArrayList<p1>();
    private final List<yc_0> d = new ArrayList<yc_0>();
    protected CQ e;
    private String o;
    private boolean p;
    private boolean q;
    private boolean k = false;
    private String l;
    private pK r;
    private s7 g;
    private boolean i = true;
    private boolean m;

    public Module(String string, int n6, int n10, CQ cQ, String string2) {
        this.h = string;
        this.s = n6;
        this.j = n10;
        this.e = cQ;
        this.l = string2;
        if (n6 != 0) {
            this.c().add(n6);
        }
    }

    public Module(String string, int n6, CQ cQ) {
        this(string, 0, n6, cQ, null);
    }

    public Module(String string, int n6, CQ cQ, String string2) {
        this(string, 0, n6, cQ, string2);
    }

    private Module(String string, int n6) {
        this(string, n6, 0, CQ.b, null);
    }

    public Module(String string) {
        this(string, 0, CQ.b);
    }

    public static void d(int n6) {
        t = n6;
    }

    public static int u() {
        return t;
    }

    public static int o() {
        int n6 = Module.u();
        if (n6 == 0) {
            return 24;
        }
        return 0;
    }

    private static RuntimeCopyException getRuntimeCopyException(RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    public void z() {
        if (this.n() && !a.ib()) {
            return;
        }
        if (this.p() && this.c().isEmpty()) {
            return;
        }
        boolean bl = this.p;
        this.d(!this.p);
        if (ng.b != null) {
            ng.b.an();
        }
        if (zu_0.T.M.u() && bl != this.p && this.Q() != CQ.b) {
            // toggle
            on.p.r().addNotification(new Notification(pJ.INFO, "Module Toggled", new qY(this.H() + " \u00a7fhas been " + (this.N() ? "\u00a7aEnabled" : "\u00a7cDisabled") + "\u00a7f!", pJ.INFO, true), 0.0, 0.0, 750L));
        }
    }

    public boolean N() {
        return this.p;
    }

    public void a(boolean bl, boolean bl2) {
        if (this.n() && !a.ib()) {
            return;
        }
        if (!bl2 && this.l() != null && !this.x() && bl) {
            on.p.r().addNotification("Hidden Module", "Attempted to toggle " + this.H() + "!", pJ.WARNING, 2500L);
            return;
        }
        this.p = bl;
        if (this.p) {
            this.s();
        } else {
            this.J();
        }
        on.p.H().a(this);
        if (this.l() != null) {
            this.l().n(this.p);
        }
    }

    public void d(boolean bl) {
        this.a(bl, false);
    }

    @Override
    public String H() {
        return this.h;
    }

    public String w() {
        return this.o != null && !this.o.equals("") ? VapeSettings.v + "7 " + this.o : "";
    }

    public void a(String string) {
        this.o = string;
    }

    public int y() {
        return this.j;
    }

    public CQ Q() {
        return this.e;
    }

    public boolean n() {
        return false;
    }

    public void a(kZ kZ2) {
        if (kZ2.getKey() <= 0) {
            return;
        }
        if (this.c().isEmpty()) {
            return;
        }
        if (kZ2.isDown() && ds_2.x().a() == null) {
            this.a(kZ2.getKey());
        }
    }

    public void a(ki_0 ki_02) {
    }

    public void s() {
        this.d.forEach(Module::s);
    }

    public void J() {
        this.d.forEach(Module::J);
    }

    public void getRuntimeCopyException(kt_0 kt_02) {
    }

    public void a(kt_0 kt_02) {
    }

    public void a(kn_0 kn_02) {
    }

    public void a(kx_0 kx_02) {
    }

    public void getRuntimeCopyException(kx_0 kx_02) {
    }

    public void a(kA kA2) {
    }

    public void a(lK lK2) {
    }

    public void a(ll_0 ll_02) {
    }

    public void a(k5 k52) {
    }

    public void a(l1 l12) {
    }

    public void a(kc_0 kc_02) {
    }

    public void a(kq_0 kq_02) {
    }

    public void a(lG lG2) {
    }

    public void a(lf lf2) {
    }

    public void a(lz_0 lz_02) {
    }

    public void a(ks_0 ks_02) {
    }

    public void a(km_0 km_02) {
    }

    public void a(kd_0 kd_02) {
    }

    public void a(ku_0 ku_02) {
    }

    public void t() {
    }

    public void a(kf_0 kf_02) {
    }

    public void a(kT kT2) {
    }

    public void a(kJ kJ2) {
    }

    public void getRuntimeCopyException(ke_0 ke_02) {
    }

    public void a(ke_0 ke_02) {
    }

    public void a(kU kU2) {
    }

    public void a(ky_0 ky_02) {
    }

    public void a(kF kF2) {
    }

    public void a(kN kN2) {
    }

    public void a(kK kK2) {
    }

    public void a(kS kS2) {
    }

    public void a(k_ k_2) {
    }

    public void a(ka_0 ka_02) {
    }

    public void a(kO kO2) {
    }

    public void k() {
    }

    public void m() {
    }

    public void a(Module y52) {
    }

    public List<yc_0> O() {
        return this.d;
    }

    public List<BasicValue> r() {
        return this.f;
    }

    public yc_0 getRuntimeCopyException(String string) {
        for (yc_0 yc_02 : this.O()) {
            if (!yc_02.H().equalsIgnoreCase(string)) continue;
            return yc_02;
        }
        return null;
    }

    public BasicValue c(String string) {
        for (BasicValue ds_02 : this.r()) {
            if (!ds_02.getValueName().equalsIgnoreCase(string) && !ds_02.H().equalsIgnoreCase(string)) continue;
            return ds_02;
        }
        return null;
    }

    public void a(yc_0... yc_0Array) {
        this.O().addAll(Arrays.asList(yc_0Array));
    }

    public void a(BasicValue... ds_0Array) {
        this.r().addAll(Arrays.asList(ds_0Array));
    }

    public List<p1> K() {
        if (!this.k) {
            this.I();
        }
        return this.n;
    }

    private void I() {
        for (BasicValue ds_02 : this.r()) {
            if (ds_02.getDefaultValue() == null) continue;
            this.n.add((p1) ds_02.getDefaultValue());
        }
        this.k = true;
    }

    public JsonObject R() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.H());
        jsonObject.add("keybinds", (JsonElement) this.b());
        JsonArray jsonArray = new JsonArray();
        for (BasicValue ds_02 : this.f) {
            if (!ds_02.f()) continue;
            jsonArray.add((JsonElement) ds_02.getJson());
        }
        jsonObject.add("values", (JsonElement) jsonArray);
        if (this.g != null) {
            jsonObject.addProperty("visible", Boolean.valueOf(this.g.Y().G()));
        }
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        this.c().clear();
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull() && jsonObject.get("name").getAsString().equalsIgnoreCase(this.H())) {
            if (jsonObject.get("keybind") != null && !jsonObject.get("keybind").isJsonNull()) {
                this.c(jsonObject.get("keybind").getAsInt());
                this.c().add(this.P());
            } else if (jsonObject.get("keybinds") != null && jsonObject.get("keybinds").isJsonArray()) {
                try {
                    this.a(jsonObject.getAsJsonArray("keybinds"));
                } catch (Exception exception) {
                }
            } else {
                this.c().clear();
                this.c().add(this.s);
            }
            JsonArray jsonArray = jsonObject.getAsJsonArray("values");
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JsonObject jsonObject2 = ((JsonElement) iterator.next()).getAsJsonObject();
                for (BasicValue ds_02 : this.f) {
                    if (!ds_02.getValueName().equalsIgnoreCase(jsonObject2.get("id").getAsString())) continue;
                    ds_02.isCorrectValue(jsonObject2);
                }
            }
            if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull() && this.g != null) {
                boolean bl = jsonObject.get("visible").getAsBoolean();
                this.g.Y().g(bl);
            }
        }
    }

    public String M() {
        return this.l;
    }

    public void d(String string) {
        this.l = string;
    }

    public int P() {
        return this.s;
    }

    public void q() {
    }

    public void a(long l6, boolean bl) {
        if (this.r != null) {
            this.r.a(false);
        }
        this.r = new pK(this, l6, bl);
        new Thread(this.r).start();
    }

    public boolean p() {
        return this.q;
    }

    @Override
    public String g() {
        return String.format(" %s7[%sr%s%s7]%sr %s", VapeSettings.v, VapeSettings.v, this.a(), VapeSettings.v, VapeSettings.v, this.H());
    }

    public String toString() {
        return "Module{name='" + this.h + '\'' + ", defaultKeybind=" + this.s + ", guiColor=" + this.j + ", values=" + this.f + ", components=" + this.n + ", subModules=" + this.d + ", guiCategory=" + this.e + ", suffix='" + this.o + '\'' + ", enabled=" + this.p + ", requiresBind=" + this.q + ", registeredComponents=" + this.k + ", tooltip='" + this.l + '\'' + ", moduleRunnable=" + this.r + ", guiButton=" + this.g + ", defaultVisible=" + this.i + ", favorited=" + this.m + '}';
    }

    @Override
    public void h() {
        this.z();
    }

    public boolean v() {
        return this.i;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public s7 l() {
        return this.g;
    }

    public void a(s7 s72) {
        this.g = s72;
    }

    public boolean x() {
        if (this.g == null || this.g.Y() == null) {
            return false;
        }
        return this.g.Y().G();
    }

    public boolean L() {
        return this.m;
    }

    public void a(boolean bl) {
        if (bl) {
            on.p.A().b(this);
        } else {
            on.p.A().c(this);
        }
    }

    public void getRuntimeCopyException(boolean bl) {
        this.m = bl;
    }

    @Override
    public boolean j() {
        return this.p;
    }
}

