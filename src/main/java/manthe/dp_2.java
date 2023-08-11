/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.bh_1;
import manthe.cy_0;
import manthe.eC;
import manthe.eJ;
import manthe.ex_0;
import manthe.fD;
import manthe.fG;
import manthe.fM;
import manthe.fS;
import manthe.g1;
import manthe.gK;
import manthe.gM;
import manthe.gO;
import manthe.gS;
import manthe.gg_0;
import manthe.hm_0;

/*
 * Renamed from manthe.dp
 */
public class dp_2
extends cy_0 {
    public dp_2(Object object) {
        super(object);
    }

    public float j() {
        return dp_2.a.M().bA.a(this.b);
    }

    public boolean i() {
        return false;
    }

    public fG a(int n6, int n10, int n11, int n12, eC eC2) {
        if (V.c() >= 23) {
            return new fG(dp_2.a.M().bA.a(this.b, n6, n10, n11, fM.e[n12].a(), eC2.a()));
        }
        return new fG(dp_2.a.M().bA.a(this.b, n6, n10, n11, n12, eC2.a()));
    }

    public boolean a(eC eC2, gS gS2, fG fG2) {
        if (V.c() >= 23) {
            fD fD2 = new fD(dp_2.a.M().bA.b(this.b, eC2.a(), gS2.a(), gM.f().a()));
            return fD2.equals(fD.f());
        }
        return dp_2.a.M().bA.a(this.b, eC2.a(), gS2.a(), fG2.a());
    }

    public void a(eC eC2) {
        dp_2.a.M().bA.a(this.b, eC2.a());
    }

    public boolean a(eJ eJ2, gO gO2, fG fG2, bh_1 bh_12, gg_0 gg_02, gK gK2) {
        if (V.c() > 13) {
            if (V.c() >= 23) {
                Boolean bl = dp_2.a.M().bA.b(this.b, eJ2.a(), gO2.a(), g1.a(bh_12).a(), gg_02.a(), gK2.a(), gM.f().a());
                fD fD2 = new fD(bl);
                return fD2.equals(fD.f());
            }
            return dp_2.a.M().bA.a(this.b, eJ2.a(), gO2.a(), fG2.a(), g1.a(bh_12).a(), gg_02.a(), gK2.a());
        }
        return dp_2.a.M().bA.a(this.b, eJ2.a(), gO2.a(), fG2.a(), bh_12.d(), bh_12.c(), bh_12.a(), gg_02.h(), gK2.a());
    }

    public void a(eC eC2, ex_0 ex_02) {
        hm_0.a(dp_2.a.M().bA, this.b, eC2.a(), ex_02.a());
    }

    public void f() {
        hm_0.a(dp_2.a.M().bA, this.b);
    }

    public void h() {
        dp_2.a.M().bA.c(this.b);
    }

    public fS k() {
        return new fS(hm_0.c(dp_2.a.M().bA, this.b));
    }

    public boolean g() {
        return hm_0.b(dp_2.a.M().bA, this.b);
    }
}

