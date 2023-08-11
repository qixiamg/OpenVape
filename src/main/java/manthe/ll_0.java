/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ll
 */
public class ll_0
extends l9 {
    private ex_0 f;

    public ll_0(cv_0 cv_02, ex_0 ex_02) {
        super(cv_02);
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public ex_0 getEntity() {
        return this.f;
    }
}

