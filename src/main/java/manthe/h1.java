/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

public class h1
extends gJ {
    public bp_1 a = this.a("sortedCopy", false, List.class, Iterable.class);
    private static String d;

    public h1() {
        super(A5.aO);
    }

    public List a(Object object, Iterable iterable) {
        return (List)this.a.e(object, iterable);
    }

    public static void b(String string) {
        d = string;
    }

    public static String d() {
        return d;
    }

    static {
        if (h1.d() == null) {
            h1.b("j6jkC");
        }
    }
}

