/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import manthe.d0_0;
import manthe.ds_2;
import manthe.mq;

public class mc
extends mq {
    public mc(String string, int n6) {
        super(null, n6);
        a.mfv2(this.b(), n6, string);
    }

    @Override
    public void a(String string, double d3, double d4, int n6, boolean bl) {
        d0_0 d0_02 = ds_2.p();
        int n10 = d0_02.f();
        a.dsv2(this.b(), string, d3 *= (double)n10, d4 *= (double)n10, n6, 1.0f);
    }

    @Override
    public double a(String string) {
        return this.a(string, true);
    }

    @Override
    public double a(String string, boolean bl) {
        d0_0 d0_02 = ds_2.p();
        int n6 = d0_02.f();
        return a.gshv2(this.b(), string) / (double)n6;
    }

    @Override
    public double b(String string, boolean bl) {
        d0_0 d0_02 = ds_2.p();
        int n6 = d0_02.f();
        return a.gswv2(this.b(), string) / (double)n6;
    }

    @Override
    public double b(String string) {
        return this.b(string, true);
    }
}

