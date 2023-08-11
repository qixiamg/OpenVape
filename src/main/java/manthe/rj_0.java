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
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.rj
 */
public class rj_0
extends r1 {
    public final pb_0 ak = new pb_0("2D Radar");
    public final pb_0 ah = new pb_0("Text Radar");
    public final DX aj = DX.a((Object)this, "Mode", this.ak, this.ak, this.ah);
    public final DF at = DF.a((Object)this, "Radar Size", "#.#", "", 25.0, 110.0, 500.0, "The size of the radar.");
    public final DF aw = DF.a(this, "Dot Size", "#.#", "", 0.5, 3.0, 10.0, 0.1, "The size of the radar.");
    public final DF av = DF.a(this, "Radar Scale", "#.##", "", 0.1, 0.5, 5.0, 0.01, "The size of the radar.");
    public final DF aA = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 100.0, 5.0, "Maximum distance to show.\nUse 0 to ignore distance requirement.");
    public final DF ai = DF.a(this, "Max Shown", "#", "", 0.0, 25.0, 50.0, 1.0, "Maximum players to show at once.\nUse 0 to show all players.");
    public final pb_0 aC = new pb_0("Team");
    public final pb_0 ag = new pb_0("Custom");
    public final pb_0 am = new pb_0("Relationship");
    public final DX aB = DX.a((Object)this, "ColorMode1", "Color Mode", "", this.aC, this.aC, this.ag, this.am);
    public final pb_0 as = new pb_0("Circles");
    public final pb_0 ae = new pb_0("Squares");
    public final DX an = DX.a((Object)this, "DotStyle1", "Dot Style", "", this.as, this.as, this.ae);
    public final pb_0 ax = new pb_0("Square");
    public final pb_0 ay = new pb_0("Circle");
    public final DX au = DX.a((Object)this, "Radar Style", this.ax, this.ax, this.ay);
    public final ColorValue az = ColorValue.createValue((Object)this, "Custom Color", Color.WHITE);
    public final ColorValue ar = ColorValue.createValue((Object)this, "Friendly Color", Color.GREEN);
    public final ColorValue ap = ColorValue.createValue((Object)this, "Enemy Color", Color.RED);
    public final BooleanValue af = BooleanValue.createValue((Object)this, "Show Cross", true, "Render a center cross on the radar.");
    public final BooleanValue al = BooleanValue.createValue((Object)this, "Show Background", true, "Render a background behind the radar.");
    public final BooleanValue aq = BooleanValue.createValue((Object)this, "Clamp Radar", true, "Clamps dots to the given size and shape.");
    private static rj_0 ao;

    public rj_0() {
        super("Radar", true);
        this.f(false);
        this.m(true);
        this.aj.a(this.ak, this.at, this.av, this.aB, this.au, this.an, this.aw, this.af, this.aq);
        this.aj.a(this.ah, this.aA, this.ai);
        this.aB.a(this.ag, this.az);
        this.aB.a(this.am, this.ar, this.ap);
        this.ah().add((p1)this.aj.getDefaultValue());
        this.ah().add((p1)this.aB.getDefaultValue());
        this.ah().add((p1)this.az.getDefaultValue());
        this.ah().add((p1)this.ar.getDefaultValue());
        this.ah().add((p1)this.ap.getDefaultValue());
        this.ah().add((p1)this.au.getDefaultValue());
        this.ah().add((p1)this.an.getDefaultValue());
        this.ah().add((p1)this.aw.getDefaultValue());
        this.ah().add((p1)this.at.getDefaultValue());
        this.ah().add((p1)this.av.getDefaultValue());
        this.ah().add((p1)this.al.getDefaultValue());
        this.ah().add((p1)this.aA.getDefaultValue());
        this.ah().add((p1)this.ai.getDefaultValue());
        this.ah().add((p1)this.af.getDefaultValue());
        this.ah().add((p1)this.aq.getDefaultValue());
        this.c(130.0);
        this.b(20.0);
        this.n(true);
        this.l(false);
        ao = this;
    }

    @Override
    public void c() {
        super.c();
        if (this.aj.v() == this.ak) {
            this.c(130.0);
        } else {
            this.c(100.0);
        }
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.z() || !this.e()) {
            return;
        }
        mq mq2 = on.p.a(1.0);
        this.b(on.p.t().r.K());
        double d3 = this.aj().t();
        double d4 = this.aj().k() + (double)(bl ? -20 : 0);
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        if (gO2.e() || eJ2.e()) {
            return;
        }
        List list = gO2.j();
        if (this.aj.v() == this.ak) {
            boolean bl2;
            boolean bl3 = GL11.glIsEnabled((int)3042);
            double d5 = this.at.a();
            double d6 = d5 / 2.0;
            double d7 = this.av.a();
            double d8 = this.aw.a();
            boolean bl4 = bl2 = this.au.v() == this.ax;
            if (this.al.u().booleanValue()) {
                if (bl2) {
                    o7.a(d3, d4, d3 + d5, d4 + d5, 2.0, new Color(-2145509859, true), new Color(-1308622848, true));
                } else {
                    o7.a(d3, d4, 0.0, d5, 0.0, 0.0, 0.0, 0.5);
                }
            }
            if (this.af.u().booleanValue()) {
                o7.a(d3 + d5 / 2.0 - 0.5, d4 + 0.5, d3 + d5 / 2.0 + 0.5, d4 + d5 - 0.5, new Color(-1077360440, true));
                o7.a(d3 + 0.5, d4 + d5 / 2.0 - 0.5, d3 + d5 - 0.5, d4 + d5 / 2.0 + 0.5, new Color(-1077360440, true));
            }
            for (Object e10 : list) {
                double d10;
                double d11;
                if (e10 == eJ2.a()) continue;
                eC eC2 = new eC(e10);
                double d12 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)ds_2.O().g();
                double d13 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)ds_2.O().g();
                double d14 = eC2.T() + (eC2.z() - eC2.T()) * (double)ds_2.O().g();
                double d15 = eC2.X() + (eC2.g() - eC2.X()) * (double)ds_2.O().g();
                double d16 = d14 - d12;
                double d17 = d15 - d13;
                double d18 = d3 + d6;
                double d19 = d4 + d6;
                float f10 = (float)Math.cos((double)eJ2.U() * (Math.PI / 180));
                float f11 = (float)Math.sin((double)eJ2.U() * (Math.PI / 180));
                double d20 = -(d16 * (double)f10 + d17 * (double)f11) * d7;
                double d21 = -(d17 * (double)f10 - d16 * (double)f11) * d7;
                if (bl2) {
                    d11 = d18 + (this.aq.u() == false ? d20 : Y.a(d20, -d6 + d8 / 2.0, d6 - d8 / 2.0));
                    d10 = d19 + (this.aq.u() == false ? d21 : Y.a(d21, -d6 + d8 / 2.0, d6 - d8 / 2.0));
                } else {
                    if (this.aq.u().booleanValue() && Math.sqrt(d20 * d20 + d21 * d21) > d6) {
                        float f12 = (float)Math.atan2(d21, d20);
                        d20 = (float)((d6 - 0.5) * Math.cos(f12));
                        d21 = (float)((d6 - 0.5) * Math.sin(f12));
                    }
                    d11 = d18 + d20;
                    d10 = d19 + d21;
                }
                Color color = Color.WHITE;
                if (this.aB.v() == this.ag) {
                    color = this.az.K();
                } else if (this.aB.v() == this.aC) {
                    L l6 = on.p.t().b(eC2);
                    if (l6 != null) {
                        color = l6;
                    }
                } else if (this.aB.v() == this.am) {
                    Color color2 = color = on.p.t().a((ex_0)eC2) ? this.ar.K() : this.ap.K();
                }
                if (on.p.N().c(eC2.S()) && on.p.N().recolorVisuals.u().booleanValue()) {
                    color = on.p.N().friendsColor.K();
                }
                if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
                    color = on.p.b().e.K();
                }
                if (this.an.v() == this.ae) {
                    o7.a(d11 - d8 / 2.0, d10 - d8 / 2.0, d11 + d8 / 2.0, d10 + d8 / 2.0, 0.5, color, new Color(-16777216, true));
                    continue;
                }
                double d22 = d8 / 2.0;
                o7.a(d11 - d22 / 2.0, d10 - d22 / 2.0, 0.0, d22, (double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
            }
            if (bl3 && !GL11.glIsEnabled((int)3042)) {
                GL11.glEnable((int)3042);
            }
        } else {
            List<eC> list2 = new ArrayList<eC>();
            ArrayList arrayList = new ArrayList();
            int n6 = this.aA.a().intValue();
            for (Object e11 : list) {
                if (!A5.cc.isAssignableFrom(e11.getClass()) || e11 == eJ2.a() || arrayList.contains(e11)) continue;
                eC eC3 = new eC(e11);
                if (n6 != 0 && !(eJ2.a(eC3) <= (float)n6) || on.p.t().b((ex_0)eC3)) continue;
                list2.add(eC3);
                arrayList.add(e11);
            }
            if (list2.isEmpty()) {
                return;
            }
            list2.sort(new m8(this, eJ2));
            int n10 = this.ai.a().intValue();
            int n11 = 0;
            if (this.ai.a() != 0.0 && list2.size() > n10) {
                n11 = list2.size() - n10;
                list2 = list2.subList(0, n10);
            }
            int n12 = 0;
            for (eC eC4 : list2) {
                int n13 = (int)eJ2.a(eC4);
                String string = n13 > 100 ? "a" : (n13 > 50 ? "e" : "c");
                String string2 = String.format("\u00a7%s%dm", string, n13);
                if (this.al.u().booleanValue()) {
                    o7.a(d3, d4 + (double)n12, d3 + this.q(), d4 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d3, d4 + (double)n12 + 9.5, d3 + this.q(), d4 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                int n14 = on.p.N().a(eC4) ? on.p.N().friendsColor.s() : (on.p.b().a(eC4) ? on.p.b().e.s() : -1);
                mq2.a(eC4.S(), d3 + 1.0, d4 + 2.0 + (double)n12, n14);
                mq2.a(string2, d3 + this.q() - mq2.b(string2) - 1.0, d4 + 2.0 + (double)n12, -1);
                n12 += 10;
            }
            if (n11 > 0) {
                if (this.al.u().booleanValue()) {
                    o7.a(d3, d4 + (double)n12, d3 + this.q(), d4 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d3, d4 + (double)n12 + 9.5, d3 + this.q(), d4 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                mq2.a(n11 + " more...", d3 + 1.0, d4 + 2.0 + (double)n12, -1);
            }
        }
    }

    private Color a(float[] fArray, Color[] colorArray, float f10) {
        Color color = Color.RED;
        if (fArray != null && colorArray != null && fArray.length == colorArray.length) {
            int[] nArray = this.a(fArray, f10);
            float[] fArray2 = new float[]{fArray[nArray[0]], fArray[nArray[1]]};
            Color[] colorArray2 = new Color[]{colorArray[nArray[0]], colorArray[nArray[1]]};
            float f11 = fArray2[1] - fArray2[0];
            float f12 = f10 - fArray2[0];
            float f13 = f12 / f11;
            color = this.a(colorArray2[0], colorArray2[1], (double)(1.0f - f13));
        }
        return color;
    }

    private int[] a(float[] fArray, float f10) {
        int n6;
        int[] nArray = new int[2];
        for (n6 = 0; n6 < fArray.length && fArray[n6] <= f10; ++n6) {
        }
        if (n6 >= fArray.length) {
            n6 = fArray.length - 1;
        }
        nArray[0] = n6 - 1;
        nArray[1] = n6;
        return nArray;
    }

    private Color a(Color color, Color color2, double d3) {
        Color color3;
        float f10 = (float)d3;
        float f11 = 1.0f - f10;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        color.getColorComponents(fArray);
        color2.getColorComponents(fArray2);
        float f12 = fArray[0] * f10 + fArray2[0] * f11;
        float f13 = fArray[1] * f10 + fArray2[1] * f11;
        float f14 = fArray[2] * f10 + fArray2[2] * f11;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 255.0f) {
            f12 = 255.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        } else if (f13 > 255.0f) {
            f13 = 255.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        } else if (f14 > 255.0f) {
            f14 = 255.0f;
        }
        try {
            color3 = new Color(f12, f13, f14);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Color.RED;
        }
        return color3;
    }

    public static rj_0 al() {
        return ao;
    }
}

