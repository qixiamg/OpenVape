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
import rip.vape.friend.Friend;
import rip.vape.value.ColorValue;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from manthe.va
 */
public class va_0 {
    private final Set<Friend> friends = new HashSet<>();
    public BooleanValue useFriends = BooleanValue.createValue(this, "Use Friends", true);
    public BooleanValue useAlias = BooleanValue.createValue(this, "Use Alias", true);
    public BooleanValue spoofAlias = BooleanValue.createValue(this, "Spoof alias", false, "This will make the friends name be replaced in chat with their alias and on their regular Nametags as well");
    public BooleanValue recolorVisuals = BooleanValue.createValue(this, "Recolor visuals", true, "Re-colors certain render modules to use \"Friends Color\" on friends");
    public ColorValue friendsColor = ColorValue.createValue(this, "Friends Color", new Color(66, 244, 137));
    private static int[] f;

    public va_0() {
        vK vK2 = ((qD)this.spoofAlias.getDefaultValue()).a().a();
        ((qD)this.spoofAlias.getDefaultValue()).a().a(new nV(this, vK2));
        this.recolorVisuals.a(this.friendsColor);
        this.useAlias.a(this.spoofAlias);
    }

    public Set<Friend> e() {
        return this.friends;
    }

    public void b(Friend ab_02) {
        Friend ab_03 = this.a(ab_02.getName());
        if (ab_03 != null) {
            this.friends.remove(ab_03);
        }
        this.friends.add(ab_02);
        ng.g.a(ab_02);
        this.b();
        zu_0.b(wX.class).ak();
    }

    public void f() {
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
            Friend ab_02 = this.a(string);
            if (ab_02 != null) {
                this.a(ab_02);
            } else {
                this.b(new Friend(string, string));
            }
        }
    }

    public void a(Friend ab_02) {
        this.friends.remove(ab_02);
        ng.g.b(ab_02);
        this.b();
    }

    public Friend a(String string) {
        for (Friend ab_02 : this.friends) {
            if (!ab_02.getName().equalsIgnoreCase(string)) continue;
            return ab_02;
        }
        return null;
    }

    public boolean c(String string) {
        if (!this.useFriends.u().booleanValue()) {
            return false;
        }
        Friend ab_02 = this.a(string);
        return ab_02 != null && ab_02.getTarget();
    }

    public boolean a(ej_0 ej_02) {
        return this.c(ej_02.S());
    }

    public Friend a(String string, boolean bl) {
        if (this.useFriends.u().booleanValue() || !bl) {
            Friend ab_02 = this.a(string);
            if (ab_02 != null && !ab_02.getTarget()) {
                return null;
            }
            return ab_02;
        }
        return null;
    }

    public Friend b(String string) {
        return this.a(string, true);
    }

    public void a() {
        this.e().clear();
        ng.g.ah.A().v().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        this.a();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                Friend ab_02 = new Friend("", "").setAlias(jsonElement.getAsJsonObject());
                this.b(ab_02);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public JsonArray getJson() {
        JsonArray jsonArray = new JsonArray();
        for (Friend ab_02 : this.e()) {
            jsonArray.add(ab_02.getJson());
        }
        return jsonArray;
    }

    public void b() {
        if (ds_2.t().e()) {
            return;
        }
        for (Object e10 : ds_2.t().j()) {
            new eC(e10).aZ();
        }
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    public static int[] d() {
        return f;
    }

    static {
        if (va_0.d() != null) {
            va_0.b(new int[4]);
        }
    }
}

