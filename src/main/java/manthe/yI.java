/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.Random;
import manthe.AX;
import manthe.Y;
import manthe.on;

public class yI {
    public static int a(Color color) {
        return yI.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int a(int n6) {
        return yI.a(n6, n6, n6, 255);
    }

    public static int a(int n6, int n10) {
        return yI.a(n6, n6, n6, n10);
    }

    public static int a(int n6, int n10, int n11) {
        return yI.a(n6, n10, n11, 255);
    }

    public static int a(int n6, int n10, int n11, int n12) {
        int n13 = 0;
        n13 |= Y.b(n12, 0, 255) << 24;
        n13 |= Y.b(n6, 0, 255) << 16;
        n13 |= Y.b(n10, 0, 255) << 8;
        return n13 |= Y.b(n11, 0, 255);
    }

    public static int c(Color color) {
        double d3 = (double)(color.getRed() * color.getRed()) * 0.241;
        double d4 = (double)(color.getGreen() * color.getGreen()) * 0.691;
        double d5 = (double)(color.getBlue() * color.getBlue()) * 0.068;
        double d6 = Math.sqrt(d3 + d4 + d5);
        return (int)d6;
    }

    public static Color a(Color color, int n6) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n6);
    }

    public static Color a(Color color, double d3) {
        double d4 = Math.max(0.0, Math.min(255.0, (double)color.getRed() + d3));
        double d5 = Math.max(0.0, Math.min(255.0, (double)color.getGreen() + d3));
        double d6 = Math.max(0.0, Math.min(255.0, (double)color.getBlue() + d3));
        return new Color((int)d4, (int)d5, (int)d6, color.getAlpha());
    }

    public static Color a(Color color, int n6, int n10) {
        return yI.a(color, n6, n10, false);
    }

    public static Color a(Color color, int n6, int n10, boolean bl) {
        double d3;
        int n11 = yI.c(color);
        double d4 = d3 = !bl && on.p.t().r.J() ? 0.0 : 130.0;
        if ((double)n11 > d3) {
            return new Color(n6, n6, n6);
        }
        return new Color(n10, n10, n10);
    }

    public static boolean b(Color color) {
        double d3;
        int n6 = yI.c(color);
        return !((double)n6 > (d3 = 130.0));
    }

    public static Color a() {
        return yI.a(on.p.t().r.K(), 45, 240);
    }

    private static float c(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 1.0f;
        }
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        if (6.0f * f12 < 1.0f) {
            return f10 + (f11 - f10) * 6.0f * f12;
        }
        if (2.0f * f12 < 1.0f) {
            return f11;
        }
        if (3.0f * f12 < 2.0f) {
            return f10 + (f11 - f10) * 6.0f * (0.6666667f - f12);
        }
        return f10;
    }

    public static Color b(float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        if (f11 == 0.0f) {
            f14 = f15 = f12;
            f13 = f15;
        } else {
            float f16 = (double)f12 < 0.5 ? f12 * (1.0f + f11) : f12 + f11 - f12 * f11;
            float f17 = 2.0f * f12 - f16;
            f13 = yI.c(f17, f16, f10 + 0.33333334f);
            f14 = yI.c(f17, f16, f10);
            f15 = yI.c(f17, f16, f10 - 0.33333334f);
        }
        return new Color(Math.round(f13 * 255.0f), Math.round(f14 * 255.0f), Math.round(f15 * 255.0f));
    }

    public static int a(int n6, int n10, boolean bl, double d3) {
        int n11;
        int n12 = bl ? n6 : n10;
        int n13 = n11 = bl ? n10 : n6;
        if (AX.a(n12, n11) >= d3) {
            return n6;
        }
        float[] fArray = new float[3];
        AX.a(bl ? n12 : n11, fArray);
        float f10 = fArray[2];
        float f11 = 1.0f;
        for (int i = 0; i < 15 && (double)(f11 - f10) > 1.0E-5; ++i) {
            float f12;
            fArray[2] = f12 = (f10 + f11) / 2.0f;
            if (bl) {
                n12 = AX.a(fArray);
            } else {
                n11 = AX.a(fArray);
            }
            if (AX.a(n12, n11) > d3) {
                f11 = f12;
                continue;
            }
            f10 = f12;
        }
        return bl ? n12 : n11;
    }

    public static int b(int n6, int n10, boolean bl, double d3) {
        int n11;
        int n12 = bl ? n6 : n10;
        int n13 = n11 = bl ? n10 : n6;
        if (AX.a(n12, n11) >= d3) {
            return n6;
        }
        double[] dArray = new double[3];
        AX.a(bl ? n12 : n11, dArray);
        double d4 = 0.0;
        double d5 = dArray[0];
        double d6 = dArray[1];
        double d7 = dArray[2];
        for (int i = 0; i < 15 && d5 - d4 > 1.0E-5; ++i) {
            double d8 = (d4 + d5) / 2.0;
            if (bl) {
                n12 = AX.b(d8, d6, d7);
            } else {
                n11 = AX.b(d8, d6, d7);
            }
            if (AX.a(n12, n11) > d3) {
                d4 = d8;
                continue;
            }
            d5 = d8;
        }
        return AX.b(d4, d6, d7);
    }

    public static Color a(float f10, float f11, float f12) {
        Color color = Color.getHSBColor(f10, f11, f12);
        Color color2 = new Color(yI.a(color.getRGB(), new Color(45, 45, 45).getRGB(), false, 4.0));
        return color2;
    }

    public static Color b() {
        return yI.a(Y.a(new Random(), 0.0f, 1.0f), 0.9f, 0.9f);
    }
}

