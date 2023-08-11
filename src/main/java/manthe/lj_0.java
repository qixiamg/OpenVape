/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ex_0;
import manthe.k_;
import manthe.kl_0;

/*
 * Renamed from manthe.lj
 */
public class lj_0
extends kl_0 {
    private final Object d;
    private final String e;

    public lj_0(Object object, String string) {
        this.d = object;
        this.e = string;
    }

    @Override
    public boolean fire() {
        return new k_(new ex_0(this.d), this.e).fire();
    }
}

