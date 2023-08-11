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

public class yL
extends yc_0 {
    private final z2 v = (z2)this.S();

    public yL(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kq_0 kq_02) {
        eC eC2 = kq_02.getEntityPlayer();
        float f10 = 57.29578f;
        ef_0 ef_02 = ds_2.r();
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        ds_2.M().a(0.0);
        double d3 = ef_02.m();
        double d4 = ef_02.n();
        double d5 = ef_02.j();
        Color color = this.v.a(eC2.a());
        if (color != null) {
            el_0 el_02;
            d6_0 d6_02;
            if (on.p.t().b((ex_0)eC2) && this.v.z.u().booleanValue()) {
                return;
            }
            if (on.p.t().a((ex_0)eC2)) {
                color = Color.BLUE;
            }
            float f11 = ds_2.O().g();
            double d6 = eC2.T() + (eC2.z() - eC2.T()) * (double)f11 - d3;
            double d7 = eC2.R() + (eC2.l() - eC2.R()) * (double)f11 - d4;
            double d8 = eC2.X() + (eC2.g() - eC2.X()) * (double)f11 - d5;
            boolean bl = GL11.glIsEnabled((int)3042);
            GL11.glPushMatrix();
            GL11.glBlendFunc((int)770, (int)771);
            if (!bl) {
                GL11.glEnable((int)3042);
            }
            GL11.glBlendFunc((int)770, (int)771);
            o7.a(color);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3553);
            GL11.glTranslated((double)d6, (double)d7, (double)d8);
            ez_0 ez_02 = this.v.E.a(eC2);
            if (ez_02.a(A5.p) && (d6_02 = (el_02 = new el_0(ez_02.a())).g()).d() && d6_02.a(A5.bz)) {
                float f12 = ds_2.k().a(eC2);
                float f13 = 4.0f * ((100.0f - Math.min(f12, 100.0f)) / 100.0f);
                GL11.glLineWidth((float)f13);
                dy_1 dy_12 = new dy_1(d6_02.a());
                boolean bl2 = eC2.af();
                float f14 = bl2 ? 0.6f : 0.75f;
                GL11.glRotatef((float)eC2.aH(), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d10 = bl2 ? -0.2 : 0.0;
                GL11.glTranslated((double)-0.15, (double)f14, (double)d10);
                float f15 = dy_12.i().m() * f10;
                float f16 = dy_12.i().g() * f10;
                float f17 = dy_12.i().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f14), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.3, (double)0.0, (double)0.0);
                f15 = dy_12.h().m() * f10;
                f16 = dy_12.h().g() * f10;
                f17 = dy_12.h().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)(-f14), (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.15, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.15, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.15, (double)0.0, (double)0.0);
                GL11.glEnd();
                if (eC2.af()) {
                    GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)0.65, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)0.0, (double)0.65, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.35, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)-0.35, (double)0.0, (double)0.0);
                GL11.glEnd();
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                f15 = dy_12.k().m() * f10;
                f16 = dy_12.k().g() * f10;
                f17 = dy_12.k().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)0.7, (double)0.0, (double)0.0);
                f15 = dy_12.j().m() * f10;
                f16 = dy_12.j().g() * f10;
                f17 = dy_12.j().j() * f10;
                GL11.glRotatef((float)f15, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f16), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f17), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                GL11.glEnd();
                GL11.glRotatef((float)f17, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)f16, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-f15), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                GL11.glRotatef((float)(-eC2.aH()), (float)0.0f, (float)-999.0f, (float)0.0f);
                double d11 = 0.4;
                GL11.glRotated((double)eC2.U(), (double)0.0, (double)-999.0, (double)0.0);
                GL11.glRotated((double)eC2.K(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d11, (double)0.0);
                GL11.glEnd();
                GL11.glBegin((int)1);
                GL11.glVertex3d((double)0.0, (double)d11, (double)0.0);
                GL11.glVertex3d((double)0.0, (double)d11, (double)0.25);
                GL11.glEnd();
                GL11.glRotated((double)eC2.K(), (double)999.0, (double)0.0, (double)0.0);
                GL11.glRotated((double)(-eC2.U()), (double)0.0, (double)999.0, (double)0.0);
            }
            if (!bl) {
                GL11.glDisable((int)3042);
            }
            GL11.glEnable((int)3553);
            GL11.glDisable((int)2848);
            GL11.glEnable((int)2896);
            GL11.glPopMatrix();
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        ds_2.M().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }

    @Override
    public void a(kx_0 kx_02) {
    }
}

