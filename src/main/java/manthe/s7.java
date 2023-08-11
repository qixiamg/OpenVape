/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class s7
extends sI {
    private final Module W;
    private final ok_0 V;
    private boolean X;
    private String Y;

    public s7(Module y52) {
        super(y52.H(), null);
        this.W = y52;
        this.Y = y52.H();
        this.b(this.W.M());
        this.V = new oW(this, y52, this.W());
        vK vK2 = this.W().a();
        this.W().a(new bD(this, y52, vK2));
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        this.a(new cc_0(this, y52, zu_02));
        for (p1 p12 : this.W.K()) {
            this.d(p12);
        }
        this.Y().a(new qc(this, y52));
        this.H.a(new vY(this, y52));
        this.H.a(new ah_0(this, y52));
        this.l(true);
    }

    private void a(String string, long l6) {
        new mJ(this, string, l6).start();
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
    }

    public void ae() {
        super.F();
    }

    @Override
    public void F() {
        if (this.W.n() && !a.ib() || this.W.p()) {
            return;
        }
        this.ae();
        if (this.W.p()) {
            return;
        }
        this.W.d(this.G());
    }

    @Override
    public boolean G() {
        return super.G();
    }

    @Override
    public void g(boolean bl) {
        this.W.d(bl);
    }

    public Module ad() {
        return this.W;
    }

    public ok_0 ac() {
        return this.V;
    }

    public void a(String string) {
        this.Y = string;
        this.W().z().a(string);
    }

    public void p(boolean bl) {
        this.H.a(bl);
    }

    static String e(s7 s72) {
        return s72.Y;
    }

    static void a(s7 s72, String string, long l6) {
        s72.a(string, l6);
    }

    static ok_0 c(s7 s72) {
        return s72.V;
    }

    static boolean b(s7 s72) {
        return s72.X;
    }

    static boolean a(s7 s72, boolean bl) {
        s72.X = bl;
        return s72.X;
    }

    static boolean a(s7 s72) {
        return super.Z();
    }

    static boolean d(s7 s72) {
        return super.Z();
    }

    static r9 f(s7 s72) {
        return super.Y();
    }

    static Module g(s7 s72) {
        return s72.W;
    }
}

