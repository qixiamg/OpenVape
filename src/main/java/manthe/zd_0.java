/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.zd
 */
public class zd_0
extends Module {
    private final ColorValue w = ColorValue.createValue((Object)this, "Color", new Color(255, 0, 0));
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Show Distance", false, "Renders the distance next to the arrow.");
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Scale Opacity", false, "Lowers the opacity the farther they are.");
    private final DF v = DF.a((Object)this, "Radius Scale", "#.##", "x", 0.0, 0.5, 1.0, 0.05);
    private final Map<ex_0, double[]> x = new HashMap<ex_0, double[]>();

    public zd_0() {
        super("Arrows", 14223934, CQ.d, "Draws arrows on screen when entities\nare out of your field of view.");
        this.a(this.w, this.v, this.y, this.u);
    }

    public boolean a(ex_0 ex_02) {
        if (Cp.e()) {
            return false;
        }
        if (!ex_02.a(A5.cc)) {
            return false;
        }
        if (ex_02.a(A5.u)) {
            return false;
        }
        eC eC2 = new eC(ex_02.a());
        if (on.p.t().b((ex_0)eC2)) {
            return false;
        }
        if (on.p.t().a((ex_0)eC2)) {
            return false;
        }
        return !on.p.N().c(eC2.S());
    }

    @Override
    public void a(kx_0 kx_02) {
        this.x.clear();
        ef_0 ef_02 = ds_2.r();
        for (Object e10 : ds_2.t().k()) {
            ex_0 ex_02 = new ex_0(e10);
            if (!this.a(ex_02)) continue;
            double d3 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)kx_02.getTicks() - ef_02.m();
            double d4 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)kx_02.getTicks() - ef_02.n();
            double d5 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)kx_02.getTicks() - ef_02.j();
            double[] dArray = ac_1.a(d3, d4, d5);
            this.x.put(ex_02, dArray);
        }
    }

    @Override
    public void t() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || eJ2.i().e()) {
            return;
        }
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        float f10 = (float)d0_02.g() / 2.0f;
        float f11 = (float)d0_02.h() / 2.0f;
        o7.a(Color.WHITE, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        dr_1 dr_12 = ds_2.m();
        for (ex_0 ex_02 : this.x.keySet()) {
            Color color;
            Object object;
            int n6;
            double[] dArray = this.x.get(ex_02);
            double d3 = dArray[0];
            double d4 = (double)ds_2.H() - dArray[1];
            if (dArray[2] < 1.0 && this.a(d3 / (double)d0_02.f(), d4 / (double)d0_02.f(), d0_02)) continue;
            float f12 = this.a(f10, d3 / (double)d0_02.f(), f11, d4 / (double)d0_02.f()) + (float)(dArray[2] > 1.0 ? 180 : 0);
            double d5 = (double)f10 * this.v.a();
            double d6 = (double)f11 * this.v.a();
            double d7 = Math.sqrt(1.0 / (1.0 / (d5 * d5) + Math.pow(Math.tan(Math.toRadians(f12)), 2.0) / (d6 * d6)));
            double d8 = Math.tan(Math.toRadians(f12)) * d7;
            float f13 = Y.a(f12 + 90.0f);
            if (f13 < 0.0f) {
                d7 = -d7;
                if (f13 > -180.0f) {
                    d8 = -d8;
                }
            }
            if ((n6 = (int)((double)eJ2.a(ex_02) * 1.5)) > 255) {
                n6 = 255;
            }
            if (this.y.u().booleanValue() && n6 < 255) {
                GL11.glPushMatrix();
                object = (int)eJ2.a(ex_02) + "m";
                GL11.glTranslated((double)(d7 + (double)((float)d0_02.g() / 2.0f)), (double)(d8 + (double)((float)d0_02.h() / 2.0f)), (double)0.0);
                GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
                e3.r();
                color = new Color(255, 255, 255, 255 - (this.u.u() != false ? n6 : 0));
                dr_12.d((String)object, (double)((float)(-dr_12.c((String)object)) / 2.0f), -dr_12.a((String)object), yI.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                e3.f();
                GL11.glPopMatrix();
            }
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d7 + (double)((float)d0_02.g() / 2.0f)), (double)(d8 + (double)((float)d0_02.h() / 2.0f)), (double)0.0);
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.375, (double)0.5, (double)0.0);
            object = this.w.K();
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - (this.u.u() != false ? n6 : 0));
            k9.a(color, -16.0f, 0.0f, "exo", 1.0f, false);
            GL11.glPopMatrix();
        }
        this.x.clear();
    }

    private boolean a(double d3, double d4, d0_0 d0_02) {
        return d3 > 0.0 && d4 > 0.0 && d3 < (double)d0_02.g() && d4 < (double)d0_02.h();
    }

    private float a(double d3, double d4, double d5, double d6) {
        return (float)Math.toDegrees(Math.atan2(d6 - d5, d4 - d3));
    }
}

