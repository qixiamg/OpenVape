/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.xb
 */
public class xb_0
extends xg_0 {
    private wV G = new wV("newsearch", 0.9);
    private wV D = new wV("newalts");
    private wV C = new wV("moduleback");
    private wh_0 E = new wh_0("newclose");
    private x1 B = new x1(this);
    private w6 F;

    public xb_0(w6 w62) {
        super(w62);
        this.F = w62;
        this.G.c(new mM(this));
        this.E.c(new sO(this, w62));
        this.C.c(new mY(this, w62));
        this.D.c(new b9(this));
        this.D.a(false);
        this.a(this.G, this.D, this.C, this.E, this.B);
    }

    @Override
    public void a() {
        this.F.aq();
        if (this.B.N().length() > 0) {
            this.E.a(true);
            this.G.a(false);
            this.E.c(this.C.b() ? this.d() + 10.0 + this.B.e() : this.d() - 5.0 + this.B.e());
            this.E.a(this.c());
            this.E.b(15.0);
            this.E.d(this.f());
        } else {
            this.G.a(true);
            this.E.a(false);
            this.G.c(this.d() - 5.0 + this.B.e());
            this.G.a(this.c());
            this.G.b(15.0);
            this.G.d(this.f());
        }
        if (this.F.ak() != null) {
            this.C.a(true);
            this.D.a(false);
            this.C.c(this.d() + 5.0);
            this.C.a(this.c());
            this.C.b(15.0);
            this.C.d(this.f());
        } else {
            this.C.a(false);
            this.D.c(this.d() + 5.0);
            this.D.a(this.c());
            this.D.b(15.0);
            this.D.d(this.f());
        }
        this.B.c(this.C.b() ? this.d() + 15.0 : this.d());
        this.B.a(this.c() - 2.0);
        this.B.b(this.C.b() ? this.e() - 30.0 : this.e() - 15.0);
        this.B.d(this.f() - 4.0);
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

    public void n() {
        this.F.a((Module)null);
        zu_0.b(w6.class).b(this.B.N());
    }

    static x1 a(xb_0 xb_02) {
        return xb_02.B;
    }
}

