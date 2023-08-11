/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.dj_1;
import manthe.dl_1;
import manthe.dr_2;
import manthe.dx_2;
import manthe.g1;
import manthe.gS;
import manthe.gg_0;
import manthe.hZ;

/*
 * Renamed from manthe.dA
 */
public class da_1
extends dx_2 {
    public da_1(Object object) {
        super(object);
    }

    public boolean b(gS gS2, int n6, int n10, int n11) {
        if (V.c() == 13) {
            return true;
        }
        g1 g12 = g1.a(n6, n10, n11);
        dl_1 dl_12 = gS2.a(g12);
        dl_1 dl_13 = new dl_1(da_1.a.M().a.a(this.b, dl_12.a(), gS2.a(), g12.a()));
        Object object = dl_13.a(da_1.i());
        if (object != null) {
            return object.toString().equals("foot");
        }
        return true;
    }

    public gg_0 c(gS gS2, int n6, int n10, int n11) {
        g1 g12 = g1.a(n6, n10, n11);
        dl_1 dl_12 = gS2.a(g12);
        dl_1 dl_13 = new dl_1(da_1.a.M().a.a(this.b, dl_12.a(), gS2.a(), g12.a()));
        Object object = dl_13.a(dj_1.i());
        return new gg_0(object);
    }

    public static dr_2 i() {
        return new dr_2(hZ.a(da_1.a.M().bL));
    }
}

