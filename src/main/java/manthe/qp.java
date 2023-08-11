/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import org.lwjgl.input.Mouse;
import rip.vape.value.BasicValue;

public abstract class qp
implements p1,
yG,
Cloneable {
    private final Map<DU, tJ> q = new LinkedHashMap<DU, tJ>();
    private final DU z = new DU(-10000.0, -10000.0, 0.0, 0.0);
    public Color v = f;
    protected bl_0 o;
    protected bo_0 x;
    protected int B = 0;
    protected int D = 0;
    protected Set<R> h = new HashSet<R>();
    protected Set<ue_0> p = new HashSet<ue_0>();
    private List<p1> A = new ArrayList<p1>();
    private DU C = null;
    private Color i = g;
    private boolean l = true;
    private yG w;
    private BasicValue r;
    private boolean E = true;
    private rl_0 u;
    private String j = "";
    private long s;
    private boolean n;
    private boolean k;
    private Color t;
    private boolean m = true;
    private static cy_0[] y;

    public qp T() {
        try {
            qp qp2 = (qp)super.clone();
            qp2.A = new ArrayList<p1>();
            for (p1 p12 : this.A) {
                if (!(p12 instanceof qp)) continue;
                qp qp3 = (qp)p12;
                qp2.A.add(qp3.T());
            }
            return qp2;
        }
        catch (Exception exception) {
            on.a(exception);
            return null;
        }
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            for (p1 p12 : this.A) {
                p12.c(bl);
            }
        }
    }

    @Override
    public void c() {
        if (this.u == null) {
            this.u = new rK(this, this.j, my_0.c, 0.75);
            this.u.d(true);
            this.u.b(10.0);
            this.u.c(this.q());
        }
        for (R object2 : this.h) {
            object2.a(this);
        }
        if (this.e()) {
            Object object;
            if (this.x != null) {
                object = o7.b();
                this.D = ((bo_0)object).b - this.x.b;
                this.B = ((bo_0)object).a - this.x.a;
            }
            if (!(this.o instanceof D3) && this.o != null) {
                this.o.b();
            }
            if (this instanceof p_0 && !Mouse.isButtonDown((int)0)) {
                ((p_0)((Object)this)).d(false);
            }
            for (p1 p12 : this.A) {
                p12.c();
            }
            if (this.u != null) {
                if (this.u.E() != null && !this.u.E().isEmpty()) {
                    if (this.g()) {
                        if (this.s++ >= 25L) {
                            this.u.a(true);
                            object = o7.b();
                            this.u.a((double)(((bo_0)object).a + 8));
                            this.u.d(((bo_0)object).b + 2);
                            this.u.c(this.r().b(this.u.E()) * 0.7);
                            zu_0.a(this.u);
                        }
                    } else {
                        this.s = 0L;
                        zu_0.b(this.u);
                    }
                } else {
                    zu_0.b(this.u);
                }
            }
            this.x = o7.b();
            if (this.o instanceof D3 && this.o != null) {
                this.o.b();
            }
        }
    }

    @Override
    public double t() {
        return this.z.a();
    }

    @Override
    public void a(double d3) {
        this.z.a(d3);
    }

    @Override
    public double k() {
        return this.z.b();
    }

    @Override
    public void d(double d3) {
        this.z.b(d3);
    }

    @Override
    public DU m() {
        return this.z;
    }

    @Override
    public yG s() {
        return this.w;
    }

    @Override
    public void a(yG yG2) {
        this.w = yG2;
    }

    public r1 Q() {
        if (this.s() != null) {
            yG yG2 = this.s();
            while (yG2 != null) {
                if ((yG2 = yG2.s()) == null || !(yG2 instanceof r1)) continue;
                return (r1)yG2;
            }
        }
        return null;
    }

    @Override
    public boolean a(char c2, int n6) {
        if (!this.e()) {
            return false;
        }
        for (p1 p12 : this.v()) {
            if (!p12.e() || !p12.a(c2, n6)) continue;
            return true;
        }
        return false;
    }

    private void a(p1 p12, p1 p13) {
        Object object;
        if (p13.equals(p12)) {
            return;
        }
        if (p13 instanceof be_0) {
            object = (be_0)((Object)p13);
            object.e(false);
        }
        if (p13 instanceof yG) {
            object = (yG)p13;
            for (p1 p14 : object.v()) {
                this.a(p12, p14);
            }
        }
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.e()) {
            for (p1 object : this.A) {
                if (!object.a(n6, n10, n11)) continue;
                for (p1 p12 : this.A) {
                    this.a(object, p12);
                }
                return true;
            }
            if (this.g()) {
                Iterator<p1> iterator = new ArrayList<Map.Entry<DU, tJ>>(this.q.entrySet()).listIterator(this.q.size());
                while (iterator.hasPrevious()) {
                    Map.Entry entry = (Map.Entry)iterator.previous();
                    DU dU = (DU)entry.getKey();
                    tJ tJ2 = (tJ)entry.getValue();
                    if (tJ2 == null) {
                        return true;
                    }
                    if (dU == null) {
                        tJ2.a(this, n6, n10, n11);
                        return true;
                    }
                    if (!dU.a(this.t(), this.k()).a(o7.b())) continue;
                    tJ2.a(this, n6, n10, n11);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Set<ue_0> h() {
        return this.p;
    }

    @Override
    public boolean a(int n6, int n10) {
        return this.z.b(n6, n10);
    }

    @Override
    public boolean e() {
        return this.l;
    }

    @Override
    public void a(boolean bl) {
        this.l = bl;
    }

    @Override
    public Set<DU> o() {
        return this.q.keySet();
    }

    @Override
    public void a(DU dU, tJ tJ2) {
        this.q.put(dU, tJ2);
    }

    @Override
    public mq r() {
        return on.p.j();
    }

    @Override
    public double q() {
        return this.z.d();
    }

    @Override
    public void c(double d3) {
        this.z.c(d3);
    }

    @Override
    public double b() {
        return this.z.c();
    }

    @Override
    public void b(double d3) {
        this.z.d(d3);
    }

    @Override
    public Color f() {
        return this.v;
    }

    @Override
    public void b(Color color) {
        this.v = color;
    }

    @Override
    public Color n() {
        return this.i;
    }

    @Override
    public void a(Color color) {
        this.i = color;
    }

    @Override
    public List<p1> v() {
        return this.A;
    }

    @Override
    public List<p1> w() {
        ArrayList<p1> arrayList = new ArrayList<p1>();
        for (p1 p12 : this.A) {
            if (!p12.e()) continue;
            arrayList.add(p12);
        }
        return arrayList;
    }

    public p1 b(BasicValue ds_02) {
        for (p1 p12 : this.A) {
            if (!p12.p().equals(ds_02)) continue;
            return p12;
        }
        return null;
    }

    @Override
    public p1 b(p1 p12) {
        p12.a(this);
        this.A.add(p12);
        return p12;
    }

    public boolean c(p1 p12) {
        return this.A.contains(p12);
    }

    public p1[] a(p1[] p1Array) {
        for (p1 p12 : p1Array) {
            p12.a(this);
            this.A.add(p12);
        }
        return p1Array;
    }

    @Override
    public p1 a(int n6, p1 p12) {
        this.A.add(n6, p12);
        return p12;
    }

    @Override
    public void a(p1 p12) {
        this.A.remove(p12);
    }

    public void J() {
        this.A.clear();
    }

    @Override
    public bl_0 u() {
        return this.o;
    }

    @Override
    public void a(bl_0 bl_02) {
        bl_02.a(this);
        this.o = bl_02;
    }

    public DU K() {
        return this.C;
    }

    public void a(DU dU) {
        for (p1 p12 : this.A) {
            if (!(p12 instanceof qp)) continue;
            ((qp)p12).a(dU);
        }
        this.C = dU;
    }

    @Override
    public boolean g() {
        Object object;
        if (!this.m) {
            return false;
        }
        boolean bl = true;
        if (!(this instanceof r1)) {
            yG yG2;
            object = on.p.H().b(zu_0.class);
            yG yG3 = this;
            while ((yG2 = yG3.s()) != null) {
                yG3 = yG2;
            }
            if (yG3 instanceof r1 && !yG3.equals(((zu_0)object).ao())) {
                bl = false;
            }
        }
        object = o7.b();
        if (this.C != null) {
            int n6 = Mouse.getX();
            int n10 = Mouse.getY();
            return (double)n6 > this.C.a() && (double)n10 > this.C.b() && (double)n6 < this.C.a() + this.C.d() && (double)n10 < this.C.b() + this.C.c() && bl && this.a(((bo_0)object).a, ((bo_0)object).b);
        }
        return bl && this.a(((bo_0)object).a, ((bo_0)object).b);
    }

    public int O() {
        return this.B;
    }

    public int M() {
        return this.D;
    }

    @Override
    public Set<R> j() {
        return this.h;
    }

    @Override
    public void a(R r) {
        this.h.add(r);
    }

    public void a(ue_0 ue_02) {
        this.p.add(ue_02);
    }

    @Override
    public BasicValue p() {
        return this.r;
    }

    @Override
    public void a(BasicValue ds_02) {
        this.r = ds_02;
    }

    @Override
    public boolean i() {
        return this.E;
    }

    public void j(boolean bl) {
        this.E = bl;
    }

    public rl_0 U() {
        return this.u;
    }

    public void b(String string) {
        if (this.u != null) {
            this.u.a(string);
        } else {
            this.j = string;
        }
    }

    public String L() {
        return this.j;
    }

    @Override
    public boolean d() {
        if (this.N() && !a.ib()) {
            return true;
        }
        return this.n;
    }

    @Override
    public void b(boolean bl) {
        this.n = bl;
    }

    public boolean N() {
        return this.k;
    }

    public void h(boolean bl) {
        this.k = bl;
    }

    public void a(p1 p12, Consumer<p1> consumer) {
        block5: {
            block6: {
                block4: {
                    consumer.accept(p12);
                    if (p12 instanceof bj_1 || p12 instanceof qD) {
                        return;
                    }
                    if (!(p12 instanceof r6)) break block4;
                    for (p1 p13 : ((r6)p12).A().v()) {
                        this.a(p13, consumer);
                    }
                    break block5;
                }
                if (!(p12 instanceof r1)) break block6;
                for (p1 p14 : ((r1)p12).aj().v()) {
                    this.a(p14, consumer);
                }
                break block5;
            }
            if (!(p12 instanceof yG)) break block5;
            for (p1 p15 : ((yG)p12).v()) {
                this.a(p15, consumer);
            }
        }
    }

    public Color P() {
        return this.t;
    }

    public void c(Color color) {
        this.t = color;
    }

    public void i(boolean bl) {
        this.m = bl;
    }

    public void R() {
        if (this.p() != null) {
            this.p().d();
        }
    }

    public boolean I() {
        if (!this.e()) {
            return false;
        }
        for (yG yG2 = this.s(); yG2 != null; yG2 = yG2.s()) {
            if (yG2.e()) continue;
            return false;
        }
        return true;
    }

    public static void b(cy_0[] cy_0Array) {
        y = cy_0Array;
    }

    public static cy_0[] S() {
        return y;
    }

    static {
        if (qp.S() == null) {
            qp.b(new cy_0[5]);
        }
    }
}

