/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;

public class r2
extends r1 {
    private final c7 af;
    private boolean ah;
    private long ae = 0L;
    private Color ag;

    public r2() {
        super("Settings", false);
        this.aj().a(new D7(0.0, 1.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.af = new rf_0(false);
        this.af.a(new D7(0.0, 1.0, 5000, 1, new pd(0, 2, 0, 2)));
        this.c(84.0);
        this.b(20.0);
        ((sW)on.p.t().r.getDefaultValue()).c(this.q());
        this.af.c(this.q() - 5.0);
        for (p1 p12 : on.p.t().e()) {
            this.af.b(p12);
            p12.c(this.af.q());
        }
        rg_0 rg_02 = on.p.t().syncSettingsState;
        rg_02.b(15.0);
        rg_02.c(this.af.q());
        rg_02.b("Save your settings");
        rg_02.a(new pI(this));
        rg_02.b("Saves your profiles to the cloud.\nClick this every time you change your settings.");
        rg_02.a(new AS(this, rg_02));
        this.af.b(rg_02);
        rg_0 rg_03 = new rg_0("Reload", true);
        rg_03.a(new q_0(this));
        rg_03.b(15.0);
        rg_03.c(this.af.q());
        rg_03.a(new q_(this, rg_03));
        this.af.b(rg_03);
        rg_0 rg_04 = new rg_0("Reload GUI", true);
        rg_04.a(new o(this));
        rg_04.b(15.0);
        rg_04.c(this.af.q());
        rg_04.a(new Ah(this, rg_04));
        this.af.b(rg_04);
        this.d(this.af);
    }

    public void al() {
        this.ag = null;
    }

    public void p(boolean bl) {
        L l6 = on.p.t().r.K();
        if (l6.equals(this.ag)) {
            return;
        }
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        for (r1 r12 : zu_02.Y()) {
            if (r12 instanceof rL) {
                if (!on.p.t().r.J()) {
                    if (!this.ah) continue;
                    this.ah = false;
                    continue;
                }
                this.ah = true;
            }
            if (bl && !r12.ai()) continue;
            r12.a(on.p.t().r.K(), on.p.t().r.J());
        }
        this.ag = l6;
        if (bl) {
            this.ag = null;
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
    }

    static long a(r2 r22) {
        return r22.ae;
    }

    static long a(r2 r22, long l6) {
        r22.ae = l6;
        return r22.ae;
    }
}

