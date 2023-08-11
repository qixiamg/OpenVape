/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.aq_0;
import manthe.ds_2;
import manthe.r1;
import manthe.r_;
import manthe.vK;
import manthe.zu_0;

class pH
implements vK {
    final zu_0 b;
    final r_ a;

    pH(r_ r_2, zu_0 zu_02) {
        this.a = r_2;
        this.b = zu_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            List<r1> list = this.b.Y();
            list.sort(new aq_0(this));
            double d3 = 2.0;
            double d4 = 24.0;
            double d5 = 0.0;
            for (r1 r12 : list) {
                if (r12.ad() || !r12.e()) continue;
                if (d3 + r12.q() > (double)ds_2.p().g()) {
                    d3 = 2.0;
                    d4 += d5 + 2.0;
                    d5 = 0.0;
                }
                if (r12.b() > d5) {
                    d5 = r12.b();
                }
                r12.a(d3);
                r12.d(d4);
                d3 += r12.q() + 2.0;
            }
        }
    }
}

