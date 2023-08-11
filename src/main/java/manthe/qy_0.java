/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.qE;
import manthe.si_0;

/*
 * Renamed from manthe.qy
 */
public class qy_0
extends qE {
    private boolean c = false;

    public qy_0(si_0 si_02) {
        super(si_02);
    }

    @Override
    public void a(Object object) {
        if (!this.c) {
            on.p.g();
            on.p.O().a(true);
            this.c = true;
        }
    }
}

