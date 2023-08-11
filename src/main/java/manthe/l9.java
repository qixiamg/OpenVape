/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.cv_0;
import manthe.kl_0;

public class l9
extends kl_0 {
    private final cv_0 e;
    private static boolean d;

    public l9(cv_0 cv_02) {
        this.e = cv_02;
    }

    public cv_0 getForgeEvent() {
        return this.e;
    }

    public static void b(boolean bl) {
        d = bl;
    }

    public static boolean e() {
        return d;
    }

    public static boolean f() {
        boolean bl = l9.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (l9.f()) {
            l9.b(true);
        }
    }
}

