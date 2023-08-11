/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.on;
import manthe.x4;

/*
 * Renamed from manthe.xl
 */
public class xl_0
extends x4 {
    public xl_0(String string) {
        super(string);
        this.e(false);
    }

    @Override
    public double g() {
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        ak_0 ak_02 = on.p.l().a(this.N());
        if (ak_02 != null) {
            return;
        }
        ak_02 = new ak_0(this.N(), "4.06");
        ak_02.B();
        on.p.l().b(ak_02);
        this.c("");
    }

    @Override
    public double n() {
        return this.e() + 2.5;
    }
}

