/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.pf_0;

/*
 * Renamed from manthe.qk
 */
class qk_0
implements Comparator {
    private final int a;

    public qk_0(int n6) {
        this.a = n6;
    }

    public int compare(Object object, Object object2) {
        int n6 = (Integer)object;
        int n10 = (Integer)object2;
        int n11 = this.a % 9;
        int n12 = (this.a - n11) / 9;
        int n13 = n6 % 9;
        int n14 = (n6 - n13) / 9;
        double d3 = pf_0.a(n13, n14, n11, n12);
        int n15 = n10 % 9;
        int n16 = (n10 - n15) / 9;
        double d4 = pf_0.a(n15, n16, n11, n12) + 1.0;
        return Double.compare(d3, d4);
    }
}

