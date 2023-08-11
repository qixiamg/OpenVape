/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

public class h2
extends gJ {
    private final bp_1 f = this.a("getScaleFactor", true, Integer.TYPE, new Class[0]);
    private final bp_1 a;
    private final bp_1 g = this.a("getScaledHeight", true, Integer.TYPE, new Class[0]);
    private bp_1 d;
    private bp_1 e;

    public h2() {
        super(A5.dS);
        this.a = this.a("getScaledWidth", true, Integer.TYPE, new Class[0]);
        if (V.c() > 13) {
            this.e = this.a("<init>", false, Void.TYPE, A5.d0);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, A5.d0, Integer.TYPE, Integer.TYPE);
        }
    }

    public int d(Object object) {
        return this.f.o(object, new Object[0]);
    }

    public int b(Object object) {
        return this.a.o(object, new Object[0]);
    }

    public int c(Object object) {
        return this.g.o(object, new Object[0]);
    }

    public Object a(Object object, int n6, int n10) {
        return this.d.a(new Object[]{object, n6, n10});
    }

    public Object a(Object object) {
        return this.e.a(object);
    }
}

