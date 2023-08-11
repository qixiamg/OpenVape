/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class yY
extends Module {
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Players only", true, "Only swap when attacking players.");
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Hand only", false, "Only swap when holding nothing.");

    public yY() {
        super("AutoSword", 6485058, CQ.f, "Automatically equips your sword when attacking entities.");
        this.a(this.v, this.u);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kJ kJ2) {
        if ((!this.v.u().booleanValue() || kJ2.getTarget().a(A5.L)) && !kJ2.c() && ds_2.x().e()) {
            eJ eJ2 = ds_2.k();
            if (!this.u.u().booleanValue() || eJ2.a_().e() || eJ2.a_().k().e()) {
                for (int i = 36; i < 45; ++i) {
                    fk_0 fk_02;
                    if (!eJ2.aY().a(i).h() || !(fk_02 = eJ2.aY().a(i).f().k()).a(A5.bO) || eJ2.aU().i() == i - 36) continue;
                    eJ2.aU().a(i - 36);
                    eJ2.bp().a(f5.a(i - 36));
                    ds_2.K().h();
                    break;
                }
            }
        }
    }
}

