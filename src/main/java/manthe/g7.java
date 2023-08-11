/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.jm_0;

public class g7
extends cy_0 {
    private static g7 e;
    private static g7 f;

    public g7(Object object) {
        super(object);
    }

    public static g7 g() {
        if (e == null) {
            e = new g7(jm_0.b(g7.a.M().bl));
        }
        return e;
    }

    public static g7 f() {
        if (f == null) {
            f = new g7(jm_0.a(g7.a.M().bl));
        }
        return f;
    }
}

