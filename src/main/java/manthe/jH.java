/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

public class jH
extends gJ {
    private final bp_1 a = this.a("<init>", false, Void.TYPE, A5.c6);
    private static int[] d;

    public jH() {
        super(A5.a5);
    }

    private Object a(Object object) {
        return this.a.a(object);
    }

    static Object a(jH jH2, Object object) {
        return jH2.a(object);
    }

    public static void b(int[] nArray) {
        d = nArray;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (jH.d() == null) {
            jH.b(new int[1]);
        }
    }
}

