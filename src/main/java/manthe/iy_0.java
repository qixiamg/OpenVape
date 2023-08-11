/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.iy
 */
public class iy_0
extends gJ {
    private final BG d = this.b("damageReduceAmount", true, Integer.TYPE);
    private final BG e;
    private final BG a = this.b("material", true, A5.h);

    public iy_0() {
        super(A5.cN);
        this.e = V.c() >= 23 ? this.b("armorType", true, A5.cb) : this.b("armorType", true, Integer.TYPE);
    }

    private int a(Object object) {
        return this.d.c(object);
    }

    private int b(Object object) {
        return this.e.c(object);
    }

    private Object d(Object object) {
        return this.e.f(object);
    }

    private Object c(Object object) {
        return this.a.f(object);
    }

    static int c(iy_0 iy_02, Object object) {
        return iy_02.a(object);
    }

    static Object b(iy_0 iy_02, Object object) {
        return iy_02.d(object);
    }

    static int d(iy_0 iy_02, Object object) {
        return iy_02.b(object);
    }

    static Object a(iy_0 iy_02, Object object) {
        return iy_02.c(object);
    }
}

