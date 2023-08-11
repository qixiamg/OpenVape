/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.jp
 */
public class jp_0
extends gJ {
    private final BG e;
    private final BG a;
    private BG d;

    public jp_0() {
        super(A5.dq);
        if (V.c() >= 23) {
            this.a = this.b("field_194148_c", false, Float.TYPE);
        } else {
            this.d = this.b("timerSpeed", true, Float.TYPE);
            this.a = this.b("elapsedPartialTicks", true, Float.TYPE);
        }
        this.e = this.b("renderPartialTicks", true, Float.TYPE);
    }

    private void a(Object object, float f10) {
        this.d.a(object, f10);
    }

    private float b(Object object) {
        return this.e.b(object);
    }

    private float a(Object object) {
        return this.a.b(object);
    }

    static void a(jp_0 jp_02, Object object, float f10) {
        jp_02.a(object, f10);
    }

    static float a(jp_0 jp_02, Object object) {
        return jp_02.b(object);
    }

    static float b(jp_0 jp_02, Object object) {
        return jp_02.a(object);
    }
}

