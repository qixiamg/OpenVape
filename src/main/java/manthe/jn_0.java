/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.jn
 */
public class jn_0
extends gJ {
    private final bp_1 f = this.a("func_149065_a", cy_0.c, A5.ba, A5.r);
    private final bp_1 d;
    private final bp_1 i;
    private final bp_1 e;
    private final bp_1 g;
    private final bp_1 h;
    private final bp_1 a;

    public jn_0() {
        super(A5.R);
        if (V.c() >= 23) {
            this.d = this.a("getX", true, Integer.TYPE, new Class[0]);
            this.i = this.a("getY", true, Integer.TYPE, new Class[0]);
            this.e = this.a("getZ", true, Integer.TYPE, new Class[0]);
        } else {
            this.d = this.a("func_149062_c", cy_0.c, Byte.TYPE, new Class[0]);
            this.i = this.a("func_149061_d", cy_0.c, Byte.TYPE, new Class[0]);
            this.e = this.a("func_149064_e", cy_0.c, Byte.TYPE, new Class[0]);
        }
        this.g = this.a("func_149066_f", cy_0.c, Byte.TYPE, new Class[0]);
        this.h = this.a("func_149063_g", cy_0.c, Byte.TYPE, new Class[0]);
        this.a = this.a("func_149060_h", cy_0.c, Boolean.TYPE, new Class[0]);
    }

    private Object a(Object object, Object object2) {
        return this.f.e(object, object2);
    }

    private int c(Object object) {
        return this.d.k(object, new Object[0]);
    }

    private int d(Object object) {
        return this.i.k(object, new Object[0]);
    }

    private int f(Object object) {
        return this.e.k(object, new Object[0]);
    }

    private byte b(Object object) {
        return this.g.k(object, new Object[0]);
    }

    private byte a(Object object) {
        return this.h.k(object, new Object[0]);
    }

    private boolean e(Object object) {
        return this.a.h(object, new Object[0]);
    }

    static Object a(jn_0 jn_02, Object object, Object object2) {
        return jn_02.a(object, object2);
    }

    static int b(jn_0 jn_02, Object object) {
        return jn_02.c(object);
    }

    static int d(jn_0 jn_02, Object object) {
        return jn_02.d(object);
    }

    static int c(jn_0 jn_02, Object object) {
        return jn_02.f(object);
    }

    static byte e(jn_0 jn_02, Object object) {
        return jn_02.b(object);
    }

    static byte a(jn_0 jn_02, Object object) {
        return jn_02.a(object);
    }

    static boolean f(jn_0 jn_02, Object object) {
        return jn_02.e(object);
    }
}

