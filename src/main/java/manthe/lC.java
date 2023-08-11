/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.kl_0;

public class lC
extends kl_0 {
    protected Object e;
    private static String[] d;

    public lC(Object object, int n6) {
        this.a = n6;
        this.e = object;
    }

    public static void b(String[] stringArray) {
        d = stringArray;
    }

    public static String[] e() {
        return d;
    }

    static {
        if (lC.e() != null) {
            lC.b(new String[3]);
        }
    }
}

