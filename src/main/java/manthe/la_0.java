/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.ds_2;
import manthe.kl_0;

/*
 * Renamed from manthe.la
 */
public class la_0
extends kl_0 {
    static float d = 0.0f;
    static float f = 0.0f;
    private static int e;

    @Override
    public boolean fire() {
        float f10 = ds_2.O().g();
        f += 1.0f;
        if (f10 != d && f >= 10.0f) {
            f = 0.0f;
        }
        if (f > 0.0f) {
            this.a(true);
        }
        d = f10;
        return super.fire();
    }

    static {
        la_0.b(27);
    }

    public static void b(int n6) {
        e = n6;
    }

    public static int f() {
        return e;
    }

    public static int e() {
        int n6 = la_0.f();
        if (n6 == 0) {
            return 83;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

