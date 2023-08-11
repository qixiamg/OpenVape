/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.da_0;

/*
 * Renamed from manthe.kl
 */
public class kl_0 {
    protected int a = da_0.b;
    private boolean c;
    private static cy_0[] b;

    public boolean fire() {
        return this.c;
    }

    public boolean c() {
        return this.a == da_0.b;
    }

    public boolean d() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public int a() {
        return this.a;
    }

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] b() {
        return b;
    }

    static {
        if (kl_0.b() == null) {
            kl_0.b(new cy_0[4]);
        }
    }
}

