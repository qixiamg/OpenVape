/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class AI
extends Module {
    private final DF v = DF.a((Object)this, "Delay", "#", "", 0.0, 1.0, 4.0, 1.0);
    private final pb_0 u = new pb_0("All");
    private final pb_0 x = new pb_0("Blocks");
    private final pb_0 w = new pb_0("Projectiles");
    private final DX y = DX.a((Object)this, "Held Item", "What kind of items should FastPlace function with?\nAll - All items/blocks\nBlocks - All blocks\nProjectiles - Snowballs & Eggs", this.u, this.u, this.x, this.w);

    public AI() {
        super("FastPlace", -16384224, CQ.e, "Changes the block place delay.");
        this.a(this.y, this.v);
    }

    @Override
    public void a(kf_0 kf_02) {
        if (kf_02.a() != da_0.b) {
            return;
        }
        if (ds_2.k().e()) {
            return;
        }
        fG fG2 = ds_2.k().a_();
        if (this.y.v() == this.x && fG2.d() && fG2.k().d() && !fG2.k().a(A5.av)) {
            return;
        }
        if (this.y.v() == this.w && fG2.d() && fG2.k().d() && !nH.a(fG2.k())) {
            return;
        }
        if ((double)ds_2.f() > this.v.a()) {
            ds_2.a(this.v.a().intValue());
        }
    }
}

