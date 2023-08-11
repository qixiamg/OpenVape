/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.w3;
import manthe.ws_0;
import manthe.x4;

public class xG
extends x4 {
    private int M;
    private boolean O;
    private ws_0 N;

    public xG(ws_0 ws_02, String string, boolean bl) {
        super(string);
        this.N = ws_02;
        this.O = bl;
        this.G = ((w3)ws_02.m()).S() ? xG.b.j : xG.b.i;
    }

    public xG(ws_0 ws_02, String string) {
        this(ws_02, string, false);
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        String string = this.N();
        ((w3)this.N.m()).Q().a(string, -1);
        ((w3)this.N.m()).Q().d();
        this.N.ak();
        this.c("");
    }

    @Override
    public double l() {
        return this.e() - 35.0;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    public int S() {
        return this.M;
    }

    public boolean R() {
        return this.O;
    }
}

