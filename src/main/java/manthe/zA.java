/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

public class zA
extends Module {
    private final BooleanValue z = BooleanValue.createValue(this, "Remove Nausea", true);
    private final BooleanValue u = BooleanValue.createValue(this, "Remove Blindness", true);
    private final BooleanValue w = BooleanValue.createValue(this, "Remove Slowness", true);
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Remove Effects", false, "Removes non-visual effects from slowness\nCan be detected by anti-cheat");
    private float y;
    private float A;
    private float x;

    public zA() {
        super("AntiDebuff", -256, CQ.d, "Removes negative visual potion effects");
        this.a(this.z, this.u, this.w, this.v);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2;
        if (this.z.u().booleanValue()) {
            ds_2.k().f(9);
        }
        if (this.u.u().booleanValue() && this.v.u().booleanValue()) {
            ds_2.k().f(15);
        }
        if (this.w.u().booleanValue() && (eJ2 = ds_2.k()).a(fX.h())) {
            if (this.v.u().booleanValue()) {
                fE fE2 = ds_2.k().b(fX.h());
                fX[] fXArray = fX.i();
                fXArray[2].a(eJ2, eJ2.aw(), fE2.h());
            }
            eJ2.f(2);
        }
    }

    @Override
    public void a(lz_0 lz_02) {
        eJ eJ2 = ds_2.k();
        if (this.u.u().booleanValue() && eJ2.a(fX.s()) && eJ2.b(fX.s()).f() > 1) {
            lz_02.getForgeEvent().a(true);
            lz_02.setDensity(0.1f);
        }
    }

    @Override
    public void a(lG lG2) {
        eJ eJ2 = ds_2.k();
        if (this.u.u().booleanValue() && eJ2.a(fX.s()) && eJ2.b(fX.s()).f() > 1) {
            GL11.glFogf((int)2915, (float)990.0f);
            GL11.glFogf((int)2916, (float)1000.0f);
            lG2.getRenderer().a(true);
            if (lG2.getRed() == 0.0f) {
                lG2.setRed(this.y);
            }
            if (lG2.getGreen() == 0.0f) {
                lG2.setGreen(this.A);
            }
            if (lG2.getBlue() == 0.0f) {
                lG2.setBlue(this.x);
            }
        } else {
            this.y = lG2.getRed();
            this.A = lG2.getGreen();
            this.x = lG2.getBlue();
        }
    }
}

