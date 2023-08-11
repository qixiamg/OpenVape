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
 * Renamed from manthe.jj
 */
public class jj_0
extends gJ {
    public final BG a = this.b("minX", true, Double.TYPE);
    public final BG e = this.b("minY", true, Double.TYPE);
    public final BG m = this.b("minZ", true, Double.TYPE);
    private final BG d = this.b("maxX", true, Double.TYPE);
    private final BG s = this.b("maxY", true, Double.TYPE);
    private final BG u = this.b("maxZ", true, Double.TYPE);
    private final bp_1 p;
    private final bp_1 g = this.a("addCoord", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
    private final bp_1 n = this.a("expand", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
    private final bp_1 o = this.a("calculateIntercept", true, A5.cH, A5.aW, A5.aW);
    private final bp_1 q = this.a("isVecInside", true, Boolean.TYPE, A5.aW);
    private final bp_1 i;
    private final bp_1 r;
    private final bp_1 l;
    private final bp_1 k;
    private final bp_1 j;
    private bp_1 t;
    private bp_1 f;
    private bp_1 h;
    private bp_1 v;

    public jj_0() {
        super(A5.b4);
        if (V.c() >= 23) {
            this.i = this.a("func_72317_d", false, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
        } else {
            this.i = this.a("offset", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
            this.t = this.a("contract", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
        }
        this.l = this.a("calculateXOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.r = this.a("calculateYOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.k = this.a("calculateZOffset", true, Double.TYPE, A5.b4, Double.TYPE);
        this.j = this.a("intersectsWith", true, Boolean.TYPE, A5.b4);
        if (V.c() == 13) {
            this.f = this.a("copy", true, A5.b4, new Class[0]);
            this.h = this.a("getOffsetBoundingBox", true, A5.b4, Double.TYPE, Double.TYPE, Double.TYPE);
            this.v = this.a("setBB", true, Void.TYPE, A5.b4);
        }
        this.p = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
    }

    public Object a(double d3, double d4, double d5, double d6, double d7, double d8) {
        return this.p.a(new Object[]{d3, d4, d5, d6, d7, d8});
    }

    public Object a(Object object, double d3, double d4, double d5) {
        return this.g.e(object, d3, d4, d5);
    }

    public Object c(Object object, double d3, double d4, double d5) {
        return this.n.e(object, d3, d4, d5);
    }

    public Object a(Object object, Object object2, Object object3) {
        return this.o.e(object, object2, object3);
    }

    public boolean a(Object object, Object object2) {
        return this.q.h(object, object2);
    }

    public Object b(Object object, double d3, double d4, double d5) {
        return this.i.e(object, d3, d4, d5);
    }

    public double d(Object object) {
        return this.a.g(object);
    }

    public double g(Object object) {
        return this.e.g(object);
    }

    public double f(Object object) {
        return this.m.g(object);
    }

    public double e(Object object) {
        return this.d.g(object);
    }

    public double c(Object object) {
        return this.s.g(object);
    }

    public double a(Object object) {
        return this.u.g(object);
    }

    private Object b(Object object) {
        return this.f.e(object, new Object[0]);
    }

    private Object d(Object object, double d3, double d4, double d5) {
        return this.h.e(object, d3, d4, d5);
    }

    private double b(Object object, Object object2, double d3) {
        return this.l.m(object, object2, d3);
    }

    private double c(Object object, Object object2, double d3) {
        return this.r.m(object, object2, d3);
    }

    private double a(Object object, Object object2, double d3) {
        return this.k.m(object, object2, d3);
    }

    private void c(Object object, Object object2) {
        this.v.p(object, object2);
    }

    private Object e(Object object, double d3, double d4, double d5) {
        return this.t.e(object, d3, d4, d5);
    }

    private boolean b(Object object, Object object2) {
        return this.j.h(object, object2);
    }

    static Object a(jj_0 jj_02, Object object) {
        return jj_02.b(object);
    }

    static Object b(jj_0 jj_02, Object object, double d3, double d4, double d5) {
        return jj_02.d(object, d3, d4, d5);
    }

    static double c(jj_0 jj_02, Object object, Object object2, double d3) {
        return jj_02.b(object, object2, d3);
    }

    static double a(jj_0 jj_02, Object object, Object object2, double d3) {
        return jj_02.c(object, object2, d3);
    }

    static double b(jj_0 jj_02, Object object, Object object2, double d3) {
        return jj_02.a(object, object2, d3);
    }

    static void a(jj_0 jj_02, Object object, Object object2) {
        jj_02.c(object, object2);
    }

    static Object a(jj_0 jj_02, Object object, double d3, double d4, double d5) {
        return jj_02.e(object, d3, d4, d5);
    }

    static boolean b(jj_0 jj_02, Object object, Object object2) {
        return jj_02.b(object, object2);
    }
}

