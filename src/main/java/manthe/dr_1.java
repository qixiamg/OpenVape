/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.V;
import manthe.cy_0;
import manthe.gz_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.dR
 */
public class dr_1
extends cy_0 {
    public dr_1(Object object) {
        super(object);
    }

    public int d(String string, double d3, double d4, int n6) {
        if (V.c() > 13) {
            return dr_1.a.M().bC.a(this.b, string, (float)d3, (float)d4, n6);
        }
        return dr_1.a.M().bC.a(this.b, string, (int)d3, (int)d4, n6);
    }

    public int d(String string, double d3, double d4, Color color) {
        return this.d(string, d3, d4, color.getRGB());
    }

    public int c(String string, double d3, double d4, int n6) {
        return dr_1.a.M().bC.b(this.b, string, (int)d3, (int)d4, n6);
    }

    public int c(String string, double d3, double d4, Color color) {
        return this.c(string, d3, d4, color.getRGB());
    }

    public int a(String string, double d3, double d4, int n6, double d5) {
        double d6 = 1.0 / d5;
        GL11.glScaled((double)d5, (double)d5, (double)d5);
        int n10 = this.c(string, d3 * d6, d4 * d6, n6);
        GL11.glScaled((double)d6, (double)d6, (double)d6);
        return n10;
    }

    public int c(String string) {
        return dr_1.a.M().bC.a(this.b, string);
    }

    public int a(String string, double d3, double d4, int n6) {
        return this.c(string, (double)((int)d3 - this.c(string) / 2), (double)((int)d4), n6);
    }

    public int b(String string, double d3, double d4, int n6) {
        return this.d(string, d3 - (double)(this.c(string) / 2), d4, n6);
    }

    public int a(String string, double d3, double d4, Color color) {
        return this.a(string, d3, d4, color.getRGB());
    }

    public int b(String string, double d3, double d4, Color color) {
        return this.b(string, d3, d4, color.getRGB());
    }

    public int f() {
        return dr_1.a.M().bC.d(this.b);
    }

    public int h() {
        return this.f() / 2;
    }

    public gz_0 g() {
        return new gz_0(dr_1.a.M().bC.a(this.b));
    }

    public int b(String string) {
        return this.f();
    }

    public double a(String string) {
        return this.h();
    }

    public float a(Object object) {
        return dr_1.a.M().bC.c(object);
    }

    public float b(Object object) {
        return dr_1.a.M().bC.b(object);
    }

    public void c(Object object, float f10) {
        dr_1.a.M().bC.c(object, f10);
    }

    public void a(Object object, float f10) {
        dr_1.a.M().bC.a(object, f10);
    }

    public void b(Object object, float f10) {
        dr_1.a.M().bC.b(object, f10);
    }
}

