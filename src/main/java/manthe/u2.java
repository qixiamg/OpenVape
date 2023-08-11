/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.tree.ClassNode
 */
package manthe;

import a.a;
import java.io.File;
import java.io.FileOutputStream;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.fw_0;
import manthe.g2;
import manthe.on;
import manthe.qa_0;
import manthe.vp;
import manthe.y_0;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public abstract class u2
implements g2 {
    protected Class b;
    protected byte[] c;
    protected byte[] d;
    private boolean a;
    protected ClassNode e;
    private static cy_0[] f;

    public u2(Class clazz) {
        if (!on.p.h()) {
            fw_0.f().h().put(clazz.getName(), clazz);
        }
        this.b = clazz;
        this.c = a.a.gcb(clazz);
        this.d = new byte[this.c.length];
        System.arraycopy(this.c, 0, this.d, 0, this.c.length);
        ClassReader classReader = new ClassReader(this.c);
        this.e = new ClassNode();
        classReader.accept((ClassVisitor)this.e, 0);
    }

    @Override
    public abstract void c();

    @Override
    public void d() {
    }

    public void h() {
        int n6 = 3;
        if (V.c() >= 23) {
            n6 = 2;
        }
        ClassWriter classWriter = new ClassWriter(n6);
        this.e.accept((ClassVisitor)classWriter);
        this.d = classWriter.toByteArray();
    }

    public void a(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(string));
            fileOutputStream.write(this.d);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void a() {
        this.h();
        int n6 = a.a.scb(this.b, this.d);
    }

    @Override
    public void b() {
        a.a.scb(this.b, this.c);
    }

    @Override
    public boolean e() {
        return this.a;
    }

    @Override
    public Class f() {
        return this.b;
    }

    public void a(bp_1 bp_12, Class clazz, y_0 ... y_0Array) {
        vp vp2 = new vp(0, clazz, this.e, new qa_0(bp_12.d(), bp_12.b()), bp_12.c(), y_0Array);
        vp2.a();
        vp2.b();
    }

    public void b(bp_1 bp_12, Class clazz, y_0 ... y_0Array) {
        vp vp2 = new vp(-1, clazz, this.e, new qa_0(bp_12.d(), bp_12.b()), bp_12.c(), y_0Array);
        vp2.a();
        vp2.b();
    }

    public static void b(cy_0[] cy_0Array) {
        f = cy_0Array;
    }

    public static cy_0[] g() {
        return f;
    }

    static {
        if (u2.g() != null) {
            u2.b(new cy_0[4]);
        }
    }
}

