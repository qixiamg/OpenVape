/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Cp;
import manthe.ds_2;
import manthe.eJ;

public class CD
extends Cp {
    private boolean p = false;

    public CD() {
        super(true);
    }

    @Override
    public void f() {
        eJ eJ2 = ds_2.k();
        this.a(eJ2);
        this.m = eJ2.U() + 180.0f;
        this.c = this.p ? 0.0f : -eJ2.K();
        super.f();
    }

    public void d(boolean bl) {
        this.p = bl;
    }
}

