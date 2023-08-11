/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.cy_0;
import manthe.gJ;

public class jV
extends gJ {
    private final BG a = this.a("ATTACK", cy_0.c, A5.b7);
    private final BG d = V.c() == 13 ? this.a("INTERACT", cy_0.c, A5.b7) : this.a("INTERACT_AT", cy_0.c, A5.b7);

    public jV() {
        super(A5.b7);
    }

    private Object d() {
        return this.a.f(null);
    }

    private Object e() {
        return this.d.f(null);
    }

    static Object b(jV jV2) {
        return jV2.d();
    }

    static Object a(jV jV2) {
        return jV2.e();
    }
}

