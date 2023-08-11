/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.DU;
import manthe.i_0;
import manthe.pe_0;
import manthe.sY;
import manthe.uW;
import manthe.w2;
import manthe.wC;
import manthe.wJ;
import manthe.wL;
import manthe.wM;
import manthe.wT;
import manthe.we_0;
import manthe.wf_0;
import manthe.wr_0;
import manthe.x2;
import manthe.xM;
import manthe.zu_0;

public class wY
extends we_0 {
    private i_0 Z = new i_0(0.15, 0.0, 100.0);
    private i_0 V = new i_0(0.15, 0.0, 1.0);
    private wf_0 X = new wf_0("Text GUI", "newtextgui", 0.9, 6);
    private wf_0 Y = new wf_0("Rearview", "newrearview", 0.9, 7);
    private wf_0 ab = new wf_0("Duel Info", "newduelinfo", 0.9, 7);
    private wf_0 aa = new wf_0("Target Info", "newtargetinfo", 0.9, 7);
    private wf_0 W = new wf_0("Radar", "newradar", 0.9, 7);
    private int ac;

    public wY() {
        this.P = false;
        this.g(false);
        this.a(wY.b.k);
        this.W().e(false);
        this.W().b("wrap");
        xM xM2 = new xM(this, "newoverlays", "Overlays", 0.7);
        xM2.n().m();
        xM2.n().c(new sY(this));
        this.X.a(wL.class);
        this.Y.a(wJ.class);
        this.ab.a(wC.class);
        this.aa.a(wr_0.class);
        this.W.a(w2.class);
        this.a(xM2);
        this.a((wM)new x2(wY.b.y), new Object[0]);
        this.a(this.X, this.Y, this.ab, this.aa, this.W);
        this.a(false);
        this.j(false);
    }

    @Override
    public void V() {
        wT wT2 = zu_0.b(wT.class);
        if (wT2 == null) {
            return;
        }
        if (this.ac == 1) {
            this.ac = 2;
            this.Z.c();
            this.V.c();
        }
        if (this.ac == 3) {
            this.ac = 4;
            this.Z.c();
            this.V.c();
        }
        if (this.ac == 4 && this.Z.o().doubleValue() == this.Z.p()) {
            this.ac = 0;
            this.a(false);
            return;
        }
        if (this.V.o().doubleValue() != this.V.n()) {
            this.g(true);
            this.a(new DU(wT2.d(), wT2.c(), wT2.e(), wT2.f()));
            this.c(wT2.d());
            this.a(wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
            this.M();
        }
        if (this.d() != wT2.d() || this.c() != wT2.c()) {
            this.a(wT2.d(), wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
        }
        this.a(wT2.c() + wT2.f() - 2.0 - this.f() * this.V.o());
        pe_0.a(wT2.d(), wT2.c(), wT2.e(), wT2.f(), new Color(0, 0, 0, this.Z.o().intValue()));
    }

    @Override
    public void Z() {
    }

    @Override
    public String ad() {
        return "Overlays";
    }

    @Override
    public void a(uW uW2) {
        if (!this.x()) {
            this.ac = 3;
        }
    }

    @Override
    public void K() {
    }

    public wf_0 al() {
        return this.X;
    }

    public wf_0 am() {
        return this.Y;
    }

    public wf_0 ak() {
        return this.ab;
    }

    public wf_0 n() {
        return this.W;
    }

    public int m() {
        return this.ac;
    }

    public void a(int n6) {
        this.ac = n6;
    }

    static int a(wY wY2, int n6) {
        wY2.ac = n6;
        return wY2.ac;
    }
}

