/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class y6
extends Module {
    public y6() {
        super("Anti-FML", 8919359, CQ.f, "Some servers prevent Forge from connecting\nthis will bypass that.\nYou must reconnect to the server inorder for this to work.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kF kF2) {
    }

    @Override
    public void a(ky_0 ky_02) {
        if (ky_02.getPacket().a().getClass().getName().toLowerCase().contains(A5.dY)) {
            ky_02.a(true);
        }
    }
}

