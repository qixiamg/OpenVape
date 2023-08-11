/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

/*
 * Renamed from manthe.zl
 */
public class zl_0
extends Module {
    private final DF y = DF.a((Object)this, "Distance", "#.#", "", 0.1, 3.3, 6.0, 1.0);
    private final DF v = DF.a(this, "Speed", "#.#", "", 0.1, 0.5, 1.0);
    private final DF w = DF.a(this, "Target minimum angle", "#", "", 1.0, 120.0, 360.0);
    private final DF z = DF.a(this, "Your minimum angle", "#", "", 1.0, 90.0, 360.0);
    private zf_0 x;
    private boolean u;

    public zl_0() {
        super("Strafe", -256, CQ.f);
        this.a(this.y, this.v, this.w, this.z);
        this.a(10L, true);
    }

    @Override
    public void k() {
        this.x = on.p.H().b(zf_0.class);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if (this.u) {
            eJ2.l(false);
            this.u = false;
        }
    }

    @Override
    public void q() {
        double d3;
        if (ds_2.x().d()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        int n6 = ds_2.s().A().i();
        boolean bl = Keyboard.isKeyDown((int)n6);
        ei_0.a(n6, bl);
        double d4 = this.y.a();
        double d5 = this.v.a() / 5.0;
        d5 *= 0.1;
        boolean bl2 = this.x.N() && this.x.S() != null;
        ej_0 ej_02 = new ej_0(this.x.S());
        if (ej_02.e()) {
            return;
        }
        boolean bl3 = pf_0.a(eJ2, ej_02, this.w.a() / 2.0);
        boolean bl4 = pf_0.a(ej_02, eJ2, this.z.a() / 2.0);
        if (bl2 && bl3 && bl4 && (d3 = (double)eJ2.a(ej_02)) < d4 && !eJ2.H() && !eJ2.E() && !eJ2.aQ() && eJ2.v() && !eJ2.aT()) {
            double d6 = ej_02.z();
            double d7 = ej_02.g();
            if (eJ2.z() - d6 > 0.5) {
                eJ2.k(eJ2.k() + d5);
            }
            if (eJ2.z() - d6 < 0.5) {
                eJ2.k(eJ2.k() - d5);
            }
            if (eJ2.g() - d7 > 0.5) {
                eJ2.d(eJ2.u() + d5);
            }
            if (eJ2.g() - d7 < 0.5) {
                eJ2.d(eJ2.u() - d5);
            }
            this.u = true;
        }
    }
}

