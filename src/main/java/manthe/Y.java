/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import manthe.gf_0;

public class Y {
    private static final int[] a;
    private static final float[] b;

    public static final float f(float f10) {
        return b[(int)(f10 * 10430.378f) & 0xFFFF];
    }

    public static final float d(float f10) {
        return b[(int)(f10 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static final float g(float f10) {
        return (float)Math.sqrt(f10);
    }

    public static final float e(double d3) {
        return (float)Math.sqrt(d3);
    }

    public static int b(float f10) {
        int n6 = (int)f10;
        return f10 < (float)n6 ? n6 - 1 : n6;
    }

    public static int b(double d3) {
        return (int)(d3 + 1024.0) - 1024;
    }

    public static int c(double d3) {
        int n6 = (int)d3;
        return d3 < (double)n6 ? n6 - 1 : n6;
    }

    public static long g(double d3) {
        long l6 = (long)d3;
        return d3 < (double)l6 ? l6 - 1L : l6;
    }

    public static int f(double d3) {
        return (int)(d3 >= 0.0 ? d3 : -d3 + 1.0);
    }

    public static float c(float f10) {
        return f10 >= 0.0f ? f10 : -f10;
    }

    public static int b(int n6) {
        return n6 >= 0 ? n6 : -n6;
    }

    public static int e(float f10) {
        int n6 = (int)f10;
        return f10 > (float)n6 ? n6 + 1 : n6;
    }

    public static int d(double d3) {
        int n6 = (int)d3;
        return d3 > (double)n6 ? n6 + 1 : n6;
    }

    public static int b(int n6, int n10, int n11) {
        return n6 < n10 ? n10 : (n6 > n11 ? n11 : n6);
    }

    public static float a(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : (f10 > f12 ? f12 : f10);
    }

    public static double a(double d3, double d4, double d5) {
        return d3 < d4 ? d4 : (d3 > d5 ? d5 : d3);
    }

    public static double b(double d3, double d4, double d5) {
        return d5 < 0.0 ? d3 : (d5 > 1.0 ? d4 : d3 + (d4 - d3) * d5);
    }

    public static double c(double d3, double d4) {
        if (d3 < 0.0) {
            d3 = -d3;
        }
        if (d4 < 0.0) {
            d4 = -d4;
        }
        return d3 > d4 ? d3 : d4;
    }

    public static int b(int n6, int n10) {
        return n6 < 0 ? -((-n6 - 1) / n10) - 1 : n6 / n10;
    }

    public static boolean a(String string) {
        return string == null || string.length() == 0;
    }

    public static int b(Random random, int n6, int n10) {
        return n6 >= n10 ? n6 : random.nextInt(n10 - n6 + 1) + n6;
    }

    public static float a(Random random, float f10, float f11) {
        return f10 >= f11 ? f10 : random.nextFloat() * (f11 - f10) + f10;
    }

    public static double b(Random random, double d3, double d4) {
        return d3 >= d4 ? d3 : random.nextDouble() * (d4 - d3) + d3;
    }

    public static double a(long[] lArray) {
        long l6 = 0L;
        long[] lArray2 = lArray;
        int n6 = lArray.length;
        for (int i = 0; i < n6; ++i) {
            long l10 = lArray2[i];
            l6 += l10;
        }
        return (double)l6 / (double)lArray.length;
    }

    public static float a(float f10) {
        if ((f10 %= 360.0f) >= 180.0f) {
            f10 -= 360.0f;
        }
        if (f10 < -180.0f) {
            f10 += 360.0f;
        }
        return f10;
    }

    public static double a(double d3) {
        if ((d3 %= 360.0) >= 180.0) {
            d3 -= 360.0;
        }
        if (d3 < -180.0) {
            d3 += 360.0;
        }
        return d3;
    }

    public static int a(String string, int n6) {
        int n10 = n6;
        try {
            n10 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n10;
    }

    public static int a(String string, int n6, int n10) {
        int n11 = n6;
        try {
            n11 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n11 < n10) {
            n11 = n10;
        }
        return n11;
    }

    public static double a(String string, double d3) {
        double d4 = d3;
        try {
            d4 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d4;
    }

    public static double a(String string, double d3, double d4) {
        double d5 = d3;
        try {
            d5 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d5 < d4) {
            d5 = d4;
        }
        return d5;
    }

    public static int a(int n6) {
        int n10 = n6 - 1;
        n10 |= n10 >> 1;
        n10 |= n10 >> 2;
        n10 |= n10 >> 4;
        n10 |= n10 >> 8;
        n10 |= n10 >> 16;
        return n10 + 1;
    }

    private static boolean c(int n6) {
        return n6 != 0 && (n6 & n6 - 1) == 0;
    }

    private static int e(int n6) {
        n6 = Y.c(n6) ? n6 : Y.a(n6);
        return a[(int)((long)n6 * 125613361L >> 27) & 0x1F];
    }

    public static int d(int n6) {
        return Y.e(n6) - (Y.c(n6) ? 0 : 1);
    }

    public static int a(int n6, int n10) {
        int n11;
        if (n10 == 0) {
            return 0;
        }
        if (n6 < 0) {
            n10 *= -1;
        }
        return (n11 = n6 % n10) == 0 ? n6 : n6 + n10 - n11;
    }

    public static double d(double d3, double d4) {
        double d5 = d3;
        d5 = d5 > 0.0 ? (d5 += Math.abs(d4)) : (d5 -= Math.abs(d4));
        return d5;
    }

    public static int c(int n6, int n10) {
        int n11 = n6;
        n11 = n11 > 0 ? (n11 += Math.abs(n10)) : (n11 -= Math.abs(n10));
        return n11;
    }

    public static double b(double d3, double d4) {
        double d5 = d3;
        if (d5 > 0.0) {
            if (d5 < d4) {
                d5 += d4;
            }
        } else if (d5 > -d4) {
            d5 -= d4;
        }
        return d5;
    }

    public static long a(gf_0 gf_02) {
        return Y.a(gf_02.h(), gf_02.f(), gf_02.g());
    }

    public static long a(int n6, int n10, int n11) {
        long l6 = (long)(n6 * 3129871) ^ (long)n11 * 116129781L ^ (long)n10;
        l6 = l6 * l6 * 42317861L + l6 * 11L;
        return l6;
    }

    public static int a(Random random, int n6, int n10) {
        return random.nextInt(n10 - n6) + n6;
    }

    public static double a(Random random, double d3, double d4) {
        return d3 + (d4 - d3) * random.nextDouble();
    }

    public static double a(double d3, double d4) {
        double d5 = 1.0 / d4;
        return (double)Math.round(d3 * d5) / d5;
    }

    public static double a(double d3, int n6) {
        if (n6 < 0) {
            return d3;
        }
        BigDecimal bigDecimal = new BigDecimal(d3);
        bigDecimal = bigDecimal.setScale(n6, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    static {
        b = new float[65536];
        for (int i = 0; i < 65536; ++i) {
            Y.b[i] = (float)Math.sin((double)i * Math.PI * 2.0 / 65536.0);
        }
        a = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
    }
}

