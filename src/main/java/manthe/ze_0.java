/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.Random;

/*
 * Renamed from manthe.ze
 */
public class ze_0
extends Module {
    private final AO y = new AO();
    private final AO x = new AO();
    private final ei_0[] w;
    private final Random u = new Random();
    private final DF z = DF.a((Object)this, "Frequency", "##", "", 1.0, 30.0, 200.0, "How often you will move");
    private ei_0 v;

    public ze_0() {
        super("Anti-AFK", 9782004, CQ.e);
        en_0 en_02 = ds_2.s();
        this.w = new ei_0[]{en_02.j(), en_02.A(), en_02.g(), en_02.n()};
        this.a(this.z);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (ds_2.x().a(A5.ag)) {
            return;
        }
        if (this.v == null) {
            if (ds_2.k().aF() != 0.0f || ds_2.k().ay() != 0.0f) {
                this.y.b(3000L);
                return;
            }
            if (this.y.a(this.z.a().longValue() * 1000L + (long)this.u.nextInt(4000))) {
                this.v = this.w[this.u.nextInt(this.w.length)];
                ei_0.a(this.v.i(), true);
                ei_0.a(this.v.i());
                this.x.d();
            }
        } else if (this.x.a(this.u.nextInt(50))) {
            ei_0.a(this.v.i(), false);
            this.v = null;
            this.y.d();
        }
    }
}

