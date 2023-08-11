/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.ColorValue;

import java.awt.Color;

public class rC
extends r1 {
    private static final double ag = 20.0;
    private static final double ae = 18.0;
    private final rf_0 ah;
    private final sb_0 ak;
    private final rl_0 aj;
    private final r6 al;
    private final ColorValue af;
    private final AO ai = new AO();

    public rC() {
        super("Search", false);
        this.aj().a(new D7(0.0, 1.0, 5, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(0.0, 3.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.d(rf_02);
        this.ah = new rf_0(false);
        this.af = ColorValue.createValue((Object)this, "new block color", Color.RED);
        ((sW)this.af.getDefaultValue()).c(95.0);
        this.af.t();
        rf_02.b((p1)this.af.getDefaultValue());
        s7 s72 = new s7(on.p.H().b(zE.class));
        s72.b(14.0);
        s72.c(95.0);
        rf_02.b(s72);
        rg_0 rg_02 = new rg_0("Add", false);
        rg_02.b(12.0);
        rg_02.c(20.0);
        rg_02.a(new mE(this));
        this.ak = new sl_0(this, 64, rg_02);
        this.ak.z().e(0.8);
        this.ak.b(12.0);
        this.ak.c(73.0);
        this.ak.a("<block name>");
        this.ah.a(new D7(1.0, 1.0, 1, 2, new pd(0, 0, 0, 0)));
        this.ah.b(this.ak);
        this.ah.b(rg_02);
        rf_02.b(this.ah);
        this.aj = new rl_0("", my_0.i, 0.8);
        this.aj.b(10.0);
        this.aj.c(95.0);
        this.aj.a(false);
        rf_02.b(this.aj);
        this.al = new r6(false);
        this.al.b(130.0);
        rf_02.b(this.al);
        this.c(100.0);
        this.b(20.0);
    }

    private void a(String string) {
        String string2 = string.replace(" ", "_");
        if (string2.contains(":")) {
            string2 = string2.split(":")[0];
        }
        dx_2 dx_22 = dx_2.a(string2);
        this.ai.d();
        if (dx_22 == null) {
            this.aj.a("Could not find block");
            return;
        }
        L l6 = this.af.K();
        this.af.t();
        this.ak.C().a("");
        this.aj.a("Added " + string);
        this.a(string, l6);
    }

    @Override
    public void c() {
        super.c();
        if (this.aj.e() && this.ai.a(2000L)) {
            this.aj.a("");
            this.ai.d();
        }
        this.aj.a(!this.aj.E().isEmpty());
    }

    @Override
    public void c(double d3) {
        super.c(d3);
    }

    private void a(String string, Color color) {
        qw qw2 = new qw(string, color.getRGB());
        this.a(qw2);
        on.p.d().a(qw2);
    }

    public void a(qw qw2) {
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(76.0);
        rf_02.a(new D7(1.0, 1.0, 2, 2, new pd(0, 0, 0, 0)));
        rW rW2 = new rW(rf_02, qw2);
        qw2.a(rW2);
        this.al.d(rf_02);
    }

    public void a(rW rW2) {
        rf_0 rf_02 = this.al.A();
        rf_02.a((p1)rW2.V());
    }

    static sb_0 a(rC rC2) {
        return rC2.ak;
    }

    static void a(rC rC2, String string) {
        rC2.a(string);
    }
}

