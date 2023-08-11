/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.eJ;
import manthe.ej_0;
import manthe.z0;

/*
 * Renamed from manthe.nc
 */
class nc_0
implements Comparator<ej_0> {
    final eJ a;
    final z0 b;

    nc_0(z0 z02, eJ eJ2) {
        this.b = z02;
        this.a = eJ2;
    }

    public int a(ej_0 ej_02, ej_0 ej_03) {
        double d3;
        double d4 = ej_02.a(this.a);
        if (d4 == (d3 = (double)ej_03.a(this.a))) {
            return 0;
        }
        return d4 > d3 ? 1 : -1;
    }
}

