/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class DY
extends BasicValue<aj_2, rh_0> {
    private aj_2 l = new aj_2(this, true, false, false, false, false, false, false);

    public DY(Object object, String string, rh_0 rh_02) {
        super(object, string, rh_02);
    }

    public static DY a(Module y52) {
        rh_0 rh_02 = new rh_0("Targets");
        rh_02.b(10.0);
        DY dY = new DY((Object)y52, "Target Settings " + y52.H(), rh_02);
        rh_02.a(dY);
        rT rT2 = new rT(dY);
        rh_02.a(rT2);
        return dY;
    }

    public boolean a(ex_0 ex_02) {
        return this.r().a(ex_02);
    }

    public aj_2 r() {
        return this.l;
    }

    @Override
    public void setType(aj_2 aj_22) {
        this.l = aj_22;
    }

    @Override
    public void getRuntimeCopyException(String string) {
        this.r().a(string);
    }
}

