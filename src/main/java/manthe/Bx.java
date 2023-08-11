/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class Bx {
    private static final char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static int[] a;
    private static boolean c;

    public static String a(byte[] byArray) {
        int n6 = byArray.length;
        byte[] byArray2 = new byte[byArray.length * 4];
        int n10 = 0;
        int n11 = -6;
        int n12 = 0;
        for (int i = 0; i < n6; ++i) {
            n10 = (n10 << 8) + byArray[i];
            n11 += 8;
            while (n11 >= 0) {
                byArray2[n12++] = (byte)b[n10 >> n11 & 0x3F];
                n11 -= 6;
            }
        }
        if (n11 > -6) {
            byArray2[n12++] = (byte)b[n10 << 8 >> n11 + 8 & 0x3F];
        }
        while (n12 % 4 != 0) {
            byArray2[n12++] = 61;
        }
        byArray2[n12] = 0;
        byte[] byArray3 = new byte[n12];
        System.arraycopy(byArray2, 0, byArray3, 0, n12);
        return new String(byArray3);
    }

    public static byte[] a(String string) {
        char c2;
        int n6;
        byte[] byArray = new byte[string.length() + 1];
        int n10 = 0;
        if (!c) {
            a = new int[256];
            for (n6 = 0; n6 < 256; ++n6) {
                Bx.a[n6] = -1;
            }
            for (n6 = 0; n6 < 64; ++n6) {
                Bx.a[Bx.b[n6]] = n6;
            }
            c = true;
        }
        n6 = 0;
        int n11 = -8;
        for (int i = 0; i < string.length() && a[c2 = string.charAt(i)] != -1; ++i) {
            n6 = (n6 << 6) + a[c2];
            if ((n11 += 6) < 0) continue;
            byArray[n10++] = (byte)(n6 >> n11 & 0xFF);
            n11 -= 8;
        }
        byArray[n10] = 0;
        return byArray;
    }
}

