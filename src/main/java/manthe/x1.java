/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.c2_0;
import manthe.uW;
import manthe.wT;
import manthe.x4;
import manthe.xV;
import manthe.xb_0;
import manthe.zu_0;

public class x1
extends x4 {
    private xb_0 O;
    private xV M;
    private int N = 0;

    public x1(xb_0 xb_02) {
        super("");
        this.O = xb_02;
        this.I.a(false);
    }

    public x1(xV xV2) {
        super("");
        this.M = xV2;
        this.I.a(false);
    }

    @Override
    public void Q() {
    }

    @Override
    public void a() {
        if (!(this.M == null || zu_0.W != null && zu_0.W.equals(this))) {
            zu_0.W = this;
        }
        this.K();
    }

    @Override
    public void j() {
        int n6;
        if (this.b() && this.O != null && (n6 = this.N().length()) != this.N) {
            this.O.n();
            this.N = n6;
        }
    }

    @Override
    public void i() {
    }

    @Override
    public void a(uW uW2) {
        if (this.O != null) {
            super.a(uW2);
            return;
        }
        if (uW2.c().equals((Object)c2_0.RIGHT_CLICK)) {
            this.c("");
            ((wT)this.M.l()).ar();
        }
        if (zu_0.W != null && !this.q().b(uW2.a(), uW2.b())) {
            zu_0.W = null;
            this.M.f(false);
            this.a(false);
        }
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

