/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.kl_0;

public class k1
extends kl_0 {
    private static boolean d = false;

    @Override
    public boolean fire() {
        return d;
    }

    public static void setCancel(boolean bl) {
        d = bl;
    }
}

