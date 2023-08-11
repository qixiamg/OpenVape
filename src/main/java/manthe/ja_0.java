/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.ja
 */
public class ja_0
extends gJ {
    private final BG e;
    private final BG a;
    private final BG f;
    private BG g;
    private BG h;
    private static String d;

    public ja_0() {
        super(A5.ct);
        if (V.c() >= 15) {
            this.g = this.b("particleType", true, A5.cm);
            this.e = this.b("xCoord", true, Float.TYPE);
            this.a = this.b("yCoord", true, Float.TYPE);
            this.f = this.b("zCoord", true, Float.TYPE);
        } else {
            this.h = this.b("field_149236_a", false, String.class);
            this.e = this.b("field_149234_b", false, Float.TYPE);
            this.a = this.b("field_149235_c", false, Float.TYPE);
            this.f = this.b("field_149232_d", false, Float.TYPE);
        }
    }

    private Object c(Object object) {
        return this.g.f(object);
    }

    private float a(Object object) {
        return this.e.b(object);
    }

    private float b(Object object) {
        return this.a.b(object);
    }

    private float e(Object object) {
        return this.f.b(object);
    }

    private String d(Object object) {
        return (String)this.h.f(object);
    }

    static Object e(ja_0 ja_02, Object object) {
        return ja_02.c(object);
    }

    static String b(ja_0 ja_02, Object object) {
        return ja_02.d(object);
    }

    static float d(ja_0 ja_02, Object object) {
        return ja_02.a(object);
    }

    static float c(ja_0 ja_02, Object object) {
        return ja_02.b(object);
    }

    static float a(ja_0 ja_02, Object object) {
        return ja_02.e(object);
    }

    public static void b(String string) {
        d = string;
    }

    public static String d() {
        return d;
    }

    static {
        if (ja_0.d() != null) {
            ja_0.b("T4WYxb");
        }
    }
}

