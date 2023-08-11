/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.xm
 */
public class xm_0
extends wM {
    private DY D;
    private wW z = new wW("newplayers");
    private wW C = new wW("newmobs");
    private wW B = new wW("newpeaceful");
    private wW A = new wW("newneutral");

    public xm_0(DY dY) {
        this.D = dY;
        this.z.c(new vO(this, dY));
        this.z.i(true);
        this.z.a("Target players");
        this.C.c(new ae_1(this, dY));
        this.C.i(true);
        this.C.a("Target mobs");
        this.B.c(new yn_0(this, dY));
        this.B.i(true);
        this.B.a("Target peaceful");
        this.A.c(new o4(this, dY));
        this.A.i(true);
        this.A.a("Target neutral");
        this.a(this.z, this.C, this.B, this.A);
    }

    @Override
    public void a() {
        double d3 = (this.e() - 10.0 - 6.0) / 4.0;
        double d4 = this.d() + 5.0;
        this.a(this.z, this.D.r().e(), d3, d4);
        this.a(this.C, this.D.r().i(), d3, d4 += d3 + 2.0);
        this.a(this.B, this.D.r().b(), d3, d4 += d3 + 2.0);
        this.a(this.A, this.D.r().h(), d3, d4 += d3 + 2.0);
    }

    private void a(wW wW2, BooleanValue dB, double d3, double d4) {
        wW2.c(d4);
        wW2.a(this.c() + 2.5);
        wW2.b(d3);
        wW2.d(this.f() - 5.0);
        wW2.h(dB.u());
        wW2.d(dB.u() != false || wW2.x() ? b.c() : null);
        if (!wW2.Q().j() && !wW2.Q().d() && dB.u().booleanValue()) {
            wW2.Q().c();
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
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

