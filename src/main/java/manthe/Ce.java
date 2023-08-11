/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.rg_0;
import manthe.rm_0;
import manthe.vK;

class Ce
implements vK {
    final List a;
    final AtomicInteger c;
    final rm_0 b;

    Ce(rm_0 rm_02, List list, AtomicInteger atomicInteger) {
        this.b = rm_02;
        this.a = list;
        this.c = atomicInteger;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (((rg_0)this.a.get(0)).e()) {
            return;
        }
        rg_0 rg_02 = null;
        for (int i = this.a.size() - 1; i > 0; --i) {
            rg_0 rg_03 = (rg_0)this.a.get(i);
            if (!rg_03.e()) continue;
            rg_02 = rg_03;
            break;
        }
        rg_0 rg_04 = null;
        for (rg_0 rg_05 : this.a) {
            if (!rg_05.e()) continue;
            int n12 = this.a.indexOf(rg_05);
            rg_04 = (rg_0)this.a.get(n12 - 1);
            break;
        }
        if (rg_02 == null || rg_04 == null) {
            return;
        }
        int n13 = Integer.parseInt(rg_04.z().E());
        this.c.set(n13 - 1);
        rg_02.a(false);
        rg_04.a(true);
    }
}

