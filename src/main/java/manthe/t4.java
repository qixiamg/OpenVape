/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import javassist.CtClass;
import javassist.CtMethod;
import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.kE;
import manthe.kX;
import manthe.km_0;
import manthe.on;
import manthe.th_0;
import manthe.yh_0;

public class t4
extends th_0 {
    private String l;
    private String p;
    private String m;
    private String k;
    private String i;
    private CtClass j;
    private bp_1 o = null;
    private bp_1 n = null;

    public t4(Class clazz) {
        super(clazz);
    }

    private void i() {
        this.o = V.c() >= 15 ? on.p.M().aJ.k : on.p.M().aw.k;
        this.n = on.p.M().M.ai;
        this.l = on.p.M().bZ.e.a();
        this.i = on.p.M().bZ.e.c();
        this.p = on.p.M().M.j.a();
        this.m = on.p.M().M.ac.a();
        this.k = on.p.M().M.af.a();
        this.j = this.d(A5.b4);
        String string = km_0.class.getName();
        CtMethod ctMethod = this.b(this.o);
        this.a(this.o, kE.class, "$0");
        this.b(this.o, kX.class, "$0");
        boolean bl = on.p.h();
        if (bl && a.a.gc("aaa") == null) {
            bl = false;
        }
        boolean bl2 = bl;
        try {
            CtClass ctClass = this.d(A5.ba);
            ctMethod.instrument(new yh_0(this, bl2, ctClass, string));
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void c() {
        this.i();
    }

    static String e(t4 t42) {
        return t42.p;
    }

    static String f(t4 t42) {
        return t42.m;
    }

    static String d(t4 t42) {
        return t42.k;
    }

    static String c(t4 t42) {
        return t42.l;
    }

    static String a(t4 t42) {
        return t42.i;
    }

    static CtClass b(t4 t42) {
        return t42.j;
    }
}

