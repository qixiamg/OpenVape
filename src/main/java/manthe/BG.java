/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.b;
import java.lang.reflect.Field;
import manthe.cm_0;
import manthe.on;

public class BG {
    private static int b = 0;
    private final int c;
    private final boolean f;
    private final String g;
    private boolean a;
    private Class d;
    private static int[] e;

    public BG(Class clazz, String string, boolean bl, boolean bl2, Class clazz2) {
        this(clazz, string, bl, bl2, cm_0.a(clazz2));
    }

    public BG(Class clazz, String string, boolean bl, boolean bl2, String string2) {
        this(clazz, string, bl, bl2, string2, false);
    }

    public BG(Class clazz, String string, boolean bl, boolean bl2, String string2, boolean bl3) {
        this.d = clazz;
        this.f = bl2;
        this.c = ++b;
        if (bl3) {
            string2 = "[" + string2;
        }
        try {
            if (bl) {
                a.b.t(this.c, clazz, string, string2, bl2);
            } else {
                a.b.u(this.c, clazz, string, string2, bl2);
            }
        }
        catch (Exception exception) {
            this.a = true;
        }
        this.g = string2;
    }

    public boolean d(Object object) {
        return a.b.v(this.c, object);
    }

    public char n(Object object) {
        return a.b.w(this.c, object);
    }

    public short p(Object object) {
        return a.b.x(this.c, object);
    }

    public int c(Object object) {
        return a.b.y(this.c, object);
    }

    public long l(Object object) {
        return a.b.z(this.c, object);
    }

    public float b(Object object) {
        return a.b.aa(this.c, object);
    }

    public double g(Object object) {
        return a.b.bb(this.c, object);
    }

    public Object f(Object object) {
        return a.b.cc(this.c, object);
    }

    public boolean[] o(Object object) {
        return a.b.dd(this.c, object);
    }

    public char[] a(Object object) {
        return a.b.ee(this.c, object);
    }

    public short[] m(Object object) {
        return a.b.ff(this.c, object);
    }

    public int[] k(Object object) {
        return a.b.gg(this.c, object);
    }

    public long[] j(Object object) {
        return a.b.hh(this.c, object);
    }

    public float[] h(Object object) {
        return a.b.ii(this.c, object);
    }

    public double[] i(Object object) {
        return a.b.jj(this.c, object);
    }

    public Object[] e(Object object) {
        return a.b.kk(this.c, object);
    }

    public void a(Object object, boolean bl) {
        a.b.ll(this.c, object, bl);
    }

    public void a(Object object, char c2) {
        a.b.mm(this.c, object, c2);
    }

    public void a(Object object, short s10) {
        a.b.nn(this.c, object, s10);
    }

    public void a(Object object, int n6) {
        a.b.oo(this.c, object, n6);
    }

    public void a(Object object, long l6) {
        a.b.pp(this.c, object, l6);
    }

    public void a(Object object, float f10) {
        a.b.qq(this.c, object, f10);
    }

    public void a(Object object, double d3) {
        a.b.rr(this.c, object, d3);
    }

    public void a(Object object, Object object2) {
        a.b.ss(this.c, object, object2);
    }

    public void a(Object object, boolean[] blArray) {
        a.b.tt(this.c, object, blArray);
    }

    public void a(Object object, char[] cArray) {
        a.b.uu(this.c, object, cArray);
    }

    public void a(Object object, short[] sArray) {
        a.b.vv(this.c, object, sArray);
    }

    public void a(Object object, int[] nArray) {
        a.b.ww(this.c, object, nArray);
    }

    public void a(Object object, long[] lArray) {
        a.b.xx(this.c, object, lArray);
    }

    public void a(Object object, float[] fArray) {
        a.b.yy(this.c, object, fArray);
    }

    public void a(Object object, double[] dArray) {
        a.b.zz(this.c, object, dArray);
    }

    public void a(Object object, Object[] objectArray) {
        a.b.aaa(this.c, object, objectArray);
    }

    public boolean d() {
        return this.a;
    }

    public String a() {
        return a.b.gfn(this.c);
    }

    public boolean b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public Field f() {
        try {
            Field field = this.d.getDeclaredField(this.a());
            field.setAccessible(true);
            return field;
        }
        catch (Exception exception) {
            on.a(exception);
            return null;
        }
    }

    static {
        BG.b(new int[3]);
    }

    public static void b(int[] nArray) {
        e = nArray;
    }

    public static int[] e() {
        return e;
    }
}

