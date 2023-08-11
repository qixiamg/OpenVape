/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.cy_0;
import manthe.gJ;

public class iP
extends gJ {
    private final BG d = this.a("GOLD", cy_0.c, A5.az);
    private static int[] a;

    public iP() {
        super(A5.az);
    }

    private Object d() {
        return this.d.f(null);
    }

    static Object a(iP iP2) {
        return iP2.d();
    }

    public static void b(int[] nArray) {
        a = nArray;
    }

    public static int[] e() {
        return a;
    }

    static {
        if (iP.e() != null) {
            iP.b(new int[5]);
        }
    }
}

