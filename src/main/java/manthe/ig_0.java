/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.ig
 */
public class ig_0
extends gJ {
    private final bp_1 e = this.a("loadRenderers", true, Void.TYPE, new Class[0]);
    public bp_1 a;
    public bp_1 d;

    public ig_0() {
        super(A5.dp);
        if (V.c() == 13) {
            this.a = this.a("updateRenderers", true, Boolean.TYPE, A5.cF, Boolean.TYPE);
        } else {
            this.d = this.a("updateChunks", true, Void.TYPE, Long.TYPE);
        }
    }

    private void a(Object object) {
        this.e.p(object, new Object[0]);
    }

    static void a(ig_0 ig_02, Object object) {
        ig_02.a(object);
    }
}

