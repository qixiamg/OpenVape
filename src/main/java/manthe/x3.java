/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.A2;
import manthe.bz_2;
import manthe.k9;
import manthe.mq;
import manthe.uW;
import manthe.wV;
import manthe.we_0;
import manthe.xg_0;

public class x3
extends xg_0 {
    private String E;
    private String D;
    private boolean C;
    private double F;
    private wV G;
    private static String[] B;

    public x3(we_0 we_02, String string, String string2, double d3) {
        super(we_02);
        this.E = string;
        this.D = string2;
        this.F = d3;
        this.G = new wV("", 0.3);
        this.G.c(new A2(this, we_02));
        this.C = ((bz_2)((Object)we_02)).m();
        this.a(this.G);
    }

    public x3(we_0 we_02, String string, String string2) {
        this(we_02, string, string2, 1.0);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        this.getClass();
        float f10 = 8.0f * (float)this.F;
        Color color = x3.b.c;
        double d3 = mq2.a(this.D);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - (double)(f10 / 2.0f);
        mq2.a(this.D, this.d() + 10.0 + (double)f10, d4, color);
        k9.a(color, (float)this.d() + 5.0f, (float)d5, this.E, f10, f10, false);
        this.G.d(this.l().ai() ? x3.b.a : null);
        double d6 = this.d() + this.e() - 7.5;
        this.getClass();
        this.G.c(d6 - 8.0);
        this.G.a(this.c());
        this.G.d(this.f());
        this.G.b(this.C ? "upcollapse" : "downexpand");
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    static boolean a(x3 x32, boolean bl) {
        x32.C = bl;
        return x32.C;
    }

    public static void b(String[] stringArray) {
        B = stringArray;
    }

    public static String[] n() {
        return B;
    }

    static {
        if (x3.n() == null) {
            x3.b(new String[1]);
        }
    }
}

