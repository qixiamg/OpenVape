/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;

/*
 * Renamed from manthe.pf
 */
public class pf_0 {
    private static final boolean a = V.c() > 13;

    public static int b(ex_0 ex_02, ex_0 ex_03) {
        double d3 = 0.0;
        double d4 = ex_03.z() - ex_02.z();
        double d5 = ex_03.g() - ex_02.g();
        if (d5 > 0.0 && d4 > 0.0) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 > 0.0 && d4 < 0.0) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 < 0.0 && d4 > 0.0) {
            d3 = -90.0 + Math.toDegrees(Math.atan(d5 / d4));
        } else if (d5 < 0.0 && d4 < 0.0) {
            d3 = 90.0 + Math.toDegrees(Math.atan(d5 / d4));
        }
        int n6 = (int)(Math.abs(d3 - (double)ex_02.U()) % 360.0);
        return n6 > 180 ? 360 - n6 : n6;
    }

    public static double b(double d3, double d4, double d5, double d6, double d7) {
        double d8 = 0.0;
        double d10 = d6 - d3;
        double d11 = d7 - d4;
        if (d11 > 0.0 && d10 > 0.0) {
            d8 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 > 0.0 && d10 < 0.0) {
            d8 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 < 0.0 && d10 > 0.0) {
            d8 = -90.0 + Math.toDegrees(Math.atan(d11 / d10));
        } else if (d11 < 0.0 && d10 < 0.0) {
            d8 = 90.0 + Math.toDegrees(Math.atan(d11 / d10));
        }
        double d12 = Math.abs(d8 - d5) % 360.0;
        double d13 = d12 > 180.0 ? 360.0 - d12 : d12;
        return d13;
    }

    public static double a(ex_0 ex_02, double d3, double d4) {
        return pf_0.b(ex_02.z(), ex_02.g(), ex_02.U(), d3, d4);
    }

    public static int a(ex_0 ex_02, ex_0 ex_03) {
        double d3 = ex_03.z() - ex_02.z();
        double d4 = ex_03.l() - ex_02.l() + (double)(ex_03.n() / 2.0f) + 0.2;
        if (V.c() > 13) {
            d4 = ex_03.l() - 0.3 - ex_02.l();
        }
        double d5 = ex_03.g() - ex_02.g();
        double d6 = Y.e(d3 * d3 + d5 * d5);
        float f10 = (float)(-(Math.atan2(d4, d6) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex_02.K() - f10));
        return (int)f11;
    }

    public static int a(ex_0 ex_02, double d3, double d4, double d5) {
        double d6 = d3 - ex_02.z();
        double d7 = d4 - ex_02.l();
        if (V.c() > 13) {
            d7 = d4 - 0.3 - ex_02.l();
        }
        double d8 = d5 - ex_02.g();
        double d10 = Y.e(d6 * d6 + d8 * d8);
        float f10 = (float)(-(Math.atan2(d7, d10) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex_02.K() - f10));
        return (int)f11;
    }

    public static boolean c(ex_0 ex_02) {
        if (ex_02 instanceof ej_0) {
            ej_0 ej_02 = (ej_0)ex_02;
            return ex_02.j() || ej_02.aD() <= 0.0f;
        }
        return ex_02.j();
    }

    public static boolean a(double d3, double d4, double d5, double d6, double d7) {
        double d8 = 0.0;
        double d10 = d6 - d3;
        double d11 = d7 - d4;
        if (d11 > 0.0 && d10 > 0.0) {
            d8 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 > 0.0 && d10 < 0.0) {
            d8 = Math.toDegrees(-Math.atan(d10 / d11));
        } else if (d11 < 0.0 && d10 > 0.0) {
            d8 = -90.0 + Math.toDegrees(Math.atan(d11 / d10));
        } else if (d11 < 0.0 && d10 < 0.0) {
            d8 = 90.0 + Math.toDegrees(Math.atan(d11 / d10));
        }
        int n6 = (int)Y.a((d8 - d5) % 360.0);
        return n6 < 0;
    }

    public static boolean b(ex_0 ex_02, double d3, double d4) {
        return pf_0.a(ex_02.z(), ex_02.g(), (double)ex_02.U(), d3, d4);
    }

    public static boolean c(ex_0 ex_02, ex_0 ex_03) {
        double d3 = ex_03.z() - ex_02.z();
        double d4 = ex_03.l() - ex_02.l() + (double)(ex_03.n() / 2.0f) + 0.2;
        if (V.c() > 13) {
            d4 = ex_03.l() - 0.3 - ex_02.l();
        }
        double d5 = ex_03.g() - ex_02.g();
        double d6 = Y.e(d3 * d3 + d5 * d5);
        float f10 = (float)(-(Math.atan2(d4, d6) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex_02.K() - f10));
        return f11 < 0.0f;
    }

    public static boolean c(ex_0 ex_02, double d3, double d4, double d5) {
        double d6 = d3 - ex_02.z();
        double d7 = d4 - ex_02.l();
        if (V.c() > 13) {
            d7 = d4 - 0.3 - ex_02.l();
        }
        double d8 = d5 - ex_02.g();
        double d10 = Y.e(d6 * d6 + d8 * d8);
        float f10 = (float)(-(Math.atan2(d7, d10) * 180.0 / Math.PI));
        float f11 = (float)Y.a((double)(ex_02.K() - f10));
        return (int)f11 < 0;
    }

    public static ej_0 a(double d3, float f10, float f11, float f12) {
        if (ds_2.B().a() != null && ds_2.t().a() != null) {
            ej_0 ej_02 = ds_2.B();
            e2 e22 = e2.b(ej_02.i(), ds_2.k().aV());
            e22.f(f11);
            e22.e(f12);
            e22.i(f11);
            e22.d(f12);
            return pf_0.a(d3, f10, ej_02, e22);
        }
        return null;
    }

    public static ej_0 a(double d3, float f10) {
        if (ds_2.B().a() != null && ds_2.t().a() != null) {
            return pf_0.a(d3, f10, ds_2.B(), ds_2.B());
        }
        return null;
    }

    public static ej_0 a(double d3, float f10, ej_0 ej_02, ej_0 ej_03) {
        cy_0 cy_02 = null;
        if (ds_2.B().a() != null && ds_2.t().a() != null) {
            ej_0 ej_04;
            double d4 = d3;
            double d5 = d3;
            gK gK2 = ej_02.m(0.0f);
            gK gK3 = ej_03.o(0.0f);
            gK gK4 = gK2.a(gK3.g() * d4, gK3.h() * d4, gK3.f() * d4);
            float f11 = 1.0f;
            List list = ds_2.t().a(ej_02, ej_02.s().e(gK3.g() * d4, gK3.h() * d4, gK3.f() * d4).d(f11, f11, f11));
            double d6 = d5;
            for (int i = 0; i < list.size(); ++i) {
                double d7;
                ex_0 ex_02 = new ex_0(list.get(i));
                if (!ex_02.V()) continue;
                float f12 = ex_02.r() + f10;
                fP fP2 = ex_02.s().d(f12, f12, f12);
                gb_0 gb_02 = fP2.a(gK2, gK4);
                if (fP2.a(gK2)) {
                    if (!(0.0 < d6) && d6 != 0.0) continue;
                    cy_02 = ex_02;
                    d6 = 0.0;
                    continue;
                }
                if (gb_02.a() == null || !((d7 = gK2.a(gb_02.k())) < d6) && d6 != 0.0) continue;
                if (ex_02.a() == ej_02.m().a() && !ex_02.Q()) {
                    if (d6 != 0.0) continue;
                    cy_02 = ex_02;
                    continue;
                }
                cy_02 = ex_02;
                d6 = d7;
            }
            if (cy_02 != null && (d6 < d5 || ds_2.I().a() == null) && ds_2.k().c((ex_0)cy_02) && A5.cF.isInstance(cy_02.a()) && !(ej_04 = new ej_0(cy_02.a())).j()) {
                return ej_04;
            }
        }
        return null;
    }

    public static double b(ex_0 ex_02, double d3, double d4, double d5) {
        double d6 = ex_02.z() - d3;
        double d7 = ex_02.l() - d4;
        double d8 = ex_02.g() - d5;
        return Y.e(d6 * d6 + d7 * d7 + d8 * d8);
    }

    public static double a(double d3, double d4, double d5, double d6, double d7, double d8) {
        double d10 = d3 - d6;
        double d11 = d4 - d7;
        double d12 = d5 - d8;
        return Y.e(d10 * d10 + d11 * d11 + d12 * d12);
    }

    public static boolean b(ej_0 ej_02) {
        if (ej_02 == null) {
            return false;
        }
        if (A5.cc.isInstance(ej_02)) {
            eC eC2 = (eC)ej_02;
            boolean bl = false;
            for (Object object : eC2.aU().g()) {
                fG fG2 = new fG(object);
                if (fG2.e()) continue;
                bl = true;
            }
            return ej_02.ae() && ej_02.aG().e() && !bl;
        }
        return ej_02.ae() && ej_02.aG().e();
    }

    public static boolean a(ej_0 ej_02) {
        if (ej_02.e()) {
            return false;
        }
        if (ej_02.a(A5.cc)) {
            eC eC2 = new eC(ej_02);
            boolean bl = false;
            for (Object object : eC2.aU().g()) {
                if (object == null) continue;
                if (V.c() >= 23) {
                    fG fG2 = new fG(object);
                    if (fG2.k().h() == 0) continue;
                    bl = true;
                    continue;
                }
                bl = true;
            }
            return ej_02.aG().e() && !bl;
        }
        return false;
    }

    public static void a() {
        v2.c();
    }

    public static boolean a(ej_0 ej_02, ej_0 ej_03, double d3) {
        return pf_0.a(ej_02, ej_03, 6.0, d3, 360.0);
    }

    public static boolean a(ej_0 ej_02, ej_0 ej_03, double d3, double d4, double d5) {
        boolean bl;
        boolean bl2 = bl = ej_03.j() || ej_03.S().equals("") || (double)ej_02.a(ej_03) > d3 || !ej_02.c(ej_03);
        if (bl) {
            return false;
        }
        int n6 = pf_0.b(ej_03, ej_02);
        int n10 = pf_0.a((ex_0)ej_03, ej_02);
        return (double)n6 < d4 && (double)n10 < d5;
    }

    public static boolean f(ex_0 ex_02) {
        if (ex_02.a(A5.cF)) {
            return !pf_0.d(ex_02) && !ex_02.a(A5.cc);
        }
        return false;
    }

    public static boolean d(ex_0 ex_02) {
        if (ex_02.a(A5.cF)) {
            return ex_02.a(A5.bc);
        }
        return false;
    }

    public static boolean b(ex_0 ex_02, double d3, double d4, boolean bl) {
        for (Object e10 : ds_2.t().j()) {
            e2 e22;
            if (!A5.L.isInstance(e10) || (e22 = new e2(e10)).equals(ex_02) || bl && on.p.N().a(e22) || (double)e22.a(ex_02) >= d3 || !((double)pf_0.b(e22, ex_02) < d4)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(ex_0 ex_02) {
        return pf_0.b(ex_02, 6.0, 60.0, true);
    }

    public static boolean a(ex_0 ex_02, double d3, double d4, boolean bl) {
        for (Object e10 : ds_2.t().j()) {
            e2 e22;
            if (!A5.L.isInstance(e10) || (e22 = new e2(e10)).equals(ex_02) || bl && on.p.N().a(e22) || (double)e22.a(ex_02) >= d3 || !((double)pf_0.b(ex_02, e22) < d4)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(ex_0 ex_02) {
        return pf_0.a(ex_02, 6.0, 60.0, true);
    }

    public static boolean a(ex_0 ex_02) {
        return ex_02.k() == 0.0 && ex_02.u() == 0.0;
    }

    public static int a(ex_0 ex_02, int n6, boolean bl) {
        int n10 = 0;
        for (Object e10 : ds_2.t().j()) {
            if (!A5.L.isInstance(e10)) continue;
            e2 e22 = new e2(e10);
            if (bl && on.p.N().a(e22) || !(e22.a(ex_02) <= (float)n6)) continue;
            ++n10;
        }
        return n10;
    }

    public static int a(ex_0 ex_02, int n6) {
        return pf_0.a(ex_02, n6, true);
    }

    public static double d(ex_0 ex_02, ex_0 ex_03) {
        double d3 = ex_02.a(ex_03);
        double d4 = Math.cos(Math.toRadians(ex_02.U() + 90.0f)) * d3;
        double d5 = Math.sin(Math.toRadians(ex_02.U() + 90.0f)) * d3;
        double d6 = ex_02.z() + d4;
        double d7 = ex_02.g() + d5;
        return pf_0.a(d6, 0.0, d7, ex_03.z(), 0.0, ex_03.g());
    }

    public static bK b(fP fP2) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        for (int i = n12; i > n11; --i) {
            for (int j = n6; j < n10; ++j) {
                for (int k = n13; k < n14; ++k) {
                    dx_2 dx_22 = ds_2.t().b(j, i, k);
                    dj_0 dj_02 = dx_22.h();
                    if (!dj_02.g()) continue;
                    return new bK(j, i, k);
                }
            }
        }
        return null;
    }

    public static bf_0 a(fP fP2) {
        int n6 = Y.c(fP2.f());
        int n10 = Y.c(fP2.h() + 1.0);
        int n11 = Y.c(fP2.l());
        int n12 = Y.c(fP2.g() + 1.0);
        int n13 = Y.c(fP2.j());
        int n14 = Y.c(fP2.i() + 1.0);
        for (int i = n12; i > n11; --i) {
            for (int j = n6; j < n10; ++j) {
                for (int k = n13; k < n14; ++k) {
                    dx_2 dx_22 = ds_2.t().b(j, i, k);
                    dj_0 dj_02 = dx_22.h();
                    if (!dj_02.g()) continue;
                    return new bf_0(j, i, k, 0);
                }
            }
        }
        return null;
    }

    public static float a(double d3, double d4, double d5, double d6) {
        double d7 = d5 - d3;
        double d8 = d6 - d4;
        float f10 = (float)Math.toDegrees(-Math.atan(d7 / d8));
        if (d8 < 0.0 && d7 < 0.0) {
            f10 = (float)(90.0 + Math.toDegrees(Math.atan(d8 / d7)));
        } else if (d8 < 0.0 && d7 > 0.0) {
            f10 = (float)(-90.0 + Math.toDegrees(Math.atan(d8 / d7)));
        }
        return f10;
    }

    public static int a(eC eC2) {
        int n6 = 0;
        if (VapeSettings.h) {
            fS fS2 = ds_2.k().bp();
            List list = dy_2.f().a(fS2.g());
            for (Object e10 : list) {
                eg_1 eg_12 = new eg_1(e10);
                if (!eg_12.f().d() || !eC2.aV().equals(eg_12.f()) && !eC2.S().equals(eg_12.f().f())) continue;
                n6 = Math.max(eg_12.g(), 0);
                break;
            }
        }
        return n6;
    }

    public static double a(int n6, int n10, int n11, int n12) {
        double d3 = n6 - n11;
        double d4 = n10 - n12;
        return Math.sqrt(d3 * d3 + d4 * d4);
    }
}

