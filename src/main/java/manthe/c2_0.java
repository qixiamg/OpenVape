/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.c2
 */
public enum c2_0 {
    LEFT_CLICK,
    RIGHT_CLICK,
    MIDDLE_CLICK,
    UNKNOWN;


    public static c2_0 a(int n6) {
        for (c2_0 c2_02 : c2_0.values()) {
            if (c2_02.ordinal() != n6) continue;
            return c2_02;
        }
        return UNKNOWN;
    }
}

