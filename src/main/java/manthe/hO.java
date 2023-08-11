/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.g1;
import manthe.gJ;

public class hO
extends gJ {
    private final BG l;
    private final bp_1 s = this.b("getIdFromBlock", true, Integer.TYPE, A5.F);
    private final bp_1 a;
    private final bp_1 g;
    private final bp_1 t;
    private final bp_1 d;
    private final bp_1 o;
    public bp_1 f;
    public bp_1 q;
    public bp_1 i;
    public bp_1 j;
    public bp_1 e;
    private bp_1 h;
    private bp_1 p;
    private bp_1 n;
    private bp_1 m;
    private bp_1 r;
    private bp_1 u;
    private bp_1 k;
    private static String[] v;

    public hO() {
        super(A5.F);
        if (V.c() >= 23) {
            this.a = this.a("getMaterial", true, A5.Y, A5.aA);
        } else {
            this.h = this.a("getRenderType", true, Integer.TYPE, new Class[0]);
            this.a = this.a("getMaterial", true, A5.Y, new Class[0]);
        }
        this.g = this.b("getBlockFromName", true, A5.F, String.class);
        if (V.c() == 13) {
            this.e = this.a("getRenderBlockPass", true, Integer.TYPE, new Class[0]);
            this.n = this.a("onEntityWalking", true, Void.TYPE, A5.r, Integer.TYPE, Integer.TYPE, Integer.TYPE, A5.ba);
            this.t = this.a("getCollisionBoundingBoxFromPool", true, A5.b4, A5.r, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.d = this.a("canCollideCheck", true, Boolean.TYPE, Integer.TYPE, Boolean.TYPE);
        } else {
            this.i = this.a("getBlockLayer", true, A5.dP, new Class[0]);
            this.m = this.a("onLanded", true, Void.TYPE, A5.r, A5.ba);
            this.d = this.a("canCollideCheck", true, Boolean.TYPE, A5.aA, Boolean.TYPE);
            this.u = this.a("getActualState", true, A5.aA, A5.aA, A5.b8, A5.ao);
            if (V.c() >= 23) {
                this.f = this.a("canRenderInLayer", cy_0.c, Boolean.TYPE, A5.aA, A5.dP);
                this.r = this.a("onEntityCollidedWithBlock", true, Void.TYPE, A5.r, A5.ao, A5.aA, A5.ba);
                this.t = this.a("getCollisionBoundingBox", true, A5.b4, A5.aA, A5.b8, A5.ao);
                this.p = this.a("isBlockNormalCube", true, Boolean.TYPE, A5.aA);
                this.k = this.a("isNormalCube", true, Boolean.TYPE, A5.aA);
                this.j = this.a("getAmbientOcclusionLightValue", true, Float.TYPE, A5.aA);
                this.q = this.a("shouldSideBeRendered", true, Boolean.TYPE, A5.aA, A5.b8, A5.ao, A5.aY);
            } else {
                this.q = this.a("shouldSideBeRendered", true, Boolean.TYPE, A5.b8, A5.ao, A5.aY);
                this.r = this.a("onEntityCollidedWithBlock", true, Void.TYPE, A5.r, A5.ao, A5.ba);
                this.t = this.a("getCollisionBoundingBox", true, A5.b4, A5.r, A5.ao, A5.aA);
                this.p = this.a("isBlockNormalCube", true, Boolean.TYPE, new Class[0]);
                this.k = this.a("isNormalCube", true, Boolean.TYPE, new Class[0]);
                this.j = this.a("getAmbientOcclusionLightValue", true, Float.TYPE, new Class[0]);
            }
        }
        this.o = V.c() <= 15 ? (V.c() == 13 ? this.a("getDamageValue", true, Integer.TYPE, A5.r, Integer.TYPE, Integer.TYPE, Integer.TYPE) : this.a("getDamageValue", true, Integer.TYPE, A5.r, A5.ao)) : this.a("getMetaFromState", true, Integer.TYPE, A5.aA);
        this.l = this.b("slipperiness", true, Float.TYPE);
    }

    private float f(Object object) {
        return this.l.b(object);
    }

    private int b(Object object, Object object2, int n6, int n10, int n11) {
        return this.o.o(object, object2, n6, n10, n11);
    }

    private int b(Object object, Object object2, Object object3) {
        return this.o.o(object, object2, object3);
    }

    private int c(Object object, Object object2) {
        return this.o.o(object, object2);
    }

    public boolean a(Object object, Object object2, boolean bl) {
        return this.d.h(object, object2, bl);
    }

    private boolean a(Object object, int n6, boolean bl) {
        return this.d.h(object, n6, bl);
    }

    public int b(Object object) {
        return this.s.o(null, object);
    }

    private int c(Object object) {
        return this.h.o(object, new Object[0]);
    }

    public Object a(String string) {
        return this.g.e(null, string);
    }

    private Object d(Object object) {
        return this.a.e(object, new Object[0]);
    }

    private Object d(Object object, Object object2) {
        return this.a.e(object, object2);
    }

    private void a(Object object, Object object2, int n6, int n10, int n11, Object object3) {
        this.n.p(object, object2, n6, n10, n11, object3);
    }

    private void a(Object object, Object object2, Object object3) {
        this.m.p(object, object2, object3);
    }

    private void b(Object object, Object object2, Object object3, Object object4) {
        this.r.p(object, object2, object3, object4);
    }

    private Object a(Object object, Object object2, int n6, int n10, int n11) {
        if (V.c() == 13) {
            return this.t.e(object, object2, n6, n10, n11);
        }
        return this.t.e(object, object2, g1.a(n6, n10, n11).a(), null);
    }

    public boolean e(Object object) {
        return this.p.h(object, new Object[0]);
    }

    public boolean a(Object object, Object object2) {
        return this.p.h(object, object2);
    }

    public boolean a(Object object) {
        return this.k.h(object, new Object[0]);
    }

    public boolean b(Object object, Object object2) {
        return this.k.h(object, object2);
    }

    public Object a(Object object, Object object2, Object object3, Object object4) {
        return this.u.e(object, object2, object3, object4);
    }

    static int c(hO hO2, Object object) {
        return hO2.c(object);
    }

    static Object a(hO hO2, Object object, Object object2) {
        return hO2.d(object, object2);
    }

    static Object a(hO hO2, Object object) {
        return hO2.d(object);
    }

    static void a(hO hO2, Object object, Object object2, int n6, int n10, int n11, Object object3) {
        hO2.a(object, object2, n6, n10, n11, object3);
    }

    static void b(hO hO2, Object object, Object object2, Object object3) {
        hO2.a(object, object2, object3);
    }

    static void a(hO hO2, Object object, Object object2, Object object3, Object object4) {
        hO2.b(object, object2, object3, object4);
    }

    static Object b(hO hO2, Object object, Object object2, int n6, int n10, int n11) {
        return hO2.a(object, object2, n6, n10, n11);
    }

    static boolean a(hO hO2, Object object, int n6, boolean bl) {
        return hO2.a(object, n6, bl);
    }

    static int a(hO hO2, Object object, Object object2, int n6, int n10, int n11) {
        return hO2.b(object, object2, n6, n10, n11);
    }

    static int a(hO hO2, Object object, Object object2, Object object3) {
        return hO2.b(object, object2, object3);
    }

    static int b(hO hO2, Object object, Object object2) {
        return hO2.c(object, object2);
    }

    static float b(hO hO2, Object object) {
        return hO2.f(object);
    }

    public static void b(String[] stringArray) {
        v = stringArray;
    }

    public static String[] d() {
        return v;
    }

    static {
        if (hO.d() != null) {
            hO.b(new String[3]);
        }
    }
}

