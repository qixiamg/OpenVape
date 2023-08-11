/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DU;
import manthe.bo_0;
import manthe.mq;
import manthe.o7;
import manthe.pe_0;
import manthe.uW;
import manthe.ua_0;
import manthe.uh_0;
import manthe.wM;
import manthe.zu_0;

/*
 * Renamed from manthe.wq
 */
public class wq_0
extends wM {
    private final uh_0[] B = uh_0.values();
    protected boolean z;
    private uh_0 C = null;
    private boolean A;

    @Override
    public void a() {
        String string = this.C != null ? this.C.a() : "Sort by";
        mq mq2 = this.e(0.7);
        double d3 = mq2.a(string);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        pe_0.a("newsort", this.d() + 2.5, this.c() + this.f() / 2.0, 5.0, 5.0, this.z ? wq_0.b.c : wq_0.b.r);
        mq2.b(string, this.d() + this.e() / 2.0, d4, this.z ? wq_0.b.c : wq_0.b.r);
        if (this.A) {
            double d5 = 5.0 + (d3 + 5.0) * (double)this.B.length;
            pe_0.a(this.d(), this.c() + d3 + 15.0, this.e(), d5 - 1.0, wq_0.b.u);
            pe_0.a("dropdownnotch", this.d() + this.e() / 2.0, this.c() + d3 + 15.0, 4.0, 4.0, wq_0.b.u);
            bo_0 bo_02 = o7.b();
            for (int i = 0; i < this.B.length; ++i) {
                double d6 = d4 + 5.0 + (d3 + 5.0) * (double)(i + 1);
                DU dU = new DU(this.d(), d6 - 2.5, this.e(), d3 + 5.0);
                if (dU.a(bo_02)) {
                    pe_0.c(dU.a(), dU.b(), dU.d(), dU.c(), wq_0.b.m);
                }
                mq2.b(this.B[i].a(), this.d() + this.e() / 2.0, d6, wq_0.b.r);
            }
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.z && !this.x()) {
            this.z = false;
        }
    }

    @Override
    public void a(uW uW2) {
        boolean bl = this.A = !this.A;
        if (this.A) {
            zu_0.W = this;
        } else {
            mq mq2 = this.e(0.7);
            double d3 = mq2.a("Sort by");
            double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
            for (int i = 0; i < this.B.length; ++i) {
                double d5 = d4 + 5.0 + (d3 + 5.0) * (double)(i + 1);
                DU dU = new DU(this.d(), d5 - 2.5, this.e(), d3 + 5.0);
                if (!dU.b(uW2.a(), uW2.b())) continue;
                this.C = this.B[i];
                ua_0.a(this.C);
            }
            zu_0.W = null;
        }
    }

    @Override
    public void i() {
        this.z = true;
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

