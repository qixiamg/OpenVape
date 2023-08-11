/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class r5
extends r1 {
    private static final double aj = 20.0;
    private static final double ah = 18.0;
    public final r6 ag;
    private final rf_0 ai;
    private final rf_0 ak;
    private final sb_0 af;
    private final rg_0 ae;

    public r5() {
        super("Enemies", false);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 2, 2)));
        rf_02.c(125.0);
        this.d(rf_02);
        this.ai = new rf_0(false);
        this.ai.a(new D7(0.0, 1.0, 5000, 1, new pd(2, 0, 1, 0)));
        this.ai.b((p1)on.p.b().e.getDefaultValue());
        this.ai.b((p1)on.p.b().c.getDefaultValue());
        this.ai.b((p1)on.p.b().f.getDefaultValue());
        this.ai.b((p1)on.p.b().d.getDefaultValue());
        this.ai.b((p1)on.p.b().b.getDefaultValue());
        rf_02.b(this.ai);
        this.ak = new rv_0(this, false);
        this.ae = new rg_0("Add", false);
        this.ae.b(12.0);
        this.ae.c(20.0);
        this.ae.a(new qq(this));
        this.af = new s9(this, 33);
        this.af.b(12.0);
        this.af.a("<username> [alias]");
        this.ak.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 1, 0)));
        this.ak.b(this.af);
        this.ak.b(this.ae);
        rf_02.b(this.ak);
        this.ag = new r6(false);
        this.ag.b(130.0);
        rf_02.b(this.ag);
        this.c(120.0);
        this.b(20.0);
    }

    @Override
    public void c(double d3) {
        double d4 = d3 - 0.0;
        this.a(this.aj(), new cc_1(this, d4));
        this.af.c(d4 - 20.0);
        this.ae.c(20.0);
        for (p1 p12 : this.ag.A().v()) {
            rf_0 rf_02 = (rf_0)p12;
            p1 p13 = rf_02.v().get(0);
            p1 p14 = rf_02.v().get(1);
            p13.c(d4 - 18.0 - 5.0);
            p14.c(18.0);
        }
        super.c(d3 + 6.0);
    }

    public void a(pr pr2) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(103.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        new rI(rf_02, pr2);
        this.ag.d(rf_02);
    }

    public void b(pr pr2) {
        rf_0 rf_02 = null;
        rf_0 rf_03 = this.ag.A();
        String string = null;
        for (p1 p12 : rf_03.v()) {
            rf_0 rf_04 = (rf_0)p12;
            rI rI2 = (rI)rf_04.v().get(0);
            string = rI2.H();
            if (!string.equals(pr2.b())) continue;
            rf_02 = rf_04;
            break;
        }
        if (rf_02 != null) {
            on.p.b().e().remove(pr2);
            rf_03.a((p1)rf_02);
        }
    }

    static sb_0 a(r5 r52) {
        return r52.af;
    }

    static rg_0 b(r5 r52) {
        return r52.ae;
    }
}

