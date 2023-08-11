/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

public class AJ
implements R {
    private static String b;

    public void a(p1 p12) {
        if (p12.p() != null && p12.p() instanceof DR) {
            DR dR = (DR)p12.p();
            for (Object value : dR.getValues()) {
                if (value instanceof BasicValue) {
                    Object c2 = ((BasicValue<?, ?>) value).getDefaultValue();
                    if (c2 == null) continue;
                    if (!p12.e()) {
                        c2.a(false);
                        continue;
                    }
                    ((BasicValue<?, ?>) value).getDefaultValue().a(dR.b(value));
                }
            }
        }
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (AJ.b() == null) {
            AJ.b("k4L8Lc");
        }
    }
}

