/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.Locale;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.module.Module;

public class wU
extends wI {
    private wv_0 J;
    private ak_0 I;
    private boolean N;
    private wV O = new wV("settingdots");
    private wW D;
    private wW E;
    private wl_0 K;
    private w4 M;
    private Color G;
    private String P;
    private boolean F;
    private final long L = 2000L;
    private long H;
    private static boolean Q;

    public wU(wv_0 wv_02, ak_0 ak_02) {
        this.D = new wW("newload", 0.8, wU.b.i);
        this.E = new wW("newsave", 0.8, wU.b.i);
        this.K = new wl_0("Delete", 0.7, wU.b.j);
        this.G = new Color(0, 0, 0, 100);
        this.P = null;
        this.F = false;
        this.L = 2000L;
        this.H = 0L;
        this.J = wv_02;
        this.I = ak_02;
        this.M = new w4(ak_02);
        wU wU2 = this;
        this.O.c(new G(this, wv_02, wU2));
        this.D.c(new kG(this, ak_02));
        this.E.c(new pl_0(this, ak_02));
        this.K.c(new tk_0(this, ak_02, wv_02));
        this.D.a(wU.b.m);
        this.E.a(wU.b.m);
        this.K.a(wU.b.m);
        this.D.a(false);
        this.E.a(false);
        this.K.a(false);
        this.a(this.O, this.M, this.D, this.E, this.K);
    }

    @Override
    public void a(uW uW2) {
        if (this.J.ak() != null && this.J.ak().equals(this) && !this.q().b(uW2.a(), uW2.b())) {
            this.O.J();
            return;
        }
        if (!this.N || (double)uW2.b() - this.c() - 20.0 < 0.0) {
            if (uW2.c().equals((Object)c2_0.LEFT_CLICK)) {
                on.p.l().d(this.I);
            } else if (uW2.c().equals((Object)c2_0.RIGHT_CLICK)) {
                this.D.J();
            }
            return;
        }
        super.a(uW2);
    }

    @Override
    public void a() {
        Color color;
        mq mq2 = this.e(0.9);
        double d3 = mq2.a(this.I.r());
        double d4 = this.c() + 9.0 - d3 / 2.0;
        double d5 = this.d() + 10.0;
        double d6 = this.c() + 20.0 + d3;
        double d7 = this.d() + 10.0;
        double d8 = (this.e() - 25.0) / 4.0;
        if (this.N) {
            this.D.a(d6);
            this.D.c(d7);
            this.D.b(d8);
            this.D.d(18.0);
            this.E.a(d6);
            this.E.c(d7 += d8 + 2.5);
            this.E.b(d8);
            this.E.d(18.0);
            this.K.a(d6);
            this.K.c(d7 += d8 + 2.5);
            this.K.b(d8 * 2.0);
            this.K.d(18.0);
            if (this.E.x()) {
                this.E.a(this.R());
            }
            if (this.D.x()) {
                this.D.a(this.O());
            }
        }
        boolean bl = this.x() && this.J.ak() == null || this.J.ak() != null && this.J.ak().equals(this);
        boolean bl2 = on.p.l().a().equals(this.I);
        Color color2 = color = bl2 ? b.c() : wU.b.s;
        if (bl) {
            pe_0.a(this.d() + 5.0 - 0.5, this.c() + 0.5, this.e() - 10.0 + 1.0, this.f() - 1.0, wU.b.y);
        }
        pe_0.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, bl2 ? b.e() : wU.b.m);
        if (this.N) {
            // empty if block
        }
        if (this.P != null) {
            mq2 = this.e(0.75);
            mq2.a(this.P, d5, d4, bl && bl2 ? color : wU.b.c);
        } else {
            mq2.a(this.I.r(), d5, d4, bl && !bl2 ? wU.b.r : color);
        }
        double d10 = this.d() + this.e() - 15.0;
        this.O.d(bl2 ? color : null);
        this.O.c(d10);
        this.O.a(this.c());
        this.O.d(18.0);
        if (this.N().f() || this.x() || this.M.O().c()) {
            this.M.c(d10 -= 5.0 + this.M.e());
            this.M.a(this.c() + 4.0);
            this.M.a(true);
        } else {
            this.M.a(false);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.M.N() && (this.P == null || !this.P.toLowerCase(Locale.ROOT).startsWith("press"))) {
            this.b("press a key to bind");
        }
        if (this.F && System.currentTimeMillis() > this.H + 2000L) {
            this.P = null;
            this.F = false;
        } else if (this.P != null && this.P.toLowerCase(Locale.ROOT).startsWith("press") && !this.M.N()) {
            this.Q();
            if (this.I.a().length() > 0) {
                this.b("bound to " + this.I.a());
            } else {
                this.b("bind removed");
            }
        }
    }

    public void b(String string) {
        if (string == null) {
            this.Q();
            return;
        }
        this.P = string.toUpperCase();
    }

    public void Q() {
        this.F = true;
        this.H = System.currentTimeMillis();
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
        return this.N ? 50.0 : 18.0;
    }

    public ak_0 N() {
        return this.I;
    }

    private String R() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Click to save the enabled states of modules\n\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        String string = "";
        for (Module y52 : on.p.H().f()) {
            if (y52.N() && y52.y() != 0) {
                string = string + y52.H() + ", ";
            }
            if (!(this.s().b(string) > 150.0)) continue;
            stringBuilder2.append(VapeSettings.v + "f" + string + "\n");
            string = "";
        }
        if (!string.equals("")) {
            stringBuilder2.append(VapeSettings.v + "f" + string);
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append("This will remember that you had these modules enabled:\n");
            stringBuilder.append(un_0.a(stringBuilder2.toString(), ", ", ""));
        } else {
            stringBuilder.append(VapeSettings.v + "fYou currently have nothing enabled, so nothing with be saved");
        }
        return stringBuilder.toString();
    }

    private String O() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Click to re-enable the saved states of modules\n");
        stringBuilder.append("Alternatively, right click the profile to do this\n\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        String string = "";
        for (Module y52 : this.N().A()) {
            string = string + y52.H() + ", ";
            if (!(this.s().b(string) > 150.0)) continue;
            stringBuilder2.append(VapeSettings.v + "f" + string + "\n");
            string = "";
        }
        if (!string.equals("")) {
            stringBuilder2.append(VapeSettings.v + "f" + string);
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append("This will re-enable these modules:\n");
            stringBuilder.append(un_0.a(stringBuilder2.toString(), ", ", ""));
        } else {
            stringBuilder.append(VapeSettings.v + "fThis profile has no modules saved");
        }
        return stringBuilder.toString();
    }

    static boolean a(wU wU2, boolean bl) {
        wU2.N = bl;
        return wU2.N;
    }

    static boolean c(wU wU2) {
        return wU2.N;
    }

    static wW a(wU wU2) {
        return wU2.D;
    }

    static wW d(wU wU2) {
        return wU2.E;
    }

    static wl_0 b(wU wU2) {
        return wU2.K;
    }

    public static void f(boolean bl) {
        Q = bl;
    }

    public static boolean S() {
        return Q;
    }

    public static boolean P() {
        boolean bl = wU.S();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!wU.S()) {
            wU.f(true);
        }
    }
}

