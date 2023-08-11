/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cm_0;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.in
 */
public class in_0
extends gJ {
    private final bp_1 d;
    private final bp_1 g;
    private final bp_1 a;
    private final bp_1 e;
    private bp_1 h;
    private final BG f;

    public in_0() {
        super(A5.a1);
        if (V.c() >= 23) {
            this.d = this.b("getEnchantmentLevel", true, Integer.TYPE, A5.dh, A5.bT);
            this.a = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, Iterable.class, A5.bQ);
            this.h = this.b("getDepthStriderModifier", true, Integer.TYPE, A5.cF);
            this.e = this.b("applyEnchantmentModifierArray", true, Void.TYPE, A5.bW, Iterable.class);
            this.g = this.b("getModifierForCreature", true, Float.TYPE, A5.bT, A5.cK);
        } else {
            if (V.c() > 13) {
                this.h = this.b("getDepthStriderModifier", true, Integer.TYPE, A5.ba);
            }
            this.d = this.b("getEnchantmentLevel", true, Integer.TYPE, Integer.TYPE, A5.bT);
            this.a = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, cm_0.b(A5.bT), A5.bQ);
            this.e = this.b("applyEnchantmentModifierArray", true, Void.TYPE, A5.bW, cm_0.b(A5.bT));
            this.g = this.b("func_152377_a", cy_0.c, Float.TYPE, A5.bT, A5.cK);
        }
        this.f = this.a(V.c() >= 23 ? "ENCHANTMENT_MODIFIER_DAMAGE" : "enchantmentModifierDamage", true, A5.aQ);
    }

    private void a(Object object, Iterable iterable) {
        try {
            this.e.p(null, object, iterable);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(Object object, Object[] objectArray) {
        try {
            this.e.p(null, object, objectArray);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private float b(Object object, Object object2) {
        return this.g.f(null, object, object2);
    }

    private Object d() {
        return this.f.f(null);
    }

    private int a(Object object) {
        if (this.h == null) {
            return 0;
        }
        return this.h.o(null, object);
    }

    private int a(int n6, Object object) {
        return this.d.o(null, n6, object);
    }

    private int a(Object object, Object object2) {
        return this.d.o(null, object, object2);
    }

    private int a(Object[] objectArray, Object object) {
        return this.a.o(null, objectArray, object);
    }

    private int a(Iterable iterable, Object object) {
        return this.a.o(null, iterable, object);
    }

    static int b(in_0 in_02, Object object, Object object2) {
        return in_02.a(object, object2);
    }

    static int a(in_0 in_02, int n6, Object object) {
        return in_02.a(n6, object);
    }

    static int a(in_0 in_02, Object object) {
        return in_02.a(object);
    }

    static float a(in_0 in_02, Object object, Object object2) {
        return in_02.b(object, object2);
    }

    static int a(in_0 in_02, Iterable iterable, Object object) {
        return in_02.a(iterable, object);
    }

    static int a(in_0 in_02, Object[] objectArray, Object object) {
        return in_02.a(objectArray, object);
    }

    static Object a(in_0 in_02) {
        return in_02.d();
    }

    static void a(in_0 in_02, Object object, Iterable iterable) {
        in_02.a(object, iterable);
    }

    static void a(in_0 in_02, Object object, Object[] objectArray) {
        in_02.a(object, objectArray);
    }
}

