/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.dx_2;
import manthe.ir_0;

public class eD
extends cy_0 {
    private static dx_2 g;
    private static dx_2 e;
    private static dx_2 f;

    public eD(Object object) {
        super(object);
    }

    public static dx_2 f() {
        if (g == null) {
            g = new dx_2(ir_0.a(eD.a.M().an));
        }
        return g;
    }

    public static dx_2 h() {
        if (e == null) {
            e = new dx_2(ir_0.b(eD.a.M().an));
        }
        return e;
    }

    public static dx_2 g() {
        if (f == null) {
            f = new dx_2(ir_0.c(eD.a.M().an));
        }
        return f;
    }
}

