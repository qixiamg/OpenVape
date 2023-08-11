/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ds_2;
import manthe.eJ;
import manthe.ex_0;
import manthe.pA;
import manthe.zS;

class nd
implements Comparator {
    final zS a;

    private nd(zS zS2) {
        this.a = zS2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds_2.k();
        return Float.compare(eJ2.a((ex_0)object), eJ2.a((ex_0)object2));
    }

    nd(zS zS2, pA pA2) {
        this(zS2);
    }
}

