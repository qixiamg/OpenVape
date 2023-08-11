/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.eC;
import manthe.er_0;
import manthe.fS;
import manthe.gh_0;
import manthe.he_0;

public class eJ
extends eC {
    public eJ(Object object) {
        super(object);
    }

    public gh_0 bg() {
        return new gh_0(eJ.a.M().aJ.b(this.b));
    }

    public fS bp() {
        if (V.c() <= 13) {
            return new er_0(this.b).bp();
        }
        return new fS(he_0.g(eJ.a.M().aJ, this.b));
    }

    @Override
    public float aF() {
        if (V.c() >= 23) {
            return eJ.a.M().aJ.c(this.b);
        }
        return super.aF();
    }

    @Override
    public void n(float f10) {
        if (V.c() >= 23) {
            eJ.a.M().aJ.c(this.b, f10);
            return;
        }
        super.n(f10);
    }

    public double bo() {
        if (V.c() <= 13) {
            return new er_0(this.a()).bv();
        }
        return he_0.a(eJ.a.M().aJ, this.b);
    }

    public void s(double d3) {
        if (V.c() <= 13) {
            new er_0(this.a()).y(d3);
            return;
        }
        he_0.a(eJ.a.M().aJ, this.b, d3);
    }

    public double bj() {
        if (V.c() <= 13) {
            return new er_0(this.a()).bx();
        }
        return he_0.i(eJ.a.M().aJ, this.b);
    }

    public void u(double d3) {
        if (V.c() <= 13) {
            new er_0(this.a()).x(d3);
            return;
        }
        he_0.b(eJ.a.M().aJ, this.b, d3);
    }

    public double bk() {
        if (V.c() <= 13) {
            return new er_0(this.a()).by();
        }
        return he_0.c(eJ.a.M().aJ, this.b);
    }

    public void t(double d3) {
        if (V.c() <= 13) {
            new er_0(this.a()).v(d3);
            return;
        }
        he_0.c(eJ.a.M().aJ, this.b, d3);
    }

    public float bi() {
        if (V.c() <= 13) {
            return new er_0(this.a()).bs();
        }
        return he_0.b(eJ.a.M().aJ, this.b);
    }

    public void u(float f10) {
        if (V.c() <= 13) {
            new er_0(this.a()).w(f10);
            return;
        }
        he_0.a(eJ.a.M().aJ, this.b, f10);
    }

    public float bl() {
        if (V.c() <= 13) {
            return new er_0(this.a()).bw();
        }
        return he_0.f(eJ.a.M().aJ, this.b);
    }

    public void t(float f10) {
        if (V.c() <= 13) {
            new er_0(this.a()).v(f10);
            return;
        }
        he_0.b(eJ.a.M().aJ, this.b, f10);
    }

    public boolean bn() {
        return he_0.e(eJ.a.M().aJ, this.b);
    }

    public void k(boolean bl) {
        he_0.b(eJ.a.M().aJ, this.b, bl);
    }

    public boolean bm() {
        return he_0.d(eJ.a.M().aJ, this.b);
    }

    public void j(boolean bl) {
        he_0.a(eJ.a.M().aJ, this.b, bl);
    }

    public int bh() {
        if (V.c() <= 13) {
            return new er_0(this.a()).bt();
        }
        return he_0.h(eJ.a.M().aJ, this.b);
    }

    public void g(int n6) {
        if (V.c() <= 13) {
            new er_0(this.a()).h(n6);
            return;
        }
        he_0.a(eJ.a.M().aJ, this.b, n6);
    }

    public void l(boolean bl) {
        he_0.c(eJ.a.M().aJ, this.b, bl);
    }

    public void a(String string) {
        if (V.c() <= 13) {
            new er_0(this.a()).a(string);
            return;
        }
        he_0.a(eJ.a.M().aJ, this.b, string);
    }
}

