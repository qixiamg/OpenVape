/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Collection;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.it
 */
public class it_0
extends gJ {
    private final BG a;
    private final BG I;
    private final BG g;
    private final BG A;
    private final BG J;
    private final BG K;
    private final BG v;
    private final BG C;
    private final BG i;
    private final BG j = this.b("prevRenderYawOffset", true, Float.TYPE);
    private final BG d = this.b("prevRotationYawHead", true, Float.TYPE);
    private final BG x;
    private final BG r;
    private final BG F;
    private final BG u;
    private final bp_1 B;
    private final bp_1 m;
    private final bp_1 L;
    private final bp_1 D;
    private final bp_1 f;
    private final bp_1 l;
    private final bp_1 y;
    private final bp_1 k;
    private final bp_1 t;
    private final bp_1 e;
    private final bp_1 z;
    private final bp_1 s;
    private final bp_1 q;
    private final bp_1 h;
    private final bp_1 o;
    private final bp_1 H;
    private final bp_1 G;
    private final bp_1 n;
    private final bp_1 w;
    private final bp_1 p;
    private bp_1 E;

    public it_0() {
        super(A5.cF);
        this.a = this.b("moveForward", true, Float.TYPE);
        this.I = this.b("moveStrafing", true, Float.TYPE);
        if (V.c() >= 23) {
            this.g = this.a("SPRINTING_SPEED_BOOST", true, A5.ar);
            this.k = this.a("getHeldItemMainhand", true, A5.bT, new Class[0]);
            this.t = this.a("swingArm", true, Void.TYPE, A5.a6);
            this.s = this.a("removePotionEffect", true, Void.TYPE, A5.c2);
        } else {
            this.g = this.a("sprintingSpeedBoostModifier", true, A5.ar);
            this.k = this.a("getHeldItem", true, A5.bT, new Class[0]);
            this.t = this.a("swingItem", true, Void.TYPE, new Class[0]);
            this.s = this.a("removePotionEffect", true, Void.TYPE, Integer.TYPE);
        }
        this.A = this.b("rotationYawHead", true, Float.TYPE);
        this.J = this.b("isSwingInProgress", true, Boolean.TYPE);
        this.r = this.b("deathTime", true, Integer.TYPE);
        this.B = this.a("getHealth", true, Float.TYPE, new Class[0]);
        this.w = this.a("getAbsorptionAmount", true, Float.TYPE, new Class[0]);
        this.L = this.a("getLook", true, A5.aW, Float.TYPE);
        this.D = this.a("canEntityBeSeen", true, Boolean.TYPE, A5.ba);
        this.l = this.a("isPotionActive", true, Boolean.TYPE, A5.c2);
        this.y = this.a("getActivePotionEffect", true, A5.dk, A5.c2);
        this.H = this.a("getActivePotionEffects", true, Collection.class, new Class[0]);
        this.n = this.a("getAttributeMap", true, A5.de, new Class[0]);
        this.G = this.a("updatePotionEffects", true, Void.TYPE, new Class[0]);
        this.p = this.a("onLivingUpdate", true, Void.TYPE, new Class[0]);
        this.e = this.a("getEntityAttribute", true, A5.H, A5.b9);
        this.z = this.a("addPotionEffect", true, Void.TYPE, A5.dk);
        this.q = this.a("isOnLadder", true, Boolean.TYPE, new Class[0]);
        this.h = this.a("getMaxHealth", true, Float.TYPE, new Class[0]);
        this.o = this.a("<init>", false, Void.TYPE, A5.r);
        this.x = this.b("jumpMovementFactor", true, Float.TYPE);
        this.K = this.b("limbSwing", true, Float.TYPE);
        this.v = this.b("limbSwingAmount", true, Float.TYPE);
        this.C = this.b("prevLimbSwingAmount", true, Float.TYPE);
        this.i = this.b("renderYawOffset", true, Float.TYPE);
        this.F = this.b("jumpTicks", true, Integer.TYPE);
        this.u = this.b("hurtTime", true, Integer.TYPE);
        if (V.c() == 13) {
            this.m = this.a("getPosition", true, A5.aW, Float.TYPE);
            this.f = this.a("rayTrace", true, A5.cH, Double.TYPE, Float.TYPE);
        } else {
            this.m = new bp_1(A5.ba, "getPositionEyes", true, false, A5.aW, Float.TYPE);
            this.f = new bp_1(A5.ba, "rayTrace", true, false, A5.cH, Double.TYPE, Float.TYPE);
        }
    }

    private float g(Object object) {
        return this.B.f(object, new Object[0]);
    }

    private int a(Object object) {
        return this.r.c(object);
    }

    private void b(Object object, int n6) {
        this.F.a(object, n6);
    }

    private int c(Object object) {
        return this.u.c(object);
    }

    private float r(Object object) {
        return this.x.b(object);
    }

    private void v(Object object) {
        this.p.p(object, new Object[0]);
    }

    public Object d(Object object, float f10) {
        return this.m.e(object, Float.valueOf(f10));
    }

    public Object g(Object object, float f10) {
        return this.L.e(object, Float.valueOf(f10));
    }

    public boolean f(Object object, Object object2) {
        return this.D.h(object, object2);
    }

    public Object a(Object object, double d3, float f10) {
        return this.f.e(object, d3, Float.valueOf(f10));
    }

    private boolean e(Object object, Object object2) {
        return this.l.h(object, object2);
    }

    private Object g(Object object, Object object2) {
        return this.y.e(object, object2);
    }

    private Object e(Object object) {
        return this.H.e(object, new Object[0]);
    }

    private float h(Object object) {
        return this.I.b(object);
    }

    private void f(Object object, float f10) {
        this.I.a(object, f10);
    }

    private float w(Object object) {
        return this.a.b(object);
    }

    private void h(Object object, float f10) {
        this.a.a(object, f10);
    }

    private Object q(Object object) {
        return this.k.e(object, new Object[0]);
    }

    private void i(Object object) {
        this.t.p(object, new Object[0]);
    }

    private void c(Object object, Object object2) {
        this.t.p(object, object2);
    }

    private Object a(Object object, Object object2) {
        return this.e.e(object, object2);
    }

    private Object m(Object object) {
        return this.n.e(object, new Object[0]);
    }

    private Object d() {
        return this.g.f(null);
    }

    private float p(Object object) {
        return this.A.b(object);
    }

    private void c(Object object, float f10) {
        this.A.a(object, f10);
    }

    public float s(Object object) {
        return this.j.b(object);
    }

    public float b(Object object) {
        return this.d.b(object);
    }

    private void b(Object object, Object object2) {
        this.z.p(object, object2);
    }

    private void a(Object object, int n6) {
        this.s.p(object, n6);
    }

    private void d(Object object, Object object2) {
        this.s.p(object, object2);
    }

    private void d(Object object) {
        this.G.p(object, new Object[0]);
    }

    private boolean j(Object object) {
        return this.J.d(object);
    }

    private boolean f(Object object) {
        return this.q.h(object, new Object[0]);
    }

    private float k(Object object) {
        return this.h.f(object, new Object[0]);
    }

    private float n(Object object) {
        return this.K.b(object);
    }

    private void a(Object object, float f10) {
        this.K.a(object, f10);
    }

    private float u(Object object) {
        return this.v.b(object);
    }

    private void b(Object object, float f10) {
        this.v.a(object, f10);
    }

    private float o(Object object) {
        return this.C.b(object);
    }

    private void e(Object object, float f10) {
        this.C.a(object, f10);
    }

    private float t(Object object) {
        return this.i.b(object);
    }

    private Object l(Object object) {
        return this.o.a(object);
    }

    public float x(Object object) {
        return this.w.f(object, new Object[0]);
    }

    static Object a(it_0 it_02) {
        return it_02.d();
    }

    static Object p(it_0 it_02, Object object) {
        return it_02.l(object);
    }

    static float m(it_0 it_02, Object object) {
        return it_02.r(object);
    }

    static void s(it_0 it_02, Object object) {
        it_02.v(object);
    }

    static float t(it_0 it_02, Object object) {
        return it_02.g(object);
    }

    static int e(it_0 it_02, Object object) {
        return it_02.a(object);
    }

    static int k(it_0 it_02, Object object) {
        return it_02.c(object);
    }

    static void b(it_0 it_02, Object object, int n6) {
        it_02.b(object, n6);
    }

    static boolean a(it_0 it_02, Object object, Object object2) {
        return it_02.e(object, object2);
    }

    static Object b(it_0 it_02, Object object, Object object2) {
        return it_02.g(object, object2);
    }

    static float c(it_0 it_02, Object object) {
        return it_02.h(object);
    }

    static void f(it_0 it_02, Object object, float f10) {
        it_02.f(object, f10);
    }

    static float r(it_0 it_02, Object object) {
        return it_02.w(object);
    }

    static void d(it_0 it_02, Object object, float f10) {
        it_02.h(object, f10);
    }

    static Object l(it_0 it_02, Object object) {
        return it_02.q(object);
    }

    static void e(it_0 it_02, Object object, Object object2) {
        it_02.c(object, object2);
    }

    static void i(it_0 it_02, Object object) {
        it_02.i(object);
    }

    static Object d(it_0 it_02, Object object, Object object2) {
        return it_02.a(object, object2);
    }

    static Object h(it_0 it_02, Object object) {
        return it_02.m(object);
    }

    static float b(it_0 it_02, Object object) {
        return it_02.p(object);
    }

    static void c(it_0 it_02, Object object, float f10) {
        it_02.c(object, f10);
    }

    static void f(it_0 it_02, Object object, Object object2) {
        it_02.b(object, object2);
    }

    static void c(it_0 it_02, Object object, Object object2) {
        it_02.d(object, object2);
    }

    static void a(it_0 it_02, Object object, int n6) {
        it_02.a(object, n6);
    }

    static boolean n(it_0 it_02, Object object) {
        return it_02.j(object);
    }

    static boolean o(it_0 it_02, Object object) {
        return it_02.f(object);
    }

    static float j(it_0 it_02, Object object) {
        return it_02.k(object);
    }

    static float q(it_0 it_02, Object object) {
        return it_02.n(object);
    }

    static void e(it_0 it_02, Object object, float f10) {
        it_02.a(object, f10);
    }

    static float d(it_0 it_02, Object object) {
        return it_02.u(object);
    }

    static void a(it_0 it_02, Object object, float f10) {
        it_02.b(object, f10);
    }

    static float a(it_0 it_02, Object object) {
        return it_02.o(object);
    }

    static void b(it_0 it_02, Object object, float f10) {
        it_02.e(object, f10);
    }

    static float g(it_0 it_02, Object object) {
        return it_02.t(object);
    }

    static Object f(it_0 it_02, Object object) {
        return it_02.e(object);
    }
}

