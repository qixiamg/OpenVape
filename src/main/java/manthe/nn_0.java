/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.uh_0;

/*
 * Renamed from manthe.nn
 */
class nn_0 {
    static final int[] a = new int[uh_0.values().length];

    static {
        try {
            nn_0.a[uh_0.DOWNLOADS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            nn_0.a[uh_0.LAST_UPDATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

