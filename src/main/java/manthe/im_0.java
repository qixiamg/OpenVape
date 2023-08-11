/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.im
 */
public class im_0
extends gJ {
    private final bp_1 f = this.a("getSizeInventory", true, Integer.TYPE, new Class[0]);
    private final bp_1 e = this.a("getStackInSlot", true, A5.bT, Integer.TYPE);
    private bp_1 a;
    private bp_1 d;

    public im_0() {
        super(A5.ap);
        if (V.c() == 13) {
            this.a = this.a("getInventoryName", true, String.class, new Class[0]);
            this.d = this.a("hasCustomInventoryName", true, Boolean.TYPE, new Class[0]);
        }
    }

    private int b(Object object) {
        return this.f.o(object, new Object[0]);
    }

    private Object a(Object object, int n6) {
        return this.e.e(object, n6);
    }

    private String a(Object object) {
        return this.a.e(object, new Object[0]).toString();
    }

    private boolean c(Object object) {
        return this.d.h(object, new Object[0]);
    }

    static String b(im_0 im_02, Object object) {
        return im_02.a(object);
    }

    static int c(im_0 im_02, Object object) {
        return im_02.b(object);
    }

    static Object a(im_0 im_02, Object object, int n6) {
        return im_02.a(object, n6);
    }

    static boolean a(im_0 im_02, Object object) {
        return im_02.c(object);
    }
}

