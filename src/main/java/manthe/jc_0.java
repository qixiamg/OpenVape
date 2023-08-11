/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.jc
 */
public class jc_0
extends gJ {
    private bp_1 a;
    private bp_1 d;

    public jc_0() {
        super(A5.k);
        if (V.c() >= 23) {
            this.d = this.a("getCachedEntity", true, A5.ba, new Class[0]);
        } else {
            this.a = this.a("getEntityNameToSpawn", true, String.class, new Class[0]);
        }
    }

    private String b(Object object) {
        return (String)this.a.e(object, new Object[0]);
    }

    private Object a(Object object) {
        return this.d.e(object, new Object[0]);
    }

    static Object b(jc_0 jc_02, Object object) {
        return jc_02.a(object);
    }

    static String a(jc_0 jc_02, Object object) {
        return jc_02.b(object);
    }
}

