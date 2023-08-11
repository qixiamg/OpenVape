/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.ex_0;
import manthe.jc_0;

public class f0
extends cy_0 {
    public f0(Object object) {
        super(object);
    }

    public String f() {
        if (V.c() >= 23) {
            ex_0 ex_02 = new ex_0(jc_0.b(f0.a.M().v, this.b));
            if (ex_02.d()) {
                return ex_02.S();
            }
            return "";
        }
        return jc_0.a(f0.a.M().v, this.b);
    }
}

