/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.ha
 */
public class ha_0
extends gJ {
    private static cy_0[] a;

    public ha_0() {
        super(A5.c7);
    }

    public static void b(cy_0[] cy_0Array) {
        a = cy_0Array;
    }

    public static cy_0[] d() {
        return a;
    }

    static {
        if (ha_0.d() == null) {
            ha_0.b(new cy_0[1]);
        }
    }
}

