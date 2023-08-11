/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.bo_1;
import manthe.on;
import manthe.th_0;

/*
 * Renamed from manthe.bn
 */
public class bn_1
extends bo_1 {
    private static boolean b;

    public bn_1() {
        if (!on.p.h()) {
            th_0.b(A5.u);
            th_0.b(A5.aH);
            th_0.b(A5.b4);
            th_0.b(A5.bS);
            th_0.b(A5.bd);
            th_0.b(A5.b6);
            if (V.c() > 13) {
                th_0.b(A5.bC);
                th_0.b(A5.b8);
                th_0.b(A5.ao);
                th_0.b(A5.aY);
            }
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    public static boolean d() {
        boolean bl = bn_1.c();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!bn_1.d()) {
            bn_1.b(true);
        }
    }
}

