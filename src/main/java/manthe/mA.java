/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;

public class mA {
    public double[] a;
    private DoubleBuffer c;
    private int d;
    private int f = 2;
    private int b = 7;
    private int e = -1;

    public void a(int n6, int n10) {
        this.a(n6, n10, 3);
    }

    public void a(int n6, int n10, int n11) {
        this.d = n6;
        this.b = n10;
        this.f = n11;
        this.a = new double[n6 * this.f];
        this.c = BufferUtils.createFloatBuffer((int) (n6 * this.f));
    }

    public void b() {
        GL11.glEnableClientState((int) 32884);
        GL11.glVertexPointer((int) this.f, (int) 0, (FloatBuffer) this.c);
        GL11.glDrawArrays((int) this.b, (int) 0, (int) this.d);
        GL11.glDisableClientState((int) 32884);
        this.e = 0;
    }

    public void c() {
        this.e = 0;
        this.a = new double[this.d * this.f];
        this.c.clear();
    }

    public void a() {
        this.c.put(this.a);
        this.c.flip();
        this.b();
    }

    public void a(float f10, float f11) {
        this.a[this.e++] = f10;
        this.a[this.e++] = f11;
    }

    public void a(double d3, double d4, double d5) {
        this.a[this.e++] = (float) d3;
        this.a[this.e++] = (float) d4;
        this.a[this.e++] = (float) d5;
    }
}

