/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ao_0;
import manthe.dx_2;
import manthe.kl_0;
import manthe.on;

public class l4
extends kl_0 {
    private final dx_2 d;

    public l4(Object object) {
        this.d = new dx_2(object);
    }

    public dx_2 getBlock() {
        return this.d;
    }

    @Override
    public boolean fire() {
        if (!on.p.H().a(ao_0.class)) {
            return super.fire();
        }
        on.p.H().b(ao_0.class).a(this);
        return super.fire();
    }
}

