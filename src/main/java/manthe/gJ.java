/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.BG;
import manthe.bp_1;
import manthe.t_0;

public class gJ {
    protected Class c;
    private static int b;

    public gJ(String string) {
        this.c = a.gc(string);
        t_0.b_.add(this);
    }

    public gJ(Class clazz) {
        this.c = clazz;
        t_0.b_.add(this);
    }

    protected bp_1 a(String string, boolean bl, Class clazz, Class ... classArray) {
        return new bp_1(this.c, string, bl, false, clazz, classArray);
    }

    protected bp_1 a(Class clazz, String string, boolean bl, Class clazz2, Class ... classArray) {
        return new bp_1(clazz, string, bl, false, clazz2, classArray);
    }

    protected bp_1 c(String string, boolean bl, String string2) {
        return new bp_1(this.c, string, bl, false, string2);
    }

    protected bp_1 b(String string, boolean bl, Class clazz, Class ... classArray) {
        return new bp_1(this.c, string, bl, true, clazz, classArray);
    }

    protected bp_1 b(Class clazz, String string, boolean bl, Class clazz2, Class ... classArray) {
        return new bp_1(clazz, string, bl, true, clazz2, classArray);
    }

    protected BG b(String string, boolean bl, Class clazz) {
        return new BG(this.c, string, bl, false, clazz);
    }

    protected BG a(String string, boolean bl, String string2) {
        return new BG(this.c, string, bl, false, string2);
    }

    protected BG a(String string, boolean bl, Class clazz) {
        return new BG(this.c, string, bl, true, clazz);
    }

    protected BG a(Class clazz, String string, boolean bl, Class clazz2) {
        return new BG(clazz, string, bl, true, clazz2);
    }

    protected BG b(String string, boolean bl, String string2) {
        return new BG(this.c, string, bl, true, string2);
    }

    public Class c() {
        return this.c;
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        int n6 = gJ.b();
        if (n6 == 0) {
            return 68;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException b(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (gJ.b() == 0) {
            gJ.b(6);
        }
    }
}

