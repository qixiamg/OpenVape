/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.ix
 */
public class ix_0
extends gJ {
    private final BG d = this.b("fuse", true, Integer.TYPE);
    private static cy_0[] a;

    public ix_0() {
        super(A5.bl);
    }

    public int a(Object object) {
        return this.d.c(object);
    }

    public static void b(cy_0[] cy_0Array) {
        a = cy_0Array;
    }

    public static cy_0[] d() {
        return a;
    }

    static {
        if (ix_0.d() == null) {
            ix_0.b(new cy_0[4]);
        }
    }
}

