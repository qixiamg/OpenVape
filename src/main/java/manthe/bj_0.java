/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rg_0;
import manthe.rm_0;
import manthe.vK;

/*
 * Renamed from manthe.bJ
 */
class bj_0
implements vK {
    final AtomicInteger a;
    final List b;
    final rm_0 c;

    bj_0(rm_0 rm_02, AtomicInteger atomicInteger, List list) {
        this.c = rm_02;
        this.a = atomicInteger;
        this.b = list;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.a.get() + 4 >= this.b.size() - 1) {
            return;
        }
        rg_0 rg_02 = null;
        for (rg_0 rg_03 : this.b) {
            if (!rg_03.e()) continue;
            rg_02 = rg_03;
            break;
        }
        if (rg_02 == null) {
            return;
        }
        int n12 = Integer.parseInt(rg_02.z().E());
        this.a.set(n12);
        rg_02.a(false);
        ((rg_0)this.b.get(this.a.get() + 4)).a(true);
    }
}

