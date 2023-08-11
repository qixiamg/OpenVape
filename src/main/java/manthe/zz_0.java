/*
 * Decompiled with CFR 0.152.
 */
package manthe;


import rip.vape.module.Module;

public class zz_0
        extends Module {
    private final p4 y = new p4("AntiCheat A", new yd_0(this, "AntiCheat A"));
    private final p4 v = new p4("AntiCheat B", new yj_0(this, "AntiCheat B"));
    private final p4 A = new p4("Bhop", new yC(this, "Bhop"));
    private final p4 B = new p4("Y-Port", new y2(this, "Y-Port"));
    private final DX u = DX.a((Object) this, "Mode", "Speed mode to use.\nAntiCheat A/B works on various servers\nBhop - Bypasses Old NCP\nY-Port - Bypasses Old NCP", (pb_0) this.y, this.y, this.v, this.A, this.B);
    public double z;
    public double C;
    public int x;
    public DF w = DF.a((Object) this, "Steps", "#.#", "", 25.0, 43.5, 180.0, "The amount of degrees to step by per tick.\nThe lower the number the smoother Speed rotates.");

    public zz_0() {
        super("Speed", 49630, CQ.f, "Increases your movement with various methods.");
        ((rz_0) this.u.getDefaultValue()).a(new db_0(this));
        this.u.a(this.y, this.w);
        this.a(this.u, this.w);
    }

    static DX a(zz_0 zz_02) {
        return zz_02.u;
    }

    @Override
    public boolean n() {
        return true;
    }

    public void e(int n6) {
        this.x = n6;
    }

    public double S() {
        double d3 = 0.28730000691562896;
        eJ eJ2 = ds_2.k();
        if (eJ2.a(fX.q()) && eJ2.b(fX.q()).f() > 10) {
            int n6 = eJ2.b(fX.q()).h();
            d3 *= 1.0 + 0.15 * (double) (n6 + 1);
        }
        return d3;
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.z = this.S();
        this.C = 0.0;
        this.x = 2;
        if (this.u.v() == this.y) {
            ((Module) this.y.f()).s();
        }
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!ks_02.c()) {
            return;
        }
        if (this.u.v() == this.y) {
            ((Module) this.y.f()).a(ks_02);
        } else if (this.u.v() == this.A) {
            ((Module) this.A.f()).a(ks_02);
        } else if (this.u.v() == this.B) {
            ((Module) this.B.f()).a(ks_02);
        } else if (this.u.v() == this.v) {
            ((Module) this.v.f()).a(ks_02);
        }
    }

    @Override
    public void a(km_0 km_02) {
        this.a(this.u.v().H());
        if (km_02.a() == da_0.b) {
            eJ eJ2 = ds_2.k();
            if (this.u.v() == this.y) {
                ((Module) this.y.f()).a(km_02);
            } else if (this.u.v() == this.B) {
                ((Module) this.B.f()).a(km_02);
            }
            double d3 = eJ2.z() - eJ2.aq();
            double d4 = eJ2.g() - eJ2.ap();
            this.C = Math.sqrt(d3 * d3 + d4 * d4);
        }
    }

    public void a(ks_0 ks_02, double d3, eJ eJ2) {
        double d4 = eJ2.bg().j();
        double d5 = eJ2.bg().h();
        float f10 = eJ2.U();
        if (d4 == 0.0 && d5 == 0.0) {
            ks_02.setX(0.0);
            ks_02.setZ(0.0);
        } else if (d4 != 0.0) {
            if (d5 != 0.0) {
                if (d5 > 0.0) {
                    f10 += d4 > 0.0 ? -45.0f : 45.0f;
                    d5 = 0.0;
                } else {
                    f10 += d4 > 0.0 ? 45.0f : -45.0f;
                    d5 = 0.0;
                }
            }
            d4 = d4 > 0.0 ? 1.0 : -1.0;
        }
        double d6 = Math.cos(Math.toRadians(f10 + 90.0f));
        double d7 = Math.sin(Math.toRadians(f10 + 90.0f));
        ks_02.setX(d4 * d3 * d6 + d5 * d3 * d7);
        ks_02.setZ(d4 * d3 * d7 - d5 * d3 * d6);
    }
}

