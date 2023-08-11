/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.kl_0;

/*
 * Renamed from manthe.lt
 */
public class lt_0
extends kl_0 {
    static int d = 0;
    private static int[] e;

    @Override
    public boolean fire() {
        if (d > 0) {
            this.a(true);
        }
        if (++d > 100) {
            d = 0;
        }
        return this.d();
    }

    static {
        lt_0.b(null);
    }

    public static void b(int[] nArray) {
        e = nArray;
    }

    public static int[] e() {
        return e;
    }
}

