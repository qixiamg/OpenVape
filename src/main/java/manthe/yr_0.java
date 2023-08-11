/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

/*
 * Renamed from manthe.yr
 */
public class yr_0
extends yc_0 {
    private final z2 v = (z2)this.S();
    private zO w;

    public yr_0(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kx_0 kx_02) {
        ds_2.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d3 = this.v.E.m();
        double d4 = this.v.E.n();
        double d5 = this.v.E.j();
        if (this.w == null) {
            this.w = on.p.H().b(zO.class);
        }
        for (Object e10 : ds_2.t().k()) {
            Color color;
            ex_0 ex_02 = new ex_0(e10);
            if (on.p.t().b(ex_02) && this.v.z.u().booleanValue() || (color = this.v.a(e10)) == null) continue;
            double d6 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)kx_02.getTicks();
            double d7 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)kx_02.getTicks();
            double d8 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)kx_02.getTicks();
            float f10 = ex_02.r() + (this.v.M.u() != false ? this.w.S() : 0.0f);
            fP fP2 = ex_02.s();
            fP fP3 = fP2.d(f10, f10, f10);
            ac_1.a(d6 - (fP3.f() - fP3.h()) / 2.0, d7 + (fP3.l() - ex_02.l()), d8 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, color, null, d3, d4, d5);
            if (!(this.w.S() > 0.0f) || !this.v.M.u().booleanValue() || !this.v.I.u().booleanValue()) continue;
            fP3 = fP2.d(ex_02.r(), ex_02.r(), ex_02.r());
            Color color2 = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue(), 70);
            ac_1.a(d6 - (fP3.f() - fP3.h()) / 2.0, d7 - (fP3.l() - ex_02.l()), d8 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, color2, null, d3, d4, d5);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }
}

