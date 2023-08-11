/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.mq;
import manthe.pe_0;
import manthe.wM;
import manthe.xZ;

/*
 * Renamed from manthe.xn
 */
public class xn_0
extends xZ {
    private wM D;
    private boolean C = false;

    public xn_0(wM wM2, String string) {
        super(string, 0.75);
        this.D = wM2;
    }

    @Override
    public void a() {
        String[] stringArray;
        if (!this.C) {
            this.D.A();
            return;
        }
        mq mq2 = this.e(this.z);
        double d3 = mq2.a(this.A);
        double d4 = this.c() + d3 / 2.0;
        double d5 = 0.0;
        double d6 = 0.0;
        for (String string : stringArray = this.A.split("\n")) {
            double d7 = mq2.b(string);
            if (d7 > d6) {
                d6 = d7;
            }
            d5 += mq2.a(string) + 3.0;
        }
        pe_0.a(this.d() + 10.0, this.c(), d6 + 10.0, d5 + 2.5, xn_0.b.u);
        for (String string : stringArray) {
            mq2.a(string, this.d() + 15.0, d4, xn_0.b.r);
            d4 += mq2.a(string) + 3.0;
        }
        this.C = false;
    }

    public wM m() {
        return this.D;
    }

    public void f(boolean bl) {
        this.C = bl;
    }
}

