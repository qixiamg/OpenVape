/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;

class AX {
    private static final double c = 95.047;
    private static final double f = 100.0;
    private static final double d = 108.883;
    private static final double g = 0.008856;
    private static final double e = 903.3;
    private static final int a = 10;
    private static final int b = 1;
    private static final ThreadLocal<double[]> h = new ThreadLocal();

    private AX() {
    }

    public static int c(int n6, int n10) {
        int n11 = 255;
        int n12 = 255;
        int n13 = AX.b(n12, n11);
        Color color = new Color(n6);
        Color color2 = new Color(n10);
        int n14 = AX.a(color.getRed(), n12, color2.getRed(), n11, n13);
        int n15 = AX.a(color.getGreen(), n12, color2.getGreen(), n11, n13);
        int n16 = AX.a(color.getBlue(), n12, color2.getBlue(), n11, n13);
        return new Color(n14, n15, n16).getRGB();
    }

    private static int b(int n6, int n10) {
        return 255 - (255 - n10) * (255 - n6) / 255;
    }

    private static int a(int n6, int n10, int n11, int n12, int n13) {
        if (n13 == 0) {
            return 0;
        }
        return (255 * n6 * n10 + n11 * n12 * (255 - n10)) / (n13 * 255);
    }

    public static void a(int n6, float[] fArray) {
        Color color = new Color(n6);
        AX.a(color.getRed(), color.getGreen(), color.getBlue(), fArray);
    }

