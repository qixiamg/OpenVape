/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class tQ {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (tQ.b() != null) {
            tQ.b(new int[2]);
        }
    }
}

