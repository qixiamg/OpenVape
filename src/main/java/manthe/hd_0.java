/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.hd
 */
public class hd_0
extends gJ {
    public bp_1 a;
    public final BG d;

    public hd_0() {
        super(A5.ac);
        if (V.c() >= 15) {
            this.a = this.a("renderGameOverlay", true, Void.TYPE, Float.TYPE);
        }
        this.d = this.b("displayedTitle", true, String.class);
    }

    public Object a(Object object) {
        return this.d.f(object);
    }
}

