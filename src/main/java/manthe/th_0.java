/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javassist.ByteArrayClassPath;
import javassist.CannotCompileException;
import javassist.ClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.LoaderClassPath;
import javassist.NotFoundException;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.bp_1;
import manthe.cg_1;
import manthe.cy_0;
import manthe.fw_0;
import manthe.g2;
import manthe.on;
import manthe.u2;

/*
 * Renamed from manthe.th
 */
public abstract class th_0
implements g2 {
    static ClassPool a = ClassPool.getDefault();
    static List<Class> d = new ArrayList<Class>();
    static int g = 0;
    protected Class b;
    protected byte[] e;
    protected byte[] f;
    private CtClass c;
    private boolean h;

    public th_0(Class clazz) {
        block2: {
            this.b = clazz;
            cy_0[] cy_0Array = u2.g();
            this.e = a.a.gcb(clazz);
            if (cy_0Array == null) {
                if (!on.p.h()) {
                    fw_0.f().h().put(clazz.getName(), clazz);
                }
                this.h();
                this.c.defrost();
                th_0.a(new LoaderClassPath(clazz.getClassLoader()), clazz);
            }
            if (!cy_0.b()) break block2;
            u2.b(new cy_0[1]);
        }
    }

    public static void a(ClassPath classPath, Class clazz) {
        if (d.contains(clazz)) {
            return;
        }
        d.add(clazz);
        a.insertClassPath(classPath);
    }

    public static void b(Class clazz) {
        if (clazz == null) {
            return;
        }
        if (d.contains(clazz)) {
            return;
        }
        th_0.a(new ByteArrayClassPath(clazz.getName(), a.a.gcb(clazz)), clazz);
        if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
            th_0.b(clazz.getSuperclass());
        }
    }

    public static void a(Class clazz) {
        if (clazz == null) {
            return;
        }
        if (d.contains(clazz)) {
            return;
        }
        th_0.a(new ByteArrayClassPath(clazz.getName(), a.a.gcb(clazz)), clazz);
        if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
            th_0.a(clazz.getSuperclass());
        }
    }

    public static void c(Class clazz) {
        if (!on.p.h()) {
            a.a.gcb(clazz);
            String string = clazz.getName();
            Set set = fw_0.f().g();
            set.remove(string);
            fw_0.f().h().put(string, clazz);
            if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
                th_0.c(clazz.getSuperclass());
            }
        }
    }

    @Override
    public abstract void c();

    public void a(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            fileOutputStream.write(this.f);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    public void g() {
    }

    @Override
    public boolean e() {
        return this.h;
    }

    @Override
    public void a() {
        block3: {
            int n6;
            cy_0[] cy_0Array = u2.g();
            th_0 th_02 = this;
            if (cy_0Array == null) {
                if (th_02.f == null) {
                    return;
                }
                th_02 = this;
            }
            if ((n6 = a.a.scb(th_02.b, this.f)) != 0) {
                // empty if block
            }
            if (n6 != 0) break block3;
            this.h = true;
        }
    }

    @Override
    public void b() {
        int n6 = a.a.scb(this.b, this.e);
    }

    @Override
    public Class f() {
        return this.b;
    }

    public CtClass h() {
        try {
            this.c = a.makeClass(new ByteArrayInputStream(this.e), false);
            return this.c;
        }
        catch (IOException iOException) {
            on.a(iOException);
            return null;
        }
    }

    public CtClass d(Class clazz) {
        try {
            return a.get(clazz.getName());
        }
        catch (NotFoundException notFoundException) {
            on.a(notFoundException);
            return null;
        }
    }

    public String a(Class clazz, String string, String string2, String string3, String string4) {
        String string5 = clazz.getName() + " " + string + " = new " + clazz.getName() + "(" + string2 + ");\n";
        string5 = string5 + "if(" + string + ".fire()) { return " + string3 + "; } " + string4;
        string5 = "{ " + string5 + " }";
        cy_0[] cy_0Array = u2.g();
        if (cy_0Array != null) {
            cy_0.b(!cy_0.b());
        }
        return string5;
    }

    public CtMethod b(bp_1 bp_12) {
        try {
            return this.c.getMethod(bp_12.d(), bp_12.b());
        }
        catch (NotFoundException notFoundException) {
            on.a(notFoundException);
            return null;
        }
    }

    public String a(CtMethod ctMethod, Class clazz, String string, boolean bl, String string2, String string3) {
        th_0.c(clazz);
        th_0.a(clazz);
        String string4 = "";
        try {
            string4 = "event" + ++g;
            string3 = string3.replace("$event", string4);
            ctMethod.addLocalVariable(string4, this.d(clazz));
            String string5 = this.a(clazz, string4, string, string2, string3);
            if (bl) {
                ctMethod.insertBefore(string5);
            } else {
                ctMethod.insertAfter(string5);
            }
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
        this.c.defrost();
        return string4;
    }

    public void a(cg_1 cg_12) {
        th_0.c(cg_12.e());
        th_0.a(cg_12.e());
        try {
            CtMethod ctMethod = this.b(cg_12.a());
            if (cg_12.c()) {
                ctMethod.insertBefore(cg_12.b());
            } else {
                ctMethod.insertAfter(cg_12.b());
            }
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
        this.c.defrost();
    }

    public void c(bp_1 bp_12) {
        CtMethod ctMethod = this.b(bp_12);
        try {
            ctMethod.insertBefore("System.out.println(\"test\");");
        }
        catch (CannotCompileException cannotCompileException) {
            on.a(cannotCompileException);
        }
    }

    public String b(CtMethod ctMethod, Class clazz, String string, String string2, String string3) {
        return this.a(ctMethod, clazz, string, true, string2, string3);
    }

    public String a(CtMethod ctMethod, Class clazz, String string, String string2, String string3) {
        return this.a(ctMethod, clazz, string, false, string2, string3);
    }

    public String a(bp_1 bp_12, Class clazz, String string) {
        return this.b(this.b(bp_12), clazz, string, "", "");
    }

    public String b(bp_1 bp_12, Class clazz, String string) {
        return this.a(this.b(bp_12), clazz, string, "", "");
    }

    public String b(bp_1 bp_12, Class clazz, String string, String string2) {
        return this.b(this.b(bp_12), clazz, string, string2, "");
    }

    public String a(bp_1 bp_12, Class clazz, String string, String string2) {
        return this.a(this.b(bp_12), clazz, string, string2, "");
    }

    public String b(bp_1 bp_12, Class clazz, String string, String string2, String string3) {
        return this.b(this.b(bp_12), clazz, string, string2, string3);
    }

    public String a(bp_1 bp_12, Class clazz, String string, String string2, String string3) {
        return this.a(this.b(bp_12), clazz, string, string2, string3);
    }

    public void a(bp_1 bp_12) {
        try {
            CtClass ctClass = ClassPool.getDefault().get("java.lang.Exception");
            this.b(bp_12).addCatch("{ return; }", ctClass);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void d() {
        try {
            this.f = this.c.toBytecode();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

