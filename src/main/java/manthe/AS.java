/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.r2;
import manthe.rg_0;

class AS
implements R {
    final rg_0 a;
    final r2 b;

    AS(r2 r22, rg_0 rg_02) {
        this.b = r22;
        this.a = rg_02;
    }

    public void a(p1 p12) {
        long l6 = r2.a(this.b) - System.currentTimeMillis();
        if (l6 > 0L) {
            if (l6 >= 57000L) {
                this.a.z().a("Saved!");
            } else {
                this.a.z().a("Wait " + l6 / 1000L + " second" + (l6 >= 1000L && l6 < 2000L ? "" : "s"));
            }
        } else {
            this.a.z().a("Sync Settings");
        }
    }
}

