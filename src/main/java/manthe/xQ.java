/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.uG;
import manthe.wV;
import manthe.we_0;
import manthe.x3;

public class xQ
extends x3 {
    private wV I = new wV("newsettings");
    private boolean H;

    public xQ(we_0 we_02, String string, String string2, double d3) {
        super(we_02, string, string2, d3);
        this.I.c(new uG(this));
        this.a(this.I);
    }

    public xQ(we_0 we_02, String string, String string2) {
        this(we_02, string, string2, 1.0);
    }

    @Override
    public void a() {
        super.a();
        this.I.d(this.H ? xQ.b.a : null);
        double d3 = this.d() + this.e() - 12.5;
        this.getClass();
        this.I.c(d3 - (double)(8.0f * 2.0f));
        this.I.a(this.c());
        this.I.d(this.f());
    }

    public boolean J() {
        return this.H;
    }

    public void f(boolean bl) {
        this.H = bl;
    }

    public void K() {
    }

    static boolean a(xQ xQ2, boolean bl) {
        xQ2.H = bl;
        return xQ2.H;
    }

    static boolean a(xQ xQ2) {
        return xQ2.H;
    }
}

