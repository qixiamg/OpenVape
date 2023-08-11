/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

/*
 * Renamed from manthe.gm
 */
public class gm_0
extends gJ {
    private final BG e = this.b("red", false, Float.TYPE);
    private final BG a = this.b("green", false, Float.TYPE);
    private final BG d = this.b("blue", false, Float.TYPE);

    public gm_0() {
        super(A5.bh);
    }

    private float a(Object object) {
        return this.e.b(object);
    }

    private float b(Object object) {
        return this.a.b(object);
    }

    private float c(Object object) {
        return this.d.b(object);
    }

    private void b(Object object, float f10) {
        this.e.a(object, f10);
    }

    private void c(Object object, float f10) {
        this.a.a(object, f10);
    }

    private void a(Object object, float f10) {
        this.d.a(object, f10);
    }

    static float a(gm_0 gm_02, Object object) {
        return gm_02.a(object);
    }

    static void b(gm_0 gm_02, Object object, float f10) {
        gm_02.b(object, f10);
    }

    static float b(gm_0 gm_02, Object object) {
        return gm_02.b(object);
    }

    static void c(gm_0 gm_02, Object object, float f10) {
        gm_02.c(object, f10);
    }

    static float c(gm_0 gm_02, Object object) {
        return gm_02.c(object);
    }

    static void a(gm_0 gm_02, Object object, float f10) {
        gm_02.a(object, f10);
    }
}

