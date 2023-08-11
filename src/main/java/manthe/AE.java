/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ba_0;
import manthe.cy_0;
import manthe.pL;

public class AE {
    private final ba_0 c = new ba_0();
    private pL d = pL.b;
    private static cy_0[] b;

    public void a(pL pL2) {
        if (this.d == pL2) {
            return;
        }
        this.d = pL2;
        if (this.d == pL.d) {
            this.c.d();
        } else {
            this.c.c();
        }
    }

    public pL d() {
        if (this.d == null) {
            this.d = pL.b;
        }
        return this.d;
    }

    public void c() {
        this.c.c();
        this.d = pL.b;
    }

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] b() {
        return b;
    }

    static {
        if (AE.b() == null) {
            AE.b(new cy_0[5]);
        }
    }
}

