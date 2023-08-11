/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import java.util.HashMap;
import java.util.Map;
import manthe.on;

/*
 * Renamed from manthe.cM
 */
public class cm_0 {
    private static final Map<Class, String> a = new HashMap<Class, String>();
    private static String b;

    public static String a(Class clazz, Class ... classArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class clazz2 : classArray) {
            stringBuilder.append(cm_0.a(clazz2));
        }
        stringBuilder.append(")");
        stringBuilder.append(cm_0.a(clazz));
        return stringBuilder.toString();
    }

    public static void c() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            on.a(stackTraceElement.toString());
        }
    }

    public static String a(Class clazz) {
        if (a.containsKey(clazz)) {
            return a.get(clazz);
        }
        return a.a.gcs(clazz);
    }

    public static Class b(Class clazz) {
        String string = "[" + a.a.gcs(clazz);
        Class<?> clazz2 = a.a.gcj(string);
        return clazz2;
    }

    static {
        a.put(Boolean.TYPE, "Z");
        a.put(Byte.TYPE, "B");
        a.put(Character.TYPE, "C");
        a.put(Short.TYPE, "S");
        a.put(Integer.TYPE, "I");
        a.put(Long.TYPE, "J");
        a.put(Float.TYPE, "F");
        a.put(Double.TYPE, "D");
        a.put(Void.TYPE, "V");
        a.put(boolean[].class, "[Z");
        a.put(byte[].class, "[B");
        a.put(char[].class, "[C");
        cm_0.b(null);
        a.put(short[].class, "[S");
        a.put(int[].class, "[I");
        a.put(long[].class, "[J");
        a.put(float[].class, "[F");
        a.put(double[].class, "[D");
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

