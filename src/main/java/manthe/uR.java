/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.wz_0;

class uR
implements Comparator<wz_0> {
    final wz_0 a;

    uR(wz_0 wz_02) {
        this.a = wz_02;
    }

    public int a(wz_0 wz_02, wz_0 wz_03) {
        return (int)wz_02.c() - (int)wz_03.c();
    }
}

