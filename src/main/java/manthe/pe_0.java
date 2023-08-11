/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.nio.FloatBuffer;
import manthe.d0_0;
import manthe.ds_2;
import manthe.e3;
import manthe.eK;
import manthe.eh_0;
import manthe.fG;
import manthe.fk_0;
import manthe.k9;
import manthe.lD;
import manthe.lP;
import manthe.lp_0;
import manthe.lv_0;
import manthe.mA;
import manthe.mg;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.pe
 */
public class pe_0 {
    private static mA a = new mA();
    private static mA h = new mA();
    private static lp_0 b;
    private static mg d;
    private static lv_0 e;
    private static lP g;
    private static lD k;
    private static boolean c;
    private static boolean i;
    private static boolean f;
    private static FloatBuffer j;

    private static void b() {
        c = GL11.glIsEnabled((int)2884);
        i = GL11.glIsEnabled((int)3042);
        f = GL11.glIsEnabled((int)3553);
        if (c) {
            e3.m();
        }
        if (!i) {
            e3.r();
        }
        if (f) {
            e3.j();
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glPushMatrix();
    }

    private static void a() {
        GL11.glPopMatrix();
        if (f) {
            e3.p();
        }
        if (!i) {
            e3.f();
        }
        if (c) {
            e3.t();
        }
    }

    public static void a(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void a(double d3, double d4, double d5, double d6, float f10, Color color) {
        d.c();
        d.a((float)d3, (float)d4, (float)d5, (float)d6);
        d.a(f10);
        d.a(color);
        pe_0.b();
        a.c();
        a.a((float)d3 - f10, (float)d4 - f10);
        a.a((float)(d3 + d5 + (double)f10), (float)d4 - f10);
        a.a((float)(d3 + d5 + (double)f10), (float)(d4 + d6 + (double)f10));
        a.a((float)d3 - f10, (float)(d4 + d6 + (double)f10));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
        d.d();
    }

    public static void a(double d3, double d4, double d5, double d6, Color color, boolean bl, float f10, float f11) {
        pe_0.a(d3, d4, d5, d6, color, bl, f10, f11, 8.0f, new Color(0, 0, 0, 102));
    }

    public static void a(double d3, double d4, double d5, double d6, Color color, float f10, float f11, float f12) {
        float f13 = 0.5f;
        float f14 = f12;
        k.c();
        k.a((float)(d3 -= (double)f14 - 0.5) + f10 + f11, (float)(d4 -= (double)f14) + f10 + f11, (float)(d3 + (d5 += (double)(f14 * 1.0f))) - (f10 + f11), (float)(d4 + (d6 += (double)f14 * 1.5)) - (f10 + f11));
        k.a(f10, f12, f11);
        pe_0.b();
        pe_0.a(color);
        a.c();
        a.a((float)d3 + f13, (float)d4 + f13);
        a.a((float)(d3 + d5 - (double)f13), (float)d4 + f13);
        a.a((float)(d3 + d5 - (double)f13), (float)(d4 + d6 - (double)f13));
        a.a((float)d3 + f13, (float)(d4 + d6 - (double)f13));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
        k.d();
    }

    public static void a(double d3, double d4, double d5, double d6, Color color, boolean bl, float f10, float f11, float f12, Color color2) {
        if (bl) {
            pe_0.a(d3, d4 + 0.5, d5, d6 - 0.5, f12, color2);
        }
        float f13 = 0.5f;
        if (f10 == 0.0f) {
            f13 = 0.0f;
        }
        float f14 = f11;
        float f15 = Math.max(0.0f, (f10 += f13 * 2.0f) - f14);
        if (f10 != 0.0f) {
            d3 -= (double)f14 - 0.5;
            d4 -= (double)f14;
            d6 += (double)f14 * 1.5;
            d5 += (double)(f14 * 1.0f);
        }
        b.c();
        b.a(f15);
        b.a((float)d3 + f10, (float)d4 + f10, (float)(d3 + d5) - f10, (float)(d4 + d6) - f10);
        b.b(f14);
        pe_0.b();
        pe_0.a(color);
        a.c();
        a.a((float)d3 + f13, (float)d4 + f13);
        a.a((float)(d3 + d5 - (double)f13), (float)d4 + f13);
        a.a((float)(d3 + d5 - (double)f13), (float)(d4 + d6 - (double)f13));
        a.a((float)d3 + f13, (float)(d4 + d6 - (double)f13));
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
        b.d();
    }

    public static void a(double d3, double d4, double d5, double d6, Color color) {
        pe_0.a(d3, d4, d5, d6, color, false, 2.0f, 1.0f);
    }

    public static void c(double d3, double d4, double d5, double d6, Color color) {
        pe_0.a((float)d3, (float)d4, (float)d5, (float)d6, color);
    }

    public static void a(float f10, float f11, float f12, float f13, Color color) {
        pe_0.b();
        pe_0.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f12, f11);
        a.a(f10 + f12, f11 + f13);
        a.a(f10, f11 + f13);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
    }

    public static void a(double d3, double d4, double d5, double d6, double d7, Color color, Color color2) {
        if (color.equals(color2)) {
            d7 = 0.0;
            pe_0.c(d3, d4, d5 - d7, d6 - d7, color);
            return;
        }
        pe_0.c(d3 -= d7, d4, (d5 += d7) - d7, (d6 += d7) - d7, color);
        pe_0.b();
        h.c();
        pe_0.a(color2);
        h.a((float)(d3 - d7), (float)(d4 - d7));
        h.a((float)(d3 + d5), (float)(d4 - d7));
        h.a((float)(d3 + d5), (float)d4);
        h.a((float)(d3 - d7), (float)d4);
        h.a((float)(d3 - d7), (float)(d4 + d6 - d7));
        h.a((float)(d3 + d5), (float)(d4 + d6 - d7));
        h.a((float)(d3 + d5), (float)(d4 + d6));
        h.a((float)(d3 - d7), (float)(d4 + d6));
        h.a((float)(d3 - d7), (float)d4);
        h.a((float)d3, (float)d4);
        h.a((float)d3, (float)(d4 + d6 - d7));
        h.a((float)(d3 - d7), (float)(d4 + d6 - d7));
        h.a((float)(d3 + d5 - d7), (float)d4);
        h.a((float)(d3 + d5), (float)d4);
        h.a((float)(d3 + d5), (float)(d4 + d6 - d7));
        h.a((float)(d3 + d5 - d7), (float)(d4 + d6 - d7));
        h.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
    }

    public static void a(String string, double d3, double d4, double d5, double d6, Color color) {
        pe_0.a(string, (float)d3, (float)d4, (float)d5, (float)d6, color);
    }

    public static void a(String string, float f10, float f11, float f12, float f13, Color color) {
        k9.a(color, f10 - f12 / 2.0f, f11 - f13 / 2.0f, string, f12, f13, false);
    }

    public static void a(fG fG2, double d3, double d4, double d5, boolean bl) {
        GL11.glPushMatrix();
        boolean bl2 = GL11.glIsEnabled((int)2929);
        boolean bl3 = GL11.glIsEnabled((int)3042);
        if (bl2 != bl) {
            if (bl) {
                e3.g();
            } else {
                e3.u();
            }
        }
        if (!bl3) {
            e3.r();
        }
        eK eK2 = ds_2.J();
        float f10 = eK2.g();
        eK2.a(150.0f);
        eh_0.h();
        eh_0.g();
        double d6 = 1.0 / d3;
        GL11.glScaled((double)d3, (double)d3, (double)d3);
        eK2.a(ds_2.m(), ds_2.l(), fG2, (int)(d4 * d6), (int)(d5 * d6));
        GL11.glScaled((double)d6, (double)d6, (double)d6);
        eh_0.h();
        eK2.a(f10);
        if (bl2 != bl) {
            if (bl) {
                e3.g();
            } else {
                e3.u();
            }
        }
        if (!bl3) {
            e3.f();
        }
        GL11.glPopMatrix();
    }

    public static void a(fG fG2, double d3, double d4, double d5) {
        pe_0.a(fG2, d3, d4, d5, false);
    }

    public static void a(int n6, double d3, double d4, double d5) {
        if (n6 < 1) {
            return;
        }
        pe_0.a(fG.a(fk_0.a(n6)), d3, d4, d5);
    }

    public static void b(double d3, double d4, double d5, double d6, Color color) {
        pe_0.a((float)d3, (float)d4, (float)d5, (float)d6, color, 0.0, null);
    }

    public static void a(float f10, float f11, float f12, float f13, Color color, double d3, Color color2) {
        f10 -= f13 / 2.0f;
        f11 -= f13 / 2.0f;
        float f14 = f12 += f13;
        float f15 = f12;
        if (color2 != null) {
            pe_0.a(color2);
            double d4 = (double)(f10 + f14 / 2.0f) - d3 / 2.0;
            pe_0.a(d4, (double)f11, d3, (double)f12, color2);
        }
        e.c();
        pe_0.b();
        e.b(f12 / 2.0f);
        e.a(f13);
        e.a(f10 + f14 / 2.0f, f11 + f15 / 2.0f);
        pe_0.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f14, f11);
        a.a(f10 + f14, f11 + f15);
        a.a(f10, f11 + f15);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
        e.d();
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, Color color) {
        f10 -= f14 / 2.0f;
        f11 -= f14 / 2.0f;
        float f15 = f12 += f14;
        float f16 = f12;
        g.c();
        g.b(f12 / 2.0f, f13);
        g.a(f14);
        g.a(f10 + f15 / 2.0f, f11 + f16 / 2.0f);
        pe_0.b();
        pe_0.a(color);
        a.c();
        a.a(f10, f11);
        a.a(f10 + f15, f11);
        a.a(f10 + f15, f11 + f16);
        a.a(f10, f11 + f16);
        a.a();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        pe_0.a();
        g.d();
    }

