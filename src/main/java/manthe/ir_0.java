/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.ir
 */
public class ir_0
extends gJ {
    private final BG e;
    private final BG a;
    private final BG d;

    public ir_0() {
        super(A5.cL);
        if (V.c() >= 23) {
            this.e = this.a("LADDER", true, A5.F);
            this.a = this.a("STONE", true, A5.F);
            this.d = this.a("AIR", true, A5.F);
        } else {
            this.e = this.a("ladder", true, A5.F);
            this.a = this.a("stone", true, A5.F);
            this.d = this.a("air", true, A5.F);
        }
    }

    private Object f() {
        return this.e.f(null);
    }

    private Object e() {
        return this.a.f(null);
    }

    private Object d() {
        return this.d.f(null);
    }

    static Object a(ir_0 ir_02) {
        return ir_02.e();
    }

    static Object b(ir_0 ir_02) {
        return ir_02.d();
    }

    static Object c(ir_0 ir_02) {
        return ir_02.f();
    }
}

