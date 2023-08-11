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

public class zF
extends Module {
    private final ef_0 v;
    private final Color x = new Color(20, 20, 20, 128);
    private final DF w = DF.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private final BooleanValue y = BooleanValue.createValue(this, "Show distance", true);
    private final dp_0 u = dp_0.a((Object)this, "Spawner names-whitelist", "Spawners", dp_0.q, "Zombie", "Skeleton", "Creeper", "Spider");

    public zF() {
        super("SpawnerFinder", 9976573, CQ.d);
        this.v = ds_2.r();
        this.a(this.w, this.y, this.u);
    }

    @Override
    public void a(kx_0 kx_02) {
        boolean bl = GL11.glIsEnabled((int)3042);
        ds_2.M().a(1.0);
        GL11.glPushMatrix();
        if (!bl) {
            GL11.glEnable((int)3042);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d3 = this.v.m();
        double d4 = this.v.n();
        double d5 = this.v.j();
        eJ eJ2 = ds_2.k();
        for (Object e10 : ds_2.t().h()) {
            fv_0 fv_02;
            String string;
            if (!A5.br.isInstance(e10) || !this.u.d(string = (fv_02 = new fv_0(e10)).j().f())) continue;
            String string2 = "";
            if (this.y.u().booleanValue()) {
                String string3 = cb_0.v + "a[" + cb_0.v + "f" + (int)eJ2.a((double)fv_02.f(), (double)fv_02.g(), (double)fv_02.h()) + cb_0.v + "a]" + cb_0.v + "r";
                string2 = string2 + string3 + " ";
            }
            string2 = string2 + string + " spawner";
            ac_1.a(string2, (double)fv_02.f() - d3 + 0.5, (double)fv_02.g() - d4 - 1.0, (double)fv_02.h() - d5 + 0.5, this.w.a(), pf_0.b((ex_0)eJ2, (double)fv_02.f(), (double)fv_02.g(), fv_02.h()), -1, this.x, 1.4);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        if (!bl) {
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }
}

