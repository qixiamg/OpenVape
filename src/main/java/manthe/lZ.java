/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cv_0;
import manthe.dk_2;
import manthe.ki_0;
import manthe.l9;

public class lZ
extends l9 {
    private final dk_2 f;

    public lZ(cv_0 cv_02) {
        super(cv_02);
        this.f = new dk_2(cv_02);
    }

    @Override
    public boolean fire() {
        return new ki_0(this.f.g(), this.f.i()).fire();
    }
}

