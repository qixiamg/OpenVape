/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.A;
import manthe.BO;
import manthe.D7;
import manthe.DA;
import manthe.aj_0;
import manthe.ak_0;
import manthe.my_0;
import manthe.of;
import manthe.oh;
import manthe.on;
import manthe.pF;
import manthe.pd;
import manthe.qp;
import manthe.rG;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.yI;

/*
 * Renamed from manthe.so
 */
public class so_0
extends qp {
    private final ak_0 J;
    private final rg_0 K;
    private final rG G;
    private final rf_0 F;
    private final rf_0 I;
    private boolean H;

    public so_0(ak_0 ak_02) {
        this.J = ak_02;
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
        this.F = new rf_0(false);
        this.I = new rf_0(true);
        this.F.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        D7 d7 = new D7(2.0, 0.0, 1, 3, new pd(1, 1, 0, 0));
        d7.h();
        d7.g();
        this.I.a(d7);
        this.b(this.F);
        this.b(this.I);
        this.I.a(false);
        this.I.b(e);
        this.K = new rg_0(ak_02.r(), true);
        this.G = new rG("Settings", 10.0f, 10.0f, 0.8f, false);
        this.F.b(this.K);
        this.F.b(this.G);
        rg_0 rg_02 = new rg_0("Load states", true);
        rg_02.b("Enables all modules that were saved, and disables all other modules\n\nYou can make these automatically enable upon loading Vape, or loading this profile, by enabling \"Auto-load module states\" under the client settings");
        rg_02.z().e(0.75);
        rg_02.c(52.0);
        rg_02.b(10.0);
        this.I.b(rg_02);
        rg_0 rg_03 = new rg_0("Save states", true);
        rg_03.b("Saves the enabled states of currently enabled modules\nClick \"Load states\", or right click the profile, to enable them again\n\nFor example;\nIf you have AimAssist and AutoClicker currently enabled, this will remember that you had those enabled and everything else disabled");
        rg_03.z().e(0.75);
        rg_03.c(52.0);
        rg_03.b(10.0);
        this.I.b(rg_03);
        rg_0 rg_04 = new rg_0("X", true);
        rg_04.b("Deletes profile");
        rg_04.z().e(0.75);
        rg_04.c(10.0);
        rg_04.b(10.0);
        rg_04.a(new Color(245, 0, 0));
        this.I.b(rg_04);
        oh oh2 = new oh(this, ak_02, this.K, ak_02);
        this.K.a(new pF(this, oh2, ak_02));
        this.K.z().b(my_0.c);
        this.G.a(new BO(this));
        rg_04.a(new DA(this, ak_02));
        rg_03.a(new of(this, ak_02, rg_03));
        rg_02.a(new aj_0(this, ak_02, rg_02));
        this.j(false);
    }

    @Override
    public void c() {
        super.c();
        this.K.a(on.p.t().r.K());
        ak_0 ak_02 = on.p.l().c();
        if (ak_02 == null) {
            return;
        }
        this.K.e(ak_02.equals(this.J));
        if (this.K.y()) {
            this.K.z().b(yI.a());
        } else {
            this.K.z().b(Color.WHITE);
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        this.K.c(this.q() - this.G.q());
        this.I.c(d3);
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.K.b(this.b());
        this.I.b(12.0);
    }

    public ak_0 x() {
        return this.J;
    }

    public rg_0 a() {
        return this.K;
    }

    private void a(rl_0 rl_02, String string, String string2, long l6) {
        new A(this, rl_02, string, l6, string2).start();
    }

    static rg_0 c(so_0 so_02) {
        return so_02.K;
    }

    static void a(so_0 so_02, rl_0 rl_02, String string, String string2, long l6) {
        so_02.a(rl_02, string, string2, l6);
    }

    static boolean a(so_0 so_02, boolean bl) {
        so_02.H = bl;
        return so_02.H;
    }

    static boolean b(so_0 so_02) {
        return so_02.H;
    }

    static rf_0 a(so_0 so_02) {
        return so_02.I;
    }
}

