/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.is
 */
public class is_0
extends gJ {
    private final BG e = this.b("inventorySlots", true, List.class);
    private final BG a = this.b("windowId", true, Integer.TYPE);
    private final bp_1 d = this.a("getSlot", true, A5.aF, Integer.TYPE);

    public is_0() {
        super(A5.aS);
    }

    public List a(Object object) {
        return (List)this.e.f(object);
    }

    public int b(Object object) {
        return this.a.c(object);
    }

    private Object a(Object object, int n6) {
        return this.d.e(object, n6);
    }

    static Object a(is_0 is_02, Object object, int n6) {
        return is_02.a(object, n6);
    }
}

