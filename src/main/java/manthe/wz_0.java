/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.wz
 */
public class wz_0
extends wI {
    private wy_0 X;
    private double P;
    private Module E;
    private boolean I;
    private boolean W;
    private boolean S;
    private boolean O;
    private double M;
    private double U;
    private int F = -1;
    private String Z = null;
    private int V = 0;
    private final long L = 2000L;
    private long T = 0L;
    private List<wM> Y = new ArrayList<wM>();
    private wh_0 Q = new wh_0("newclose", 1.5);
    private wh_0 N = new wh_0("newrearrange", 1.5);
    private i_0 G = new i_0(0.15, 0.0, 1.0);
    private wV J = new wV("settingdots");
    private wV R = new wV("newstar");
    private DU H;
    private wK D;
    private w4 K;

    public wz_0(wy_0 wy_02, Module y52, double d3) {
        this.X = wy_02;
        this.E = y52;
        this.P = d3;
        this.K = new w4(y52);
        this.D = new w1(this, "REQUIRES BLATANT MODE", 0.75);
        this.D.a(wz_0.b.d);
        this.D.a(false);
        this.D.c(new qG(this));
        this.a(wz_0.b.k);
        if (y52.M() != null) {
            this.a(y52.M());
        }
        wz_0 wz_02 = this;
        if (wy_02 instanceof w0) {
            this.S = true;
        }
        this.Q.c(new qi(this, y52, wy_02));
        this.Q.a("Remove module from favorites");
        this.N.c(new dc_0(this, wz_02));
        this.J.c(new uS(this, wy_02));
        this.R.c(new ce_0(this, y52));
        this.R.a("Add module to favorites");
        this.c(new nq_0(this, y52));
        this.a(this.D, this.K, this.Q, this.N, this.J, this.R);
    }

    public wz_0(wy_0 wy_02, Module y52) {
        this(wy_02, y52, 0.9);
    }

    private void a(double d3, double d4, Color color) {
        o7.a(this.d(), this.c(), this.e(), this.f());
        mq mq2 = this.e(0.75);
        pe_0.c(this.d(), this.c(), mq2.b(this.Z) + 10.0, this.f(), wz_0.b.u);
        int n6 = 7;
        double d5 = this.d() + mq2.b(this.Z) + 10.0 - 1.0;
        double d6 = this.c() + this.f();
        double d7 = d5;
        double d8 = this.c() - 4.0;
        double d10 = d5 + (double)n6;
        double d11 = d6;
        pe_0.a(d5 + 1.0, d6, d7 + 1.0, d8 - 20.0, d10 + 1.0, d11, new Color(16, 16, 16, 255));
        pe_0.a(d5, d6, d7, d8, d10, d11, wz_0.b.u);
        mq2.a(this.Z, d3, d4, color);
        GL11.glDisable((int)3089);
    }

    @Override
    public void a() {
        boolean bl;
        if (this.O) {
            this.O();
            this.P();
        }
        if (this.D.b()) {
            this.D.c(this.d());
            this.D.a(this.c());
            this.D.b(this.e() - this.J.e() + 2.5);
            this.D.d(this.f());
            this.K.a(false);
            this.J.a(false);
            this.a(0.0, 0.0, wz_0.b.d);
            return;
        }
        mq mq2 = this.e(this.P);
        double d3 = mq2.a(this.E.H());
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - 4.0;
        double d6 = this.d() + 5.0;
        Color color = this.I();
        Color color2 = wz_0.b.r;
        if (this.E.N()) {
            color = b.e();
            color2 = b.c();
        } else if (this.I || this.W || this.Z != null) {
            color = wz_0.b.m;
            color2 = wz_0.b.c;
        }
        double d7 = this.d() + this.e() - 10.0 - 8.0;
        if ((this.Z != null && this.Z.startsWith("MUST") || this.E.f() || this.I || this.K.O().c() || this.W) && !zu_0.E) {
            this.K.c(d7 -= this.K.e());
            this.K.a(this.c() + 5.0);
            this.K.a(true);
            d7 -= 5.0;
        } else {
            this.K.a(false);
        }
        if (this.W && !this.S) {
            this.R.a(true);
            this.R.d(this.E.L() ? wz_0.b.w : (this.E.N() ? color2 : null));
            this.R.c(d7 -= this.R.e());
            this.R.a(this.c());
            this.R.d(this.f());
            d7 -= 5.0;
        } else {
            this.R.a(false);
        }
        pe_0.c(this.d(), this.c(), this.e(), this.f(), color);
        if (zu_0.E) {
            if (this.W) {
                this.W = false;
                this.X.a((Module)null);
                this.N();
                return;
            }
            double d8 = this.S ? 38.0 : 20.0;
            d6 += d8;
            pe_0.c(this.d(), this.c(), d8, this.f(), wz_0.b.u);
            this.R.a(false);
            this.J.a(false);
            if (this.S) {
                this.Q.a(true);
                this.Q.c(this.d() + 5.0);
                this.Q.a(this.c());
                this.Q.d(this.f());
                this.N.a(true);
                this.N.c(this.d() + 10.0 + 8.0 * this.Q.H);
                this.N.a(this.c());
                this.N.d(this.f());
            } else {
                this.H = new DU(this.d(), this.c(), d8, this.f());
                double d10 = 7.0;
                double d11 = 0.5;
                double d12 = d11 + 0.5;
                if (this.E.x()) {
                    pe_0.c(this.d() + d10, this.c() + d10, d8 - d10 * 2.0, this.f() - d10 * 2.0, b.e());
                    pe_0.c(this.d() + d10 + d11, this.c() + d10 + d11, d8 - (d10 + d11) * 2.0, this.f() - (d10 + d11) * 2.0, wz_0.b.u);
                    pe_0.c(this.d() + d10 + d12, this.c() + d10 + d12, d8 - (d10 + d12) * 2.0, this.f() - (d10 + d12) * 2.0, b.e());
                } else {
                    pe_0.c(this.d() + d10, this.c() + d10, d8 - d10 * 2.0, this.f() - d10 * 2.0, wz_0.b.y);
                    pe_0.c(this.d() + d10 + d11, this.c() + d10 + d11, d8 - (d10 + d11) * 2.0, this.f() - (d10 + d11) * 2.0, wz_0.b.u);
                }
            }
        } else {
            this.Q.a(false);
            this.N.a(false);
            this.J.a(true);
            this.J.d(this.E.N() ? color2 : null);
            this.J.c(this.d() + this.e() - 5.0 - 8.0);
            this.J.a(this.c());
            this.J.d(this.f());
        }
        boolean bl2 = bl = !on.C && this.E.n() && !this.E.N() && !this.W && !zu_0.E && !this.K.N();
        if (bl) {
            float f10 = 0.87f;
            k9.a(wz_0.b.s.darker(), (float)(d7 -= (double)(8.0f * f10)), (float)d5, "newblatant", 8.0f * f10, 8.0f * f10, false);
        }
        if (this.Z != null) {
            this.J.a(false);
            this.a(d6, d4, color2);
        } else {
            mq2.a(this.E.H(), d6, d4, this.E.x() ? color2 : wz_0.b.s);
        }
        if (this.E.N()) {
            double d13 = zu_0.E ? 20 : 0;
            pe_0.c(this.d() + d13, this.c() + this.f() - 0.5, this.e() - d13, 0.5, wz_0.b.y);
        }
    }

    private void O() {
        bo_0 bo_02 = o7.b();
        double d3 = (double)bo_02.b - this.M;
        this.a(this.c() + d3);
        if (this.c() < this.X.c() + this.X.Y().f()) {
            if (this.X.U()) {
                this.X.f(this.X.P() + 1.0);
            }
            this.a(this.X.c() + this.X.Y().f());
        } else if (this.X.U() && this.c() > this.X.c() + this.X.L() - this.f()) {
            this.X.f(this.X.P() - 1.0);
            this.a(this.X.c() + this.X.L() - this.f());
        } else if (this.c() > this.X.c() + this.X.f() - this.f()) {
            this.a(this.X.c() + this.X.f() - this.f());
        } else {
            this.M = bo_02.b;
        }
    }

    public void R() {
        for (BasicValue ds_02 : this.E.r()) {
            wM wM2 = null;
            if (ds_02 instanceof BooleanValue) {
                wM2 = new wK((BooleanValue)ds_02);
            } else if (ds_02 instanceof DX) {
                wM2 = new w5((DX)ds_02);
            } else if (ds_02 instanceof DF) {
                wM2 = new xx_0((DF)ds_02);
            } else if (ds_02 instanceof dy_0) {
                wM2 = new xc_0((dy_0)ds_02);
            } else if (ds_02 instanceof ColorValue) {
                wM2 = new xA((ColorValue)ds_02);
            } else if (ds_02 instanceof DP) {
                wM2 = new w3((DP)ds_02);
            } else if (ds_02 instanceof Dv) {
                wM2 = new xy_0((Dv)ds_02);
            } else if (ds_02 instanceof DY) {
                wM2 = new wo_0((DY)ds_02);
            } else {
                on.a(" - Unknown value type: " + ds_02.getClass().getSimpleName());
            }
            if (wM2 == null) continue;
            if (ds_02.getBaseValue() != null) {
                wM2.a(wz_0.b.u);
            } else {
                wM2.a(wz_0.b.k);
            }
            wM2.a(false);
            this.X.a(wM2, new Object[0]);
            this.Y.add(wM2);
        }
        if (this.E instanceof zE) {
            wQ wQ2 = new wQ();
            wQ2.a(wz_0.b.k);
            wQ2.a(false);
            this.X.a((wM)wQ2, new Object[0]);
            this.Y.add(wQ2);
        }
    }

    public void Q() {
        this.W = true;
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz_0) || wM2.equals(this)) continue;
            wM2.a(false);
        }
        for (wM wM2 : this.Y) {
            this.X.w().get(this.X.w().indexOf(wM2)).a(true);
        }
    }

    public void N() {
        this.W = false;
        zu_0.a(this.X.an());
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.K.N() && (this.Z == null || !this.Z.toLowerCase(Locale.ROOT).startsWith("press"))) {
            this.b("press a key to bind");
        }
        if (this.V != 0 && System.currentTimeMillis() > this.T + 2000L) {
            this.Z = null;
            this.D.a(false);
            this.K.f(false);
            this.V = 0;
        } else if (this.Z != null && this.Z.toLowerCase(Locale.ROOT).startsWith("press") && !this.K.N()) {
            this.b(1);
            if (this.E.a().length() > 0) {
                this.b("bound to " + this.E.a());
            } else {
                this.b("bind removed");
            }
        }
        if (this.I && !this.x()) {
            this.I = false;
            if (this.D.b()) {
                this.b(2);
            } else if (this.V == 0 && this.Z != null && !this.Z.toLowerCase(Locale.ROOT).startsWith("press") && System.currentTimeMillis() > this.T + 2000L) {
                this.b((String)null);
            }
        }
    }

    private void P() {
        if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
            this.O = false;
            zu_0.W = null;
            if (this.F != -1) {
                on.p.A().b().remove(this.E);
                on.p.A().b().add(this.F, this.E);
            }
            w0.ar();
            this.F = -1;
            return;
        }
        int n6 = -1;
        int n10 = -1;
        double d3 = this.f() * this.e();
        ArrayList<wz_0> arrayList = new ArrayList<wz_0>();
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz_0)) continue;
            arrayList.add((wz_0)wM2);
        }
        arrayList.sort(new uR(this));
        for (wz_0 wz_02 : arrayList) {
            double d4;
            ++n10;
            if (wz_02.equals(this) || !((d4 = wz_02.q().b(this.q())) >= d3 / 2.0)) continue;
            n6 = n10;
            break;
        }
        if (n6 == -1) {
            return;
        }
        if (this.F != n6) {
            this.a(n6);
        }
        this.F = n6;
    }

    private void a(int n6) {
        double d3 = this.X.Y().c() + this.X.Y().f();
        ArrayList<wz_0> arrayList = new ArrayList<wz_0>();
        for (wM wM2 : this.X.w()) {
            if (!(wM2 instanceof wz_0)) continue;
            arrayList.add((wz_0)wM2);
        }
        arrayList.remove(this);
        arrayList.add(n6, this);
        double d4 = 0.0;
        for (wz_0 wz_02 : arrayList) {
            if (wz_02.c() < d3) continue;
            if (wz_02.S().equals(this.S())) {
                d4 += wz_02.f();
                continue;
            }
            wz_02.a(d3 + d4);
            d4 += wz_02.f();
        }
    }

    public void b(String string) {
        if (string == null) {
            this.b(1);
            return;
        }
        this.Z = string.toUpperCase();
    }

    public void b(int n6) {
        this.V = n6;
        this.T = System.currentTimeMillis();
    }

    public Module S() {
        return this.E;
    }

    @Override
    public void i() {
        if (!zu_0.E) {
            this.I = true;
        }
    }

    public void f(boolean bl) {
        this.W = bl;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    static double a(wz_0 wz_02, double d3) {
        wz_02.M = d3;
        return wz_02.M;
    }

    static double b(wz_0 wz_02, double d3) {
        wz_02.U = d3;
        return wz_02.U;
    }

    static boolean b(wz_0 wz_02, boolean bl) {
        wz_02.O = bl;
        return wz_02.O;
    }

    static boolean a(wz_0 wz_02, boolean bl) {
        wz_02.W = bl;
        return wz_02.W;
    }

    static boolean d(wz_0 wz_02) {
        return wz_02.W;
    }

    static boolean f(wz_0 wz_02) {
        return wz_02.S;
    }

    static DU a(wz_0 wz_02) {
        return wz_02.H;
    }

    static w4 b(wz_0 wz_02) {
        return wz_02.K;
    }

    static wK c(wz_0 wz_02) {
        return wz_02.D;
    }

    static wV e(wz_0 wz_02) {
        return wz_02.J;
    }
}

