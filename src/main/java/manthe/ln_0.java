/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.d4_0;
import manthe.ex_0;
import manthe.kA;
import manthe.l9;

/*
 * Renamed from manthe.ln
 */
public class ln_0
extends l9 {
    private final d4_0 f;

    public ln_0(d4_0 d4_02) {
        super(d4_02);
        this.f = d4_02;
    }

    @Override
    public boolean fire() {
        kA kA2 = new kA(this.f.g(), this.f.k(), this.f.h(), this.f.i());
        kA2.fire();
        this.f.a(kA2.d());
        return kA2.d();
    }

    public ex_0 getEntity() {
        return this.f.g();
    }

    public double getX() {
        return this.f.k();
    }

    public double getY() {
        return this.f.h();
    }

    public double getZ() {
        return this.f.i();
    }
}

