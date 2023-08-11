/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

/*
 * Renamed from manthe.rq
 */
public class rq_0
extends r1 {
    private static final double ag = 20.0;
    private static final double af = 18.0;
    public final r6 ah;
    private final rf_0 aj;
    private final rf_0 ai;
    private final sb_0 ae;
    private final rg_0 ak;

    public rq_0() {
        super("Friends", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf_02.c(125.0);
        this.d(rf_02);
        this.aj = new rf_0(false);
        this.aj.a(new D7(0.0, 1.0, 5000, 1, new pd(2, 0, 1, 0)));
        this.aj.b((p1)on.p.N().recolorVisuals.getDefaultValue());
        this.aj.b((p1)on.p.N().friendsColor.getDefaultValue());
        this.aj.b((p1)on.p.N().useFriends.getDefaultValue());
        this.aj.b((p1)on.p.N().useAlias.getDefaultValue());
        this.aj.b((p1)on.p.N().spoofAlias.getDefaultValue());
        rf_02.b(this.aj);
        this.ai = new rP(this, false);
        this.ak = new rg_0("Add", false);
        this.ak.b(12.0);
        this.ak.c(20.0);
        this.ak.a(new qT(this));
        this.ae = new sG(this, 33);
        this.ae.b(12.0);
        this.ae.a("<username> [alias]");
        this.ai.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 1, 0)));
        this.ai.b(this.ae);
        this.ai.b(this.ak);
        rf_02.b(this.ai);
        this.ah = new r6(false);
        this.ah.b(130.0);
        rf_02.b(this.ah);
        this.c(120.0);
        this.b(20.0);
    }

    @Override
    public void c(double d3) {
        double d4 = d3 - 0.0;
        this.a(this.aj(), new Cx(this, d4));
        this.ae.c(d4 - 20.0);
        this.ak.c(20.0);
        for (p1 p12 : this.ah.A().v()) {
            rf_0 rf_02 = (rf_0)p12;
            p1 p13 = rf_02.v().get(0);
            p1 p14 = rf_02.v().get(1);
            p13.c(d4 - 18.0 - 5.0);
            p14.c(18.0);
        }
        super.c(d3 + 6.0);
    }

    public void a(Friend ab_02) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(103.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new r7(rf_02, ab_02);
        this.ah.d(rf_02);
    }

    public void b(Friend ab_02) {
        rf_0 rf_02 = null;
        rf_0 rf_03 = this.ah.A();
        String string = null;
        for (p1 p12 : rf_03.v()) {
            rf_0 rf_04 = (rf_0)p12;
            r7 r72 = (r7)rf_04.v().get(0);
            string = r72.H();
            if (!string.equals(ab_02.getName())) continue;
            rf_02 = rf_04;
            break;
        }
        if (rf_02 != null) {
            on.p.N().e().remove(ab_02);
            rf_03.a((p1)rf_02);
        }
    }

    static sb_0 b(rq_0 rq_02) {
        return rq_02.ae;
    }

    static rg_0 a(rq_0 rq_02) {
        return rq_02.ak;
    }
}

