/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ve
 */
public class ve_0
implements P {
    private final zu_0 c = on.p.H().b(zu_0.class);
    private static String[] b;

    @Override
    public void a(kl_0 kl_02) {
        this.c.W();
        for (Module y52 : on.p.H().f()) {
            y52.t();
        }
        on.p.r().c();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (ve_0.b() != null) {
            ve_0.b(new String[4]);
        }
    }
}

