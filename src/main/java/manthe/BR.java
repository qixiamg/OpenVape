/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import manthe.CG;
import manthe.ak_0;
import manthe.rQ;
import manthe.sM;
import manthe.vK;

class BR
implements vK {
    final ak_0 c;
    final rQ a;
    final sM b;

    BR(sM sM2, ak_0 ak_02, rQ rQ2) {
        this.b = sM2;
        this.c = ak_02;
        this.a = rQ2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        a.a.cpy(this.c.l().toString());
        this.a.b("Copied!");
        new CG(this).start();
    }
}

