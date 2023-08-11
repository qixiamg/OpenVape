/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.ko
 */
public class ko_0
extends gJ {
    private final bp_1 a = this.a("isOpen", false, Boolean.TYPE, new Class[0]);
    private static boolean d;

    public ko_0() {
        super(A5.f);
    }

    private boolean a(Object object) {
        return this.a.h(object, new Object[0]);
    }

    static boolean a(ko_0 ko_02, Object object) {
        return ko_02.a(object);
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean f() {
        return d;
    }

    public static boolean e() {
        boolean bl = ko_0.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (ko_0.f()) {
            ko_0.b(true);
        }
    }
}

