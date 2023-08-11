/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class z9
extends Module {
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Direction Check", true, "Checks if you're walking forwards and it'll allow you to walk off the edge");
    private boolean v;

    public z9() {
        super("SafeWalk", -9176515, CQ.f, "Helps you from falling off the edge.");
        this.r().add(this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ks_0 ks_02) {
        eJ eJ2 = ds_2.k();
        if (ks_02.c()) {
            this.v = eJ2.bg().g();
            boolean bl = true;
            if (this.u.u().booleanValue() && !eJ2.af() && eJ2.aF() > 0.0f && eJ2.ay() == 0.0f) {
                bl = false;
            }
            if (bl) {
                eJ2.bg().e(true);
            }
        } else {
            eJ2.bg().e(this.v);
        }
    }
}

