/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.on;
import manthe.rd_0;
import manthe.vK;

class u4
implements vK {
    final rd_0 a;

    u4(rd_0 rd_02) {
        this.a = rd_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = rd_0.a(this.a).C().E();
        if (string.isEmpty()) {
            return;
        }
        ak_0 ak_02 = on.p.l().a(string);
        if (ak_02 != null) {
            return;
        }
        rd_0.a(this.a).C().a("");
        ak_02 = new ak_0(string, "4.06");
        ak_02.B();
        on.p.l().b(ak_02);
    }
}

