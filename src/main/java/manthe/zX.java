/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

public class zX
extends Module {
    private final List<Object> w;
    private final AO u = new AO();
    private final ef_0 v;

    public zX() {
        super("PropHunt", 0, 15962879, CQ.h, "Renders where all the hidden props are.");
        this.w = new CopyOnWriteArrayList<Object>();
        this.v = ds_2.r();
    }

    @Override
    public void a(kF kF2) {
        f8 f82;
        g1 g12;
        fn_0 fn_02 = kF2.getPacket();
        if (fn_02.a(A5.bI) && (g12 = (f82 = new f8(fn_02.a())).g()).h() >= -30000000 && g12.g() >= -30000000 && g12.h() < 30000000 && g12.g() < 30000000 && g12.f() >= 0 && g12.f() < 256 && !this.w.contains(g12.a()) && this.w.size() < 1024) {
            this.w.add(g12.a());
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        double d3;
        double d4;
        double d5;
        cy_0 cy_02;
        if (this.u.a(2000L)) {
            this.u.d();
            this.w.clear();
        }
        ds_2.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d6 = this.v.m();
        double d7 = this.v.n();
        double d8 = this.v.j();
        for (Object object : ds_2.t().k()) {
            cy_02 = new ex_0(object);
            if (!cy_02.a(A5.b5)) continue;
            d5 = ((ex_0)cy_02).T() + (((ex_0)cy_02).z() - ((ex_0)cy_02).T()) * (double)kx_02.getTicks();
            d4 = ((ex_0)cy_02).R() + (((ex_0)cy_02).l() - ((ex_0)cy_02).R()) * (double)kx_02.getTicks();
            d3 = ((ex_0)cy_02).X() + (((ex_0)cy_02).g() - ((ex_0)cy_02).X()) * (double)kx_02.getTicks();
            float f10 = ((ex_0)cy_02).r();
            fP fP2 = ((ex_0)cy_02).s();
            fP fP3 = fP2.d(f10, f10, f10);
            Color color = new Color(0x23FFFFFF, true);
            ac_1.a(d5 - (fP3.f() - fP3.h()) / 2.0, d4 + (fP3.l() - ((ex_0)cy_02).l()), d3 - (fP3.j() - fP3.i()) / 2.0, fP3.j() - fP3.i(), fP3.g() - fP3.l(), fP3.f() - fP3.h(), 0.1, Color.WHITE, color, d6, d7, d8);
        }
        for (Object object : this.w) {
            cy_02 = new g1(object);
            d5 = ((gf_0)cy_02).h();
            d4 = ((gf_0)cy_02).f();
            d3 = ((gf_0)cy_02).g();
            Color color = new Color(603914752, true);
            ac_1.a(d5, d4, d3, 1.0, 1.0, 1.0, 0.1, Color.RED, color, d6, d7, d8);
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

