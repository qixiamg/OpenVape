/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.R;
import manthe.p1;
import manthe.rU;
import manthe.rf_0;

/*
 * Renamed from manthe.yk
 */
class yk_0
implements R {
    final rf_0 b;
    final rU a;

    yk_0(rU rU2, rf_0 rf_02) {
        this.a = rU2;
        this.b = rf_02;
    }

    public void a(p1 p12) {
        if (rU.a(this.a).H() == rU.a(this.a).Z()) {
            this.b.b(p1.a);
            return;
        }
        if (rU.a(this.a).H() > rU.a(this.a).Z()) {
            this.b.b(new Color(100, 0, 0, 125));
        } else {
            this.b.b(new Color(0, 100, 0, 125));
        }
    }
}

