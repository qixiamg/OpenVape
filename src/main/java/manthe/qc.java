/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

class qc
implements R {
    final Module a;
    final s7 b;

    qc(s7 s72, Module y52) {
        this.b = s72;
        this.a = y52;
    }

    public void a(p1 p12) {
        if (!this.b.Y().G() && this.a.N()) {
            this.a.d(false);
        }
    }
}

