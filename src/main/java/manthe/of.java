/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.rg_0;
import manthe.so_0;
import manthe.sv_0;
import manthe.vK;

class of
implements vK {
    final ak_0 a;
    final rg_0 b;
    final so_0 c;

    of(so_0 so_02, ak_0 ak_02, rg_0 rg_02) {
        this.c = so_02;
        this.a = ak_02;
        this.b = rg_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        this.a.q();
        new sv_0(this).start();
    }
}

