/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class zK
extends Module {
    private final DF v = DF.a((Object)this, "Speed", "#.##", "", 0.1, 1.07, 2.0, 0.01);
    private boolean u;

    public zK() {
        super("Timer", 0xFF1010, CQ.f, "Modifies game timer");
        this.a(this.v);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        this.u = !this.u;
        ds_2.O().a(this.u ? 1.0f : this.v.a().floatValue());
    }

    @Override
    public void J() {
        ds_2.O().a(1.0f);
    }
}

