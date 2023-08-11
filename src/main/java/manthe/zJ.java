/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Sphere
 */
package manthe;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;
import rip.vape.module.Module;

public class zJ
extends Module {
    public BooleanValue u = BooleanValue.createValue((Object)this, "Blast ring", true, "Shows the blast radius where blocks will be broken");

    public zJ() {
        super("Explosions", 11534100, CQ.d, "Shows the explosion radius of TNT");
        this.a(this.u);
    }

    @Override
    public void a(kx_0 kx_02) {
        ef_0 ef_02 = ds_2.r();
        double d3 = ef_02.m();
        double d4 = ef_02.n();
        double d5 = ef_02.j();
        boolean bl = GL11.glIsEnabled((int)3042);
        double d6 = 4.0;
        double d7 = 8.0;
        for (Object e10 : ds_2.t().k()) {
            Sphere sphere;
            if (!A5.bl.isAssignableFrom(e10.getClass())) continue;
            es_0 es_02 = new es_0(e10);
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            float f10 = kx_02.getTicks();
            double d8 = es_02.T() + (es_02.z() - es_02.T()) * (double)f10;
            double d10 = es_02.R() + (es_02.l() - es_02.R()) * (double)f10;
            double d11 = es_02.X() + (es_02.g() - es_02.X()) * (double)f10;
            double d12 = ds_2.k().a(d8, d10, d11);
            GL11.glTranslated((double)(d8 - d3), (double)(d10 - d4), (double)(d11 - d5));
            float f11 = ((float)(es_02.at() % 5) - f10 + 1.0f) / 5.0f;
            float f12 = es_02.at() / 5 % 2 == 0 ? 1.0f : f11 * f11;
            int n6 = Math.max(Math.min((int)(255.0f * f12), 255), 0);
            if (this.u.u().booleanValue()) {
                o7.a(255, 255, 0, (int)((float)n6 * 0.75f));
                sphere = new Sphere();
                sphere.setDrawStyle(100011);
                sphere.draw((float)d6, 24, 24);
            }
            o7.a(255, 0, 0, (int)((float)n6 * 0.4f));
            sphere = new Sphere();
            sphere.setDrawStyle(100012);
            sphere.setOrientation(d12 < d7 ? 100021 : 100020);
            sphere.draw((float)d7, 32, 32);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
        }
        if (bl) {
            GL11.glEnable((int)3042);
        }
    }
}

