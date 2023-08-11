/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

public class DF extends BasicValue<Double, sV> {
    private double l = 0.01;

    public DF(Object object, String string, sV sV2) {
        super(object, string, sV2);
    }

    public static DF a(Object object, String string, String string2, String string3, String string4, double d3, double d4, double d5) {
        sV sV2 = new sV(d5, d3, 0.01, string3, string4, string2);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d4);
        DF dF = new DF(object, string, sV2);
        dF.setType(d4);
        sV2.a(dF);
        return dF;
    }

    public static DF a(Object object, String string, String string2, String string3, double d3, double d4, double d5, double d6, String string4) {
        sV sV2 = new sV(d5, d3, d6, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d4);
        DF dF = new DF(object, string, sV2);
        dF.setType(d4);
        dF.l = d6;
        sV2.a(dF);
        sV2.b(string4);
        return dF;
    }

    public static DF a(Object object, String string, String string2, String string3, double d3, double d4, double d5, double d6) {
        sV sV2 = new sV(d5, d3, d6, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d4);
        DF dF = new DF(object, string, sV2);
        dF.setType(d4);
        dF.l = d6;
        sV2.a(dF);
        return dF;
    }

    public static DF a(Object object, String string, String string2, String string3, double d3, double d4, double d5, String string4) {
        sV sV2 = new sV(d5, d3, 0.01, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d4);
        DF dF = new DF(object, string, sV2);
        dF.setType(d4);
        sV2.a(dF);
        sV2.b(string4);
        return dF;
    }

    public static DF a(Object object, String string, String string2, String string3, double d3, double d4, double d5) {
        sV sV2 = new sV(d5, d3, 0.01, string2, " " + string3, string);
        sV2.c(100.0);
        sV2.b(7.0);
        sV2.f(d4);
        DF dF = new DF(object, string, sV2);
        sV2.a(dF);
        dF.setType(d4);
        return dF;
    }

    public double r() {
        return this.l;
    }

    public Double a() {
        return ((sV)this.getDefaultValue()).B();
    }

    @Override
    public void b(Double d3) {
        if (this.b() == null) {
            this.setType(d3);
        }
        if (d3 > ((sV)this.getDefaultValue()).C()) {
            this.b(((sV)this.getDefaultValue()).C());
        } else if (d3 < ((sV)this.getDefaultValue()).D()) {
            this.b(((sV)this.getDefaultValue()).D());
        }
        ((sV)this.getDefaultValue()).f(d3);
        this.d();
    }

    @Override
    public void getRuntimeCopyException(String string) {
        this.b(Double.parseDouble(string));
    }

    @Override
    public void setType(Double d3) {
        ((sV)this.getDefaultValue()).g(d3);
        this.d();
    }
}

