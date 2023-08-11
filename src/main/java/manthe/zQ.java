/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class zQ
extends Module {
    private final DF y = DF.a(this, "Boost", "#.#", "", 3.0, 4.1, 5.0);
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Toggle", true, "Toggles off after touching the ground.");
    private double v;
    private double x;
    private boolean z;
    private boolean u;

    public zQ() {
        super("LongJump", 16028225, CQ.f, "Does not work on a advanced anti-cheat servers.");
        this.a(this.y, this.w);
        this.v = 0.27999999999999997;
        this.u = false;
        this.x = 0.0;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void s() {
        on.p.t().a(this);
        this.v = 0.27999999999999997;
        this.u = false;
        this.x = 0.0;
        this.z = false;
    }

    @Override
    public void a(ks_0 ks_02) {
        if (!ks_02.c()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.aF() == 0.0f && eJ2.ay() == 0.0f || eJ2.i().e() || eJ2.H()) {
            this.v = 0.27999999999999997;
            return;
        }
        if (eJ2.J()) {
            if (this.u) {
                this.v *= 2.15 - 1.0 / Math.pow(10.0, 5.0);
                eJ2.l(0.4092839480958903);
                ks_02.setY(0.4092839480958903);
                eJ2.e(true);
            } else {
                this.v = this.y.a() * 0.27999999999999997;
            }
        } else if (this.u) {
            if (this.x < 2.147) {
                this.x = 2.147;
            }
            this.v = this.x - 0.66 * (this.x - 0.27999999999999997);
        } else {
            this.v = this.x - this.x / 155.0;
        }
        this.u = eJ2.J();
        this.v = Math.max(this.v, 0.27999999999999997);
        ks_02.setX(-(Math.sin(this.b(eJ2)) * this.v));
        ks_02.setZ(Math.cos(this.b(eJ2)) * this.v);
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.a() == da_0.b) {
            eJ eJ2 = ds_2.k();
            this.x = Math.hypot(eJ2.z() - eJ2.aq(), eJ2.g() - eJ2.ap());
            if (this.w.u().booleanValue()) {
                if (!this.u && eJ2.J() && this.z) {
                    this.z();
                }
                if (!this.z && this.a(eJ2)) {
                    this.z = true;
                }
            }
        }
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

