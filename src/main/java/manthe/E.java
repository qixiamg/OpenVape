/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.HashMap;
import manthe.aj_1;
import manthe.bt_0;
import manthe.fG;
import manthe.fk_0;
import manthe.on;

public class E {
    static HashMap<aj_1, bt_0> c = new HashMap();
    private static String[] b;

    private static void a(fG fG2, aj_1 aj_12) {
        bt_0 bt_02 = new bt_0();
        bt_0.a(bt_02, fG2);
        c.put(aj_12, bt_02);
    }

    public static void a(int n6, int n10) {
        aj_1 aj_12 = new aj_1(n6, n10);
        if (!c.containsKey(aj_12)) {
            fk_0 fk_02 = fk_0.a(n6);
            if (fk_02.e()) {
                return;
            }
            fG fG2 = fG.a(fk_02);
            fG2.a(n10);
            E.a(fG2, aj_12);
        }
    }

    public static void a(fG fG2, float f10, float f11, int n6, int n10, float f12) {
        try {
            fk_0 fk_02 = fG2.k();
            aj_1 aj_12 = new aj_1(fk_02.h(), fG2.m());
            E.a(fk_02.h(), fG2.m());
            c.get(aj_12).a(f10, f11, n6, n10, f12);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    public static void a(int n6, int n10, float f10, float f11, int n11, int n12) {
        aj_1 aj_12 = new aj_1(n6, n10);
        if (!c.containsKey(aj_12)) {
            fG fG2 = fG.a(fk_0.a(n6));
            fG2.a(n10);
            E.a(fG2, f10, f11, n11, n12, 1.0f);
        } else {
            c.get(aj_12).a(f10, f11, n11, n12, 1.0f);
        }
    }

    public static void a(int n6, float f10, float f11, int n10, int n11) {
        E.a(n6, 0, f10, f11, n10, n11);
    }

    static {
        E.b(new String[4]);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }
}

