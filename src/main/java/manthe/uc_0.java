/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cx_0;

/*
 * Renamed from manthe.uc
 */
class uc_0 {
    static final int[] a = new int[cx_0.values().length];

    static {
        try {
            uc_0.a[cx_0.ABGR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.RGBA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.BGRA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.RGB.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.LUMINANCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.ALPHA.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uc_0.a[cx_0.LUMINANCE_ALPHA.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

