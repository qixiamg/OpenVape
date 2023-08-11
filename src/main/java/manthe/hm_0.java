/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.hm
 */
public class hm_0
extends gJ {
    public final bp_1 i;
    public final bp_1 m;
    public final bp_1 g;
    public final bp_1 j;
    public final bp_1 k;
    public final bp_1 f;
    public final bp_1 n;
    public final bp_1 d;
    public final bp_1 h;
    private final BG a;
    private final BG e;
    private static boolean l;

    public hm_0() {
        super(A5.aZ);
        if (V.c() >= 23) {
            this.a = this.b("connection", true, A5.dV);
            this.g = this.a("windowClick", true, A5.bT, Integer.TYPE, Integer.TYPE, Integer.TYPE, A5.cy, A5.cc);
            this.n = this.a("processRightClick", true, A5.a_, A5.cc, A5.r, A5.a6);
        } else {
            this.a = this.b("netClientHandler", true, A5.dV);
            this.g = this.a("windowClick", true, A5.bT, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, A5.cc);
            this.n = this.a("sendUseItem", true, Boolean.TYPE, A5.cc, A5.r, A5.bT);
        }
        this.e = this.b("isHittingBlock", true, Boolean.TYPE);
        this.i = this.a("getBlockReachDistance", true, Float.TYPE, new Class[0]);
        this.m = this.a("extendedReach", true, Boolean.TYPE, new Class[0]);
        this.j = this.a("attackEntity", true, Void.TYPE, A5.cc, A5.ba);
        this.k = this.a("syncCurrentPlayItem", true, Void.TYPE, new Class[0]);
        this.d = this.a("updateController", true, Void.TYPE, new Class[0]);
        this.h = this.a("onStoppedUsingItem", true, Void.TYPE, A5.cc);
        this.f = V.c() > 13 ? (V.c() >= 23 ? this.a("processRightClickBlock", true, A5.a_, A5.u, A5.b6, A5.ao, A5.aY, A5.aW, A5.a6) : this.a("onPlayerRightClick", true, Boolean.TYPE, A5.u, A5.b6, A5.bT, A5.ao, A5.aY, A5.aW)) : this.a("onPlayerRightClick", true, Boolean.TYPE, A5.cc, A5.r, A5.bT, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, A5.aW);
    }

    public void c(Object object) {
        this.d.p(object, new Object[0]);
    }

    public boolean a(Object object, Object object2, Object object3, Object object4) {
        return this.n.h(object, object2, object3, object4);
    }

    public Object b(Object object, Object object2, Object object3, Object object4) {
        return this.n.e(object, object2, object3, object4);
    }

    public void a(Object object, Object object2) {
        this.h.p(object, object2);
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.f.h(object, object2, object3, object4, object5, object6, object7);
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, int n6, int n10, int n11, int n12, Object object5) {
        return this.f.h(object, object2, object3, object4, n6, n10, n11, n12, object5);
    }

    public boolean b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.f.h(object, object2, object3, object4, object5, object6, object7);
    }

    public float a(Object object) {
        return this.i.f(object, new Object[0]);
    }

    public boolean b(Object object) {
        return this.m.h(object, new Object[0]);
    }

    public Object a(Object object, int n6, int n10, int n11, int n12, Object object2) {
        return this.g.e(object, n6, n10, n11, n12, object2);
    }

    public Object a(Object object, int n6, int n10, int n11, Object object2, Object object3) {
        return this.g.e(object, n6, n10, n11, object2, object3);
    }

    private void a(Object object, Object object2, Object object3) {
        this.j.p(object, object2, object3);
    }

    private void d(Object object) {
        this.k.p(object, new Object[0]);
    }

    private Object f(Object object) {
        return this.a.f(object);
    }

    private boolean e(Object object) {
        return this.e.d(object);
    }

    static void a(hm_0 hm_02, Object object, Object object2, Object object3) {
        hm_02.a(object, object2, object3);
    }

    static void a(hm_0 hm_02, Object object) {
        hm_02.d(object);
    }

    static Object c(hm_0 hm_02, Object object) {
        return hm_02.f(object);
    }

    static boolean b(hm_0 hm_02, Object object) {
        return hm_02.e(object);
    }

    public static void b(boolean bl) {
        l = bl;
    }

    public static boolean f() {
        return l;
    }

    public static boolean e() {
        boolean bl = hm_0.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!hm_0.e()) {
            hm_0.b(true);
        }
    }
}

