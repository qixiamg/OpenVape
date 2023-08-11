/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

/*
 * Renamed from manthe.hh
 */
public class hh_0
extends gJ {
    private final BG a = this.b("phase", false, A5.dw);
    private static boolean d;

    public hh_0() {
        super(A5.ce);
    }

    private Object a(Object object) {
        return this.a.f(object);
    }

    static Object a(hh_0 hh_02, Object object) {
        return hh_02.a(object);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = hh_0.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (hh_0.f()) {
            hh_0.b(true);
        }
    }
}

