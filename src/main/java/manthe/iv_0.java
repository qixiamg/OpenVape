/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

/*
 * Renamed from manthe.iv
 */
public class iv_0
extends gJ {
    private final BG e = this.b("toolMaterial", true, A5.az);
    private final BG d;
    private final BG a = this.b("efficiencyOnProperMaterial", true, Float.TYPE);

    public iv_0() {
        super(A5.aP);
        this.d = this.b("damageVsEntity", true, Float.TYPE);
    }

    private float a(Object object) {
        return this.a.b(object);
    }

    private Object b(Object object) {
        return this.e.f(object);
    }

    private float c(Object object) {
        return this.d.b(object);
    }

    static Object a(iv_0 iv_02, Object object) {
        return iv_02.b(object);
    }

    static float b(iv_0 iv_02, Object object) {
        return iv_02.c(object);
    }

    static float c(iv_0 iv_02, Object object) {
        return iv_02.a(object);
    }
}

