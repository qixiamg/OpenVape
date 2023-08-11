/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

public class hT
extends gJ {
    public bp_1 a;
    public bp_1 d;

    public hT() {
        super(A5.bv);
        if (V.c() >= 23) {
            this.a = this.a("func_187493_a", cy_0.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE, Long.TYPE);
            this.d = this.a("func_187498_b", cy_0.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE, Long.TYPE);
        } else {
            this.a = this.a("func_178267_a", cy_0.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE);
            this.d = cy_0.c ? this.a("a", false, Boolean.TYPE, A5.b8, A5.bV, A5.F, A5.ao, A5.cu, Boolean.TYPE) : this.a("renderModelAmbientOcclusion", true, Boolean.TYPE, A5.b8, A5.bV, A5.F, A5.ao, A5.cu, Boolean.TYPE);
        }
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, boolean bl, long l6) {
        if (V.c() >= 23) {
            return this.d.h(object, object2, object3, object5, object6, object7, bl, l6);
        }
        if (cy_0.c) {
            return this.d.h(object, object2, object3, object4, object6, object7, bl);
        }
        return this.d.h(object, object2, object3, object4, object6, object7, bl);
    }
}