    public static void a(int n6, int n10, int n11, float[] fArray) {
        float f10;
        float f11;
        float f12 = (float)n6 / 255.0f;
        float f13 = (float)n10 / 255.0f;
        float f14 = (float)n11 / 255.0f;
        float f15 = Math.max(f12, Math.max(f13, f14));
        float f16 = Math.min(f12, Math.min(f13, f14));
        float f17 = f15 - f16;
        float f18 = (f15 + f16) / 2.0f;
        if (f15 == f16) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = f15 == f12 ? (f13 - f14) / f17 % 6.0f : (f15 == f13 ? (f14 - f12) / f17 + 2.0f : (f12 - f13) / f17 + 4.0f);
            f11 = f17 / (1.0f - Math.abs(2.0f * f18 - 1.0f));
        }
        f10 = f10 * 60.0f % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        fArray[0] = AX.a(f10, 0.0f, 360.0f);
        fArray[1] = AX.a(f11, 0.0f, 1.0f);
        fArray[2] = AX.a(f18, 0.0f, 1.0f);
    }

    public static double a(int n6) {
        double[] dArray = AX.a();
        AX.b(n6, dArray);
        return dArray[1] / 100.0;
    }

    public static double a(int n6, int n10) {
        n6 = AX.c(n6, n10);
        double d3 = AX.a(n6) + 0.05;
        double d4 = AX.a(n10) + 0.05;
        return Math.max(d3, d4) / Math.min(d3, d4);
    }

    public static void a(int n6, double[] dArray) {
        Color color = new Color(n6);
        AX.a(color.getRed(), color.getGreen(), color.getBlue(), dArray);
    }

    public static void a(int n6, int n10, int n11, double[] dArray) {
        AX.b(n6, n10, n11, dArray);
        AX.a(dArray[0], dArray[1], dArray[2], dArray);
    }

    public static void b(int n6, double[] dArray) {
        Color color = new Color(n6);
        AX.b(color.getRed(), color.getGreen(), color.getBlue(), dArray);
    }

    public static void b(int n6, int n10, int n11, double[] dArray) {
        if (dArray.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = (double)n6 / 255.0;
        d3 = d3 < 0.04045 ? d3 / 12.92 : Math.pow((d3 + 0.055) / 1.055, 2.4);
        double d4 = (double)n10 / 255.0;
        d4 = d4 < 0.04045 ? d4 / 12.92 : Math.pow((d4 + 0.055) / 1.055, 2.4);
        double d5 = (double)n11 / 255.0;
        d5 = d5 < 0.04045 ? d5 / 12.92 : Math.pow((d5 + 0.055) / 1.055, 2.4);
        dArray[0] = 100.0 * (d3 * 0.4124 + d4 * 0.3576 + d5 * 0.1805);
        dArray[1] = 100.0 * (d3 * 0.2126 + d4 * 0.7152 + d5 * 0.0722);
        dArray[2] = 100.0 * (d3 * 0.0193 + d4 * 0.1192 + d5 * 0.9505);
    }

    public static void a(double d3, double d4, double d5, double[] dArray) {
        if (dArray.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        d3 = AX.a(d3 / 95.047);
        d4 = AX.a(d4 / 100.0);
        d5 = AX.a(d5 / 108.883);
        dArray[0] = Math.max(0.0, 116.0 * d4 - 16.0);
        dArray[1] = 500.0 * (d3 - d4);
        dArray[2] = 200.0 * (d4 - d5);
    }

    public static void b(double d3, double d4, double d5, double[] dArray) {
        double d6 = (d3 + 16.0) / 116.0;
        double d7 = d4 / 500.0 + d6;
        double d8 = d6 - d5 / 200.0;
        double d10 = Math.pow(d7, 3.0);
        double d11 = d10 > 0.008856 ? d10 : (116.0 * d7 - 16.0) / 903.3;
        double d12 = d3 > 7.9996247999999985 ? Math.pow(d6, 3.0) : d3 / 903.3;
        d10 = Math.pow(d8, 3.0);
        double d13 = d10 > 0.008856 ? d10 : (116.0 * d8 - 16.0) / 903.3;
        dArray[0] = d11 * 95.047;
        dArray[1] = d12 * 100.0;
        dArray[2] = d13 * 108.883;
    }

    public static int a(double d3, double d4, double d5) {
        double d6 = (d3 * 3.2406 + d4 * -1.5372 + d5 * -0.4986) / 100.0;
        double d7 = (d3 * -0.9689 + d4 * 1.8758 + d5 * 0.0415) / 100.0;
        double d8 = (d3 * 0.0557 + d4 * -0.204 + d5 * 1.057) / 100.0;
        d6 = d6 > 0.0031308 ? 1.055 * Math.pow(d6, 0.4166666666666667) - 0.055 : 12.92 * d6;
        d7 = d7 > 0.0031308 ? 1.055 * Math.pow(d7, 0.4166666666666667) - 0.055 : 12.92 * d7;
        d8 = d8 > 0.0031308 ? 1.055 * Math.pow(d8, 0.4166666666666667) - 0.055 : 12.92 * d8;
        return new Color(AX.a((int)Math.round(d6 * 255.0), 0, 255), AX.a((int)Math.round(d7 * 255.0), 0, 255), AX.a((int)Math.round(d8 * 255.0), 0, 255)).getRGB();
    }

    public static int b(double d3, double d4, double d5) {
        double[] dArray = AX.a();
        AX.b(d3, d4, d5, dArray);
        return AX.a(dArray[0], dArray[1], dArray[2]);
    }

    private static int a(int n6, int n10, int n11) {
        return n6 < n10 ? n10 : (n6 > n11 ? n11 : n6);
    }

    private static float a(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : (f10 > f12 ? f12 : f10);
    }

    private static double a(double d3) {
        return d3 > 0.008856 ? Math.pow(d3, 0.3333333333333333) : (903.3 * d3 + 16.0) / 116.0;
    }

    public static double[] a() {
        double[] dArray = h.get();
        if (dArray == null) {
            dArray = new double[3];
            h.set(dArray);
        }
        return dArray;
    }

    public static int a(float[] fArray) {
        float f10 = fArray[0];
        float f11 = fArray[1];
        float f12 = fArray[2];
        float f13 = (1.0f - Math.abs(2.0f * f12 - 1.0f)) * f11;
        float f14 = f12 - 0.5f * f13;
        float f15 = f13 * (1.0f - Math.abs(f10 / 60.0f % 2.0f - 1.0f));
        int n6 = (int)f10 / 60;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        switch (n6) {
            case 0: {
                n10 = Math.round(255.0f * (f13 + f14));
                n11 = Math.round(255.0f * (f15 + f14));
                n12 = Math.round(255.0f * f14);
                break;
            }
            case 1: {
                n10 = Math.round(255.0f * (f15 + f14));
                n11 = Math.round(255.0f * (f13 + f14));
                n12 = Math.round(255.0f * f14);
                break;
            }
            case 2: {
                n10 = Math.round(255.0f * f14);
                n11 = Math.round(255.0f * (f13 + f14));
                n12 = Math.round(255.0f * (f15 + f14));
                break;
            }
            case 3: {
                n10 = Math.round(255.0f * f14);
                n11 = Math.round(255.0f * (f15 + f14));
                n12 = Math.round(255.0f * (f13 + f14));
                break;
            }
            case 4: {
                n10 = Math.round(255.0f * (f15 + f14));
                n11 = Math.round(255.0f * f14);
                n12 = Math.round(255.0f * (f13 + f14));
                break;
            }
            case 5: 
            case 6: {
                n10 = Math.round(255.0f * (f13 + f14));
                n11 = Math.round(255.0f * f14);
                n12 = Math.round(255.0f * (f15 + f14));
            }
        }
        n10 = AX.a(n10, 0, 255);
        n11 = AX.a(n11, 0, 255);
        n12 = AX.a(n12, 0, 255);
        return new Color(n10, n11, n12).getRGB();
    }
}

