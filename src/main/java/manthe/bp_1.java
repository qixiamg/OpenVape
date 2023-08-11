/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.b;
import java.lang.reflect.Method;
import manthe.cm_0;
import manthe.on;

/*
 * Renamed from manthe.bP
 */
public class bp_1 {
    private static int f = 0;
    private final int g;
    private final Class d;
    private final boolean a;
    private String e;
    private boolean b;
    private Class[] c;

    public bp_1(Class clazz, String string, boolean bl, boolean bl2, Class clazz2, Class ... classArray) {
        this.c = classArray;
        this.a = bl2;
        this.g = ++f;
        this.d = clazz;
        try {
            this.e = cm_0.a(clazz2, classArray);
            if (bl) {
                a.b.a(this.g, clazz, string, this.e, bl2);
            } else {
                a.b.b(this.g, clazz, string, this.e, bl2);
            }
        }
        catch (Exception exception) {
            this.b = true;
        }
    }

    public bp_1(Class clazz, String string, boolean bl, boolean bl2, String string2) {
        this.c = new Class[0];
        this.a = bl2;
        this.g = ++f;
        this.d = clazz;
        try {
            this.e = "()" + string2;
            if (bl) {
                a.b.a(this.g, clazz, string, string2, bl2);
            } else {
                a.b.b(this.g, clazz, string, string2, bl2);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void p(Object object, Object ... objectArray) {
        a.b.c(this.g, object, objectArray);
    }

    public boolean h(Object object, Object ... objectArray) {
        return a.b.d(this.g, object, objectArray);
    }

    public char s(Object object, Object ... objectArray) {
        return a.b.e(this.g, object, objectArray);
    }

    public short b(Object object, Object ... objectArray) {
        return a.b.f(this.g, object, objectArray);
    }

    public int o(Object object, Object ... objectArray) {
        return a.b.g(this.g, object, objectArray);
    }

    public long l(Object object, Object ... objectArray) {
        return a.b.h(this.g, object, objectArray);
    }

    public float f(Object object, Object ... objectArray) {
        return a.b.i(this.g, object, objectArray);
    }

    public double m(Object object, Object ... objectArray) {
        return a.b.j(this.g, object, objectArray);
    }

    public byte k(Object object, Object ... objectArray) {
        return a.b.ddd(this.g, object, objectArray);
    }

    public Object e(Object object, Object ... objectArray) {
        return a.b.k(this.g, object, objectArray);
    }

    public boolean[] q(Object object, Object ... objectArray) {
        return a.b.l(this.g, object, objectArray);
    }

    public char[] d(Object object, Object ... objectArray) {
        return a.b.m(this.g, object, objectArray);
    }

    public short[] r(Object object, Object ... objectArray) {
        return a.b.n(this.g, object, objectArray);
    }

    public int[] j(Object object, Object ... objectArray) {
        return a.b.o(this.g, object, objectArray);
    }

    public long[] c(Object object, Object ... objectArray) {
        return a.b.p(this.g, object, objectArray);
    }

    public float[] n(Object object, Object ... objectArray) {
        return a.b.q(this.g, object, objectArray);
    }

    public double[] i(Object object, Object ... objectArray) {
        return a.b.r(this.g, object, objectArray);
    }

    public Object[] g(Object object, Object ... objectArray) {
        return a.b.s(this.g, object, objectArray);
    }

    public void a(Object object, Object ... objectArray) {
        a.b.bbb(this.g, object, objectArray);
    }

    public Object a(Object ... objectArray) {
        return a.b.ccc(this.g, this.d, objectArray);
    }

    public boolean a() {
        return this.b;
    }

    public String d() {
        return a.b.gmn(this.g);
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.a;
    }

    public Method e() {
        try {
            return this.d.getDeclaredMethod(this.d(), this.c);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            on.a(noSuchMethodException);
            return null;
        }
    }
}

