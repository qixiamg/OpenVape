/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class yD
extends Module {
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Fast Bow", false, "Makes you shoot your bow faster.");
    private final DF u = DF.a(this, "Ticks", "#", "", 1.0, 14.0, 40.0, 1.0, "The amount of ticks you have to use an item to consume.");

    public yD() {
        super("FastConsume", -256, CQ.f, "Use/Consume items quicker.");
        this.a(this.u, this.v);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if ((double)eJ2.be() == this.u.a() && this.a(eJ2.a_().k())) {
            for (int i = 0; i < 30; ++i) {
                eJ2.bp().a(f_.a(true));
            }
            ds_2.K().a(eJ2);
        }
    }

    private boolean a(fk_0 fk_02) {
        return !fk_02.a(A5.bO) && (this.v.u() != false || !fk_02.a(A5.cZ));
    }
}

