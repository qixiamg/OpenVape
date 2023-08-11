/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.UUID;
import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.ic
 */
public class ic_0
extends gJ {
    private final bp_1 d = this.a("getModifier", true, A5.ar, UUID.class);
    private final bp_1 f = this.a("applyModifier", true, Void.TYPE, A5.ar);
    private final bp_1 e = this.a("getAttributeValue", true, Double.TYPE, new Class[0]);
    private static String[] a;

    public ic_0() {
        super(A5.H);
    }

    private Object a(Object object, UUID uUID) {
        return this.d.e(object, uUID);
    }

    private void a(Object object, Object object2) {
        this.f.p(object, object2);
    }

    private double a(Object object) {
        return this.e.m(object, new Object[0]);
    }

    static Object a(ic_0 ic_02, Object object, UUID uUID) {
        return ic_02.a(object, uUID);
    }

    static void a(ic_0 ic_02, Object object, Object object2) {
        ic_02.a(object, object2);
    }

    static double a(ic_0 ic_02, Object object) {
        return ic_02.a(object);
    }

    public static void b(String[] stringArray) {
        a = stringArray;
    }

    public static String[] d() {
        return a;
    }

    static {
        if (ic_0.d() != null) {
            ic_0.b(new String[1]);
        }
    }
}

