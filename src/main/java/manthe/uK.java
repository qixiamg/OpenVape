/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.p1;
import manthe.r1;
import manthe.tJ;

class uK
implements tJ {
    final r1 a;

    uK(r1 r12) {
        this.a = r12;
    }

    public void a(p1 p12, int n6, int n10, int n11) {
        if (n11 == 0) {
            boolean bl = false;
            for (r1 r12 : on.p.F().d()) {
                if (!r12.x()) continue;
                bl = true;
            }
            if (!bl) {
                this.a.d(true);
                on.p.F().d().remove(this.a);
                on.p.F().d().add(0, this.a);
            }
        } else if (n11 == 1) {
            this.a.f(!this.a.z());
        }
    }
}

