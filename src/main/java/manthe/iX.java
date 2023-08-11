/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

public class iX
extends gJ {
    private final BG e;
    private final bp_1 d = this.a("getStack", true, A5.bT, new Class[0]);
    private static String[] a;

    public iX() {
        super(A5.aF);
        this.e = this.b("slotNumber", true, Integer.TYPE);
    }

    public Object a(Object object) {
        return this.d.e(object, new Object[0]);
    }

    private int b(Object object) {
        return this.e.c(object);
    }

    static int a(iX iX2, Object object) {
        return iX2.b(object);
    }

    public static void b(String[] stringArray) {
        a = stringArray;
    }

    public static String[] d() {
        return a;
    }

    static {
        if (iX.d() != null) {
            iX.b(new String[5]);
        }
    }
}

