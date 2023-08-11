/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.kZ;
import manthe.ki_0;
import manthe.kl_0;

/*
 * Renamed from manthe.lx
 */
public class lx_0
extends kl_0 {
    private final int e;
    private final boolean d;

    public lx_0(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    @Override
    public boolean fire() {
        kl_0 kl_02 = this.e >= 0 ? new kZ(this.e, this.d) : new ki_0(this.e + 100, this.d);
        return ((kl_0)kl_02).fire();
    }
}

