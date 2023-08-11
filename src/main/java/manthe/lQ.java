/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ao_0;
import manthe.dx_2;
import manthe.g7;
import manthe.kl_0;
import manthe.on;

public class lQ
extends kl_0 {
    private final dx_2 d;
    private final g7 e;
    private boolean f;

    public lQ(Object object, Object object2) {
        this.d = new dx_2(object);
        this.e = new g7(object2);
    }

    public boolean shouldRender() {
        return this.f;
    }

    public void setShouldRender(boolean bl) {
        this.f = bl;
    }

    public dx_2 getBlock() {
        return this.d;
    }

    public g7 getEnumWorldBlockLayer() {
        return this.e;
    }

    @Override
    public boolean fire() {
        on.p.H().b(ao_0.class).a(this);
        return super.fire();
    }
}

