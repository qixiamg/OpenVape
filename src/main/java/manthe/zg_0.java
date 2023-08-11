/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from manthe.zg
 */
public class zg_0
extends Module {
    private final DF z = DF.a(this, "Speed", "#.#", "", 3.0, 4.1, 5.0);
    private int y;
    private int E;
    private int D;
    private double u;
    private double A;
    private boolean B;
    private boolean w;
    private boolean C;
    private Queue<Object> v = new ConcurrentLinkedQueue<Object>();
    private AO F = new AO();
    private double x = Math.random();

    public zg_0() {
        super("FastFly", 11924545, CQ.f, "May not work on certain anti-cheats.");
        this.a(this.z);
        this.u = 0.27999999999999997;
        this.w = false;
        this.A = 0.0;
    }

    @Override
    public boolean n() {
        return true;
    }

    public boolean U() {
        return !this.F.a(150L);
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.u = 0.27999999999999997;
        this.w = false;
        this.A = 0.0;
        this.B = false;
        this.E = 0;
        this.x = Math.random();
        this.y = 7;
        this.D = 50;
        this.T();
        ep_0 ep_02 = ds_2.k().a8();
        boolean bl = ep_02.i();
        boolean bl2 = ep_02.h();
        float f10 = ep_02.f();
        ep_02.c(true);
        ep_02.a(true);
        ep_02.b(ep_02.f() * 5.0f);
        ep_02.c(bl);
        ep_02.a(bl2);
        ep_02.b(f10);
    }

    @Override
    public void J() {
        this.E = 0;
        if (this.v.size() > 0) {
            this.S();
        }
        ds_2.O().a(1.0f);
    }

    @Override
    public void a(ky_0 ky_02) {
        fn_0 fn_02 = ky_02.getPacket();
        if (fn_02.a(A5.U)) {
            this.V();
            this.z();
        }
        if (fn_02.a(A5.bN) && !this.C && this.a(ds_2.k()) && !ds_2.k().J() && this.D > 0) {
            this.v.add(ky_02.getPacketInstance());
            ky_02.a(true);
            ky_02.setPacket(null);
            this.F.d();
            on.a("Choking");
        }
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!ks_02.c()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.aF() == 0.0f && eJ2.ay() == 0.0f || eJ2.i().e() || eJ2.H()) {
            this.u = 0.27999999999999997;
            return;
        }
        --this.y;
        if (this.y > 4) {
            ks_02.setX(0.0);
            ks_02.setZ(0.0);
            return;
        }
        if (eJ2.J()) {
            if (this.w) {
                this.u *= 1.83949644 + 9.238423E-6 * Math.random();
                double d3 = 0.42f;
                if (eJ2.a(fX.k())) {
                    d3 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
                }
                eJ2.l(d3);
                ks_02.setY(d3);
            } else {
                double d4 = 0.27999999999999997;
                if (eJ2.a(fX.q())) {
                    int n6 = eJ2.b(fX.q()).h();
                    d4 *= 1.0 + 0.105 * (double)(n6 + 1);
                }
                this.u = this.z.a() * d4;
            }
        } else if (this.w) {
            if (this.A < 1.73949644) {
                this.A = 1.73949644;
            }
            this.u = this.A - (double)((float)(0.66 * (this.A - 0.27999999999999997)));
            this.B = true;
        } else {
            this.u = this.A - this.A / 159.0;
            ds_2.O().a(0.85f + (float)((double)0.1f * Math.random()));
            ks_02.setY(0.0);
            eJ2.l(0.0);
            if (this.B) {
                this.B = false;
            }
        }
        this.w = eJ2.J();
        this.u = Math.max(this.u, 0.27999999999999997);
        ks_02.setX(-(Math.sin(this.b(eJ2)) * this.u));
        ks_02.setZ(Math.cos(this.b(eJ2)) * this.u);
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.a() == da_0.b) {
            eJ eJ2 = ds_2.k();
            this.A = Math.hypot(eJ2.z() - eJ2.aq(), eJ2.g() - eJ2.ap());
            if (!eJ2.J()) {
                --this.D;
            }
            if (this.v.size() > 0 && this.D == 0) {
                this.S();
                this.D = 50;
            }
            if (!eJ2.J() && this.y <= 3) {
                ++this.E;
                double d3 = 0.0;
                if (this.E == 1) {
                    d3 = 0.00883f + (float)Y.a((double)(4.2E-6f * (float)this.x), 7);
                } else if (this.E == 2) {
                    d3 = 0.0133f + (float)Y.a((double)(2.8E-6f * (float)this.x), 6);
                } else if (this.E == 3) {
                    d3 = 0.0179f + (float)Y.a((double)(1.3E-6f * (float)this.x), 6);
                } else if (this.E == 4) {
                    d3 = 0.0216f + (float)Y.a((double)(6.2E-6f * (float)this.x), 6);
                } else if (this.E == 5) {
                    this.E = 0;
                    d3 = 0.0252f + (float)Y.a((double)(2.1E-6f * (float)this.x), 6);
                }
                km_0.setY(km_02.getY() + d3);
                km_0.setOnGround(false);
                eJ2.e(false);
            }
        }
    }

    private void T() {
        eJ eJ2 = ds_2.k();
        if (!eJ2.v() || !eJ2.J()) {
            return;
        }
        double d3 = 0.0;
        double d4 = 0.7 * Math.random();
        for (int i = 0; i < 50; ++i) {
            double d5 = 0.10234f + 3.9E-4f * ((float)Math.min(i, 39) / 39.0f);
            double d6 = 0.04093f;
            d3 += d5 - d6;
            ft_0 ft_02 = cb_0.h ? ft_0.a(eJ2.z(), eJ2.l() + d6 + (d5 - d6) * (double)0.65f, eJ2.g(), false) : ft_0.a(eJ2.z(), eJ2.s().l() + d6 + (d5 - d6) * (double)0.65f, eJ2.l() + d6 + (d5 - d6) * (double)0.65f, eJ2.g(), false);
            ft_0 ft_03 = cb_0.h ? ft_0.a(eJ2.z(), eJ2.l() + d5, eJ2.g(), false) : ft_0.a(eJ2.z(), eJ2.s().l() + d5, eJ2.l() + d5, eJ2.g(), false);
            f_ f_2 = f_.a(false);
            ft_0 ft_04 = cb_0.h ? ft_0.a(eJ2.z(), eJ2.l() + d5, eJ2.g(), false) : ft_0.a(eJ2.z(), eJ2.s().l() + d6, eJ2.l() + d6, eJ2.g(), false);
            this.C = true;
            eJ2.bp().a(ft_02);
            eJ2.bp().a(ft_03);
            eJ2.bp().a(f_2);
            eJ2.bp().a(ft_04);
            this.C = false;
            if (d3 >= 3.0 + d4) break;
        }
    }

    private void S() {
        on.a("Sent");
        while (this.v.peek() != null) {
            this.C = true;
            ds_2.k().bp().a(new fn_0(this.v.poll()));
            this.C = false;
        }
        this.V();
    }

    private void V() {
        this.v.clear();
    }

    private float b(eJ eJ2) {
        float f10 = eJ2.U();
        if (eJ2.aF() < 0.0f) {
            f10 += 180.0f;
        }
        float f11 = eJ2.aF() < 0.0f ? -0.5f : (eJ2.aF() > 0.0f ? 0.5f : 1.0f);
        if (eJ2.ay() > 0.0f) {
            f10 -= 90.0f * f11;
        }
        if (eJ2.ay() < 0.0f) {
            f10 += 90.0f * f11;
        }
        return f10 *= (float)Math.PI / 180;
    }

    private boolean a(eJ eJ2) {
        en_0 en_02 = ds_2.s();
        return en_02.j().h() || en_02.A().h() || en_02.g().h() || en_02.n().h() || eJ2.bg().j() != 0.0f || eJ2.bg().h() != 0.0f;
    }
}

