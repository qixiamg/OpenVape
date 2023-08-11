/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.sI;
import manthe.vK;

/*
 * Renamed from manthe.mt
 */
class mt_0
implements vK {
    final sI a;

    mt_0(sI sI2) {
        this.a = sI2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            this.a.F();
        } else if (n11 == 1 && sI.a(this.a).e()) {
            sI.a(this.a).a().a(n6, n10, 0);
        }
    }
}

