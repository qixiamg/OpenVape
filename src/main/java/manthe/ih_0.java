/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.ih
 */
public class ih_0
extends gJ {
    public bp_1 e;
    private BG f;
    private BG a;
    private bp_1 d;
    private bp_1 h;
    private bp_1 g;

    public ih_0() {
        super(A5.b2);
        if (V.c() == 13) {
            this.f = this.b("mainModel", true, A5.bw);
        } else {
            this.d = this.a("getMainModel", true, A5.bw, new Class[0]);
            this.a = this.b("field_177097_h", cy_0.c, List.class);
            this.h = this.a("unsetBrightness", true, Void.TYPE, new Class[0]);
            this.g = this.a("setBrightness", true, Boolean.TYPE, A5.cF, Float.TYPE, Boolean.TYPE);
            this.e = this.a("renderName", true, Void.TYPE, A5.cF, Double.TYPE, Double.TYPE, Double.TYPE);
        }
    }

    boolean a(Object object, Object object2, float f10, boolean bl) {
        return this.g.h(object, object2, Float.valueOf(f10), bl);
    }

    private Object a(Object object) {
        return this.a.f(object);
    }

    private Object b(Object object) {
        if (V.c() == 13) {
            return this.f.f(object);
        }
        return this.d.e(object, new Object[0]);
    }

    private void a(Object object, Object object2) {
        this.a.a(object, object2);
    }

    private void c(Object object) {
        this.h.p(object, new Object[0]);
    }

    static Object b(ih_0 ih_02, Object object) {
        return ih_02.b(object);
    }

    static Object a(ih_0 ih_02, Object object) {
        return ih_02.a(object);
    }

    static void a(ih_0 ih_02, Object object, Object object2) {
        ih_02.a(object, object2);
    }

    static void c(ih_0 ih_02, Object object) {
        ih_02.c(object);
    }
}

