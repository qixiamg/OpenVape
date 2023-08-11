/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

/*
 * Renamed from manthe.kx
 */
public class kx_0
extends kl_0 {
    private final float d;
    private static float e = -1.0f;
    private static cy_0[] f;

    public kx_0(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        if (this.d == e) {
            return false;
        }
        ef_0.l();
        for (Module object : on.p.H().e()) {
            if (!object.N()) continue;
            object.a(this);
        }
        boolean bl = ds_2.s().q();
        ds_2.s().c(false);
        ds_2.M().a(this.d, 0);
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.getRuntimeCopyException(this);
        }
        ds_2.s().c(bl);
        if (ds_2.s().i() > 0) {
            ds_2.M().a(1.0);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        e = this.d;
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }

    static {
        kx_0.a(null);
    }

    public static void a(cy_0[] cy_0Array) {
        f = cy_0Array;
    }

    public static cy_0[] e() {
        return f;
    }
}

