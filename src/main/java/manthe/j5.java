/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

public class j5
extends gJ {
    public bp_1 a = this.a("endStartSection", true, Void.TYPE, String.class);
    private static int[] d;

    public j5() {
        super(A5.X);
    }

    public static void b(int[] nArray) {
        d = nArray;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (j5.d() != null) {
            j5.b(new int[1]);
        }
    }
}

