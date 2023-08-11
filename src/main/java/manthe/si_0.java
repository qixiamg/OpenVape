/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import a.c;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.oz;
import manthe.qE;

/*
 * Renamed from manthe.si
 */
public abstract class si_0
implements oz {
    private final Class c;
    private qE a;
    private static boolean b;

    public si_0(String string, int n6) {
        this.c = a.a.gc(string);
        a.c.reg(this.c, n6);
    }

    public si_0(Class clazz, int n6) {
        this.c = clazz;
        a.c.reg(this.c, n6);
    }

    @Override
    public abstract void a(Object var1);

    @Override
    public Class a() {
        return this.c;
    }

    public qE d() {
        return this.a;
    }

    public void a(qE qE2) {
        this.a = qE2;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean e() {
        return b;
    }

    public static boolean c() {
        boolean bl = si_0.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!si_0.e()) {
            si_0.b(true);
        }
    }
}

