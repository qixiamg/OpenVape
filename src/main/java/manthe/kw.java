/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.R;
import manthe.p1;
import manthe.rg_0;
import manthe.rm_0;

class kw
implements R {
    final List a;
    final rg_0 d;
    final rg_0 c;
    final rm_0 b;

    kw(rm_0 rm_02, List list, rg_0 rg_02, rg_0 rg_03) {
        this.b = rm_02;
        this.a = list;
        this.d = rg_02;
        this.c = rg_03;
    }

    public void a(p1 p12) {
        rg_0 rg_02 = null;
        for (rg_0 rg_03 : this.a) {
            if (!rg_03.z().i()) continue;
            rg_02 = rg_03;
            break;
        }
        if (rg_02 == null) {
            return;
        }
        String string = rg_02.z().E();
        int n6 = this.a.size();
        String string2 = (String)string + "/" + n6;
        this.d.b(string2);
        this.d.z().b(string2);
        this.c.b(string2);
        this.c.z().b(string2);
    }
}

