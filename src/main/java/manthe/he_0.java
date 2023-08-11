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
 * Renamed from manthe.he
 */
public class he_0
extends gJ {
    private final bp_1 g;
    private final BG p = this.b("movementInput", true, A5.d1);
    public bp_1 e;
    public bp_1 k;
    public bp_1 d;
    private BG j;
    private BG f;
    private BG q;
    private BG r;
    private BG i;
    private BG o;
    private BG h;
    private BG n;
    private BG m;
    private BG l;
    private static String a;

    public he_0() {
        super(A5.u);
        if (V.c() > 13) {
            if (V.c() >= 23) {
                this.j = this.b("field_191988_bg", false, Float.TYPE);
                this.f = this.b("connection", true, A5.dV);
            } else {
                this.f = this.b("sendQueue", true, A5.dV);
            }
            this.q = this.b("lastReportedPosX", true, Double.TYPE);
            this.r = this.b("lastReportedPosY", true, Double.TYPE);
            this.i = this.b("lastReportedPosZ", true, Double.TYPE);
            this.o = this.b("lastReportedYaw", true, Float.TYPE);
            this.h = this.b("lastReportedPitch", true, Float.TYPE);
            this.n = this.b("serverSneakState", true, Boolean.TYPE);
            this.m = this.b("serverSprintState", true, Boolean.TYPE);
            this.l = this.b("positionUpdateTicks", true, Integer.TYPE);
            this.e = this.a("sendChatMessage", true, Void.TYPE, String.class);
            this.k = this.a("onUpdateWalkingPlayer", true, Void.TYPE, new Class[0]);
        }
        this.g = this.a("setSprinting", true, Void.TYPE, Boolean.TYPE);
        this.d = this.a("playSound", true, Void.TYPE, String.class, Float.TYPE, Float.TYPE);
    }

    public float c(Object object) {
        return this.j.b(object);
    }

    public void c(Object object, float f10) {
        this.j.a(object, f10);
    }

    public Object b(Object object) {
        return this.p.f(object);
    }

    private Object a(Object object) {
        return this.f.f(object);
    }

    private double d(Object object) {
        return this.q.g(object);
    }

    private double j(Object object) {
        return this.r.g(object);
    }

    private double f(Object object) {
        return this.i.g(object);
    }

    private float h(Object object) {
        return this.o.b(object);
    }

    private float e(Object object) {
        return this.h.b(object);
    }

    private boolean g(Object object) {
        return this.n.d(object);
    }

    private boolean k(Object object) {
        return this.m.d(object);
    }

    private void b(Object object, double d3) {
        this.q.a(object, d3);
    }

    private void a(Object object, double d3) {
        this.r.a(object, d3);
    }

    private void c(Object object, double d3) {
        this.i.a(object, d3);
    }

    private void a(Object object, float f10) {
        this.o.a(object, f10);
    }

    private void b(Object object, float f10) {
        this.h.a(object, f10);
    }

    private void a(Object object, boolean bl) {
        this.n.a(object, bl);
    }

    private void c(Object object, boolean bl) {
        this.m.a(object, bl);
    }

    private int i(Object object) {
        return this.l.c(object);
    }

    private void a(Object object, int n6) {
        this.l.a(object, n6);
    }

    private void b(Object object, boolean bl) {
        this.g.p(object, bl);
    }

    private void a(Object object, String string) {
        this.e.p(object, string);
    }

    static Object g(he_0 he_02, Object object) {
        return he_02.a(object);
    }

    static double a(he_0 he_02, Object object) {
        return he_02.d(object);
    }

    static void a(he_0 he_02, Object object, double d3) {
        he_02.b(object, d3);
    }

    static double i(he_0 he_02, Object object) {
        return he_02.j(object);
    }

    static void b(he_0 he_02, Object object, double d3) {
        he_02.a(object, d3);
    }

    static double c(he_0 he_02, Object object) {
        return he_02.f(object);
    }

    static void c(he_0 he_02, Object object, double d3) {
        he_02.c(object, d3);
    }

    static float b(he_0 he_02, Object object) {
        return he_02.h(object);
    }

    static void a(he_0 he_02, Object object, float f10) {
        he_02.a(object, f10);
    }

    static float f(he_0 he_02, Object object) {
        return he_02.e(object);
    }

    static void b(he_0 he_02, Object object, float f10) {
        he_02.b(object, f10);
    }

    static boolean e(he_0 he_02, Object object) {
        return he_02.g(object);
    }

    static void b(he_0 he_02, Object object, boolean bl) {
        he_02.a(object, bl);
    }

    static boolean d(he_0 he_02, Object object) {
        return he_02.k(object);
    }

    static void a(he_0 he_02, Object object, boolean bl) {
        he_02.c(object, bl);
    }

    static int h(he_0 he_02, Object object) {
        return he_02.i(object);
    }

    static void a(he_0 he_02, Object object, int n6) {
        he_02.a(object, n6);
    }

    static void c(he_0 he_02, Object object, boolean bl) {
        he_02.b(object, bl);
    }

    static void a(he_0 he_02, Object object, String string) {
        he_02.a(object, string);
    }

    public static void b(String string) {
        a = string;
    }

    public static String d() {
        return a;
    }

    static {
        if (he_0.d() == null) {
            he_0.b("gUzzvb");
        }
    }
}

