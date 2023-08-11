/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

/*
 * Renamed from manthe.br
 */
class br_1
implements C4 {
    final z8 a;

    br_1(z8 z82) {
        this.a = z82;
    }

    @Override
    public void a(BasicValue ds_02) {
        for (v6 v62 : z8.a(this.a)) {
            v62.a();
        }
        z8.a(this.a).clear();
    }
}

