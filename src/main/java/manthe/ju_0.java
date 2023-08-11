/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.ju
 */
public class ju_0
extends gJ {
    private final bp_1 a;
    private final bp_1 d;
    private BG h;
    private bp_1 i;
    private bp_1 f;
    private bp_1 g;
    private static String e;

    public ju_0() {
        super(A5.dk);
        if (V.c() >= 23) {
            this.f = this.a("<init>", false, Void.TYPE, A5.c2, Integer.TYPE, Integer.TYPE);
            this.h = this.b("potion", true, A5.c2);
        } else {
            this.i = this.a("<init>", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.g = this.a("getPotionID", true, Integer.TYPE, new Class[0]);
        }
        this.a = this.a("getAmplifier", true, Integer.TYPE, new Class[0]);
        this.d = this.a("getDuration", true, Integer.TYPE, new Class[0]);
    }

    private int c(Object object) {
        return this.a.o(object, new Object[0]);
    }

    private Object a(int n6, int n10, int n11) {
        return this.i.a(new Object[]{n6, n10, n11});
    }

    private int a(Object object) {
        return this.g.o(object, new Object[0]);
    }

    private int d(Object object) {
        return this.d.o(object, new Object[0]);
    }

    public Object a(Object object, int n6, int n10) {
        return this.f.a(new Object[]{object, n6, n10});
    }

    private Object b(Object object) {
        return this.h.f(object);
    }

    static Object a(ju_0 ju_02, int n6, int n10, int n11) {
        return ju_02.a(n6, n10, n11);
    }

    static int c(ju_0 ju_02, Object object) {
        return ju_02.c(object);
    }

    static Object d(ju_0 ju_02, Object object) {
        return ju_02.b(object);
    }

    static int a(ju_0 ju_02, Object object) {
        return ju_02.a(object);
    }

    static int b(ju_0 ju_02, Object object) {
        return ju_02.d(object);
    }

    public static void b(String string) {
        e = string;
    }

    public static String d() {
        return e;
    }

    static {
        if (ju_0.d() == null) {
            ju_0.b("uLvNVc");
        }
    }
}

