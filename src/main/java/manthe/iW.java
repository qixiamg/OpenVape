/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

public class iW
extends gJ {
    public bp_1 a;
    private BG f;
    private bp_1 e;
    private static cy_0[] d;

    public iW() {
        super(A5.p);
        if (V.c() > 13) {
            this.e = this.a("getMainModel", true, A5.b_, new Class[0]);
        } else {
            this.f = this.b("modelBipedMain", true, A5.bz);
        }
        this.a = this.a("doRender", true, Void.TYPE, A5.cC, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
    }

    private Object a(Object object) {
        if (V.c() > 13) {
            return this.e.e(object, new Object[0]);
        }
        return this.f.f(object);
    }

    static Object a(iW iW2, Object object) {
        return iW2.a(object);
    }

    public static void b(cy_0[] cy_0Array) {
        d = cy_0Array;
    }

    public static cy_0[] d() {
        return d;
    }

    static {
        if (iW.d() == null) {
            iW.b(new cy_0[1]);
        }
    }
}

