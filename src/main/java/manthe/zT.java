/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.ColorValue;

public class zT
extends Module {
    private final ef_0 w;
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Ghost Bow Charge", false, "Draws a ghost trajectory of a fully charged\nshot when not pulling back bow");
    private final ColorValue x = ColorValue.createValue((Object)this, "Trajectory Color", 128.0);
    private final ColorValue u = ColorValue.createValue((Object)this, "Target Color", 64.0);

    public zT() {
        super("Trajectories", -16535661, CQ.d, "Shows a path of where your projectile will land\nTarget Color will only be used on the cross if there is an entity intersecting it");
        this.a(this.x, this.u, this.v);
        this.w = ds_2.r();
    }

    public List a(fP fP2) {
        ArrayList arrayList = new ArrayList();
        int n6 = Y.c((fP2.f() - 2.0) / 16.0);
        int n10 = Y.c((fP2.h() + 2.0) / 16.0);
        int n11 = Y.c((fP2.j() - 2.0) / 16.0);
        int n12 = Y.c((fP2.i() + 2.0) / 16.0);
        gO gO2 = ds_2.t();
        for (int i = n6; i <= n10; ++i) {
            for (int j = n11; j <= n12; ++j) {
                if (!gO2.f().a(i, j)) continue;
                gO2.a(i, j).a(ds_2.k(), fP2, arrayList, null);
            }
        }
        return arrayList;
    }

    @Override
    public void a(kx_0 kx_02) {
        boolean bl = false;
        eJ eJ2 = ds_2.k();
        if (eJ2.a_().d()) {
            fk_0 fk_02 = eJ2.a_().k();
            if (!(fk_02.a(A5.cZ) || fk_02.a(A5.be) || fk_02.a(A5.an) || fk_02.a(A5.dt))) {
                return;
            }
            if (fk_02.a(A5.cZ)) {
                bl = true;
            }
        } else {
            return;
        }
        double d3 = this.w.m() - (double)(Y.d(eJ2.U() / 180.0f * (float)Math.PI) * 0.16f);
        double d4 = this.w.n() + (double)eJ2.am() - (double)0.1f;
        double d5 = this.w.j() - (double)(Y.f(eJ2.U() / 180.0f * (float)Math.PI) * 0.16f);
        double d6 = (double)(-Y.f(eJ2.U() / 180.0f * (float)Math.PI) * Y.d(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d7 = (double)(-Y.f(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        double d8 = (double)(Y.d(eJ2.U() / 180.0f * (float)Math.PI) * Y.d(eJ2.K() / 180.0f * (float)Math.PI)) * (bl ? 1.0 : 0.4);
        boolean bl2 = false;
        int n6 = 40;
        if (!this.v.u().booleanValue() && eJ2.bb() <= 0 && bl) {
            return;
        }
        if (eJ2.bb() > 0 && bl) {
            n6 = eJ2.bb();
            bl2 = true;
        }
        int n10 = 72000 - n6;
        float f10 = (float)n10 / 20.0f;
        if ((double)(f10 = (f10 * f10 + f10 * 2.0f) / 3.0f) < 0.1) {
            return;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        L l6 = this.x.K();
        Color color = new Color(((Color)l6).getRed(), ((Color)l6).getGreen(), ((Color)l6).getBlue(), bl2 || !bl ? 255 : 100);
        o7.a(color);
        GL11.glPushMatrix();
        ds_2.M().a(0.0);
        boolean bl3 = GL11.glIsEnabled((int)2929);
        boolean bl4 = GL11.glIsEnabled((int)3553);
        boolean bl5 = GL11.glIsEnabled((int)3042);
        if (bl3) {
            GL11.glDisable((int)2929);
        }
        if (bl4) {
            GL11.glDisable((int)3553);
        }
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl5) {
            GL11.glEnable((int)3042);
        }
        float f11 = Y.e(d6 * d6 + d7 * d7 + d8 * d8);
        d6 /= (double)f11;
        d7 /= (double)f11;
        d8 /= (double)f11;
        d6 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        d7 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        d8 *= (double)(bl ? f10 * 2.0f : 1.0f) * 1.5;
        GL11.glLineWidth((float)1.5f);
        GL11.glBegin((int)3);
        boolean bl6 = false;
        boolean bl7 = false;
        gb_0 gb_02 = new gb_0(null);
        float f12 = (float)(bl ? 0.3 : 0.25);
        for (int i = 0; i <= 100 && !bl6; ++i) {
            gK gK2 = gK.b(d3, d4, d5);
            gK gK3 = gK.b(d3 + d6, d4 + d7, d5 + d8);
            gb_0 gb_03 = ds_2.t().a(gK2, gK3, false, true, false);
            gK2 = gK.b(d3, d4, d5);
            gK3 = gK.b(d3 + d6, d4 + d7, d5 + d8);
            if (gb_03.d()) {
                bl6 = true;
                gb_02 = gb_03;
            }
            fP fP2 = fP.a(d3 - (double)f12, d4 - (double)f12, d5 - (double)f12, d3 + (double)f12, d4 + (double)f12, d5 + (double)f12);
            List list = this.a(fP2.e(d6, d7, d8).d(1.0, 1.0, 1.0));
            for (int j = 0; j < list.size(); ++j) {
                ex_0 ex_02 = new ex_0(list.get(j));
                if (!ex_02.V() || ex_02 == eJ2) continue;
                float f13 = 0.3f;
                fP fP3 = ex_02.s().d(0.3f, 0.3f, 0.3f);
                gb_0 gb_04 = fP3.a(gK2, gK3);
                if (!gb_04.d()) continue;
                bl6 = true;
                bl7 = true;
                gb_02 = gb_04;
            }
            if (bl7) {
                o7.a(this.u.K());
            }
            d3 += d6;
            d4 += d7;
            d5 += d8;
            float f14 = 0.99f;
            d6 *= (double)f14;
            d7 *= (double)f14;
            d8 *= (double)f14;
            d7 -= bl ? 0.05 : 0.03;
            GL11.glVertex3d((double)(d3 - this.w.m()), (double)(d4 - this.w.n()), (double)(d5 - this.w.j()));
        }
        GL11.glEnd();
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glTranslated((double)(d3 - this.w.m()), (double)(d4 - this.w.n()), (double)(d5 - this.w.j()));
        if (gb_02.d()) {
            switch (gb_02.f()) {
                case 2: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
                case 5: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
            }
            if (bl7) {
                o7.a(this.u.K());
            }
        }
        this.S();
        GL11.glDisable((int)2848);
        if (bl3) {
            GL11.glEnable((int)2929);
        }
        if (bl4) {
            GL11.glEnable((int)3553);
        }
        if (!bl5) {
            GL11.glDisable((int)3042);
        }
        ds_2.M().b(0.0);
        GL11.glPopMatrix();
    }

    public boolean a(fP fP2, dj_0 dj_02) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        if (!ds_2.t().b(n6, n11, n13, n10, n12, n14)) {
            return false;
        }
        boolean bl = false;
        gK.b(0.0, 0.0, 0.0);
        for (int i = n6; i < n10; ++i) {
            for (int j = n11; j < n12; ++j) {
                for (int k = n13; k < n14; ++k) {
                    double d3;
                    dx_2 dx_22 = ds_2.t().b(i, j, k);
                    if (!dx_22.d() || dx_22.h() != dj_02 || !((double)n12 >= (d3 = (double)((float)(j + 1) - dc_1.a(ds_2.t().c(i, j, k)))))) continue;
                    bl = true;
                }
            }
        }
        return bl;
    }

    public void S() {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)-0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)-0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.25, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.25);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glEnd();
    }
}

