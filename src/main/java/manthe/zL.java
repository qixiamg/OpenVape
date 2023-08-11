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

public class zL
extends Module {
    private final qN u = new qN("#.#");

    public zL() {
        super("Health", -21075, CQ.d, "Displays your health in the center of your screen.");
    }

    @Override
    public void t() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e()) {
            return;
        }
        dx_1 dx_12 = ds_2.x();
        int n6 = dx_12.a(A5.ag) ? 70 : (dx_12.a(A5.bt) ? 95 : -10);
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        int n10 = d0_02.g() / 2;
        int n11 = d0_02.h() / 2 + n6;
        String string = this.u.b(eJ2.aD() / 2.0f).replace(".0", "") + "\u00a7c\u2764";
        if (eJ2.aR() > 0.0f) {
            string = string + " \u00a7e" + this.u.b(eJ2.aR() / 2.0f).replace(".0", "") + "\u00a76\u2764";
        }
        dr_1 dr_12 = ds_2.m();
        int n12 = dr_12.c(string);
        float f10 = eJ2.aD();
        Color color = Color.RED;
        if (f10 > 0.0f) {
            try {
                float f11 = f10 / eJ2.at();
                color = o7.a(Y.a(f11, 0.0f, 1.0f)).brighter();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        dr_12.d(string, (double)(-n12) / 2.0 + (double)n10, (double)(n11 + 25), color.getRGB());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (bl) {
            GL11.glEnable((int)2896);
        }
    }
}

