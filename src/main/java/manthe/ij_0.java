/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.ij
 */
public class ij_0
extends gJ {
    private final bp_1 e = this.a("<init>", false, Void.TYPE, new Class[0]);
    private final BG a = this.b("isCreativeMode", true, Boolean.TYPE);
    private final BG k = this.b("disableDamage", true, Boolean.TYPE);
    private final BG h = this.b("allowFlying", true, Boolean.TYPE);
    private final BG j = this.b("allowEdit", true, Boolean.TYPE);
    private final BG d = this.b("isFlying", true, Boolean.TYPE);
    private final bp_1 m;
    private final bp_1 i;
    private final bp_1 f;
    private final bp_1 g = this.a("getWalkSpeed", true, Float.TYPE, new Class[0]);
    private static boolean l;

    public ij_0() {
        super(A5.c6);
        this.f = this.a("setPlayerWalkSpeed", true, Void.TYPE, Float.TYPE);
        this.i = this.a("getFlySpeed", true, Float.TYPE, new Class[0]);
        this.m = this.a("setFlySpeed", true, Void.TYPE, Float.TYPE);
    }

    private Object f() {
        return this.e.a(new Object[0]);
    }

    private boolean g(Object object) {
        return this.a.d(object);
    }

    private boolean b(Object object) {
        return this.k.d(object);
    }

    private boolean e(Object object) {
        return this.h.d(object);
    }

    private void b(Object object, boolean bl) {
        this.h.a(object, bl);
    }

    private boolean d(Object object) {
        return this.j.d(object);
    }

    private boolean f(Object object) {
        return this.d.d(object);
    }

    private void a(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    private float c(Object object) {
        return this.g.f(object, new Object[0]);
    }

    private void a(Object object, float f10) {
        this.f.p(object, Float.valueOf(f10));
    }

    private float a(Object object) {
        return this.i.f(object, new Object[0]);
    }

    private void b(Object object, float f10) {
        this.m.p(object, Float.valueOf(f10));
    }

    static Object a(ij_0 ij_02) {
        return ij_02.f();
    }

    static boolean g(ij_0 ij_02, Object object) {
        return ij_02.g(object);
    }

    static boolean e(ij_0 ij_02, Object object) {
        return ij_02.b(object);
    }

    static boolean c(ij_0 ij_02, Object object) {
        return ij_02.e(object);
    }

    static void b(ij_0 ij_02, Object object, boolean bl) {
        ij_02.b(object, bl);
    }

    static boolean f(ij_0 ij_02, Object object) {
        return ij_02.d(object);
    }

    static boolean b(ij_0 ij_02, Object object) {
        return ij_02.f(object);
    }

    static void a(ij_0 ij_02, Object object, boolean bl) {
        ij_02.a(object, bl);
    }

    static float d(ij_0 ij_02, Object object) {
        return ij_02.c(object);
    }

    static void a(ij_0 ij_02, Object object, float f10) {
        ij_02.a(object, f10);
    }

    static float a(ij_0 ij_02, Object object) {
        return ij_02.a(object);
    }

    static void b(ij_0 ij_02, Object object, float f10) {
        ij_02.b(object, f10);
    }

    public static void b(boolean bl) {
        l = bl;
    }

    public static boolean d() {
        return l;
    }

    public static boolean e() {
        boolean bl = ij_0.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ij_0.e()) {
            ij_0.b(true);
        }
    }
}

