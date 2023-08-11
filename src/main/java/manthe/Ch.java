/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.HashMap;
import manthe.cy_0;
import manthe.ds_2;
import manthe.oS;
import manthe.on;
import manthe.pj_0;

public class Ch {
    static HashMap<oS, pj_0> c = new HashMap();
    private static cy_0[] b;

    private static void a(oS oS2) {
        pj_0 pj_02 = new pj_0();
        pj_02.a(oS2.a, oS2.a());
        c.put(oS2, pj_02);
    }

    public static void a(String string, int n6) {
        oS oS2 = new oS(string, n6);
        if (!c.containsKey(oS2)) {
            Ch.a(oS2);
        }
    }

    public static void a(String string, float f10, float f11, int n6) {
        try {
            oS oS2 = new oS(string, n6);
            Ch.a(string, n6);
            int n10 = ds_2.m().c(string);
            int n11 = ds_2.m().b(string);
            c.get(oS2).a(f10, f11, n10, n11);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    static {
        Ch.b(new cy_0[2]);
    }

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] b() {
        return b;
    }
}

