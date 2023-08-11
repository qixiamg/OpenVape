/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ky
 */
public class ky_0
extends kl_0 {
    private fO d;
    private fn_0 e;

    public ky_0(Object object, Object object2) {
        this.d = new fO(object);
        this.e = new fn_0(object2);
    }

    public Object getPacketInstance() {
        return this.e.a();
    }

    public fn_0 getPacket() {
        return this.e;
    }

    public void setPacket(fn_0 fn_02) {
        this.e = fn_02;
    }

    public fO getNetworkManager() {
        return this.d;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }
}

