/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.CC;
import manthe.ak_0;
import manthe.rg_0;
import manthe.so_0;
import manthe.vK;

/*
 * Renamed from manthe.Aj
 */
class aj_0
implements vK {
    final ak_0 b;
    final rg_0 a;
    final so_0 c;

    aj_0(so_0 so_02, ak_0 ak_02, rg_0 rg_02) {
        this.c = so_02;
        this.b = ak_02;
        this.a = rg_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        this.b.x();
        new CC(this).start();
    }
}

