/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import rip.vape.module.Module;

import java.util.Random;

/*
 * Renamed from manthe.zi
 */
public class zi_0
extends Module {
    private final BooleanValue I = BooleanValue.createValue((Object)this, "Only when targeting", false, "Only reduce knockback while being face to face with opponent");
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Water check", false, "Won't reduce knockback if in water");
    private final BooleanValue F = BooleanValue.createValue((Object)this, "Kite mode", false, "Increases knockback while not facing opponent");
    private final BooleanValue J = BooleanValue.createValue((Object)this, "Always Kite", false, "Increase knockback regardless if not facing opponent");
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Anti-Combo", false, "Helps prevent a combo on you.");
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Air Only", false, "Only count hits in air.");
    private final DF y = DF.a(this, "Horizontal", "#", "%", 0.0, 90.0, 100.0);
    private final DF B = DF.a(this, "Vertical", "#", "%", 0.0, 100.0, 100.0);
    private final DF A = DF.a(this, "Chance", "#", "%", 0.0, 90.0, 100.0);
    private final DF w = DF.a(this, "Kite horizontal", "#", "%", 100.0, 120.0, 300.0);
    private final DF K = DF.a(this, "Kite vertical", "#", "%", 100.0, 120.0, 300.0);
    private final DF x = DF.a((Object)this, "Combo Amount", "#", "hits", 1.0, 3.0, 5.0, 1.0);
    private final AO G = new AO();
    private float E = -999.0f;
    private gS v;
    private eJ z;
    private int D;

    public zi_0() {
        super("Velocity", -65404, CQ.c, "Reduces knockback taken");
        this.F.a(this.w, this.K, this.J);
        this.H.a(this.C, this.x);
        this.a(this.y, this.B, this.A, this.I, this.u, this.H, this.C, this.x, this.F, this.w, this.K, this.J);
    }

    private boolean S() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e()) {
            return true;
        }
        if (this.u.u().booleanValue() && eJ2.H()) {
            return true;
        }
        if (this.H.u().booleanValue()) {
            return (double)this.D < this.x.a();
        }
        return false;
    }

    @Override
    public void a(kF kF2) {
        this.a(this.H.u() != false ? this.D + "" : "");
        if (this.S()) {
            return;
        }
        try {
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d10;
            double d11;
            double d12;
            int n6;
            double d13;
            Random random;
            boolean bl;
            boolean bl2;
            eJ eJ2;
            fn_0 fn_02;
            if (kF2.getPacketInstance() == null) {
                return;
            }
            fn_0 fn_03 = kF2.getPacket();
            if (fn_03.a(A5.cJ)) {
                fn_02 = new fs_0(fn_03);
                eJ2 = ds_2.k();
                bl2 = pf_0.e(eJ2);
                bl = pf_0.b((ex_0)eJ2);
                if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                    bl = false;
                }
                if (bl2 && !bl && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                    return;
                }
                random = new Random();
                d13 = random.nextDouble();
                n6 = Y.a(random, 0, 100);
                if ((double)n6 >= 100.0 - this.A.a()) {
                    d12 = ((fs_0)fn_02).i();
                    d11 = ((fs_0)fn_02).h();
                    d10 = ((fs_0)fn_02).g();
                    if (bl2 && !bl && this.F.u().booleanValue()) {
                        double d14 = this.w.a() / 100.0;
                        double d15 = this.K.a() / 100.0;
                        double d16 = this.a(d12, d14);
                        double d17 = this.a(d11, d15);
                        double d18 = this.a(d10, d14);
                        ((fs_0)fn_02).b((float)d16);
                        ((fs_0)fn_02).a((float)d17);
                        ((fs_0)fn_02).c((float)d18);
                        return;
                    }
                    d8 = this.y.a();
                    d7 = d8 + (d8 + 5.0 - d8) * d13;
                    if (d7 >= 100.0) {
                        d7 = 100.0;
                    }
                    if ((d6 = (d5 = this.B.a().doubleValue()) + (d5 + 5.0 - d5) * d13) >= 90.0) {
                        d6 = 100.0;
                    }
                    d4 = d7 / 100.0;
                    d3 = d6 / 100.0;
                    double d19 = this.a(d12, d4);
                    double d20 = this.a(d11, d3);
                    double d21 = this.a(d10, d4);
                    ((fs_0)fn_02).b((float)d19);
                    ((fs_0)fn_02).a((float)d20);
                    ((fs_0)fn_02).c((float)d21);
                    if (d8 == 0.0 && d5 == 0.0) {
                        kF2.a(true);
                    }
                }
            }
            if (fn_03.a(A5.cQ)) {
                fn_02 = new f2(fn_03);
                eJ2 = ds_2.k();
                if (eJ2.e()) {
                    return;
                }
                if (((f2)fn_02).h() == eJ2.q()) {
                    bl2 = pf_0.e(eJ2);
                    bl = pf_0.b((ex_0)eJ2);
                    if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                        bl = false;
                    }
                    if (!bl2 && !bl && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                        return;
                    }
                    random = new Random();
                    d13 = random.nextDouble();
                    n6 = Y.a(random, 0, 100);
                    if ((double)n6 >= 100.0 - this.A.a()) {
                        d12 = ((f2)fn_02).j();
                        d11 = ((f2)fn_02).g();
                        d10 = ((f2)fn_02).i();
                        if (bl2 && !bl && this.F.u().booleanValue()) {
                            d8 = this.w.a() / 100.0;
                            d7 = this.K.a() / 100.0;
                            int n10 = (int)(d12 * d8);
                            int n11 = (int)(d11 * d7);
                            int n12 = (int)(d10 * d8);
                            ((f2)fn_02).a(n10);
                            ((f2)fn_02).c(n11);
                            ((f2)fn_02).b(n12);
                            return;
                        }
                        d8 = this.y.a();
                        d7 = d8 + (d8 + 5.0 - d8) * d13;
                        if (d7 >= 100.0) {
                            d7 = 100.0;
                        }
                        if ((d6 = (d5 = this.B.a().doubleValue()) + (d5 + 5.0 - d5) * d13) >= 90.0) {
                            d6 = 100.0;
                        }
                        d4 = d7 / 100.0;
                        d3 = d6 / 100.0;
                        int n13 = (int)(d12 * d4);
                        int n14 = (int)(d11 * d3);
                        int n15 = (int)(d10 * d4);
                        ((f2)fn_02).a(n13);
                        ((f2)fn_02).c(n14);
                        ((f2)fn_02).b(n15);
                        if (d8 == 0.0 && d5 == 0.0) {
                            kF2.a(true);
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a(kn_0 kn_02) {
        eJ eJ2;
        this.a(this.H.u() != false ? this.D + "" : "");
        if (this.H.u().booleanValue() && kn_02.getEntity().a(A5.u)) {
            eJ2 = ds_2.k();
            if (!(eJ2.aN() != 10 || this.C.u().booleanValue() && eJ2.v())) {
                ++this.D;
                this.G.d();
            }
            if (this.D > 0 && eJ2.v() && this.G.a(200L)) {
                this.D = 0;
            }
        }
        if (a.ib() || this.S()) {
            return;
        }
        if (this.v == null || !this.v.equals(ds_2.t())) {
            this.v = ds_2.t();
            this.E = -999.0f;
            return;
        }
        if (this.z == null || !this.z.equals(ds_2.k())) {
            this.z = ds_2.k();
            this.E = -999.0f;
            return;
        }
        eJ2 = ds_2.k();
        if (kn_02.getEntity().equals(eJ2)) {
            boolean bl = pf_0.e(eJ2);
            boolean bl2 = pf_0.b((ex_0)eJ2);
            if (this.F.u().booleanValue() && this.J.u().booleanValue()) {
                bl2 = false;
            }
            float f10 = eJ2.aD();
            if (this.E == -999.0f || f10 > this.E) {
                this.E = f10;
            } else if (f10 < this.E && (eJ2.k() != 0.0 || eJ2.D() != 0.0 || eJ2.u() != 0.0)) {
                this.E = f10;
                if (bl && !bl2 && !this.F.u().booleanValue() && this.I.u().booleanValue()) {
                    return;
                }
                Random random = new Random();
                double d3 = random.nextDouble();
                int n6 = random.nextInt(100);
                if ((double)n6 > 100.0 - this.A.a()) {
                    double d4;
                    double d5;
                    if (bl && !bl2 && this.F.u().booleanValue()) {
                        double d6 = this.w.a() / 100.0;
                        double d7 = this.K.a() / 100.0;
                        eJ2.k(this.a(eJ2.k(), d6));
                        eJ2.l(this.a(eJ2.D(), d7));
                        eJ2.d(this.a(eJ2.u(), d6));
                        return;
                    }
                    double d8 = this.y.a();
                    double d10 = d8 + (d8 + 5.0 - d8) * d3;
                    if (d10 >= 100.0) {
                        d10 = 100.0;
                    }
                    if ((d5 = (d4 = this.B.a().doubleValue()) + (d4 + 5.0 - d4) * d3) >= 90.0) {
                        d5 = 100.0;
                    }
                    double d11 = d10 / 100.0;
                    double d12 = d5 / 100.0;
                    eJ2.k(this.a(eJ2.k(), d11));
                    eJ2.l(this.a(eJ2.D(), d12));
                    eJ2.d(this.a(eJ2.u(), d11));
                    if (d8 <= 1.0) {
                        eJ2.k(0.0);
                        eJ2.d(0.0);
                    }
                    if (d4 <= 1.0) {
                        eJ2.l(0.0);
                    }
                }
            }
        }
    }

    private double a(double d3, double d4) {
        String string = Double.toString(Math.abs(d3));
        String string2 = string.contains(",") ? "," : ".";
        int n6 = string.indexOf(string2);
        int n10 = string.length() - n6 - 1;
        qN qN2 = new qN(n10);
        return qN2.a(d3 * d4);
    }
}

