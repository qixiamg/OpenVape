/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.AV;
import manthe.pc;
import manthe.ua_0;
import manthe.xY;

class nP
implements pc {
    final AV b;
    final xY a;

    nP(xY xY2, AV aV) {
        this.a = xY2;
        this.b = aV;
    }

    @Override
    public void b() {
        ua_0.a(this.b.l().toString());
    }
}

