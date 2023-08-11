/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class AM
extends Module {
    private static boolean v;
    public DD u = DD.a((Object)this, "clutch-whitelist", "Allowed Blocks", DD.m, new mD("blocks"));

    public AM() {
        super("Clutch", -16764673, CQ.e, "Automatically attempts to bridge under you if you fall.");
        this.a(this.u);
    }

    @Override
    public void t() {
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
    }

    static boolean e(boolean bl) {
        v = bl;
        return v;
    }
}

