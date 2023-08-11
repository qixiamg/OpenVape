/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashSet;
import manthe.bo_0;
import manthe.d0_0;
import manthe.ds_2;
import manthe.eb_0;
import manthe.p1;
import manthe.pe_0;
import manthe.qL;
import manthe.zu_0;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public final class o7 {
    private static IntBuffer f;
    private static FloatBuffer c;
    private static FloatBuffer d;
    private static final float[] e;
    private static final Color[] b;
    private static final Color[] a;

    private o7() {
    }

    public static void a(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static boolean a(double d3, double d4, double d5, double d6) {
        boolean bl = GL11.glIsEnabled((int)3089);
        if (!bl) {
            GL11.glEnable((int)3089);
        }
        d0_0 d0_02 = ds_2.p();
        int n6 = ds_2.H();
        int n10 = d0_02.f();
        if (zu_0.T.aa.u().booleanValue()) {
            n10 = 2;
        }
        int n11 = (int)(d5 * (double)n10);
        int n12 = (int)(d6 * (double)n10);
        double d7 = d3 * (double)n10;
        int n13 = (int)d7;
        double d8 = d4 * (double)n10;
        int n14 = (int)((double)n6 - d8 - (double)n12);
        GL11.glScissor((int)n13, (int)n14, (int)n11, (int)n12);
        return bl;
    }

    public static void a(Color color, double d3, double d4, double d5, double d6, double d7, double d8, double d10, double d11) {
        o7.a(color);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glVertex2d((double)d7, (double)d8);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
    }

    public static void a(Color color, Color color2, double d3, double d4, double d5, double d6, double d7, double d8, double d10, double d11) {
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        o7.a(color2);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d5, (double)d6);
        o7.a(color);
        GL11.glVertex2d((double)d7, (double)d8);
        GL11.glVertex2d((double)d10, (double)d11);
        GL11.glEnd();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        GL11.glShadeModel((int)7424);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
    }

    public static void a(Color color, p1 p12) {
        o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t(), p12.k());
    }

    public static void a(Color color, double d3, double d4, p1 p12, Integer ... integerArray) {
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(integerArray));
        double d5 = p12.q();
        double d6 = p12.b();
        double d7 = p12.t();
        double d8 = p12.k();
        p12.c(d5 - d4 * 2.0);
        p12.b(d6 - d4 * 2.0);
        p12.a(d7 + d4);
        p12.d(d8 + d4);
        boolean bl = hashSet.contains(4);
        if (bl || hashSet.contains(0)) {
            o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + d3, p12.k() + p12.b(), p12.t() + d3, p12.k(), p12.t(), p12.k());
        }
        if (bl || hashSet.contains(3)) {
            o7.a(color, p12.t() + d3, p12.k() + p12.b(), p12.t() + p12.q() - d3, p12.k() + p12.b(), p12.t() + p12.q() - d3, p12.k() + p12.b() - d3, p12.t() + d3, p12.k() + p12.b() - d3);
        }
        if (bl || hashSet.contains(2)) {
            o7.a(color, p12.t() + p12.q() - d3, p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t() + p12.q() - d3, p12.k());
        }
        if (bl || hashSet.contains(1)) {
            o7.a(color, p12.t() + d3, p12.k() + d3, p12.t() + p12.q() - d3, p12.k() + d3, p12.t() + p12.q() - d3, p12.k(), p12.t() + d3, p12.k());
        }
        p12.b(d6);
        p12.c(d5);
        p12.a(d7);
        p12.d(d8);
    }

    public static void a(Color color, double d3, p1 p12, Integer ... integerArray) {
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(integerArray));
        boolean bl = hashSet.contains(4);
        if (bl || hashSet.contains(0)) {
            o7.a(color, p12.t(), p12.k() + p12.b(), p12.t() + d3, p12.k() + p12.b(), p12.t() + d3, p12.k(), p12.t(), p12.k());
        }
        if (bl || hashSet.contains(3)) {
            o7.a(color, p12.t() + d3, p12.k() + p12.b(), p12.t() + p12.q() - d3, p12.k() + p12.b(), p12.t() + p12.q() - d3, p12.k() + p12.b() - d3, p12.t() + d3, p12.k() + p12.b() - d3);
        }
        if (bl || hashSet.contains(2)) {
            o7.a(color, p12.t() + p12.q() - d3, p12.k() + p12.b(), p12.t() + p12.q(), p12.k() + p12.b(), p12.t() + p12.q(), p12.k(), p12.t() + p12.q() - d3, p12.k());
        }
        if (bl || hashSet.contains(1)) {
            o7.a(color, p12.t() + d3, p12.k() + d3, p12.t() + p12.q() - d3, p12.k() + d3, p12.t() + p12.q() - d3, p12.k(), p12.t() + d3, p12.k());
        }
    }

    public static bo_0 b() {
        int n6;
        int n10 = ds_2.s().x();
        if (n10 == 0) {
            n10 = 1000;
        }
        for (n6 = 0; n6 < n10 && ds_2.F() / (n6 + 1) >= 320 && ds_2.H() / (n6 + 1) >= 240; ++n6) {
        }
        if (n6 == 0) {
            n6 = 2;
        }
        return new bo_0(Mouse.getX() / n6, ds_2.H() / n6 - Mouse.getY() / n6 - 1);
    }

    public static void a(double d3, double d4, double d5, double d6, Color color, int n6) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)(color.getRed() / 255), (double)(color.getGreen() / 255), (double)(color.getBlue() / 255), (double)(n6 / 255));
        GL11.glBegin((int)9);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)(d3 + d5 / 2.0), (double)(d4 + d6));
        GL11.glVertex2d((double)(d3 + d5), (double)d4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d3, double d4, double d5, double d6, double d7, Color color, Color color2) {
        pe_0.a(d3, d4, d5 - d3, d6 - d4, d7, color, color2);
    }

    public static void b(double d3, double d4, double d5, double d6, double d7, double d8, double d10, double d11) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)d7, (double)d8, (double)d10, (double)d11);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d5, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d6);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d3, double d4, double d5, double d6, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d5, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d6);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        if (!bl) {
            GL11.glDisable((int)3042);
        }
    }

    public static void e(double d3, double d4, double d5, double d6) {
    }

    public static void d(double d3, double d4, double d5, double d6) {
        eb_0 eb_02 = eb_0.f();
        eb_02.a(7);
        eb_02.a(d3, d6, 0.0, 1.0, 0.0);
        eb_02.a(d5, d6, 0.0, 0.0, 0.0);
        eb_02.a(d5, d4, 0.0, 0.0, 1.0);
        eb_02.a(d3, d4, 0.0, 1.0, 1.0);
        eb_02.j();
    }

    public static void a(int n6, int n10, int n11, int n12, int n13, int n14) {
        float f10 = 0.00390625f;
        float f11 = 0.00390625f;
        GL11.glBegin((int)7);
        o7.a((double)n6, (double)(n10 + n14), 0.0, (double)((float)n11 * f10), (float)(n12 + n14) * f11);
        o7.a((double)(n6 + n13), (double)(n10 + n14), 0.0, (double)((float)(n11 + n13) * f10), (float)(n12 + n14) * f11);
        o7.a((double)(n6 + n13), (double)n10, 0.0, (double)((float)(n11 + n13) * f10), (float)(n12 + 0) * f11);
        o7.a((double)n6, (double)n10, 0.0, (double)((float)n11 * f10), (float)(n12 + 0) * f11);
        GL11.glEnd();
    }

    public static void a(double d3, double d4, double d5, double d6, double d7) {
        GL11.glTexCoord2d((double)d6, (double)d7);
        GL11.glVertex3d((double)d3, (double)d4, (double)5.0);
    }

    public static void c(double d3, double d4, double d5, double d6) {
    }

    public static void b(double d3, double d4, double d5, double d6) {
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3d((double)d3, (double)d6, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3d((double)d5, (double)d6, (double)0.0);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3d((double)d5, (double)d4, (double)0.0);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3d((double)d3, (double)d4, (double)0.0);
        GL11.glEnd();
    }

    public static void a(int n6) {
        float f10 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f11 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f12 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n6 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)f10);
    }

    public static void a(int n6, int n10, int n11, int n12) {
        float f10 = 0.003921569f * (float)n6;
        float f11 = 0.003921569f * (float)n10;
        float f12 = 0.003921569f * (float)n11;
        float f13 = 0.003921569f * (float)n12;
        GL11.glColor4f((float)f10, (float)f11, (float)f12, (float)f13);
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, int n6) {
        float f15 = (f13 - f11) / 4.0f;
        float f16 = (f12 - f10) / 4.0f;
        o7.a(f10 - f14, f11, f10, f11 + f15, n6);
        o7.a(f10 - f14, f11 - f14, f10 + f16, f11, n6);
        o7.a(f12, f11, f12 + f14, f11 + f15, n6);
        o7.a(f12 - f16, f11 - f14, f12 + f14, f11, n6);
        o7.a(f10 - f14, f13 - f15, f10, f13, n6);
        o7.a(f10 - f14, f13, f10 + f16, f13 + f14, n6);
        o7.a(f12, f13 - f15, f12 + f14, f13, n6);
        o7.a(f12 - f16, f13, f12 + f14, f13 + f14, n6);
    }

    public static void a(float f10, float f11, float f12, float f13, int n6) {
        o7.a();
        o7.a(n6);
        o7.a(f10, f11, f12, f13);
        o7.c();
    }

    public static void a(double d3, double d4, double d5, double d6, int n6) {
        o7.a();
        o7.a(n6);
        o7.a((float)d3, (float)d4, (float)d5, (float)d6);
        o7.c();
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        o7.a();
        GL11.glColor4f((float)f14, (float)f15, (float)f16, (float)f17);
        o7.a(f10, f11, f12, f13);
        o7.c();
    }

    public static void a(float f10, float f11, float f12, float f13) {
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f10, (float)f13);
        GL11.glVertex2f((float)f12, (float)f13);
        GL11.glVertex2f((float)f12, (float)f11);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glEnd();
    }

    public static void a() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
    }

    public static void c() {
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void a(double d3, double d4, double d5, double d6, double d7, double d8, double d10, double d11) {
        double d12;
        o7.a();
        double d13 = d6 / 2.0;
        d3 += d13;
        d4 += d13;
        boolean bl = GL11.glIsEnabled((int)2884);
        if (bl) {
            GL11.glDisable((int)2884);
        }
        double d14 = Math.PI * 2;
        GL11.glColor4d((double)d7, (double)d8, (double)d10, (double)d11);
        GL11.glBegin((int)6);
        for (d12 = Math.PI; d12 <= d14; d12 += 0.001) {
            GL11.glVertex2d((double)(d3 + Math.sin(d12) * d13), (double)(d4 + Math.cos(d12) * d13));
        }
        GL11.glEnd();
        GL11.glBegin((int)6);
        for (d12 = 0.0; d12 <= d14 / 2.0; d12 += 0.001) {
            GL11.glVertex2d((double)(d3 + Math.sin(d12) * d13), (double)(d4 + Math.cos(d12) * d13));
        }
        GL11.glEnd();
        GL11.glColor4d((double)d7, (double)d8, (double)d10, (double)0.8);
        GL11.glBegin((int)2);
        for (d12 = Math.PI; d12 < d14 * 1.5; d12 += 0.1) {
            GL11.glVertex2d((double)(d3 + Math.sin(d12) * d13), (double)(d4 + Math.cos(d12) * d13));
        }
        GL11.glEnd();
        if (bl) {
            GL11.glEnable((int)2884);
        }
        o7.c();
    }

    public static Color a(float f10) {
        return o7.a(f10, false);
    }

    public static Color a(float f10, boolean bl) {
        return o7.a(e, bl ? a : b, f10);
    }

    public static Color a(float[] fArray, Color[] colorArray, float f10) {
        Color color = Color.RED;
        if (fArray != null && colorArray != null && fArray.length == colorArray.length) {
            int[] nArray = o7.a(fArray, f10);
            float[] fArray2 = new float[]{fArray[nArray[0]], fArray[nArray[1]]};
            Color[] colorArray2 = new Color[]{colorArray[nArray[0]], colorArray[nArray[1]]};
            float f11 = fArray2[1] - fArray2[0];
            float f12 = f10 - fArray2[0];
            float f13 = f12 / f11;
            color = o7.a(colorArray2[0], colorArray2[1], (double)(1.0f - f13));
        }
        return color;
    }

    private static int[] a(float[] fArray, float f10) {
        int n6;
        int[] nArray = new int[2];
        for (n6 = 0; n6 < fArray.length && fArray[n6] <= f10; ++n6) {
        }
        if (n6 >= fArray.length) {
            n6 = fArray.length - 1;
        }
        nArray[0] = n6 - 1;
        nArray[1] = n6;
        return nArray;
    }

    private static Color a(Color color, Color color2, double d3) {
        Color color3;
        float f10 = (float)d3;
        float f11 = 1.0f - f10;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        color.getColorComponents(fArray);
        color2.getColorComponents(fArray2);
        float f12 = fArray[0] * f10 + fArray2[0] * f11;
        float f13 = fArray[1] * f10 + fArray2[1] * f11;
        float f14 = fArray[2] * f10 + fArray2[2] * f11;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 255.0f) {
            f12 = 255.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        } else if (f13 > 255.0f) {
            f13 = 255.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        } else if (f14 > 255.0f) {
            f14 = 255.0f;
        }
        try {
            color3 = new Color(f12, f13, f14);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Color.RED;
        }
        return color3;
    }

    static {
        e = new float[]{0.0f, 0.5f, 1.0f};
        b = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        a = new Color[]{Color.RED, Color.YELLOW, qL.b.i};
    }
}

