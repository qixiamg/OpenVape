/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

/*
 * Renamed from manthe.kk
 */
public class kk_0
extends gJ {
    private final BG a = this.a("configRenderResMul", false, Float.TYPE);
    private static int d;

    public kk_0() {
        super(A5.dR);
    }

    private float e() {
        return this.a.b(null);
    }

    static float a(kk_0 kk_02) {
        return kk_02.e();
    }

    public static void a(int n6) {
        d = n6;
    }

    public static int d() {
        return d;
    }

    public static int f() {
        int n6 = kk_0.d();
        if (n6 == 0) {
            return 18;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (kk_0.d() != 0) {
            kk_0.a(56);
        }
    }
}

