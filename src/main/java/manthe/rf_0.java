/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.c7;
import manthe.o7;
import manthe.qp;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.rf
 */
public class rf_0
extends qp
implements c7 {
    private boolean H;
    private double G = 0.0;
    private static String F;

    public rf_0(boolean bl) {
        this.H = bl;
    }

    @Override
    public void c(boolean bl) {
        if (this.e() && this.H) {
            GL11.glPushMatrix();
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            o7.a(this.f(), this);
            if (this.G > 0.0) {
                o7.a(this.P() != null ? this.P() : this.n(), this.G, this, 4);
            }
            GL11.glEnable((int)3553);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
            GL11.glPopMatrix();
        }
        super.c(bl);
    }

    public void g(boolean bl) {
        this.H = bl;
    }

    public void e(double d3) {
        this.G = d3;
    }

    public static void c(String string) {
        F = string;
    }

    public static String V() {
        return F;
    }

    static {
        if (rf_0.V() == null) {
            rf_0.c("Abrl7");
        }
    }
}

