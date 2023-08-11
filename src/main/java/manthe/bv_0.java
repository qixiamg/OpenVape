/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;
import manthe.uX;

/*
 * Renamed from manthe.bV
 */
class bv_0
implements Comparator<AV> {
    final uX a;

    bv_0(uX uX2) {
        this.a = uX2;
    }

    public int a(AV aV, AV aV2) {
        if (aV.m() == aV2.m()) {
            return 0;
        }
        return aV.m() > aV2.m() ? -1 : 1;
    }
}