    public static void b(double d3, double d4, double d5, float f10, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            e3.r();
        }
        if (bl2) {
            e3.j();
        }
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)(d3 + d5), (double)d4);
        GL11.glEnd();
        if (bl2) {
            e3.p();
        }
        if (!bl) {
            e3.f();
        }
    }

    public static void a(double d3, double d4, double d5, float f10, Color color) {
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            e3.r();
        }
        if (bl2) {
            e3.j();
        }
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)3);
        GL11.glVertex2f((float)((float)d3), (float)((float)d4));
        GL11.glVertex2f((float)((float)d3), (float)((float)(d4 + d5)));
        GL11.glEnd();
        if (bl2) {
            e3.p();
        }
        if (!bl) {
            e3.f();
        }
    }

    public static void d() {
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        GL11.glPushMatrix();
        GL11.glGetFloat((int)2983, (FloatBuffer)j);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)d0_02.g(), (double)d0_02.h(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    public static void c() {
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glLoadMatrix((FloatBuffer)j);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPopMatrix();
    }

    public static void a(double d3, double d4, double d5, double d6, double d7, double d8, Color color) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2881);
        GL11.glPushMatrix();
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glBegin((int)6);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d7, (double)d8);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glDisable((int)2881);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    static {
        a.a(8, 7, 2);
        h.a(40, 7, 2);
        b = new lp_0();
        d = new mg();
        e = new lv_0();
        g = new lP();
        k = new lD();
        j = BufferUtils.createFloatBuffer((int)16);
    }
}

