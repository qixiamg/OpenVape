/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.bo_1;
import manthe.td;
import manthe.th_0;

/*
 * Renamed from manthe.bi
 */
public class bi_1
extends bo_1 {
    private static int b;

    public bi_1() {
        th_0.b(A5.ba);
        th_0.b(A5.bT);
        th_0.b(A5.cC);
        th_0.b(A5.cF);
        this.a.add(new td());
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int c() {
        return b;
    }

    public static int d() {
        int n6 = bi_1.c();
        if (n6 == 0) {
            return 54;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (bi_1.c() != 0) {
            bi_1.b(4);
        }
    }
}

