/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.AV;
import manthe.ns_0;
import manthe.pc;
import manthe.xY;

/*
 * Renamed from manthe.Df
 */
class df_0
implements pc {
    final AV a;
    final xY b;

    df_0(xY xY2, AV aV) {
        this.b = xY2;
        this.a = aV;
    }

    @Override
    public void b() {
        ns_0.a(this.a.l().toString());
    }
}

