/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.rg_0;
import manthe.rx_0;

/*
 * Renamed from manthe.mx
 */
class mx_0
implements R {
    final rg_0 a;
    final rx_0 b;

    mx_0(rx_0 rx_02, rg_0 rg_02) {
        this.b = rx_02;
        this.a = rg_02;
    }

    public void a(p1 p12) {
        if (rx_0.e(this.b)) {
            this.a.z().a("Update");
        } else {
            this.a.z().a("Add");
        }
    }
}

