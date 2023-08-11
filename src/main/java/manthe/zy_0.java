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
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.zy
 */
public class zy_0
extends Module {
    private final ef_0 u;
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Outline open", true, "Outlines open chests by contrasting color");
    private final BooleanValue E = BooleanValue.createValue(this, "Render Chests", true);
    private final BooleanValue w = BooleanValue.createValue(this, "Render Trapped Chests", true);
    private final BooleanValue K = BooleanValue.createValue(this, "Render Enderchests", false);
    private final BooleanValue C = BooleanValue.createValue(this, "Render Hopper", false);
    private final BooleanValue G = BooleanValue.createValue(this, "Render Furnace", false);
    private final BooleanValue v = BooleanValue.createValue(this, "Render Dispenser", false);
    private final BooleanValue B = BooleanValue.createValue(this, "Render Dropper", false);
    private final BooleanValue D = BooleanValue.createValue(this, "Render Shulker", false);
    private final ColorValue J = ColorValue.createValue((Object)this, "Chest Color", new Color(1, 255, 146, 100));
    private final ColorValue y = ColorValue.createValue((Object)this, "Chest Color", new Color(255, 0, 0, 100));
    private final ColorValue F = ColorValue.createValue((Object)this, "Ender Chest Color", new Color(126, 21, 156, 100));
    private final ColorValue A = ColorValue.createValue((Object)this, "Hopper Color", new Color(-7697782));
    private final ColorValue I = ColorValue.createValue((Object)this, "Furnace Color", new Color(-10855846));
    private final ColorValue x = ColorValue.createValue((Object)this, "Dispenser Color", new Color(1, 20, 200, 100));
    private final ColorValue L = ColorValue.createValue((Object)this, "Dropper Color", new Color(70, 200, 200, 100));
    private final ColorValue z = ColorValue.createValue((Object)this, "Shulker Color", new Color(255, 255, 255, 100));

    public zy_0() {
        super("StorageESP", 3465010, CQ.d);
        this.E.a(new BasicValue[]{this.J});
        this.w.a(new BasicValue[]{this.y});
        this.K.a(new BasicValue[]{this.F});
        this.C.a(new BasicValue[]{this.A});
        this.G.a(new BasicValue[]{this.I});
        this.v.a(new BasicValue[]{this.x});
        this.B.a(new BasicValue[]{this.L});
        this.D.a(new BasicValue[]{this.z});
        this.a(this.H, this.E, this.J, this.w, this.y, this.K, this.F, this.C, this.A, this.G, this.I, this.v, this.x, this.B, this.L, this.D, this.z);
        this.u = ds_2.r();
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
        double d3 = this.u.m();
        double d4 = this.u.n();
        double d5 = this.u.j();
        for (Object e10 : ds_2.t().h()) {
            Object object;
            Color color = null;
            fT fT2 = null;
            if ((this.E.u().booleanValue() || this.w.u().booleanValue()) && A5.N.isInstance(e10)) {
                object = new f6(e10);
                int n6 = ((f6)object).l();
                if (this.E.u().booleanValue() && n6 == 0) {
                    color = this.J.K();
                    fT2 = object;
                }
                if (this.w.u().booleanValue() && n6 == 1) {
                    color = this.y.K();
                    fT2 = object;
                }
            } else if (this.K.u().booleanValue() && A5.dN.isInstance(e10)) {
                color = this.F.K();
                fT2 = new fY(e10);
            } else if (this.C.u().booleanValue() && A5.du.isInstance(e10)) {
                color = this.A.K();
            } else if (this.G.u().booleanValue() && A5.d2.isInstance(e10)) {
                color = this.I.K();
            } else if (this.B.u().booleanValue() && A5.aK.equals(e10.getClass())) {
                color = this.L.K();
            } else if (this.v.u().booleanValue() && A5.cE.equals(e10.getClass())) {
                color = this.x.K();
            } else if (V.c() >= 23 && this.D.u().booleanValue() && A5.bZ.isInstance(e10)) {
                color = this.z.K();
            }
            if (color == null) continue;
            if (fT2 == null) {
                fT2 = new fT(e10);
            }
            color = new Color(((Color)color).getRed(), ((Color)color).getGreen(), ((Color)color).getBlue(), 100);
            if (fT2 instanceof f6) {
                f6 f62 = (f6)fT2;
                object = this.H.u().booleanValue() ? new tW(fT2.f(), fT2.g(), fT2.h(), -1, color, f62.j()) : new tV(fT2.f(), fT2.g(), fT2.h(), -1, color);
            } else if (fT2 instanceof fY) {
                fT fT3 = fT2;
                object = new tW(fT2.f(), fT2.g(), fT2.h(), -1, color, ((fY)fT3).k());
            } else {
                object = new tV(fT2.f(), fT2.g(), fT2.h(), -1, color);
            }
            ac_1.a(d3, d4, d5, (tV)object);
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

