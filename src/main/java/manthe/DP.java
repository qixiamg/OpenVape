/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.List;

public abstract class DP<C>
extends BasicValue<List<C>, rh_0> {
    private static String l;

    public DP(Object object, String string, rh_0 rh_02) {
        super(object, string, rh_02);
    }

    public abstract C a(String var1, int var2);

    @Override
    public abstract void a(r6 var1);

    public static void b(String string) {
        l = string;
    }

    public static String a() {
        return l;
    }

    static {
        if (DP.a() != null) {
            DP.b("fjCwNc");
        }
    }
}

