/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.eC;
import manthe.eJ;
import manthe.rj_0;

class m8
implements Comparator<eC> {
    final eJ b;
    final rj_0 a;

    m8(rj_0 rj_02, eJ eJ2) {
        this.a = rj_02;
        this.b = eJ2;
    }

    public int a(eC eC2, eC eC3) {
        return (int)eC2.a(this.b) - (int)eC3.a(this.b);
    }
}

