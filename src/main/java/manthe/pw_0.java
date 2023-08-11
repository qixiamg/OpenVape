/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.HashMap;
import manthe.cm_1;
import manthe.ds_2;
import manthe.eN;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.pw
 */
public final class pw_0 {
    private static final pw_0 c = new pw_0();
    private final HashMap<Integer, cm_1> a = new HashMap();
    private int d = 1;
    private boolean b;

    public static pw_0 b() {
        return c;
    }

    public static void j() {
        eN eN2 = ds_2.w();
        if (eN2.d() && eN2.f() > -1) {
            pw_0.a(eN2);
            eN2.a(-1);
        }
    }

    public static void a(eN eN2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)eN2.f());
        int n6 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n6);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)ds_2.F(), (int)ds_2.H());
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n6);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n6);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void e() {
        if (this.d == 1) {
            GL11.glClearStencil((int)0);
            GL11.glClear((int)1024);
        }
        GL11.glEnable((int)2960);
        ++this.d;
        if (this.d > this.k()) {
            System.out.println("StencilUtil: Reached maximum amount of layers!");
            this.d = 1;
        }
    }

    public void i() {
        if (this.d == 1) {
            System.out.println("StencilUtil: No layers found!");
            return;
        }
        --this.d;
        if (this.d == 1) {
            GL11.glDisable((int)2960);
        } else {
            cm_1 cm_12 = this.a.remove(this.d);
            if (cm_12 != null) {
                cm_12.a();
            }
        }
    }

    public void c() {
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        this.a.clear();
        this.d = 1;
    }

    public void a() {
        this.a(new cm_1(this, this.b ? 519 : 512, this.d, this.k(), 7681, 7680, 7680));
    }

    public void b(boolean bl) {
        this.a(new cm_1(this, this.b ? 519 : 512, bl ? this.d : this.d - 1, this.k(), 7681, 7681, 7681));
    }

    public void f() {
        this.a(new cm_1(this, 517, this.d, this.k(), 7680, 7680, 7680));
    }

    public void g() {
        this.a(new cm_1(this, 514, this.d, this.k(), 7680, 7680, 7680));
    }

    public cm_1 l() {
        return this.a.get(this.d);
    }

    public void a(cm_1 cm_12) {
        GL11.glStencilFunc((int)cm_1.a, (int)cm_1.d, (int)cm_1.e);
        GL11.glStencilOp((int)cm_1.b, (int)cm_1.f, (int)cm_1.c);
        this.a.put(this.d, cm_12);
    }

    public int h() {
        return this.d;
    }

    public int d() {
        return GL11.glGetInteger((int)3415);
    }

    public int k() {
        return (int)(Math.pow(2.0, this.d()) - 1.0);
    }

    public void a(double d3, double d4, double d5) {
        GL11.glBegin((int)6);
        for (int i = 0; i <= 360; ++i) {
            double d6 = Math.sin((double)i * Math.PI / 180.0) * d5;
            double d7 = Math.cos((double)i * Math.PI / 180.0) * d5;
            GL11.glVertex2d((double)(d3 + d6), (double)(d4 + d7));
        }
        GL11.glEnd();
    }

    public void a(double d3, double d4, double d5, double d6) {
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d3, (double)d6);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glVertex2d((double)d5, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
    }
}

