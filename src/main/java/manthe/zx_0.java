/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.d;
import rip.vape.module.Module;

/*
 * Renamed from manthe.zx
 */
public class zx_0
extends Module {
    private static cy_0[] u;

    public zx_0() {
        super("SelfDestruct", 1, CQ.b, "You can press LEFT CONTROL + HOME on your keyboard to self destruct at any time, including while in a portal, GUI, or menu");
    }

    @Override
    public void a(kf_0 kf_02) {
    }

    @Override
    public void s() {
        on.p.s = true;
        if (!ds_2.k().e()) {
            ds_2.a(null);
            ds_2.z();
            d.onGuiClosed(d.getGuiObject());
            nx_0.c().a();
        }
        for (Module y52 : on.p.H().e()) {
            if (!y52.N() || y52.getClass().equals(zu_0.class)) continue;
            y52.d(false);
        }
        try {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        on.p.b(false);
    }

    public static void a(cy_0[] cy_0Array) {
        u = cy_0Array;
    }

    public static cy_0[] S() {
        return u;
    }

    static {
        if (zx_0.S() == null) {
            zx_0.a(new cy_0[5]);
        }
    }
}

