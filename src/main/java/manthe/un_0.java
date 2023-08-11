/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.un
 */
public class un_0 {
    public static String a(String string, String string2, String string3) {
        return string.replaceFirst("(?s)" + string2 + "(?!.*?" + string2 + ")", string3);
    }
}

