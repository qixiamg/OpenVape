/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.value.BasicValue;

public abstract class wM
implements qL {
    private double u;
    private double m;
    private double x;
    private double d;
    private boolean q;
    private boolean y;
    private wc_0 n;
    private boolean w = true;
    private long j;
    private long r;
    private long s;
    private xn_0 g;
    private List<bv_1> l = new ArrayList<bv_1>();
    private List<DO> e = new ArrayList<DO>();
    private List<wM> f = new ArrayList<wM>();
    public final float i = 5.0f;
    public final float h = 8.0f;
    public final double o = 0.15;
    private BasicValue t;
    private Color p;
    private boolean k = true;
    private static boolean v;

    public void z() {
        this.j();
        for (wM wM2 : this.w()) {
            wM2.z();
        }
    }

    public void C() {
        if (!(this.j == 0L || this.s != this.j || this.x() && this.b())) {
            this.A();
        }
        if (this.g != null) {
            this.g.f(true);
        }
        this.s = this.j;
        this.a();
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.C();
        }
    }

    public void A() {
        this.j = 0L;
        this.r = 0L;
        this.g.a(false);
        zu_0.ah = null;
    }

    public void B() {
        this.k();
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.B();
        }
    }

    public void E() {
        if (zu_0.W == null || zu_0.W instanceof x4 || zu_0.W.equals(this)) {
            this.i();
        }
        boolean bl = true;
        for (wM wM2 : this.w()) {
            if (!wM2.b() || !wM2.x() || zu_0.W != null && !(zu_0.W instanceof x4) && !zu_0.W.equals(wM2) || this instanceof wc_0 && ((wc_0)this).Y() != null && ((wc_0)this).Y().x() && !(wM2 instanceof xg_0)) continue;
            wM2.E();
            if (wM2.t() == null || !bl) continue;
            bl = false;
        }
        if (bl && this.g != null) {
            this.p();
        }
    }

    public void b(uW uW2) {
        for (wM wM2 : this.w()) {
            if (!wM2.b() || !wM2.x() || this instanceof wc_0 && ((wc_0)this).Y() != null && ((wc_0)this).Y().x() && !(wM2 instanceof xg_0)) continue;
            wM2.b(uW2);
            if (wM2 instanceof xg_0) continue;
            return;
        }
        this.a(uW2);
    }

    private void p() {
        if (this.r == 0L) {
            this.r = System.currentTimeMillis();
        }
        this.j += System.currentTimeMillis() - this.r;
        if (this.j >= 2000L) {
            bo_0 bo_02 = o7.b();
            this.g.c(bo_02.a);
            this.g.a(bo_02.b);
            this.g.a(true);
            zu_0.ah = this.g;
        }
    }

    public void v() {
        pe_0.a((float)this.d(), (float)this.c(), 1.0f, (float)this.f(), Color.MAGENTA);
        pe_0.a((float)this.d(), (float)this.c(), (float)this.e(), 1.0f, Color.MAGENTA);
        pe_0.a((float)this.d() + (float)this.e(), (float)this.c(), 1.0f, (float)this.f(), Color.MAGENTA);
        pe_0.a((float)this.d(), (float)this.c() + (float)this.f(), (float)this.e(), 1.0f, Color.MAGENTA);
    }

    public void o() {
        if (!this.y()) {
            return;
        }
        pe_0.c(this.d(), this.c(), this.e(), this.f(), this.I());
    }

    public boolean x() {
        bo_0 bo_02 = o7.b();
        return this.q().a(bo_02);
    }

    public void a(wM ... wMArray) {
        Collections.addAll(this.w(), wMArray);
    }

    public mq s() {
        return on.p.j();
    }

    public mq e(double d3) {
        return on.p.a(d3);
    }

    public DU q() {
        return new DU(this.d(), this.c(), this.e(), this.f());
    }

    public xZ t() {
        return this.g;
    }

    public void a(DO dO) {
        this.e.add(dO);
    }

    public void b(bv_1 bv_12) {
        this.l.add(bv_12);
    }

    public void b(DO dO) {
        this.e.remove(dO);
    }

    public void a(bv_1 bv_12) {
        this.l.remove(bv_12);
    }

    public List<DO> r() {
        return this.e;
    }

    public List<bv_1> u() {
        return this.l;
    }

    public List<wM> w() {
        return this.f;
    }

    public Color I() {
        if (this.p == null) {
            this.p = wM.b.k;
        }
        return this.p;
    }

    public BasicValue D() {
        return this.t;
    }

    @Override
    public double d() {
        return this.u;
    }

    @Override
    public double c() {
        return this.m;
    }

    @Override
    public double e() {
        return this.q ? this.x : Math.max(this.x, this.g());
    }

    @Override
    public double f() {
        return this.y ? this.d : Math.max(this.d, this.h());
    }

    @Override
    public boolean b() {
        if (this.t != null && this.t.getBaseValue() != null && this.t.getBaseValue() instanceof DR) {
            BasicValue ds_02 = this.D();
            boolean bl = true;
            for (DR dR = (DR)this.t.getBaseValue(); dR != null && (bl = dR.b(ds_02)) && dR.getBaseValue() != null && dR.getBaseValue() instanceof DR; dR = (DR)dR.getBaseValue()) {
                ds_02 = dR;
            }
            return this.w && bl;
        }
        return this.w;
    }

    public boolean y() {
        return this.k;
    }

    public wc_0 F() {
        return this.n;
    }

    public wM a(String string) {
        if (string.length() < 1) {
            return this;
        }
        this.g = new xn_0(this, string);
        return this;
    }

    public wM a(xn_0 xn_02) {
        this.g = xn_02;
        return this;
    }

    public void a(BasicValue ds_02) {
        this.t = ds_02;
        ds_02.getRuntimeCopyException(this);
        if (ds_02.getDefaultValue() != null && ds_02.getDefaultValue() instanceof qp) {
            this.a(((qp)ds_02.getDefaultValue()).L());
        }
    }

    public void a(wc_0 wc_02) {
        this.n = wc_02;
    }

    public wM a(Color color) {
        this.p = color;
        return this;
    }

    @Override
    public void c(double d3) {
        this.u = d3;
    }

    @Override
    public void a(double d3) {
        this.m = d3;
    }

    @Override
    public void b(double d3) {
        this.x = d3;
    }

    @Override
    public void d(double d3) {
        this.d = d3;
    }

    public void a(boolean bl) {
        this.w = bl;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public void b(boolean bl) {
        this.y = bl;
    }

    public void c(boolean bl) {
        this.q = bl;
    }

    public static void d(boolean bl) {
        v = bl;
    }

    public static boolean G() {
        return v;
    }

    public static boolean H() {
        boolean bl = wM.G();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException b(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!wM.G()) {
            wM.d(true);
        }
    }
}

