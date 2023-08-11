/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ds_2;
import manthe.eJ;
import manthe.ex_0;
import manthe.pA;
import manthe.pf_0;
import manthe.zS;

class vH
implements Comparator {
    final zS a;

    private vH(zS zS2) {
        this.a = zS2;
    }

    public int compare(Object object, Object object2) {
        eJ eJ2 = ds_2.k();
        return Integer.compare(pf_0.b(eJ2, (ex_0)object), pf_0.b(eJ2, (ex_0)object2));
    }

    vH(zS zS2, pA pA2) {
        this(zS2);
    }
}

