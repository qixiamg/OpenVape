/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Random;
import manthe.dy_0;

/*
 * Renamed from manthe.aA
 */
public class aa_0 {
    private static final Random a = new Random();

    public static int a(int n6, int n10) {
        int n11 = n10 - n6;
        return n11 <= 0 ? n6 : a.nextInt(n11) + n6 + 1;
    }

    public static int a(dy_0 dy_02) {
        return aa_0.a(dy_02.v()[0].intValue(), dy_02.v()[1].intValue());
    }
}

