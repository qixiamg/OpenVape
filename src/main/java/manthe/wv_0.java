/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.bz_2;
import manthe.pe_0;
import manthe.uW;
import manthe.wD;
import manthe.wM;
import manthe.wU;
import manthe.we_0;
import manthe.x3;
import manthe.x8;
import manthe.xg_0;
import manthe.yI;

/*
 * Renamed from manthe.wv
 */
public class wv_0
extends we_0
implements bz_2 {
    private boolean W;
    private wU V;

    public wv_0() {
        this.a(wv_0.b.k);
        this.c(300.0);
        this.a(100.0);
        this.W = true;
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new x3(this, "newprofiles", "Profiles", 0.7));
        this.a(new wM[]{new x8()});
    }

    @Override
    public void E() {
        if (this.V != null) {
            if (this.V.x()) {
                this.V.E();
            }
            return;
        }
        super.E();
    }

    @Override
    public void b(uW uW2) {
        if (this.V != null) {
            this.V.b(uW2);
            return;
        }
        super.b(uW2);
    }

    @Override
    public void C() {
        super.C();
        if (this.V != null) {
            double d3 = this.V.c() + this.V.f() - (this.c() + this.L());
            if (d3 > 0.0) {
                this.f(this.P() - d3);
            }
            pe_0.a(this.d(), this.c(), this.e(), Math.min(this.f(), this.L()), yI.a(this.I(), 100));
            this.V.C();
        }
    }

    public void a(ak_0 ak_02) {
        this.a(new wM[]{new wU(this, ak_02)});
        wD.V.b(ak_02);
    }

    public void b(ak_0 ak_02) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wU) || !((wU)wM2).N().l().equals(ak_02.l())) continue;
            this.a(wM2);
        }
        wD.V.a(ak_02);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public void n() {
        this.W = !this.W;
        this.al();
    }

    private void al() {
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg_0) continue;
            wM2.a(this.W);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.W;
    }

    public wU ak() {
        return this.V;
    }

    public void a(wU wU2) {
        this.V = wU2;
    }

    @Override
    public String ad() {
        return "Profiles";
    }
}

