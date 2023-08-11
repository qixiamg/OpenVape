/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import java.util.Map;
import manthe.nk_0;

class Bb
implements Comparator {
    final nk_0 a;

    Bb(nk_0 nk_02) {
        this.a = nk_02;
    }

    public int compare(Object object, Object object2) {
        return ((Integer)((Map.Entry)object).getValue()).compareTo((Integer)((Map.Entry)object2).getValue());
    }
}

