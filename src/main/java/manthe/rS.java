/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.ArrayList;
import manthe.ds_2;
import manthe.e3;
import manthe.eJ;
import manthe.eK;
import manthe.eh_0;
import manthe.fG;
import manthe.rH;
import org.lwjgl.opengl.GL11;

public class rS
extends rH {
    public rS() {
        super("Armor HUD", 80.0, 16.0);
    }

    @Override
    public void c(boolean bl) {
        int n6;
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || eJ2.i().e()) {
            return;
        }
        this.c(80.0);
        this.b(16.0);
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (n6 = 3; n6 >= 0; --n6) {
            Object object = eJ2.aU().g()[n6];
            if (object == null) continue;
            arrayList.add(new fG(object));
        }
        if (eJ2.a_().d()) {
            arrayList.add(eJ2.a_());
        }
        if (arrayList.size() < 1) {
            return;
        }
        n6 = this.Y() ? 1 : 0;
        double d3 = 0.0;
        GL11.glPushMatrix();
        eh_0.g();
        eK eK2 = ds_2.J();
        for (fG fG2 : arrayList) {
            GL11.glPushMatrix();
            float f10 = eK2.g();
            GL11.glTranslated((double)(this.t() + d3), (double)this.k(), (double)0.0);
            eK2.a(!bl ? -150.0f : 150.0f);
            eK2.a(ds_2.m(), ds_2.l(), fG2, 0, 0);
            eK2.b(ds_2.m(), ds_2.l(), fG2, 0, 0);
            eK2.a(f10);
            GL11.glPopMatrix();
            d3 += 16.0;
        }
        e3.l();
        e3.r();
        e3.k();
        GL11.glEnable((int)3008);
        eh_0.h();
        GL11.glPopMatrix();
        super.c(bl);
    }
}

