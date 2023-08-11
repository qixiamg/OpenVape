/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ao_0;
import manthe.dx_2;
import manthe.g7;
import manthe.kl_0;
import manthe.on;

/*
 * Renamed from manthe.lo
 */
public class lo_0
extends kl_0 {
    private final dx_2 d;
    private boolean e;
    private static String[] f;

    public lo_0(Object object) {
        this.d = new dx_2(object);
    }

    public Object getBlockLayer() {
        return this.e ? g7.f().a() : g7.g().a();
    }

    public dx_2 getBlock() {
        return this.d;
    }

    public void setShouldRender(boolean bl) {
        this.e = bl;
    }

    @Override
    public boolean fire() {
        if (!on.p.H().a(ao_0.class)) {
            return super.fire();
        }
        on.p.H().b(ao_0.class).a(this);
        return super.fire();
    }

    public static void b(String[] stringArray) {
        f = stringArray;
    }

    public static String[] e() {
        return f;
    }

    static {
        if (lo_0.e() == null) {
            lo_0.b(new String[5]);
        }
    }
}

