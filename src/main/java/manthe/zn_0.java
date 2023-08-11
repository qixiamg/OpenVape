/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import lgbt.vape.hook.SprintEnable;
import rip.vape.module.Module;

/*
 * Renamed from manthe.zn
 */
public class zn_0
extends Module {
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Cancel Invis", false, "Does not sprint when you are invisible.\nUseful to prevent sprint particles.");
    private zG v;

    public zn_0() {
        super("Sprint", -16711796, CQ.c, "Sets your sprinting to true.");
        this.a(this.u);
    }

    @Override
    public void a(kn_0 kn1) {
        if (this.v == null) {
            this.v = on.p.H().b(zG.class);
        }
        if (!ds_2.x().e()) {
            return;
        }
        if (this.u.u().booleanValue() && ds_2.k().a(fX.a(14)) && !ds_2.k().a8().i()) {
            return;
        }
        SprintEnable.hook();
        ei_0.a(ds_2.s().o().i(), !this.v.V() && !ds_2.s().o().g() && !ds_2.k().C() && !ds_2.k().E());
    }

    @Override
    public void J() {
        ei_0.a(ds_2.s().o().i(), false);
    }
}

