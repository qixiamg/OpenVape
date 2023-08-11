/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.cp_0;
import manthe.kK;
import manthe.si_0;

public class sN
extends si_0 {
    public sN() {
        super(A5.w, 0);
    }

    @Override
    public void a(Object object) {
        cp_0 cp_02 = new cp_0(object);
        kK kK2 = new kK(cp_02.g());
        kK2.fire();
        cp_02.a(kK2.getMessage());
    }
}

