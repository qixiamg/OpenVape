/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.xa
 */
public class xa_0
extends wM {
    private boolean G;
    private boolean F;
    private final BooleanValue H = BooleanValue.createValue(null, "", false);
    private final wK D = new wK(this.H);
    private final wh_0 A = new wh_0("newclose");
    private final xq_0 B;
    private final xq_0 z;
    private final xq_0 I;
    private final ColorValue E;
    private final qw C;

    public xa_0(qw qw2) {
        this.C = qw2;
        this.E = ColorValue.createValue(null, qw2.i(), qw2.b());
        this.B = new xq_0(sp.RAINBOW, this.E, "Color", 100.0, 1.0);
        this.B.a((wM)this);
        this.z = new xq_0(sp.SATURATION, this.E, "", 100.0, 1.0);
        this.I = new xq_0(sp.VIBRANCE, this.E, "", 100.0, 1.0);
        this.B.c(true);
        this.B.b(99.0);
        this.z.c(true);
        this.z.b(99.0);
        this.I.c(true);
        this.I.b(99.0);
        this.B.a(xa_0.b.m);
        this.z.a(xa_0.b.m);
        this.I.a(xa_0.b.m);
        this.H.setType((Boolean)qw2.a());
        this.D.c(new BS(this, qw2));
        qw2.a(this.E.s());
        this.a(this.D, this.A, this.B, this.z, this.I);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.9);
        String string = this.C.i();
        double d3 = mq2.a(string);
        double d4 = 18.0;
        double d5 = this.f() - 3.0;
        Color color = this.l() ? xa_0.b.r : xa_0.b.r;
        pe_0.a(this.d() + 5.0 - 0.5, this.c() + 1.0 - 0.5, this.e() - 10.0 + 1.0, d5 - 2.0 + 1.0, this.C.b());
        pe_0.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, d5 - 2.0, xa_0.b.m);
        k9.a(Color.WHITE, (float)this.d() + 10.0f, (float)(this.c() + 10.0) - 2.0f, this.F ? "upcollapse" : "downexpand", 2.0f, 2.0f, false);
        double d6 = this.d() + this.e() - 30.0;
        double d7 = this.c() + d4 / 2.0 - d3 / 2.0;
        o7.a(this.d(), this.c(), d6 - this.d(), d4);
        mq2.a(string, this.d() + 15.0 + 8.0, d7, color);
        GL11.glDisable((int)3089);
        double d8 = mq2.a(string);
        double d10 = d6;
        double d11 = d10 - 10.0;
        double d12 = d7 - 2.0;
        double d13 = d12 + d8 + 2.0;
        o7.a(new Color(xa_0.b.m.getRed(), xa_0.b.m.getGreen(), xa_0.b.m.getBlue(), 0), xa_0.b.m, d10, d13, d10, d12, d11, d12, d11, d13);
        this.A.c(this.d() + this.e() - 10.0 - 8.0);
        this.A.a(this.c());
        this.A.d(d4);
        this.D.e(false);
        this.D.c(d6);
        this.D.a(this.c());
        this.D.b(12.0);
        this.D.d(d4);
        this.D.c(true);
        this.B.a(this.F);
        this.z.a(this.F);
        this.I.a(this.F);
        this.B.c(this.d() + 6.0);
        this.z.c(this.d() + 6.0);
        this.I.c(this.d() + 6.0);
        this.B.a(this.c() + 18.0);
        this.z.a(this.c() + 40.0);
        this.I.a(this.c() + 65.0);
        this.C.a(this.E.s());
    }

    public xa_0 a(pc pc2) {
        this.A.c(pc2);
        return this;
    }

    public void f(boolean bl) {
        this.D.f(bl);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.G && !this.x()) {
            this.G = false;
        }
    }

    @Override
    public void a(uW uW2) {
        if ((double)uW2.b() > this.c() + 20.0 - 2.0) {
            return;
        }
        this.F = !this.F;
        this.F().M();
    }

    @Override
    public void i() {
        this.G = true;
    }

    public boolean l() {
        return this.D.T();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return (this.F ? 95.0 : 18.0) + 3.0;
    }

    static BooleanValue a(xa_0 xa_02) {
        return xa_02.H;
    }
}

