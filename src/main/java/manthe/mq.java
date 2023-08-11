/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.ds_2;
import manthe.e3;
import manthe.pe_0;
import manthe.zu_0;
import org.lwjgl.opengl.GL11;

public class mq {
    private static int e = 0;
    private final int f;
    private final int c;
    private final int d;
    private static boolean b;

    public mq(String string, int n6) {
        this.f = n6;
        this.d = e++;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.c = string != null ? a.mf(this.d, n6, string) : 0;
    }

    public void a(String string, double d3, double d4, int n6, boolean bl) {
        if (zu_0.ag()) {
            double d5;
            double d6 = d5 = zu_0.T.aa.u() != false ? 1.0 : (double)ds_2.s().x();
            if (d5 == 0.0) {
                d5 = 3.0;
            }
            if (!bl) {
                d5 = 1.0;
            }
            int n10 = GL11.glGetInteger((int)32873);
            boolean bl2 = GL11.glIsEnabled((int)3042);
            boolean bl3 = GL11.glIsEnabled((int)3553);
            boolean bl4 = GL11.glIsEnabled((int)2896);
            boolean bl5 = GL11.glIsEnabled((int)3008);
            if (!bl2) {
                e3.r();
            }
            if (!bl3) {
                e3.p();
            }
            if (bl4) {
                e3.l();
            }
            if (!bl5) {
                e3.k();
            }
            if (n10 != this.c) {
                e3.b(this.c);
            }
            double d7 = 0.5 / d5;
            double d8 = 1.0 / d7;
            GL11.glScaled((double)d7, (double)d7, (double)d7);
            a.ds(this.d, string, d3 * d8, d4 * d8, n6);
            GL11.glScaled((double)d8, (double)d8, (double)d8);
            if (n10 != this.c) {
                e3.b(n10);
            }
            if (!bl5) {
                e3.i();
            }
            if (bl4) {
                e3.n();
            }
            if (!bl2) {
                e3.f();
            }
            if (!bl3) {
                e3.j();
            }
        } else {
            double d10;
            double d11 = d10 = zu_0.T.aa.u() != false ? 1.0 : (double)ds_2.s().x();
            if (d10 == 0.0) {
                d10 = 3.0;
            }
            pe_0.a(new Color(n6));
            if ((double)this.f >= 15.0 * d10) {
                ds_2.m().c(string, d3, d4, n6);
            } else {
                ds_2.m().a(string, d3, d4, n6, 0.5);
            }
        }
    }

    public void c(String string, double d3, double d4, int n6, boolean bl) {
        String string2 = "";
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[i];
            if (c2 == '\u00a7') {
                ++i;
                continue;
            }
            string2 = string2 + c2;
        }
        this.a(string2, d3, d4, n6, bl);
    }

    public void a(String string, double d3, double d4, Color color) {
        this.a(string, d3, d4, color.getRGB(), true);
    }

    public void c(String string, double d3, double d4, int n6) {
        this.a(string, d3, d4, n6, true);
    }

    public void a(String string, double d3, double d4, int n6) {
        if (zu_0.ag()) {
            this.c(string, d3 + 0.5, d4 + 0.5, Integer.MIN_VALUE, true);
            this.a(string, d3, d4, n6, true);
        } else {
            ds_2.m().d(string, d3, d4, n6);
        }
    }

    public void b(String string, double d3, double d4, int n6, boolean bl) {
        if (zu_0.ag()) {
            this.c(string, d3 + 0.5, d4 + 0.5, Integer.MIN_VALUE, bl);
            this.a(string, d3, d4, n6, bl);
        } else {
            ds_2.m().d(string, d3, d4, n6);
        }
    }

    public void c(String string, double d3, double d4, Color color) {
        if (zu_0.ag()) {
            this.c(string, d3 + 0.5, d4 + 0.5, Integer.MIN_VALUE, true);
            this.a(string, d3, d4, color);
        } else {
            ds_2.m().d(string, d3, d4, color);
        }
    }

    public double a(String string) {
        return this.a(string, true);
    }

    public double a(String string, boolean bl) {
        if (zu_0.ag()) {
            int n6;
            int n10 = n6 = zu_0.T.aa.u() != false ? 1 : ds_2.s().x();
            if (n6 == 0) {
                n6 = 3;
            }
            if (!bl) {
                n6 = 1;
            }
            if (string.equals("")) {
                return 0.0;
            }
            return a.gsh(this.d, string) / (double)(2 * n6);
        }
        return ds_2.m().b(string) / 2;
    }

    public double b(String string, boolean bl) {
        int n6;
        int n10 = n6 = zu_0.T.aa.u() != false ? 1 : ds_2.s().x();
        if (n6 == 0) {
            n6 = 3;
        }
        if (!bl) {
            n6 = 1;
        }
        if (zu_0.ag()) {
            return a.gsw(this.d, string) / (double)(2 * n6);
        }
        int n11 = ds_2.m().c(string);
        if (this.f < 16 * n6) {
            n11 = (int)((double)n11 * 0.5);
        }
        return n11;
    }

    public double b(String string) {
        return this.b(string, true);
    }

    public void b(String string, double d3, double d4, int n6) {
        this.a(string, d3 - this.b(string) / 2.0, d4, n6, true);
    }

    public void b(String string, double d3, double d4, Color color) {
        this.b(string, d3, d4, color.getRGB());
    }

    public void d(String string, double d3, double d4, Color color) {
        if (zu_0.ag()) {
            this.b(string, d3 + 0.5, d4 + 0.5, Integer.MIN_VALUE);
            this.b(string, d3, d4, color);
        } else {
            this.c(string, d3 - this.b(string) / 2.0, d4, color);
        }
    }

    public int b() {
        return this.d;
    }

    public int a() {
        return this.f;
    }

    static {
        mq.b(true);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    public static boolean d() {
        boolean bl = mq.c();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

