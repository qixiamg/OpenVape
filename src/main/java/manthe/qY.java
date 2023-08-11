/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.mq;
import manthe.on;
import manthe.pJ;
import manthe.u9;
import manthe.uV;

public class qY
implements u9 {
    private String a;
    private boolean e;
    private pJ d;
    private uV b = new uV();
    private static int c;

    public qY(String string) {
        this(string, pJ.INFO, false);
    }

    public qY(String string, boolean bl) {
        this(string, pJ.INFO, bl);
    }

    public qY(String string, pJ pJ2) {
        this(string, pJ2, false);
    }

    public qY(String string, pJ pJ2, boolean bl) {
        this.a = string == null ? "null" : string;
        this.d = pJ2;
        this.e = bl;
    }

    @Override
    public double a() {
        String[] stringArray;
        mq mq2 = on.p.j();
        double d3 = 0.0;
        for (String string : stringArray = this.a.split("\n")) {
            d3 += mq2.a(string) + 3.0;
        }
        return (d3 + 4.0) * 0.9;
    }

    @Override
    public double b() {
        String[] stringArray;
        mq mq2 = on.p.j();
        double d3 = 0.0;
        for (String string : stringArray = this.a.split("\n")) {
            double d4 = mq2.b(string);
            if (!(d4 > d3)) continue;
            d3 = d4;
        }
        return (d3 + 2.0) * 0.9;
    }

    @Override
    public void a(double d3, double d4) {
        mq mq2 = on.p.a(0.9);
        String[] stringArray = this.a.split("\n");
        double d5 = d4;
        for (String string : stringArray) {
            if (this.e) {
                mq2.a(string, d3, d5, this.b.r);
            } else {
                mq2.c(string, d3, d5, this.b.r);
            }
            d5 += mq2.a(string) + 3.0;
        }
    }

    public static void b(int n6) {
        c = n6;
    }

    public static int d() {
        return c;
    }

    public static int c() {
        int n6 = qY.d();
        if (n6 == 0) {
            return 99;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (qY.d() != 0) {
            qY.b(4);
        }
    }
}

