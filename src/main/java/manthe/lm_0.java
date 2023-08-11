/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.fG;
import manthe.ka_0;
import manthe.kl_0;

/*
 * Renamed from manthe.lm
 */
public class lm_0
extends kl_0 {
    private final Object d;

    public lm_0(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        return new ka_0(new fG(this.d)).fire();
    }
}

