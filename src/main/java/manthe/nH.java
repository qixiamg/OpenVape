/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.fE;
import manthe.fG;
import manthe.fh_0;
import manthe.fk_0;

public class nH {
    public static boolean a(fG fG2) {
        return nH.a(fG2, false);
    }

    public static boolean a(fG fG2, boolean bl) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        if (bl && fG2.k().a(A5.bU)) {
            return true;
        }
        if (!fG2.k().a(A5.dx)) {
            return false;
        }
        fh_0 fh_02 = new fh_0(fG2.k().a());
        if (fh_02.c(fG2) == null) {
            return false;
        }
        if (fh_0.d(fG2)) {
            for (fE fE2 : fh_02.f(fG2)) {
                if (fE2.g() != 6) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean a(fk_0 fk_02) {
        return fk_02.a(A5.be) || fk_02.a(A5.dt);
    }
}

