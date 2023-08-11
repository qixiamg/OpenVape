/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.pe_0;
import manthe.uW;
import manthe.wM;

public class x2
extends wM {
    private Color A;
    private double B;
    private static boolean z;

    public x2(Color color) {
        this(color, 0.5);
    }

    public x2(Color color, double d3) {
        this.A = color;
        this.B = d3;
    }

    @Override
    public void a() {
        pe_0.c(this.d(), this.c(), this.e(), this.f(), this.A);
    }

    @Override
    public void k() {
        pe_0.c(this.d(), this.c(), this.e(), this.f(), this.A);
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double f() {
        return this.h();
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return this.B;
    }

    public static void f(boolean bl) {
        z = bl;
    }

    public static boolean l() {
        return z;
    }

    public static boolean m() {
        boolean bl = x2.l();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (x2.m()) {
            x2.f(true);
        }
    }
}

