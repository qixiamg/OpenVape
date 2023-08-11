/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rm_0;
import manthe.vK;

/*
 * Renamed from manthe.qu
 */
class qu_0
implements vK {
    final List a;
    final rg_0 c;
    final rf_0 b;
    final AtomicInteger f;
    final int d;
    final rm_0 e;

    qu_0(rm_0 rm_02, List list, rg_0 rg_02, rf_0 rf_02, AtomicInteger atomicInteger, int n6) {
        this.e = rm_02;
        this.a = list;
        this.c = rg_02;
        this.b = rf_02;
        this.f = atomicInteger;
        this.d = n6;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        for (rg_0 rg_02 : this.a) {
            if (rg_02 == this.c) {
                rg_02.z().j(true);
                rg_02.e(true);
                continue;
            }
            rg_02.z().j(false);
            rg_02.z().b(Color.WHITE);
            rg_02.e(false);
        }
        this.b.v().get(this.f.get()).a(false);
        this.b.v().get(this.d).a(true);
        this.b.u().b();
        this.f.set(this.d);
    }
}

