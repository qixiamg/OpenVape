/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ao_0;
import manthe.dx_2;
import manthe.eV;
import manthe.kl_0;
import manthe.on;

public class kv
extends kl_0 {
    private eV d;
    private dx_2 e;

    public kv(Object object, Object object2) {
        this.d = new eV(object);
        this.e = new dx_2(object2);
    }

    @Override
    public boolean fire() {
        on.p.H().b(ao_0.class).a(this);
        return super.fire();
    }

    public eV getRenderBlocks() {
        return this.d;
    }

    public dx_2 getBlock() {
        return this.e;
    }
}

