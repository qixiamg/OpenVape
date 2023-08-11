/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Cj;
import manthe.ai_0;
import manthe.bp_0;
import manthe.qd_0;

public class D_ {
    private String c;
    private qd_0 a;
    private static int b;

    public qd_0 a() {
        return this.a;
    }

    public qd_0 a(String string) {
        this.a = new ai_0().a(string);
        if (this.a != null) {
            this.c = string;
        }
        return this.a;
    }

    public Cj b() {
        if (this.c == null) {
            return null;
        }
        return new bp_0().a(this.c);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int d() {
        return b;
    }

    public static int c() {
        int n6 = D_.d();
        if (n6 == 0) {
            return 44;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (D_.c() != 0) {
            D_.b(51);
        }
    }
}

