/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.wm
 */
public class wm_0
extends we_0
implements bz_2 {
    private boolean X = true;
    private xA W;
    private wK Y;
    private wK Z;
    private wK ab;
    private wK V;
    private x2 aa;

    public wm_0() {
        this.aa = new x2(wm_0.b.y);
        this.a(wm_0.b.k);
        this.c(300.0);
        this.a(100.0);
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
        this.a(new xo_0(this, this, "newfriends", "Enemies"));
        this.W = new xA(on.p.b().e);
        this.Y = new wK(on.p.N().recolorVisuals);
        this.Z = new wK(on.p.b().f);
        this.ab = new wK(on.p.N().useAlias);
        this.V = new wK(on.p.N().spoofAlias);
        this.W.a(wm_0.b.u);
        this.Y.a(wm_0.b.u);
        this.Z.a(wm_0.b.u);
        this.ab.a(wm_0.b.u);
        this.V.a(wm_0.b.u);
        this.W.a(false);
        this.Y.a(false);
        this.Z.a(false);
        this.ab.a(false);
        this.V.a(false);
        this.aa.a(false);
    }

    public void ak() {
        this.J();
        this.a(this.W, this.Y, this.Z, this.ab, this.V, this.aa);
        this.a((wM)new x9("Username / Alias"), new Object[0]);
        for (pr pr2 : on.p.b().e()) {
            this.a((wM)new x_(pr2).a(new n1(this, pr2)), new Object[0]);
        }
        this.M();
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public void n() {
        this.X = !this.X;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg_0) continue;
            wM2.a(this.X);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.X;
    }

    @Override
    public String ad() {
        return "Enemies";
    }

    static xA d(wm_0 wm_02) {
        return wm_02.W;
    }

    static wK a(wm_0 wm_02) {
        return wm_02.Y;
    }

    static wK f(wm_0 wm_02) {
        return wm_02.Z;
    }

    static wK b(wm_0 wm_02) {
        return wm_02.ab;
    }

    static wK c(wm_0 wm_02) {
        return wm_02.V;
    }

    static x2 e(wm_0 wm_02) {
        return wm_02.aa;
    }
}

