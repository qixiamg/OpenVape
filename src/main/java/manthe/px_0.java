/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.p0;

/*
 * Renamed from manthe.px
 */
class px_0 {
    static final int[] a = new int[p0.values().length];

    static {
        try {
            px_0.a[p0.TOP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            px_0.a[p0.BOTTOM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            px_0.a[p0.LEFT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            px_0.a[p0.RIGHT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

