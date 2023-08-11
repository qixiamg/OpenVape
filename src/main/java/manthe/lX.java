/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.kl_0;
import manthe.on;

public class lX
extends kl_0 {
    private static boolean e = false;
    private final float d;
    private static int f;

    public lX(float f10) {
        this.d = f10;
        if (!e) {
            on.p.g();
            on.p.u().a(true);
            e = true;
        }
    }

    @Override
    public boolean fire() {
        if (!e) {
            on.p.g();
            on.p.u().a(true);
            e = true;
            return false;
        }
        return false;
    }

    static {
        lX.b(40);
    }

    public static void b(int n6) {
        f = n6;
    }

    public static int e() {
        return f;
    }

    public static int f() {
        int n6 = lX.e();
        if (n6 == 0) {
            return 55;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

