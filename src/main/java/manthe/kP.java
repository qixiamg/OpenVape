/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ao_0;
import manthe.cy_0;
import manthe.dx_2;
import manthe.eb_0;
import manthe.kl_0;
import manthe.on;

public class kP
extends kl_0 {
    private final eb_0 e;
    private final dx_2 f;
    private static cy_0[] d;

    public kP(Object object) {
        this.f = new dx_2(object);
        this.e = eb_0.f();
    }

    public eb_0 getTessellator() {
        return this.e;
    }

    public dx_2 getBlock() {
        return this.f;
    }

    @Override
    public boolean fire() {
        ao_0 ao_02 = on.p.H().b(ao_0.class);
        if (ao_02.N() && !ao_02.a(this.f) && this.e.g()) {
            this.e.a(255, 255, 255, ao_02.S());
        }
        return super.fire();
    }

    public static void a(cy_0[] cy_0Array) {
        d = cy_0Array;
    }

    public static cy_0[] e() {
        return d;
    }

    static {
        if (kP.e() != null) {
            kP.a(new cy_0[2]);
        }
    }
}

