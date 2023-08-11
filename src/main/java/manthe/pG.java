/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.U;
import manthe.fG;
import manthe.fk_0;
import manthe.on;
import manthe.p1;
import manthe.rl_0;

class pG
implements R {
    final rl_0 b;
    final U a;

    pG(U u6, rl_0 rl_02) {
        this.a = u6;
        this.b = rl_02;
    }

    public void a(p1 p12) {
        U.c(this.a).e(true);
        this.b.d(U.c(this.a));
        fk_0 fk_02 = this.a.g();
        if (fk_02.e()) {
            this.b.a("Empty");
            return;
        }
        fG fG2 = fG.a(fk_02);
        fG2.a(U.d(this.a));
        String string = fG2.j();
        double d3 = on.p.a(0.75).b(string);
        if (d3 > 65.0 && string.contains(" ")) {
            StringBuilder stringBuilder = new StringBuilder(string);
            int n6 = string.lastIndexOf(" ");
            stringBuilder.setCharAt(n6, '\n');
            string = stringBuilder.toString();
        }
        U.c(this.a).a(fG2);
        this.b.a(string);
    }
}

