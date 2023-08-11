/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ke
 */
public class ke_0
extends kl_0 {
    private final float d;

    public ke_0(int n6, float f10) {
        this.a = n6;
        this.d = f10;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (y52 instanceof zu_0 && this.a() == da_0.b) {
                ((zu_0)y52).c(this);
            }
            if (!y52.N()) continue;
            if (this.a() == da_0.b) {
                y52.getRuntimeCopyException(this);
                continue;
            }
            y52.a(this);
        }
        if (this.a() == da_0.b && xR.A != null) {
            xR.A.m();
        }
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }
}

