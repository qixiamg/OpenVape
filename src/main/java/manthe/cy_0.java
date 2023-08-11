/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.on;

/*
 * Renamed from manthe.cy
 */
public class cy_0 {
    public static on a = on.p;
    public static boolean c;
    protected final Object b;
    private static boolean d;

    public cy_0(Object object) {
        if (object instanceof cy_0) {
            cy_0 cy_02 = (cy_0)object;
            this.b = cy_02.a();
            return;
        }
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == null || this.b == null) {
            return false;
        }
        if (object instanceof cy_0) {
            cy_0 cy_02 = (cy_0)object;
            return this.b.equals(cy_02.b);
        }
        return super.equals(object);
    }

    public boolean e() {
        return this.b == null;
    }

    public boolean d() {
        return !this.e();
    }

    public boolean a(Class clazz) {
        return this.d() && clazz != null && clazz.isInstance(this.b);
    }

    public String toString() {
        if (this.b == null) {
            return "Null instance";
        }
        return this.b.toString();
    }

    static {
        cy_0.b(false);
        c = a.h();
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean b() {
        return d;
    }

    public static boolean c() {
        boolean bl = cy_0.b();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

