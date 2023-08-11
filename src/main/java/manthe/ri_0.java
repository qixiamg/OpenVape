/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.bz_0;
import manthe.c5;
import manthe.k9;
import manthe.on;
import manthe.r1;
import manthe.rG;
import manthe.rg_0;
import manthe.zu_0;

/*
 * Renamed from manthe.ri
 */
public class ri_0
extends r1 {
    private final rg_0 af;
    private boolean ae;

    public ri_0(String string, int n6, int n10) {
        super(string, false);
        this.n(true);
        if (k9.b(string)) {
            this.af = new rG(string, n6, n10, 0.8f);
        } else {
            this.af = new rg_0(string, true);
            this.af.c(n6);
            this.af.b(n10);
        }
        this.af.b(new Color(45, 45, 45));
        this.af.j(false);
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        this.af.a(new c5(this, zu_02));
    }

    public rg_0 al() {
        return this.af;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        this.Z().a(false);
        this.a(this.af.t());
        this.d(this.af.k() + this.af.b() + 2.0);
        if (this.z()) {
            this.b(0.0);
        }
    }

    @Override
    public void b(int n6, int n10, int n11) {
        if (this.g() || this.af.g()) {
            return;
        }
        this.f(true);
        this.ae = false;
        bz_0 bz_02 = on.p.H().b(zu_0.class).ak();
        bz_02.a(null);
    }

    static boolean a(ri_0 ri_02, boolean bl) {
        ri_02.ae = bl;
        return ri_02.ae;
    }

    static boolean a(ri_0 ri_02) {
        return ri_02.ae;
    }
}

