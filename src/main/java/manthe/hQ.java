/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

public class hQ
extends gJ {
    private final bp_1 d = this.a("isCancelable", false, Boolean.TYPE, new Class[0]);
    private final bp_1 a = this.a("setCanceled", false, Void.TYPE, Boolean.TYPE);

    public hQ() {
        super(A5.a4);
    }

    public boolean a(Object object) {
        return this.d.h(object, new Object[0]);
    }

    public void a(Object object, boolean bl) {
        this.a.p(object, bl);
    }
}

