/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.ds_2;
import manthe.o7;
import manthe.on;
import manthe.r1;
import manthe.rH;
import manthe.rn_0;
import manthe.zu_0;
import org.lwjgl.opengl.GL11;

public class rZ
extends rH {
    public rZ() {
        super("FPS Hud", 62.0, 16.0);
    }

    @Override
    public void c(boolean bl) {
        rn_0 rn_02 = null;
        for (r1 object2 : on.p.F().d()) {
            if (!(object2 instanceof rn_0)) continue;
            rn_02 = (rn_0)object2;
            break;
        }
        if (rn_02 == null) {
            return;
        }
        Color color = rn_02.ap();
        GL11.glPushMatrix();
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), new Color(0, 0, 0, rn_02.aq()));
        String string = ds_2.q() + " FPS";
        double d3 = this.r().a(string);
        if (!zu_0.ag()) {
            o7.a(0.0, 0.0, 0.0, 0.0, color);
        }
        this.r().b(string, this.t() + this.q() / 2.0, this.k() + this.b() / 2.0 - d3 / 2.0, color);
        if (!zu_0.ag()) {
            this.r().a("", 0.0, 0.0, -1);
        }
        this.b(16.0);
        GL11.glPopMatrix();
        super.c(bl);
    }
}

