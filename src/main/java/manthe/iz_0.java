/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.iz
 */
public class iz_0
extends gJ {
    private final BG r = this.b("keyBindAttack", true, A5.ci);
    private final BG o = this.b("keyBindUseItem", true, A5.ci);
    private final BG q = this.b("guiScale", true, Integer.TYPE);
    private final BG i = this.b("keyBindInventory", true, A5.ci);
    private final BG p = this.b("viewBobbing", true, Boolean.TYPE);
    private final BG d;
    private final BG v;
    private final BG g;
    private final BG n;
    private final BG l;
    private final BG h;
    private final BG e;
    private final BG m;
    private final BG w;
    private final BG t;
    private final BG u;
    private final BG x;
    private final BG j;
    private final BG a;
    private final BG k = this.b("ofFastRender", false, Boolean.TYPE);
    private final BG s;
    private final BG f;

    public iz_0() {
        super(A5.dr);
        this.m = this.b("gammaSetting", true, Float.TYPE);
        this.f = this.b("ofAaLevel", true, Integer.TYPE);
        this.j = this.b("fboEnable", true, Boolean.TYPE);
        this.d = this.b("keyBindForward", true, A5.ci);
        this.v = this.b("keyBindBack", true, A5.ci);
        this.g = this.b("keyBindLeft", true, A5.ci);
        this.n = this.b("keyBindRight", true, A5.ci);
        this.l = this.b("keyBindJump", true, A5.ci);
        this.h = this.b("keyBindSneak", true, A5.ci);
        this.w = this.b("keyBindSprint", true, A5.ci);
        this.t = this.b("keyBindDrop", true, A5.ci);
        this.x = this.b("hideGUI", true, Boolean.TYPE);
        this.s = this.b("thirdPersonView", true, Integer.TYPE);
        this.u = this.b("mouseSensitivity", true, Float.TYPE);
        this.a = this.b("fovSetting", true, Float.TYPE);
        this.e = V.c() > 13 ? this.b("clouds", true, Integer.TYPE) : this.b("clouds", true, Boolean.TYPE);
    }

    private Object s(Object object) {
        return this.r.f(object);
    }

    private Object f(Object object) {
        return this.o.f(object);
    }

    private Object p(Object object) {
        return this.d.f(object);
    }

    private Object e(Object object) {
        return this.v.f(object);
    }

    private Object j(Object object) {
        return this.g.f(object);
    }

    private Object q(Object object) {
        return this.n.f(object);
    }

    private Object n(Object object) {
        return this.l.f(object);
    }

    private Object h(Object object) {
        return this.h.f(object);
    }

    private Object a(Object object) {
        return this.w.f(object);
    }

    private Object i(Object object) {
        return this.t.f(object);
    }

    private int w(Object object) {
        return this.q.c(object);
    }

    private void b(Object object, int n6) {
        this.q.a(object, n6);
    }

    private Object o(Object object) {
        return this.i.f(object);
    }

    private boolean k(Object object) {
        return this.p.d(object);
    }

    private void b(Object object, boolean bl) {
        this.p.a(object, bl);
    }

    private boolean t(Object object) {
        if (this.k.d()) {
            return false;
        }
        return this.k.d(object);
    }

    private void c(Object object, boolean bl) {
        if (this.k.d()) {
            return;
        }
        this.k.a(object, bl);
    }

    private int u(Object object) {
        if (this.f.d()) {
            return 0;
        }
        return this.f.c(object);
    }

    private void a(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private boolean g(Object object) {
        return this.e.d(object);
    }

    private void a(Object object, int n6) {
        this.e.a(object, n6);
    }

    private int d(Object object) {
        return this.e.c(object);
    }

    private float m(Object object) {
        return this.m.b(object);
    }

    private void b(Object object, float f10) {
        this.m.a(object, f10);
    }

    private boolean v(Object object) {
        return this.x.d(object);
    }

    private void d(Object object, boolean bl) {
        this.x.a(object, bl);
    }

    private int b(Object object) {
        return this.s.c(object);
    }

    private void c(Object object, int n6) {
        this.s.a(object, n6);
    }

    private float l(Object object) {
        return this.u.b(object);
    }

    private boolean c(Object object) {
        return this.j.d(object);
    }

    private float r(Object object) {
        return this.a.b(object);
    }

    private void a(Object object, float f10) {
        this.a.a(object, f10);
    }

    static Object f(iz_0 iz_02, Object object) {
        return iz_02.s(object);
    }

    static Object l(iz_0 iz_02, Object object) {
        return iz_02.f(object);
    }

    static Object m(iz_0 iz_02, Object object) {
        return iz_02.o(object);
    }

    static Object h(iz_0 iz_02, Object object) {
        return iz_02.p(object);
    }

    static Object k(iz_0 iz_02, Object object) {
        return iz_02.e(object);
    }

    static Object b(iz_0 iz_02, Object object) {
        return iz_02.j(object);
    }

    static Object g(iz_0 iz_02, Object object) {
        return iz_02.q(object);
    }

    static Object w(iz_0 iz_02, Object object) {
        return iz_02.n(object);
    }

    static Object i(iz_0 iz_02, Object object) {
        return iz_02.h(object);
    }

    static int j(iz_0 iz_02, Object object) {
        return iz_02.w(object);
    }

    static void c(iz_0 iz_02, Object object, int n6) {
        iz_02.b(object, n6);
    }

    static boolean e(iz_0 iz_02, Object object) {
        return iz_02.k(object);
    }

    static void b(iz_0 iz_02, Object object, boolean bl) {
        iz_02.b(object, bl);
    }

    static boolean q(iz_0 iz_02, Object object) {
        return iz_02.t(object);
    }

    static void d(iz_0 iz_02, Object object, boolean bl) {
        iz_02.c(object, bl);
    }

    static int p(iz_0 iz_02, Object object) {
        return iz_02.d(object);
    }

    static boolean u(iz_0 iz_02, Object object) {
        return iz_02.g(object);
    }

    static void a(iz_0 iz_02, Object object, int n6) {
        iz_02.a(object, n6);
    }

    static void c(iz_0 iz_02, Object object, boolean bl) {
        iz_02.a(object, bl);
    }

    static float t(iz_0 iz_02, Object object) {
        return iz_02.m(object);
    }

    static void a(iz_0 iz_02, Object object, float f10) {
        iz_02.b(object, f10);
    }

    static Object a(iz_0 iz_02, Object object) {
        return iz_02.a(object);
    }

    static Object s(iz_0 iz_02, Object object) {
        return iz_02.i(object);
    }

    static boolean o(iz_0 iz_02, Object object) {
        return iz_02.v(object);
    }

    static void a(iz_0 iz_02, Object object, boolean bl) {
        iz_02.d(object, bl);
    }

    static int n(iz_0 iz_02, Object object) {
        return iz_02.b(object);
    }

    static void b(iz_0 iz_02, Object object, int n6) {
        iz_02.c(object, n6);
    }

    static float r(iz_0 iz_02, Object object) {
        return iz_02.l(object);
    }

    static int c(iz_0 iz_02, Object object) {
        return iz_02.u(object);
    }

    static boolean v(iz_0 iz_02, Object object) {
        return iz_02.c(object);
    }

    static float d(iz_0 iz_02, Object object) {
        return iz_02.r(object);
    }

    static void b(iz_0 iz_02, Object object, float f10) {
        iz_02.a(object, f10);
    }
}

