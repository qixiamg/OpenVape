/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

public class iS
extends gJ {
    private final bp_1 e = this.a("func_148090_a", cy_0.c, Void.TYPE, Float.TYPE);
    private final bp_1 d = this.a("func_148087_a", cy_0.c, Void.TYPE, Float.TYPE, Float.TYPE);
    private static cy_0[] a;

    public iS() {
        super(A5.di);
    }

    public void a(Object object, float f10) {
        this.e.p(object, Float.valueOf(f10));
    }

    public void a(Object object, float f10, float f11) {
        this.d.p(object, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static void b(cy_0[] cy_0Array) {
        a = cy_0Array;
    }

    public static cy_0[] d() {
        return a;
    }

    static {
        if (iS.d() == null) {
            iS.b(new cy_0[4]);
        }
    }
}

