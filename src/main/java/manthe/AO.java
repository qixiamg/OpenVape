/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class AO {
    long c;
    private static String b;

    public AO() {
        this.d();
    }

    public long c() {
        return System.currentTimeMillis() - this.c;
    }

    public boolean a(long l6) {
        return this.c() >= l6;
    }

    public void d() {
        this.c = System.currentTimeMillis();
    }

    public void b(long l6) {
        this.c = System.currentTimeMillis() + l6;
    }

    public long a() {
        return this.c;
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (AO.b() != null) {
            AO.b("a0RAtb");
        }
    }
}

