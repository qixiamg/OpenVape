/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.List;
import manthe.R;
import manthe.p1;
import manthe.rg_0;
import manthe.rm_0;

class qX
implements R {
    final rg_0 b;
    final List a;
    final rm_0 c;

    qX(rm_0 rm_02, rg_0 rg_02, List list) {
        this.c = rm_02;
        this.b = rg_02;
        this.a = list;
    }

    public void a(p1 p12) {
        this.b.z().j(!((rg_0)this.a.get(0)).e());
        this.b.e(this.b.z().i());
        if (!this.b.z().i()) {
            this.b.z().b(Color.WHITE);
        }
    }
}

