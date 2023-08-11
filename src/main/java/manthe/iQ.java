/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

public class iQ
extends gJ {
    public bp_1 d = this.a("computeVisibility", true, A5.dg, new Class[0]);
    public bp_1 e;
    private static boolean a;

    public iQ() {
        super(A5.b1);
        if (V.c() >= 23) {
            this.e = this.a("setOpaqueCube", true, Void.TYPE, A5.ao);
        } else if (V.c() > 13) {
            this.e = this.a("func_178606_a", cy_0.c, Void.TYPE, A5.ao);
        }
    }

    public static void b(boolean bl) {
        a = bl;
    }

    public static boolean d() {
        return a;
    }

    public static boolean e() {
        boolean bl = iQ.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!iQ.e()) {
            iQ.b(true);
        }
    }
}

