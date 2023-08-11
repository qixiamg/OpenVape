/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ki
 */
public class ki_0
extends kl_0 {
    private final int e;
    private final boolean d;

    public ki_0(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    @Override
    public boolean fire() {
        int n6 = -100 + this.getButton();
        if (!this.getButtonState()) {
            return this.d();
        }
        if (!on.p.h()) {
            pf_0.a();
        }
        if (on.p.t().y.u().booleanValue() && this.getButton() == 2) {
            on.p.N().f();
        }
        for (ak_0 yt_02 : on.p.l().d()) {
            if (!yt_02.a(n6)) continue;
            return this.d();
        }
        for (Module y52 : on.p.H().e()) {
            if (!y52.c().isEmpty()) {
                y52.a(n6);
            }
            if (!y52.N()) continue;
            y52.a(this);
        }
        if (this.getButtonState()) {
            ya_0 ya_02 = on.p.f().b(n6);
            if (ya_02 == null) {
                return this.d();
            }
            on.p.H().b(z5.class).a(ya_02);
        }
        return this.d();
    }

    public boolean getButtonState() {
        return this.d;
    }

    public int getButton() {
        return this.e;
    }
}

