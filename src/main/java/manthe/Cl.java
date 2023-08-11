/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.R;
import manthe.p1;
import manthe.rg_0;
import manthe.rm_0;

class Cl
implements R {
    final rg_0 b;
    final AtomicInteger d;
    final List c;
    final rm_0 a;

    Cl(rm_0 rm_02, rg_0 rg_02, AtomicInteger atomicInteger, List list) {
        this.a = rm_02;
        this.b = rg_02;
        this.d = atomicInteger;
        this.c = list;
    }

    public void a(p1 p12) {
        this.b.z().j(this.d.get() + 4 < this.c.size() - 1);
        this.b.e(this.b.z().i());
        if (!this.b.z().i()) {
            this.b.z().b(Color.WHITE);
        }
    }
}

