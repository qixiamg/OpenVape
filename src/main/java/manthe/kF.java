/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kF
extends kl_0 {
    private fO d;
    private fn_0 e;

    public kF(Object object, Object object2) {
        this.d = new fO(object);
        this.e = new fn_0(object2);
    }

    public Object getPacketInstance() {
        return this.e.a();
    }

    public fn_0 getPacket() {
        return this.e;
    }

    public void setPacket(fn_0 fn2) {
        this.e = fn2;
    }

    @Override
    public boolean fire() {
        try {
            for (Module y52 : on.p.H().e()) {
                if (!y52.N()) continue;
                y52.a(this);
            }
        }
        catch (Exception e10) {
            e10.printStackTrace();
        }
        return super.fire();
    }

    public fO getNetworkManager() {
        return this.d;
    }
}

