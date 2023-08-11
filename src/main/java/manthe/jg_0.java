/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Map;
import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.jg
 */
public class jg_0
extends gJ {
    private final BG e = this.b("tagMap", true, Map.class);
    private final bp_1 a = this.a("getShort", true, Short.TYPE, String.class);
    private final bp_1 d = this.a("getTag", true, A5.cr, String.class);

    public jg_0() {
        super(A5.au);
    }

    private Object a(Object object, String string) {
        return this.d.e(object, string);
    }

    private Map a(Object object) {
        return (Map)this.e.f(object);
    }

    private short b(Object object, String string) {
        return this.a.b(object, string);
    }

    static short a(jg_0 jg_02, Object object, String string) {
        return jg_02.b(object, string);
    }

    static Map a(jg_0 jg_02, Object object) {
        return jg_02.a(object);
    }

    static Object b(jg_0 jg_02, Object object, String string) {
        return jg_02.a(object, string);
    }
}

