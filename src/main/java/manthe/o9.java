/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.du_2;
import manthe.pA;
import manthe.zS;

class o9 {
    private List<double[]> a;
    private int b;
    final zS c;

    private o9(zS zS2, double d3, double d4) {
        this.c = zS2;
        this.a = new ArrayList<double[]>();
        this.a.add(new double[]{d3, d4});
    }

    private o9 a(double d3, double d4, int n6) {
        if (n6 - this.b > 5) {
            this.a.clear();
        }
        this.b = n6;
        this.a.add(new double[]{d3, d4});
        if (this.a.size() > 6) {
            ArrayList arrayList = new ArrayList(du_2.a(this.a));
            this.a.clear();
            for (int i = 0; i < 6 && i < arrayList.size(); ++i) {
                this.a.add((double[])arrayList.get(i));
            }
            this.a = du_2.a(this.a);
        }
        return this;
    }

    private double[] a() {
        int n6 = this.a.size();
        double d3 = 0.0;
        double d4 = 0.0;
        for (double[] dArray : this.a) {
            d3 += dArray[0];
            d4 += dArray[1];
        }
        return new double[]{d3 / (double)n6, d4 / (double)n6};
    }

    static o9 a(o9 o92, double d3, double d4, int n6) {
        return o92.a(d3, d4, n6);
    }

    o9(zS zS2, double d3, double d4, pA pA2) {
        this(zS2, d3, d4);
    }

    static double[] a(o9 o92) {
        return o92.a();
    }
}

