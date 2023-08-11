/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import rip.vape.module.Module;

import java.awt.Color;

public class yP
extends Module {
    private final pb_0 x = new pb_0("Packet");
    private final pb_0 w = new pb_0("Jump");
    public pb_0 y = new pb_0("Ground");
    public pb_0 u = new pb_0("AntiCheat");
    public DX z = DX.a((Object)this, "Mode", "Criticals bypass method\nPacket - May not bypass anti-cheats.\nGround - Ground crits (Works with Switch)\nAntiCheat - Like Ground but bypasses various anti-cheats\nGround/AntiCheat mode does not work separate from Switch mode Killaura.", this.x, this.x, this.y, this.u);
    private boolean A;
    private boolean v;

    public yP() {
        super("Criticals", new Color(193, 183, 92).getRGB(), CQ.f, "Forces critical hit every attack\nMay not bypass anti-cheats");
        this.a(this.z);
        ((rz_0)this.z.getDefaultValue()).a(new n7(this));
    }

    @Override
    public void s() {
        this.A = false;
    }

    public boolean S() {
        return (this.z.v() == this.u || this.z.v() == this.y) && this.N() && V.c() > 13;
    }

    @Override
    public boolean n() {
        return true;
    }

    public void e(boolean bl) {
        this.v = bl;
    }

    @Override
    public void a(kf_0 kf_02) {
        this.a(this.z.v().H());
    }

    @Override
    public void a(kJ kJ2) {
        if (this.z.v().equals(this.x) && kJ2.a() == da_0.b) {
            on on2 = on.p;
            eJ eJ2 = ds_2.k();
            if (eJ2.J()) {
                if (on2.H().a(zz_0.class) || on2.H().a(zM.class) || on2.H().a(zQ.class)) {
                    return;
                }
                if (!kJ2.getTarget().e() && kJ2.getTarget().a(A5.cF)) {
                    ej_0 ej_02 = new ej_0(kJ2.getTarget().a());
                    if (ej_02.a(A5.L) && on2.N().a(ej_02)) {
                        return;
                    }
                    this.a(eJ2);
                    if (a.ib()) {
                        this.A = true;
                    }
                }
            }
        }
    }

    @Override
    public void a(ky_0 ky_02) {
        fN fN2;
        if (this.z.v().equals(this.x) && ky_02.getPacket().a(A5.cU) && (fN2 = new fN(ky_02.getPacketInstance())).g().equals(fB.g())) {
            if (!this.A) {
                eJ eJ2 = ds_2.k();
                if (eJ2.J()) {
                    on on2 = on.p;
                    if (on2.H().a(zz_0.class) || on2.H().a(zM.class) || on2.H().a(zQ.class)) {
                        return;
                    }
                    ex_0 ex_02 = fN2.a(eJ2.i());
                    if (!ex_02.e() && ex_02.a(A5.cF)) {
                        ej_0 ej_02 = new ej_0(ex_02.a());
                        if (ej_02.a(A5.L) && on2.N().a(ej_02)) {
                            return;
                        }
                        this.a(eJ2);
                        this.A = true;
                    }
                }
            } else {
                this.A = false;
            }
        }
    }

    private void a(eJ eJ2) {
        if (this.v) {
            return;
        }
        for (double d3 : new double[]{0.040009234827343, 0.0, 0.030009234827343, 0.0}) {
            if (V.c() > 13) {
                eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.l() + d3, eJ2.g(), false));
                continue;
            }
            eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.s().l() + d3, eJ2.l() + d3, eJ2.g(), false));
        }
    }
}

