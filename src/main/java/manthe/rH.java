/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.BI;
import manthe.D7;
import manthe.DU;
import manthe.Y;
import manthe.bo_0;
import manthe.d0_0;
import manthe.ds_2;
import manthe.du_0;
import manthe.my_0;
import manthe.o7;
import manthe.on;
import manthe.pX;
import manthe.p_0;
import manthe.pd;
import manthe.r1;
import org.lwjgl.opengl.GL11;

public class rH
extends r1
implements p_0,
BI {
    private final DU af;
    private double ag;
    private double ae;

    public rH(String string, double d3, double d4) {
        super(string, true);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.g(false);
        this.aj().g(false);
        this.c(d3);
        this.b(d4);
        this.Z().c(0.0);
        this.Z().b(0.0);
        this.f(false);
        this.m(true);
        this.af = new du_0(this, 0.0, 0.0, 0.0, 0.0);
        this.a(null, new pX(this));
    }

    @Override
    public void c(boolean bl) {
        if (!bl) {
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            bo_0 bo_02 = o7.b();
            DU dU = this.af;
            boolean bl2 = dU.a(bo_02) || this.x();
            int n6 = bl2 ? on.p.t().r.s() : -1275068416;
            o7.a(this.t() - 1.0, this.k() - 1.0, this.t(), this.k() + this.b() + 1.0, n6);
            o7.a(this.t() + this.q(), this.k() - 1.0, this.t() + this.q() + 1.0, this.k() + this.b() + 1.0, n6);
            o7.a(this.t(), this.k() - 1.0, this.t() + this.q(), this.k(), n6);
            o7.a(this.t(), this.k() + this.b(), this.t() + this.q(), this.k() + this.b() + 1.0, n6);
            o7.b(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), 0.7, 0.7, 0.7, 0.15);
            GL11.glEnable((int)3553);
            double d3 = this.t() + this.q() / 2.0 - this.r().b(this.H()) / 2.0;
            double d4 = this.k() + this.b() / 2.0 - this.r().a(this.H()) / 2.0;
            this.r().a(this.H(), d3, d4, bl2 ? on.p.t().r.s() : -1258291201);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void a(double d3) {
        if (this.a(d3, this.k())) {
            super.a(Y.a(d3, 1.0, (double)ds_2.p().g() - this.q() - 1.0));
        }
    }

    @Override
    public void d(double d3) {
        if (this.a(this.t(), d3)) {
            super.d(Y.a(d3, 1.0, (double)ds_2.p().h() - this.b() - 1.0));
        }
    }

    @Override
    public boolean ai() {
        return this.e();
    }

    private boolean a(double d3, double d4) {
        boolean bl = true;
        for (r1 r12 : on.p.F().d()) {
            rH rH2;
            if (!(r12 instanceof rH) || r12.equals(this) || !(rH2 = (rH)r12).e()) continue;
            double d5 = rH2.al().a();
            double d6 = d5 + rH2.al().d();
            double d7 = rH2.al().b();
            double d8 = d7 + rH2.al().c();
            if (d3 > d6 || d3 + this.q() < d5 || d4 > d8 || d4 + this.b() < d7) continue;
            bl = false;
        }
        return bl;
    }

    public int am() {
        d0_0 d0_02 = ds_2.p();
        double d3 = this.t() + this.q() / 2.0;
        double d4 = this.k() + this.b() / 2.0;
        double d5 = (double)d0_02.g() * 0.3;
        double d6 = (double)d0_02.g() * 0.6;
        double d7 = (double)d0_02.h() * 0.3;
        double d8 = (double)d0_02.h() * 0.6;
        int n6 = d3 < d5 ? (d4 < d7 ? my_0.g : (d4 > d8 ? my_0.f : my_0.c)) : (d3 > d6 ? (d4 < d7 ? my_0.a : (d4 > d8 ? my_0.h : my_0.e)) : (d4 < d7 ? my_0.b : (d4 > d8 ? my_0.d : my_0.i)));
        return n6;
    }

    public double an() {
        return this.ag;
    }

    public double ao() {
        return this.ae;
    }

    private DU al() {
        return this.af;
    }
}

