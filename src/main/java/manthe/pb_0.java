/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import manthe.BI;
import manthe.DX;
import manthe.rg_0;

/*
 * Renamed from manthe.pb
 */
public class pb_0
implements BI {
    public static HashMap<DX, List<pb_0>> c = new HashMap();
    private final String d;
    private final rg_0 b;
    private DX f;
    private boolean a;
    private static String e;

    public pb_0(String string, double d3) {
        this.d = string;
        this.b = new rg_0(string, false);
        this.b.z().e(d3);
    }

    public pb_0(String string) {
        this(string, 1.0);
    }

    public static pb_0 a(DX dX, String string) {
        List<pb_0> list = c.get(dX);
        for (pb_0 pb_02 : list) {
            if (!pb_02.d().equalsIgnoreCase(string)) continue;
            return pb_02;
        }
        return null;
    }

    @Override
    public String H() {
        return this.d;
    }

    public String d() {
        return this.d.replace("\u00a7", "");
    }

    public DX e() {
        return this.f;
    }

    public void a(DX dX) {
        this.f = dX;
        if (!c.containsKey(dX)) {
            c.put(dX, new ArrayList());
        }
        c.get(dX).add(this);
    }

    public String toString() {
        return this.d.replace("\u00a7", "");
    }

    public boolean c() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public rg_0 a() {
        return this.b;
    }

    static {
        pb_0.b("nCG2Bc");
    }

    public static void b(String string) {
        e = string;
    }

    public static String b() {
        return e;
    }
}

