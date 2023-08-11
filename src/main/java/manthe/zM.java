/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class zM
extends Module {
    private final pb_0 v = new pb_0("AntiCheat");
    private final pb_0 E = new pb_0("Normal");
    private final DF z = DF.a(this, "Speed", "#.#", "", 0.1, 0.5, 5.0, 0.1, "Speed for Normal fly mode.");
    private final DF B = DF.a(this, "Vertical Speed", "#.#", "", 0.1, 0.2, 5.0, 0.1, "Speed for Normal vertical fly mode.");
    private final DF w = DF.a((Object)this, "Boost", "#.##", "x", 1.0, 1.25, 1.5, 0.01);
    private final DX u = DX.a((Object)this, "Mode", this.E, this.E);
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Boost", false, "Increases fly speed\nYou will not be able to fly infinitely with this enabled.");
    private final AO C = new AO();
    private final double y;
    private int D;
    private int A;

    public zM() {
        super("Fly", 49630, CQ.f, "Makes you go zoom.");
        this.x.a(new BasicValue[]{this.w});
        this.a(this.u, this.z, this.B, this.x, this.w);
        this.y = this.a(6969.0, -6969.0) / 2.0E15;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void s() {
        on.p.t().a(this);
        ds_2.O().a(1.0f);
        this.D = -1;
        if (this.x.u().booleanValue() && this.C.a(5000L)) {
            this.A = 30;
        }
    }

    @Override
    public void J() {
        ds_2.O().a(1.0f);
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.c()) {
            eJ eJ2 = ds_2.k();
            km_0.setOnGround(false);
            eJ2.e(false);
        }
    }

    @Override
    public void a(ks_0 ks_02) {
        double d3;
        if (!ks_02.c()) {
            return;
        }
        this.a(this.u.v().H());
        eJ eJ2 = ds_2.k();
        gl_0 gl_02 = ds_2.O();
        double d4 = d3 = cb_0.h ? eJ2.s().l() : eJ2.l();
        if (this.u.v() == this.v) {
            ks_02.setY(0.0);
            eJ2.l(0.0);
            this.a(ks_02, this.S());
            if (this.x.u().booleanValue()) {
                --this.A;
                if (this.C.a(7000L)) {
                    this.C.d();
                }
                float f10 = this.w.a().floatValue();
                if (this.A > 0 && f10 > 1.0f && !this.C.a(7000L)) {
                    gl_02.a(1.0f + f10);
                    if (this.A < 10) {
                        float f11 = this.A / 10;
                        if ((double)f11 > 0.5) {
                            f11 = 1.0f;
                        }
                        gl_02.a(1.0f + f10 * f11);
                    }
                } else {
                    gl_02.a(1.0f);
                }
            }
            ++this.D;
            if (this.D == 1) {
                eJ2.a(eJ2.z(), d3 + 9.6918752349782E-13 + this.y, eJ2.g(), eJ2.U(), eJ2.K());
            }
            if (this.D == 2) {
                eJ2.a(eJ2.z(), d3 - (9.6918752349782E-13 + this.y), eJ2.g(), eJ2.U(), eJ2.K());
                this.D = 0;
            }
        } else if (this.u.v() == this.E) {
            double d5 = ds_2.s().l().h() ? this.B.a() : (ds_2.s().u().h() ? -this.B.a().doubleValue() : 0.0);
            ks_02.setY(d5);
            eJ2.l(d5);
            eJ2.a(eJ2.z(), d3, eJ2.g(), eJ2.U(), eJ2.K());
            this.a(ks_02, Math.max(this.z.a(), this.S()));
        }
    }

    public double S() {
        double d3 = 0.2873;
        if (ds_2.k().a(fX.q())) {
            int n6 = ds_2.k().b(fX.q()).h();
            d3 *= 1.0 + 0.2 * (double)(n6 + 1);
        }
        return d3;
    }

    private void a(ks_0 ks_02, double d3) {
        eJ eJ2 = ds_2.k();
        double d4 = eJ2.bg().j();
        double d5 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d4 == 0.0 && d5 == 0.0) {
            ks_02.setX(0.0).setZ(0.0);
        } else {
            if (d4 != 0.0) {
                if (d5 > 0.0) {
                    f10 += (float)(d4 > 0.0 ? -45 : 45);
                } else if (d5 < 0.0) {
                    f10 += (float)(d4 > 0.0 ? 45 : -45);
                }
                d5 = 0.0;
                if (d4 > 0.0) {
                    d4 = 1.0;
                } else if (d4 < 0.0) {
                    d4 = -1.0;
                }
            }
            ks_02.setX(d4 * d3 * Math.cos(Math.toRadians(f10 + 90.0f)) + d5 * d3 * Math.sin(Math.toRadians(f10 + 90.0f)));
            ks_02.setZ(d4 * d3 * Math.sin(Math.toRadians(f10 + 90.0f)) - d5 * d3 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    private double a(double d3, double d4) {
        return Math.random() * (d3 - d4) + d4;
    }
}

