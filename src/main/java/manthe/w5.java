/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public class w5<T>
extends wM {
    private List<T> H = new ArrayList<T>();
    private List<tR> C = new ArrayList<tR>();
    private T z;
    private String G;
    private boolean E;
    private g_0 I;
    private boolean A;
    private float B;
    private DX F;
    private static int D;

    public w5(String string, T ... TArray) {
        this.I = new g_0(0.15, w5.b.y, w5.b.f);
        this.A = false;
        this.B = 2.0f;
        this.G = string;
        Collections.addAll(this.H, TArray);
    }

    public w5(DX dX) {
        this(dX.H(), (Object[])dX.u());
        this.F = dX;
        this.a((Object)dX);
    }

    @Override
    public void a() {
        this.o();
        mq mq2 = this.e(0.9);
        double d3 = mq2.a(this.G);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        double d5 = this.c() + this.f() / 2.0 - (double)(this.B / 2.0f);
        Color color = w5.b.k;
        if (this.A) {
            double d6 = this.f() - 5.0 + (d3 + 5.0) * (double)this.H.size();
            pe_0.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, d6 - 1.0, color, false, 3.0f, 1.0f);
            pe_0.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, d6, this.I.q(), 3.0f, 0.75f, 1.0f);
            bo_0 bo_02 = o7.b();
            for (int i = 0; i < this.H.size(); ++i) {
                double d7 = d4 + (d3 + 5.0) * (double)(i + 1);
                DU dU = new DU(this.d() + 5.0 + 0.5, d7 - 2.5, this.e() - 10.0 - 1.0, d3 + 5.0);
                if (dU.a(bo_02)) {
                    pe_0.c(dU.a(), dU.b(), dU.d(), dU.c(), w5.b.m);
                }
                mq2.a(this.H.get(i).toString(), this.d() + 10.0, d7, w5.b.r);
            }
        } else {
            pe_0.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color, false, 3.0f, 1.0f);
            pe_0.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.I.q(), 3.0f, 0.75f, 1.0f);
        }
        if (this.A) {
            mq2.a(this.F.v().toString(), this.d() + 10.0, d4, w5.b.r);
        } else {
            mq2.a(this.G + " - " + this.F.v().toString(), this.d() + 10.0, d4, w5.b.r);
        }
        k9.a(w5.b.o, (float)(this.d() + this.e()) - 15.0f, (float)d5, this.A ? "upcollapse" : "downexpand", this.B, this.B, false);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.E && !this.x() && !this.A) {
            this.I.c();
            this.E = false;
        }
    }

    @Override
    public void a(uW uW2) {
        boolean bl = this.A = !this.A;
        if (this.A) {
            zu_0.W = this;
        } else {
            mq mq2 = this.e(0.9);
            double d3 = mq2.a(this.G);
            double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
            for (int i = 0; i < this.H.size(); ++i) {
                double d5 = d4 + (d3 + 5.0) * (double)(i + 1);
                DU dU = new DU(this.d() + 5.0 + 0.5, d5 - 2.5, this.e() - 10.0 - 1.0, d3 + 5.0);
                if (!dU.b(uW2.a(), uW2.b())) continue;
                this.z = this.H.get(i);
                if (this.F == null) continue;
                this.F.d();
                this.F.setType(pb_0.a(this.F, this.z.toString()));
                for (tR tR2 : this.C) {
                    tR2.a();
                }
                if (this.F.getValues().size() <= 0) continue;
                this.F().M();
            }
            zu_0.W = null;
        }
    }

    @Override
    public void i() {
        if (!this.E) {
            this.I.c();
        }
        this.E = true;
    }

    public w5<T> a(tR tR2) {
        this.C.add(tR2);
        return this;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public void a(T t) {
        this.J().add(t);
    }

    public void a(T ... TArray) {
        Collections.addAll(this.J(), TArray);
    }

    public String K() {
        return this.G;
    }

    public T n() {
        return this.z;
    }

    public List<T> J() {
        return this.H;
    }

    public static void b(int n6) {
        D = n6;
    }

    public static int l() {
        return D;
    }

    public static int m() {
        int n6 = w5.l();
        if (n6 == 0) {
            return 51;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (w5.l() != 0) {
            w5.b(108);
        }
    }
}

