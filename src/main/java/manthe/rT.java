/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class rT
extends rf_0 {
    public rT(DY dY) {
        super(true);
        BooleanValue[] dBArray;
        aj_2 aj_22 = dY.r();
        this.j(false);
        this.b(qp.c);
        this.a(new D7(0.0, 1.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(120.0);
        this.a(true);
        for (BooleanValue dB : dBArray = new BooleanValue[]{aj_22.e(), aj_22.i(), aj_22.b(), aj_22.h(), aj_22.g(), aj_22.d(), aj_22.a()}) {
            this.b((p1)dB.getDefaultValue());
        }
        this.a(this.m(), null);
    }
}

