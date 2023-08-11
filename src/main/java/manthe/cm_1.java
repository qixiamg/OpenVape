/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.pw_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.cm
 */
public class cm_1 {
    public static int a;
    public static int d;
    public static int e;
    public static int b;
    public static int f;
    public static int c;

    public cm_1(pw_0 pw_02, int n6, int n10, int n11, int n12, int n13, int n14) {
        a = n6;
        d = n10;
        e = n11;
        b = n12;
        f = n13;
        c = n14;
    }

    public void a() {
        GL11.glStencilFunc((int)a, (int)d, (int)e);
        GL11.glStencilOp((int)b, (int)f, (int)c);
    }
}

