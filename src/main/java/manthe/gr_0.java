/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.UUID;
import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.gr
 */
public class gr_0
extends gJ {
    private final bp_1 e;
    private final bp_1 a;
    private final bp_1 d = this.a("<init>", false, Void.TYPE, UUID.class, String.class);
    private static int[] f;

    public gr_0() {
        super(A5.al);
        this.e = this.a("getId", false, UUID.class, new Class[0]);
        this.a = this.a("getName", false, String.class, new Class[0]);
    }

    private Object a(UUID uUID, String string) {
        return this.d.a(new Object[]{uUID, string});
    }

    private UUID b(Object object) {
        return (UUID)this.e.e(object, new Object[0]);
    }

    private String a(Object object) {
        return (String)this.a.e(object, new Object[0]);
    }

    static Object a(gr_0 gr_02, UUID uUID, String string) {
        return gr_02.a(uUID, string);
    }

    static UUID a(gr_0 gr_02, Object object) {
        return gr_02.b(object);
    }

    static String b(gr_0 gr_02, Object object) {
        return gr_02.a(object);
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    public static int[] d() {
        return f;
    }

    static {
        if (gr_0.d() == null) {
            gr_0.b(new int[2]);
        }
    }
}

