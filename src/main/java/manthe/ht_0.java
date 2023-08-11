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
 * Renamed from manthe.ht
 */
public class ht_0
extends gJ {
    private final BG d;
    private final BG a;
    private final bp_1 g;
    private final bp_1 e;
    private static int f;

    public ht_0() {
        super(A5.Y);
        if (V.c() >= 23) {
            this.d = this.a("AIR", true, A5.Y);
            this.a = this.a("WATER", true, A5.Y);
        } else {
            this.d = this.a("air", true, A5.Y);
            this.a = this.a("water", true, A5.Y);
        }
        this.g = this.a("isReplaceable", true, Boolean.TYPE, new Class[0]);
        this.e = this.a("blocksMovement", true, Boolean.TYPE, new Class[0]);
    }

    public boolean b(Object object) {
        return this.g.h(object, new Object[0]);
    }

    public Object d() {
        return this.d.f(null);
    }

    public Object e() {
        return this.a.f(null);
    }

    public boolean a(Object object) {
        return this.e.h(object, new Object[0]);
    }

    public static void a(int n6) {
        f = n6;
    }

    public static int f() {
        return f;
    }

    public static int g() {
        int n6 = ht_0.f();
        if (n6 == 0) {
            return 83;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ht_0.g() == 0) {
            ht_0.a(64);
        }
    }
}

