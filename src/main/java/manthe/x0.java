/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.dx_0;
import manthe.uW;
import manthe.wE;
import manthe.wM;
import manthe.wt_0;

public class x0
extends wM {
    private wE z;
    private List<wt_0> A = new ArrayList<wt_0>();

    public x0(wE wE2) {
        this.z = wE2;
        int n6 = 0;
        while (n6 < 9) {
            wt_0 wt_02 = new wt_0(x0.b.u, x0.b.m, 0);
            int n10 = n6++;
            wt_02.c(new dx_0(this, wE2, n10));
            this.A.add(wt_02);
            this.a(wt_02);
        }
    }

    @Override
    public void a() {
        double d3 = this.c() + 10.0;
        double d4 = this.d() + 5.0;
        for (int i = 0; i < this.A.size(); ++i) {
            wt_0 wt_02 = this.A.get(i);
            wt_02.c(d4);
            wt_02.a(d3);
            wt_02.a(this.z.m().n().get(i).a());
            d4 += wt_02.e();
            wt_02.f(this.z.ak() == i);
        }
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

    @Override
    public double g() {
        return 220.0;
    }

    @Override
    public double h() {
        return 40.0;
    }
}

