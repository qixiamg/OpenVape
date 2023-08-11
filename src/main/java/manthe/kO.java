/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kO
extends kl_0 {
    private dx_1 d;

    public kO(Object object) {
        this.d = new dx_1(object);
    }

    public dx_1 getGuiScreen() {
        return this.d;
    }

    public void setGuiScreen(dx_1 dx_12) {
        this.d = dx_12;
    }

    public Object getGuiScreenObject() {
        return this.d.a();
    }

    @Override
    public boolean fire() {
        for (Module object : on.p.H().e()) {
            if (!object.N()) continue;
            object.a(this);
        }
        if (VapeSettings.C && on.p.t().a.u().booleanValue()) {
            boolean bl = false;
            if (this.d.a(A5.O) || this.d.a(A5.cn) || this.d.a(A5.B)) {
                for (Module y52 : on.p.H().e()) {
                    if (!y52.N() || y52.getClass().equals(zu_0.class)) continue;
                    y52.d(false);
                    bl = true;
                }
            }
            if (bl) {
                on.p.r().addNotification("Sanity Check", "All modules have been disabled!", 5000L);
            }
        }
        return super.fire();
    }
}

