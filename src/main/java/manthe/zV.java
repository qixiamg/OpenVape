/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class zV
extends Module {
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Limit Items", false, "Limits to whitelisted items only.");
    private final DD w = DD.a((Object)this, "noslowdown-whitelist", "Whitelisted", DD.m, new mD("swords"));
    private boolean u;

    public zV() {
        super("NoSlowdown", 14828276, CQ.f, "Prevents slowing down when\nblocking or using items.");
        this.v.a(new BasicValue[]{this.w});
        this.a(this.v, this.w);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
        fn_0 fn_02 = kF2.getPacket();
        if (fn_02.a(A5.cJ)) {
            this.u = true;
        }
        if (fn_02.a(A5.cQ)) {
            f2 f22 = new f2(fn_02);
            eJ eJ2 = ds_2.k();
            if (eJ2.d() && f22.h() == eJ2.q()) {
                this.u = true;
            }
        }
    }

    @Override
    public void a(km_0 km_02) {
        eJ eJ2 = ds_2.k();
        if (this.u) {
            if (eJ2.v()) {
                this.u = false;
            }
            return;
        }
        if (eJ2.H()) {
            return;
        }
        if (km_02.a() == da_0.b) {
            double d3 = eJ2.bg().j();
            double d4 = eJ2.bg().h();
            float f10 = eJ2.U();
            if (!(!eJ2.bd() || this.v.u().booleanValue() && !this.w.a(eJ2.a_()) || Math.abs(d4) != (double)0.2f && Math.abs(d3) != (double)0.2f)) {
                if (on.p.H().a(zn_0.class)) {
                    eJ2.l(true);
                }
                if (Math.abs(d4) == (double)0.2f) {
                    if (d4 > 0.0) {
                        eJ2.bg().a(1.0f);
                    } else if (d4 < 0.0) {
                        eJ2.bg().a(-1.0f);
                    }
                }
                if (Math.abs(d3) == (double)0.2f) {
                    if (d3 > 0.0) {
                        eJ2.bg().b(1.0f);
                    } else if (d3 < 0.0) {
                        eJ2.bg().b(-1.0f);
                    }
                }
                if (Math.abs(eJ2.bg().h()) != 1.0f && d3 > 0.0) {
                    d3 *= eJ2.C() ? (double)1.3f : 1.0;
                }
                d4 = d3 != 0.0 ? (d4 *= 0.5) : (d4 *= 0.85);
                eJ2.k(d3 * Math.cos(Math.toRadians(f10 + 90.0f)) + d4 * Math.sin(Math.toRadians(f10 + 90.0f)));
                eJ2.d(d3 * Math.sin(Math.toRadians(f10 + 90.0f)) - d4 * Math.cos(Math.toRadians(f10 + 90.0f)));
            }
        }
    }
}

