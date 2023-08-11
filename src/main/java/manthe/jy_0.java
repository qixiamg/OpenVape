/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.jy
 */
public class jy_0
extends gJ {
    private final BG j;
    private final BG a;
    private final BG i = this.b("jump", true, Boolean.TYPE);
    private final BG f = this.b("sneak", true, Boolean.TYPE);
    private BG d;
    private BG e;
    private BG g;
    private BG h;

    public jy_0() {
        super(A5.d1);
        this.j = this.b("moveStrafe", true, Float.TYPE);
        if (V.c() >= 23) {
            this.d = this.b("forwardKeyDown", true, Boolean.TYPE);
            this.e = this.b("backKeyDown", true, Boolean.TYPE);
            this.g = this.b("leftKeyDown", true, Boolean.TYPE);
            this.h = this.b("rightKeyDown", true, Boolean.TYPE);
            this.a = this.b("field_192832_b", false, Float.TYPE);
        } else {
            this.a = this.b("moveForward", true, Float.TYPE);
        }
    }

    private boolean a(Object object) {
        return this.d.d(object);
    }

    private void b(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private boolean e(Object object) {
        return this.e.d(object);
    }

    private void e(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private boolean c(Object object) {
        return this.g.d(object);
    }

    private void f(Object object, boolean bl) {
        this.g.a(object, bl);
    }

    private boolean d(Object object) {
        return this.d.d(object);
    }

    private void c(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private boolean b(Object object) {
        return this.i.d(object);
    }

    private boolean h(Object object) {
        return this.f.d(object);
    }

    private void d(Object object, boolean bl) {
        this.i.a(object, bl);
    }

    private void a(Object object, boolean bl) {
        this.f.a(object, bl);
    }

    private float g(Object object) {
        return this.j.b(object);
    }

    private float f(Object object) {
        return this.a.b(object);
    }

    private void b(Object object, float f10) {
        this.j.a(object, f10);
    }

    private void a(Object object, float f10) {
        this.a.a(object, f10);
    }

    static boolean g(jy_0 jy_02, Object object) {
        return jy_02.a(object);
    }

    static void b(jy_0 jy_02, Object object, boolean bl) {
        jy_02.b(object, bl);
    }

    static boolean a(jy_0 jy_02, Object object) {
        return jy_02.e(object);
    }

    static void d(jy_0 jy_02, Object object, boolean bl) {
        jy_02.e(object, bl);
    }

    static boolean e(jy_0 jy_02, Object object) {
        return jy_02.c(object);
    }

    static void a(jy_0 jy_02, Object object, boolean bl) {
        jy_02.f(object, bl);
    }

    static boolean f(jy_0 jy_02, Object object) {
        return jy_02.d(object);
    }

    static void c(jy_0 jy_02, Object object, boolean bl) {
        jy_02.c(object, bl);
    }

    static float c(jy_0 jy_02, Object object) {
        return jy_02.g(object);
    }

    static void a(jy_0 jy_02, Object object, float f10) {
        jy_02.b(object, f10);
    }

    static float h(jy_0 jy_02, Object object) {
        return jy_02.f(object);
    }

    static void b(jy_0 jy_02, Object object, float f10) {
        jy_02.a(object, f10);
    }

    static boolean d(jy_0 jy_02, Object object) {
        return jy_02.b(object);
    }

    static void f(jy_0 jy_02, Object object, boolean bl) {
        jy_02.d(object, bl);
    }

    static boolean b(jy_0 jy_02, Object object) {
        return jy_02.h(object);
    }

    static void e(jy_0 jy_02, Object object, boolean bl) {
        jy_02.a(object, bl);
    }
}

