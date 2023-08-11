/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.awt.Color;
import manthe.V;
import manthe.Y;
import manthe.cb_0;
import manthe.dr_1;
import manthe.ds_2;
import manthe.eJ;
import manthe.ef_0;
import manthe.ex_0;
import manthe.mA;
import manthe.o7;
import manthe.on;
import manthe.qN;
import manthe.tV;
import manthe.tW;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.ac
 */
public class ac_1 {
    private static final mA a;
    private static final mA b;
    private static final boolean c;
    private static final qN d;

    public static void a(double d3, double d4, double d5, double d6, double d7, double d8, double d10, Color color) {
        ef_0 ef_02 = ds_2.r();
        dr_1 dr_12 = ds_2.m();
        eJ eJ2 = ds_2.k();
        ds_2.M().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d3, (double)(d4 + 1.4), (double)d5);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        double d11 = 0.0;
        double d12 = d6 - ds_2.k().z();
        double d13 = d8 - ds_2.k().g();
        if (d13 > 0.0 && d12 > 0.0) {
            d11 = Math.toDegrees(-Math.atan(d12 / d13));
        } else if (d13 > 0.0 && d12 < 0.0) {
            d11 = Math.toDegrees(-Math.atan(d12 / d13));
        } else if (d13 < 0.0 && d12 > 0.0) {
            d11 = -90.0 + Math.toDegrees(Math.atan(d13 / d12));
        } else if (d13 < 0.0 && d12 < 0.0) {
            d11 = 90.0 + Math.toDegrees(Math.atan(d13 / d12));
        }
        GL11.glRotated((double)(-d11), (double)0.0, (double)1.0, (double)0.0);
        double d14 = d7 - eJ2.l() + d10 / 2.0 + 0.2;
        if (cb_0.h) {
            d14 = d7 - 0.3 - eJ2.l();
        }
        double d15 = d8 - eJ2.g();
        double d16 = Y.e(d12 * d12 + d15 * d15);
        float f10 = (float)(-(Math.atan2(d14, d16) * 180.0 / Math.PI));
        GL11.glRotated((double)f10, (double)1.0, (double)0.0, (double)0.0);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        double d17 = 0.5;
        double d18 = -1.0;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
        GL11.glLineWidth((float)3.0f);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d17), (double)(-d18));
        GL11.glVertex2d((double)d17, (double)(-d18));
        GL11.glVertex2d((double)d17, (double)d18);
        GL11.glVertex2d((double)(-d17), (double)d18);
        GL11.glEnd();
        GL11.glEnable((int)2929);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)(-d17), (double)(-d18));
        GL11.glVertex2d((double)d17, (double)(-d18));
        GL11.glVertex2d((double)d17, (double)d18);
        GL11.glVertex2d((double)(-d17), (double)d18);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2896);
        GL11.glPopMatrix();
        ds_2.M().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void a(double d3, double d4, double d5, double d6, double d7, double d8, double d10, Color color, Color color2, double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        if (color2 != null) {
            GL11.glColor4d((double)((float)color2.getRed() / 255.0f), (double)((float)color2.getGreen() / 255.0f), (double)((float)color2.getBlue() / 255.0f), (double)((float)color2.getAlpha() / 255.0f));
            b.c();
            d19 = d3 + d6 - d11;
            d18 = d3 - d11;
            d17 = d4 + d7 - d12;
            d16 = d4 - d12;
            d15 = d5 + d8 - d13;
            d14 = d5 - d13;
            b.a(d18, d16, d14);
            b.a(d18, d17, d14);
            b.a(d19, d16, d14);
            b.a(d19, d17, d14);
            b.a(d19, d16, d15);
            b.a(d19, d17, d15);
            b.a(d18, d16, d15);
            b.a(d18, d17, d15);
            b.a(d19, d17, d14);
            b.a(d19, d16, d14);
            b.a(d18, d17, d14);
            b.a(d18, d16, d14);
            b.a(d18, d17, d15);
            b.a(d18, d16, d15);
            b.a(d19, d17, d15);
            b.a(d19, d16, d15);
            b.a(d18, d17, d14);
            b.a(d19, d17, d14);
            b.a(d19, d17, d15);
            b.a(d18, d17, d15);
            b.a(d18, d17, d14);
            b.a(d18, d17, d15);
            b.a(d19, d17, d15);
            b.a(d19, d17, d14);
            b.a(d18, d16, d14);
            b.a(d19, d16, d14);
            b.a(d19, d16, d15);
            b.a(d18, d16, d15);
            b.a(d18, d16, d14);
            b.a(d18, d16, d15);
            b.a(d19, d16, d15);
            b.a(d19, d16, d14);
            b.a(d18, d16, d14);
            b.a(d18, d17, d14);
            b.a(d18, d16, d15);
            b.a(d18, d17, d15);
            b.a(d19, d16, d15);
            b.a(d19, d17, d15);
            b.a(d19, d16, d14);
            b.a(d19, d17, d14);
            b.a(d18, d17, d15);
            b.a(d18, d16, d15);
            b.a(d18, d17, d14);
            b.a(d18, d16, d14);
            b.a(d19, d17, d14);
            b.a(d19, d16, d14);
            b.a(d19, d17, d15);
            b.a(d19, d16, d15);
            b.a();
        }
        if (color != null) {
            GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            a.c();
            d19 = d3 + d6 - d11;
            d18 = d3 - d11;
            d17 = d4 + d7 - d12;
            d16 = d4 - d12;
            d15 = d5 + d8 - d13;
            d14 = d5 - d13;
            a.a(d18, d16, d14);
            a.a(d19, d16, d14);
            a.a(d18, d16, d15);
            a.a(d19, d16, d15);
            a.a(d18, d16, d14);
            a.a(d18, d16, d15);
            a.a(d19, d16, d14);
            a.a(d19, d16, d15);
            a.a(d18, d17, d14);
            a.a(d19, d17, d14);
            a.a(d18, d17, d15);
            a.a(d19, d17, d15);
            a.a(d18, d17, d14);
            a.a(d18, d17, d15);
            a.a(d19, d17, d14);
            a.a(d19, d17, d15);
            a.a(d18, d16, d14);
            a.a(d18, d17, d14);
            a.a(d18, d16, d15);
            a.a(d18, d17, d15);
            a.a(d19, d16, d15);
            a.a(d19, d17, d15);
            a.a(d19, d16, d14);
            a.a(d19, d17, d14);
            a.a();
        }
    }

    public static void a(tV tV2, double d3, double d4, double d5) {
        ac_1.a(tV2.a, tV2.b, tV2.f, 1.0, 1.0, 1.0, 0.1, tV2.c, null, d3, d4, d5);
    }

    public static void a(double d3, double d4, double d5, tV tV2) {
        tW tW2;
        GL11.glColor4d((double)((float)tV2.c.getRed() / 255.0f), (double)((float)tV2.c.getGreen() / 255.0f), (double)((float)tV2.c.getBlue() / 255.0f), (double)((float)tV2.c.getAlpha() / 255.0f));
        b.c();
        double d6 = (double)(tV2.a + 1) - d3;
        double d7 = (double)tV2.a - d3;
        double d8 = (double)(tV2.b + 1) - d4;
        double d10 = (double)tV2.b - d4;
        double d11 = (double)(tV2.f + 1) - d5;
        double d12 = (double)tV2.f - d5;
        b.a(d7, d10, d12);
        b.a(d7, d8, d12);
        b.a(d6, d10, d12);
        b.a(d6, d8, d12);
        b.a(d6, d10, d11);
        b.a(d6, d8, d11);
        b.a(d7, d10, d11);
        b.a(d7, d8, d11);
        b.a(d6, d8, d12);
        b.a(d6, d10, d12);
        b.a(d7, d8, d12);
        b.a(d7, d10, d12);
        b.a(d7, d8, d11);
        b.a(d7, d10, d11);
        b.a(d6, d8, d11);
        b.a(d6, d10, d11);
        b.a(d7, d8, d12);
        b.a(d6, d8, d12);
        b.a(d6, d8, d11);
        b.a(d7, d8, d11);
        b.a(d7, d8, d12);
        b.a(d7, d8, d11);
        b.a(d6, d8, d11);
        b.a(d6, d8, d12);
        b.a(d7, d10, d12);
        b.a(d6, d10, d12);
        b.a(d6, d10, d11);
        b.a(d7, d10, d11);
        b.a(d7, d10, d12);
        b.a(d7, d10, d11);
        b.a(d6, d10, d11);
        b.a(d6, d10, d12);
        b.a(d7, d10, d12);
        b.a(d7, d8, d12);
        b.a(d7, d10, d11);
        b.a(d7, d8, d11);
        b.a(d6, d10, d11);
        b.a(d6, d8, d11);
        b.a(d6, d10, d12);
        b.a(d6, d8, d12);
        b.a(d7, d8, d11);
        b.a(d7, d10, d11);
        b.a(d7, d8, d12);
        b.a(d7, d10, d12);
        b.a(d6, d8, d12);
        b.a(d6, d10, d12);
        b.a(d6, d8, d11);
        b.a(d6, d10, d11);
        b.a();
        if (tV2 instanceof tW && (tW2 = (tW)tV2).c() > 0.0f) {
            GL11.glColor4d((double)((double)(255 - tW2.c.getRed()) / 255.0), (double)((255.0 - (double)tW2.c.getGreen()) / 255.0), (double)((255.0 - (double)tW2.c.getBlue()) / 255.0), (double)0.7);
            GL11.glLineWidth((float)3.0f);
            a.c();
            a.a(d7, d10, d12);
            a.a(d7, d8, d12);
            a.a(d6, d10, d12);
            a.a(d6, d8, d12);
            a.a(d7, d10, d11);
            a.a(d7, d8, d11);
            a.a(d6, d10, d11);
            a.a(d6, d8, d11);
            a.a(d6, d10, d12);
            a.a(d6, d10, d11);
            a.a(d6, d8, d12);
            a.a(d6, d8, d11);
            a.a(d7, d10, d12);
            a.a(d7, d10, d11);
            a.a(d7, d8, d12);
            a.a(d7, d8, d11);
            a.a(d7, d10, d12);
            a.a(d6, d10, d12);
            a.a(d7, d8, d12);
            a.a(d6, d8, d12);
            a.a(d7, d10, d11);
            a.a(d6, d10, d11);
            a.a(d7, d8, d11);
            a.a(d6, d8, d11);
            a.a();
        }
    }

    public static void a(ex_0 ex_02, double d3, Color color, Color color2, float f10) {
        ef_0 ef_02 = ds_2.r();
        double d4 = ef_02.m();
        double d5 = ef_02.n();
        double d6 = ef_02.j();
        double d7 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)f10;
        double d8 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)f10;
        double d10 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)f10;
        GL11.glPushMatrix();
        ds_2.M().a(1.0);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d11 = 0.15;
        ac_1.a(d7 - (double)(ex_02.A() / 2.0f) - d11, d8, d10 - (double)(ex_02.A() / 2.0f) - d11, (double)ex_02.A() + d11 * 2.0, ex_02.n(), (double)ex_02.A() + d11 * 2.0, d3, color, color2, d4, d5, d6);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        ds_2.M().b(1.0);
        GL11.glPopMatrix();
    }

    public static void a(String string, double d3, double d4, double d5, double d6, double d7, int n6, Color color, double d8) {
        ef_0 ef_02 = ds_2.r();
        dr_1 dr_12 = ds_2.m();
        ds_2.M().a(0.0);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d3, (double)(d4 + d8), (double)d5);
        GL11.glNormal3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)(-ef_02.i()), (double)0.0, (double)1.0, (double)0.0);
        GL11.glRotated((double)ef_02.g(), (double)1.0, (double)0.0, (double)0.0);
        float f10 = d7 / 5.0 <= 2.0 ? 2.0f : (float)(d7 / 5.0);
        float f11 = (float)(0.01666666753590107 * ((double)f10 * d6));
        GL11.glScaled((double)(-f11), (double)(-f11), (double)f11);
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        int n10 = dr_12.c(string) / 2;
        int n11 = -(dr_12.b(string) - 1);
        o7.a((double)(-n10) - 2.0, (double)n11 - 2.0, (double)n10 + 2.0, 2.0, color);
        GL11.glDisable((int)2929);
        o7.a((double)(-n10) - 2.0, (double)n11 - 2.0, (double)n10 + 2.0, 2.0, color);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        dr_12.c(string, (double)(-n10), (double)n11 + 0.1, n6);
        GL11.glEnable((int)2929);
        dr_12.c(string, (double)(-n10), (double)n11 + 0.1, n6);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        ds_2.M().b(0.0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static Color a(Color color) {
        int n6 = color.getRGB();
        n6 = 0xFFFFFF - n6;
        return new Color(n6);
    }

    public static double[] a(double d3, double d4, double d5) {
        // TODO this may not working because change a.a.trn(d3, d4, d5)
        a.a(d3, d4, d5);
        return a.a;
    }

    static {
        c = V.c() > 13;
        d = new qN("#.#");
        a = on.p.y();
        b = new mA();
        b.a(48, 7);
    }
}

