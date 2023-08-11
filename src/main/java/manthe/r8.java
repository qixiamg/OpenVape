/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.regex.Pattern;

public class r8
extends r1 {
    private final rf_0 ae = new rf_0(false);
    private final int ah = 200;
    public sb_0 ag;
    private rg_0 ai;
    private final Pattern af = Pattern.compile("api-\\w{4}-\\w{4}-\\w{4}$");

    public r8() {
        super("TheAltening", false);
        this.aj().e(1.0);
        this.aj().c(new Color(100, 100, 100, 40));
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rf_02.a(new D3(2.0, 0.0, 5000, 2, new pd(2, 2, 0, 0)));
        rl_0 rl_02 = new rl_0("Altening", my_0.c, 1.25);
        rl_02.c(66.0);
        rl_02.b(20.0);
        rl_02.j(false);
        rf_02.b(rl_02);
        this.aj().b(rf_02);
        this.al();
    }

    private void al() {
        this.ae.a(new D7(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(2.0, 2.0, 3, 1, new pd(0, 0, 0, 0)));
        this.ag = new sK(this, 18);
        this.ag.c(199.0);
        this.ag.b(15.0);
        this.ag.a(this.af);
        this.ag.a("Altening API Key");
        this.ag.e(1.0);
        this.ag.c(new Color(100, 100, 100, 40));
        rf_02.b(this.ag);
        rf_02.b((p1)on.p.D().e.getDefaultValue());
        this.ai = new rg_0(on.p.w() == null ? "Login to Altening" : "Generate Alt", true);
        this.ai.b(18.0);
        this.ai.c(199.0);
        this.ai.a(new n8(this));
        rf_02.b(this.ai);
        this.ae.b(rf_02);
        rg_0 rg_02 = new rg_0("Return to Alt Manager", true);
        rg_02.b(18.0);
        rg_02.c(199.0);
        rg_02.a(new nt(this));
        this.ae.b(rg_02);
        this.aj().b(this.ae);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0_0 d0_02 = ds_2.p();
        this.a((double)(d0_02.g() / 2) - this.q() / 2.0);
        this.d(d0_02.h() / 2 - 100);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        ds_2.x().i();
        super.c(false);
    }

    static rg_0 b(r8 r82) {
        return r82.ai;
    }

    static Pattern a(r8 r82) {
        return r82.af;
    }
}

