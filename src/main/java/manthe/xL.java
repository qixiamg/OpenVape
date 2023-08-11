/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.oa_0;
import manthe.pe_0;
import manthe.qz_0;
import manthe.uW;
import manthe.vW;
import manthe.w0;
import manthe.w2;
import manthe.wC;
import manthe.wJ;
import manthe.wL;
import manthe.wM;
import manthe.wV;
import manthe.wb_0;
import manthe.wr_0;
import manthe.yI;
import manthe.zu_0;

public class xL
extends wM {
    private wV z = new wV("newfavorites", 0.8);
    private wV A;
    private List<oa_0> B = new ArrayList<oa_0>();

    public xL() {
        this.a(xL.b.k);
        this.A = new wb_0(this, "newoverlays", 0.6);
        this.A.c(new vW(this));
        this.A.a("Open overlays menu");
        this.z.c(new qz_0(this));
        this.z.a("Favorites");
        this.a(this.z, this.A);
        this.B.add(new oa_0("newtextgui", zu_0.b(wL.class), 5));
        this.B.add(new oa_0("newrearview", zu_0.b(wJ.class), 6));
        this.B.add(new oa_0("newduelinfo", zu_0.b(wC.class), 6));
        this.B.add(new oa_0("newtargetinfo", zu_0.b(wr_0.class), 7));
        this.B.add(new oa_0("newradar", zu_0.b(w2.class), 7));
    }

    @Override
    public void a() {
        pe_0.c(this.d(), this.c(), this.e(), this.f(), this.I());
        this.z.c(this.d() + 5.0);
        this.z.a(this.c());
        this.z.d(this.f());
        this.z.d(zu_0.b(w0.class).b() ? (this.z.x() ? xL.b.h : xL.b.w) : null);
        this.A.c(this.d() + this.e() - 7.5 - 8.0);
        this.A.a(this.c());
        this.A.d(this.f());
        boolean bl = false;
        double d3 = this.c() + this.f() / 2.0;
        double d4 = (float)(this.d() + this.e() - 17.5 - 8.0);
        for (oa_0 oa_02 : this.B) {
            if (!oa_02.b.b()) continue;
            pe_0.a(oa_02.c, d4, d3, (double)oa_02.a, (double)oa_02.a, xL.b.o);
            bl = true;
            d4 -= (double)(5.0f + (float)oa_02.a);
        }
        this.A.d(bl ? (this.A.x() ? yI.a(b.e(), 10.0) : b.e()) : null);
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
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

