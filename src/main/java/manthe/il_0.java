/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.il
 */
public class il_0
extends gJ {
    private final bp_1 a;
    private final bp_1 k = this.a("<init>", false, Void.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE);
    private final bp_1 g;
    private final bp_1 i;
    private final bp_1 f;
    private final bp_1 j;
    private final bp_1 e;
    private final bp_1 h;
    private final BG d;

    public il_0() {
        super(A5.g);
        this.a = this.a("createBindFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.g = this.a("bindFramebuffer", true, Void.TYPE, Boolean.TYPE);
        this.i = this.a("unbindFramebuffer", true, Void.TYPE, new Class[0]);
        this.f = this.a("bindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.j = this.a("unbindFramebufferTexture", true, Void.TYPE, new Class[0]);
        this.e = this.a("createFramebuffer", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.h = this.a("deleteFramebuffer", true, Void.TYPE, new Class[0]);
        this.d = this.b("depthBuffer", true, Integer.TYPE);
    }

    private Object a(int n6, int n10, boolean bl) {
        return this.k.a(new Object[]{n6, n10, bl});
    }

    private void b(Object object, int n6, int n10) {
        this.a.p(object, n6, n10);
    }

    private void a(Object object, int n6, int n10) {
        this.e.p(object, n6, n10);
    }

    private void a(Object object, boolean bl) {
        this.g.p(object, bl);
    }

    private void c(Object object) {
        this.i.p(object, new Object[0]);
    }

    private void b(Object object) {
        this.f.p(object, new Object[0]);
    }

    private void d(Object object) {
        this.j.p(object, new Object[0]);
    }

    private int a(Object object) {
        return this.d.c(object);
    }

    private void a(Object object, int n6) {
        this.d.a(object, n6);
    }

    private void e(Object object) {
        this.h.p(object, new Object[0]);
    }

    static Object a(il_0 il_02, int n6, int n10, boolean bl) {
        return il_02.a(n6, n10, bl);
    }

    static void a(il_0 il_02, Object object, int n6, int n10) {
        il_02.b(object, n6, n10);
    }

    static void b(il_0 il_02, Object object, int n6, int n10) {
        il_02.a(object, n6, n10);
    }

    static void a(il_0 il_02, Object object, boolean bl) {
        il_02.a(object, bl);
    }

    static void a(il_0 il_02, Object object) {
        il_02.c(object);
    }

    static void b(il_0 il_02, Object object) {
        il_02.b(object);
    }

    static void e(il_0 il_02, Object object) {
        il_02.d(object);
    }

    static int c(il_0 il_02, Object object) {
        return il_02.a(object);
    }

    static void a(il_0 il_02, Object object, int n6) {
        il_02.a(object, n6);
    }

    static void d(il_0 il_02, Object object) {
        il_02.e(object);
    }
}

