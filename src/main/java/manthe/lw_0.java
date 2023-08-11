/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cv_0;
import manthe.dx_1;
import manthe.kO;
import manthe.l9;

/*
 * Renamed from manthe.lw
 */
public class lw_0
extends l9 {
    private dx_1 f;

    public lw_0(cv_0 cv_02, dx_1 dx_12) {
        super(cv_02);
        this.f = dx_12;
    }

    public dx_1 getGui() {
        return this.f;
    }

    public void setGui(dx_1 dx_12) {
        this.f = dx_12;
    }

    @Override
    public boolean fire() {
        return new kO(this.f.a()).fire();
    }
}

