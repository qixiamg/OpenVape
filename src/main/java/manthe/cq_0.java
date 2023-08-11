/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import java.util.List;
import manthe.fG;
import manthe.fQ;
import manthe.on;
import manthe.u8;
import manthe.zP;

/*
 * Renamed from manthe.Cq
 */
class cq_0
implements Comparator<Integer> {
    final List b;
    final u8 a;

    cq_0(u8 u82, List list) {
        this.a = u82;
        this.b = list;
    }

    public int a(Integer n6, Integer n10) {
        try {
            fG fG2 = ((fQ)this.b.get(n6)).f();
            fG fG3 = ((fQ)this.b.get(n10)).f();
            double d3 = zP.b(fG2);
            double d4 = zP.b(fG3);
            return Double.compare(d3, d4);
        }
        catch (Exception exception) {
            on.a(exception);
            return 0;
        }
    }
}

