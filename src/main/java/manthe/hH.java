/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

public class hH
extends gJ {
    public final bp_1 a = this.b("gc", false, Void.TYPE, new Class[0]);
    private static String[] d;

    public hH() {
        super(A5.co);
    }

    public static void b(String[] stringArray) {
        d = stringArray;
    }

    public static String[] d() {
        return d;
    }

    static {
        if (hH.d() == null) {
            hH.b(new String[2]);
        }
    }
}

