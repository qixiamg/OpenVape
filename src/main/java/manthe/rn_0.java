/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.rn
 */
public class rn_0
extends rH {
    private final CA am;
    private final CA as;
    private final CA aq;
    private final CA ai;
    private final CA al;
    private final CA ah;
    private final CA ap;
    private final BooleanValue aj = BooleanValue.createValue(this, "Custom Colors", false);
    private final ColorValue at = ColorValue.createValue((Object)this, "Text Color", new Color(0xDCDCDC));
    private final ColorValue an = ColorValue.createValue((Object)this, "Background Color", new Color(0xDCDCDC));
    private final DF ak = DF.a((Object)this, "Fade Time", "#", "ms", 1.0, 45.0, 250.0, 1.0);
    private final DF ao = DF.a((Object)this, "Background Opacity", "#", "", 0.0, 110.0, 255.0, 1.0);
    private static String[] ar;

    public rn_0() {
        super("Key Strokes", 62.0, 79.0);
        en_0 en_02 = ds_2.s();
        this.am = new CA(this, en_02.j());
        this.as = new CA(this, en_02.A());
        this.aq = new CA(this, en_02.g());
        this.ai = new CA(this, en_02.n());
        this.al = new CA(this, en_02.m());
        this.ah = new CA(this, en_02.s());
        this.ap = new CA(this, en_02.l());
        this.aj.a(this.at, this.an);
        this.ah().add((p1)this.ao.getDefaultValue());
        this.ah().add((p1)this.ak.getDefaultValue());
        this.ah().add((p1)this.aj.getDefaultValue());
        this.ah().add((p1)this.at.getDefaultValue());
        this.ah().add((p1)this.an.getDefaultValue());
    }

    public Color ap() {
        return this.aj.u() != false ? this.at.K() : new Color(0xDCDCDC);
    }

    public int aq() {
        return this.ao.a().intValue();
    }

    @Override
    public void c(boolean bl) {
        this.b(79.0);
        int n6 = 20;
        this.a(this.am, this.t() + 31.0, this.k(), 20.0, 20.0, 0.0, bl);
        this.a(this.as, this.t() + 31.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.aq, this.t() + 10.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.ai, this.t() + 52.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.al, this.t() + 10.0, this.k() + 42.0, 20.0, 20.0, 11.5, bl);
        this.a(this.ah, this.t() + 42.5, this.k() + 42.0, 20.0, 20.0, 9.5, bl);
        this.a(this.ap, this.t() + 10.0, this.k() + 63.0, 20.0, 16.0, 42.0, bl);
        super.c(bl);
    }

    private void a(CA cA, double d3, double d4, double d5, double d6, double d7, boolean bl) {
        Color color;
        String string;
        ei_0 ei_02 = cA.d;
        mq mq2 = this.r();
        double d8 = zu_0.ag() ? 0.0 : 0.5;
        double d10 = zu_0.ag() ? 0.0 : -1.0;
        GL11.glPushMatrix();
        if (!bl) {
            if (System.currentTimeMillis() % 1000L > 500L != cA.c) {
                cA.c = !cA.c;
                cA.a = System.currentTimeMillis();
            }
        } else {
            if (cA.c != ei_02.h()) {
                cA.a = System.currentTimeMillis();
            }
            cA.c = ei_02.h();
        }
        double d11 = !cA.c ? 1.0 - Math.min(1.0, (double)(System.currentTimeMillis() - cA.a) / this.ak.a()) : Math.min(1.0, (double)(System.currentTimeMillis() - cA.a) / this.ak.a());
        d11 = Y.a(d11, 0.0, 1.0);
        L l6 = this.an.K();
        Color color2 = this.aj.u() != false ? new Color((int)((double)((Color)l6).getRed() * d11), (int)((double)((Color)l6).getGreen() * d11), (int)((double)((Color)l6).getBlue() * d11), this.ao.a().intValue()) : new Color((int)(255.0 * d11), (int)(255.0 * d11), (int)(255.0 * d11), this.ao.a().intValue());
        GL11.glTranslated((double)d3, (double)d4, (double)0.0);
        o7.a(-d5 / 2.0, 0.0, d5 / 2.0 + d7, d6, color2);
        String string2 = cA == this.al ? "LMB" : (cA == this.ah ? "RMB" : (string = cA == this.ap ? "" : Keyboard.getKeyName((int)ei_02.i())));
        Color color3 = this.aj.u().booleanValue() ? (this.at.J() ? this.at.K() : new Color((int)((double)this.at.K().getRed() * (1.0 - d11)), (int)((double)this.at.K().getGreen() * (1.0 - d11)), (int)((double)this.at.K().getBlue() * (1.0 - d11)), 255)) : (color = new Color((int)(220.0 * (1.0 - d11)), (int)(220.0 * (1.0 - d11)), (int)(220.0 * (1.0 - d11)), 255));
        if (cA == this.ap) {
            o7.a(0.0, d6 / 2.0 - 0.5, d7, d6 / 2.0 + 0.5, color);
        } else {
            GL11.glTranslated((double)(d8 + (double)(cA == this.al ? 6 : (cA == this.ah ? 5 : (cA == this.ap ? 10 : 0)))), (double)(d10 + d6 / 2.0 - mq2.a(string) / 2.0), (double)0.0);
            if (!zu_0.ag()) {
                o7.a(0.0, 0.0, 0.0, 0.0, new Color(255, 255, 255, 255));
            }
            mq2.b(string, 0.0, 0.0, color);
            if (!zu_0.ag()) {
                mq2.a("", 0.0, 0.0, -1);
            }
        }
        GL11.glPopMatrix();
    }

    public static void b(String[] stringArray) {
        ar = stringArray;
    }

    public static String[] ar() {
        return ar;
    }

    static {
        if (rn_0.ar() == null) {
            rn_0.b(new String[2]);
        }
    }
}

