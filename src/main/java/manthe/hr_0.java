/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.hr
 */
public class hr_0
extends gJ {
    private final BG n;
    private final BG j;
    private final BG k;
    private final BG p;
    private final BG o;
    private final BG r;
    private final BG i;
    private final BG l;
    private final BG h;
    private final BG g;
    private final BG d;
    private final BG a;
    private final BG f;
    private final BG t;
    private final BG m;
    private final BG s = V.c() == 13 ? this.a("field_147001_a", false, A5.ca) : this.a(V.c() >= 23 ? "INVENTORY_BACKGROUND" : "inventoryBackground", true, A5.ca);
    private final bp_1 q;
    private final bp_1 e;

    public hr_0() {
        super(A5.bt);
        this.n = this.b("inventorySlots", true, A5.aS);
        this.j = this.b("field_146993_M", cy_0.c, Boolean.TYPE);
        this.k = this.b("field_146995_H", cy_0.c, Boolean.TYPE);
        this.p = this.b("guiLeft", true, Integer.TYPE);
        this.o = this.b("guiTop", true, Integer.TYPE);
        this.r = this.b("xSize", true, Integer.TYPE);
        this.i = this.b("ySize", true, Integer.TYPE);
        this.l = this.b("field_146994_N", cy_0.c, A5.bT);
        this.h = this.b("field_146998_K", cy_0.c, A5.aF);
        this.g = this.b("field_146997_J", cy_0.c, Long.TYPE);
        this.d = this.b("field_146992_L", cy_0.c, Integer.TYPE);
        this.a = this.b("field_147007_t", cy_0.c, Boolean.TYPE);
        this.f = this.b("field_146988_G", cy_0.c, Integer.TYPE);
        this.t = this.b("field_147008_s", cy_0.c, Set.class);
        this.m = this.b("field_146987_F", cy_0.c, Integer.TYPE);
        this.q = this.a("getSlotAtPosition", true, A5.aF, Integer.TYPE, Integer.TYPE);
        this.e = V.c() >= 23 ? this.a("handleMouseClick", true, Void.TYPE, A5.aF, Integer.TYPE, Integer.TYPE, A5.cy) : this.a("handleMouseClick", true, Void.TYPE, A5.aF, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    }

    public Object d() {
        return this.s.f(null);
    }

    public Object g(Object object) {
        return this.n.f(object);
    }

    private Object a(Object object, int n6, int n10) {
        return this.q.e(object, n6, n10);
    }

    private void a(Object object, boolean bl) {
        this.j.a(object, bl);
    }

    private void b(Object object, boolean bl) {
        this.k.a(object, bl);
    }

    private int d(Object object) {
        return this.p.c(object);
    }

    private int c(Object object) {
        return this.o.c(object);
    }

    private int b(Object object) {
        return this.r.c(object);
    }

    private int a(Object object) {
        return this.i.c(object);
    }

    private Object e(Object object) {
        return this.l.f(object);
    }

    private void a(Object object, Object object2) {
        this.l.a(object, object2);
    }

    private void a(Object object, Object object2, int n6, int n10, int n11) {
        this.e.p(object, object2, n6, n10, n11);
    }

    private void a(Object object, Object object2, int n6, int n10, Object object3) {
        this.e.p(object, object2, n6, n10, object3);
    }

    private void b(Object object, Object object2) {
        this.h.a(object, object2);
    }

    private void a(Object object, long l6) {
        this.g.a(object, l6);
    }

    private void b(Object object, int n6) {
        this.d.a(object, n6);
    }

    private void c(Object object, boolean bl) {
        this.a.a(object, bl);
    }

    private void c(Object object, int n6) {
        this.f.a(object, n6);
    }

    private Set f(Object object) {
        return (Set)this.t.f(object);
    }

    private void a(Object object, int n6) {
        this.m.a(object, n6);
    }

    static Object a(hr_0 hr_02, Object object, int n6, int n10) {
        return hr_02.a(object, n6, n10);
    }

    static void a(hr_0 hr_02, Object object, boolean bl) {
        hr_02.a(object, bl);
    }

    static void c(hr_0 hr_02, Object object, boolean bl) {
        hr_02.b(object, bl);
    }

    static int d(hr_0 hr_02, Object object) {
        return hr_02.d(object);
    }

    static int b(hr_0 hr_02, Object object) {
        return hr_02.c(object);
    }

    static int e(hr_0 hr_02, Object object) {
        return hr_02.b(object);
    }

    static int f(hr_0 hr_02, Object object) {
        return hr_02.a(object);
    }

    static Object c(hr_0 hr_02, Object object) {
        return hr_02.e(object);
    }

    static void b(hr_0 hr_02, Object object, Object object2) {
        hr_02.a(object, object2);
    }

    static void a(hr_0 hr_02, Object object, Object object2, int n6, int n10, int n11) {
        hr_02.a(object, object2, n6, n10, n11);
    }

    static void a(hr_0 hr_02, Object object, Object object2, int n6, int n10, Object object3) {
        hr_02.a(object, object2, n6, n10, object3);
    }

    static void a(hr_0 hr_02, Object object, Object object2) {
        hr_02.b(object, object2);
    }

    static void a(hr_0 hr_02, Object object, long l6) {
        hr_02.a(object, l6);
    }

    static void c(hr_0 hr_02, Object object, int n6) {
        hr_02.b(object, n6);
    }

    static void b(hr_0 hr_02, Object object, boolean bl) {
        hr_02.c(object, bl);
    }

    static void a(hr_0 hr_02, Object object, int n6) {
        hr_02.c(object, n6);
    }

    static Set a(hr_0 hr_02, Object object) {
        return hr_02.f(object);
    }

    static void b(hr_0 hr_02, Object object, int n6) {
        hr_02.a(object, n6);
    }
}

