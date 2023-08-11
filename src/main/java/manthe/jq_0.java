/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.jq
 */
public class jq_0
extends gJ {
    private final bp_1 a = this.a("isSameTeam", true, Boolean.TYPE, A5.dJ);
    private static String[] d;

    public jq_0() {
        super(A5.dJ);
    }

    private boolean a(Object object, Object object2) {
        return this.a.h(object, object2);
    }

    static boolean a(jq_0 jq_02, Object object, Object object2) {
        return jq_02.a(object, object2);
    }

    public static void b(String[] stringArray) {
        d = stringArray;
    }

    public static String[] d() {
        return d;
    }

    static {
        if (jq_0.d() == null) {
            jq_0.b(new String[5]);
        }
    }
}

