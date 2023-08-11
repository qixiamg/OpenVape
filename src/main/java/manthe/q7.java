/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.AV;
import manthe.rm_0;

class q7
implements Comparator<AV> {
    final rm_0 a;

    q7(rm_0 rm_02) {
        this.a = rm_02;
    }

    public int a(AV aV, AV aV2) {
        if (aV.m() == aV2.m()) {
            return 0;
        }
        return aV.m() > aV2.m() ? -1 : 1;
    }
}

