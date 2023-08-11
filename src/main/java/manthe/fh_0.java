/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.V;
import manthe.fE;
import manthe.fG;
import manthe.fk_0;
import manthe.iT;

/*
 * Renamed from manthe.fh
 */
public class fh_0
extends fk_0 {
    public fh_0(Object object) {
        super(object);
    }

    public static boolean d(fG fG2) {
        if (V.c() >= 23) {
            return fG2.k().d() && fG2.k().a(A5.c8);
        }
        return (fG2.m() & 0x4000) != 0;
    }

    public List c(fG fG2) {
        return iT.b(fh_0.a.M().u, this.b, fG2.a());
    }

    public List<fE> f(fG fG2) {
        ArrayList<fE> arrayList = new ArrayList<fE>();
        List list = iT.b(fh_0.a.M().u, this.b, fG2.a());
        for (Object e10 : list) {
            arrayList.add(new fE(e10));
        }
        return arrayList;
    }

    public List e(fG fG2) {
        return iT.b(fh_0.a.M().u, this.b, fG2.a());
    }

    public List<fE> b(int n6) {
        ArrayList<fE> arrayList = new ArrayList<fE>();
        List list = iT.b(fh_0.a.M().u, this.b, n6);
        for (Object e10 : list) {
            arrayList.add(new fE(e10));
        }
        return arrayList;
    }

    @Override
    public String a(fG fG2) {
        return iT.a(fh_0.a.M().u, this.b, fG2.a());
    }
}

