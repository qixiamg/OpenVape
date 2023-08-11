/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.eJ;
import manthe.ex_0;
import manthe.zR;

class BC
implements Comparator<ex_0> {
    final eJ b;
    final zR a;

    BC(zR zR2, eJ eJ2) {
        this.a = zR2;
        this.b = eJ2;
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        return Double.compare(this.b.a(ex_03), this.b.a(ex_02));
    }
}

