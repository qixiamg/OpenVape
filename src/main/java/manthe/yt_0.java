/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.cb_0;
import manthe.cy_0;
import manthe.zu_0;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Renamed from manthe.yt
 */
public abstract class yt_0 {
    private final List<Integer> a = new CopyOnWriteArrayList<>();
    private String c;
    private static cy_0[] b;

    public abstract void h();

    public List<Integer> c() {
        return this.a;
    }

    public void a(List<Integer> list) {
        this.a.clear();
        this.a.addAll(list);
        if (this instanceof zu_0 && !this.f()) {
            this.a(Collections.singletonList(54));
        }
    }

    public boolean a(int n6) {
        if (this.c().isEmpty()) {
            return false;
        }
        if (this.c().size() == 1) {
            if (this.c().contains(n6)) {
                this.h();
                return true;
            }
        } else {
            int n10 = 0;
            for (int n11 : this.c()) {
                if (n11 == n6) {
                    ++n10;
                    continue;
                }
                if (n11 < 0) {
                    if (!Mouse.isButtonDown((int)(100 + n11))) continue;
                    ++n10;
                    continue;
                }
                if (!Keyboard.isKeyDown((int)n11)) continue;
                ++n10;
            }
            if (n10 == this.c().size()) {
                this.h();
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        if (this.c().isEmpty()) {
            return false;
        }
        if (this.c().size() == 1) {
            return cb_0.a(this.c().get(0));
        }
        int n6 = 0;
        for (int n10 : this.c()) {
            if (!cb_0.a(n10)) continue;
            ++n6;
        }
        return n6 == this.c().size();
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); ++i) {
            int n6 = this.a.get(i);
            if (n6 == 0) continue;
            stringBuilder.append(this.b(n6));
            if (i == this.a.size() - 1) continue;
            stringBuilder.append("+");
        }
        return stringBuilder.toString();
    }

    public boolean f() {
        boolean bl = !this.a.isEmpty();
        for (Integer n6 : this.a) {
            if (n6 != 0) continue;
            bl = false;
            break;
        }
        return bl;
    }

    public String i() {
        return this.c;
    }

    public String b(int n6) {
        if (n6 >= 0) {
            return Keyboard.getKeyName((int)n6);
        }
        return "M" + (101 + n6);
    }

    public void c(int n6) {
        if (this instanceof zu_0 && n6 == 0) {
            n6 = 54;
        }
        this.c = n6 >= 0 ? Keyboard.getKeyName((int)n6) : "M" + (101 + n6);
    }

    protected JsonArray b() {
        JsonArray jsonArray = new JsonArray();
        for (Integer n6 : this.c()) {
            jsonArray.add(new Gson().toJsonTree((Object)n6));
        }
        return jsonArray;
    }

    protected void a(JsonArray jsonArray) {
        this.c().clear();
        for (JsonElement jsonElement : jsonArray) {
            int n6 = jsonElement.getAsInt();
            if (n6 == 0) continue;
            this.c().add(n6);
        }
    }

    public abstract String g();

    public abstract boolean j();

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] e() {
        return b;
    }

    static {
        if (yt_0.e() != null) {
            yt_0.b(new cy_0[4]);
        }
    }
}

