/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class zW
extends Module {
    private final dy_0 x = dy_0.createValue(this, "Rate", "#.#", "", 0.0, 1.0, 3.0, 10.0);
    private final DF w = DF.a(this, "Rate Change", "#.#", "", 0.0, 1.0, 5.0);
    private float v;
    private long u;

    public zW() {
        super("OmniSprint", -256, CQ.f);
        this.a(this.x, this.w);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
    }
}

