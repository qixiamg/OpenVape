/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DC;

/*
 * Renamed from manthe.cj
 */
class cj_0 {
    static final int[] a = new int[DC.values().length];

    static {
        try {
            cj_0.a[DC.MINIMUM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cj_0.a[DC.MAXIMUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

