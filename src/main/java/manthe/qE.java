/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.si_0;

public abstract class qE {
    private final si_0 a;
    private static cy_0[] b;

    public qE(si_0 si_02) {
        this.a = si_02;
    }

    public abstract void a(Object var1);

    public si_0 a() {
        return this.a;
    }

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] b() {
        return b;
    }

    static {
        if (qE.b() != null) {
            qE.b(new cy_0[1]);
        }
    }
}

