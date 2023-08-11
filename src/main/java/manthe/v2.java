/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public class v2 {
    private static zZ d = null;
    private static zO c = null;
    private static int b;

    public static void c() {
        if (d == null) {
            d = on.p.H().b(zZ.class);
            c = on.p.H().b(zO.class);
        }
        if (!d.N() && !c.N()) {
            return;
        }
        if (c.N() && v2.c.B.u().booleanValue()) {
            v2.b();
        } else {
            v2.d();
        }
    }

    private static void b() {
        ex_0 ex_02 = null;
        ex_0 ex_03 = null;
        gb_0 gb_02 = null;
        boolean bl = c.N() && v2.c.B.u() != false;
        boolean bl2 = false;
        if (ds_2.I().a() != null && ds_2.I().g().d() && !ds_2.I().g().equals(g4.g()) && !ds_2.I().g().equals(g4.f())) {
            if (!bl) {
                return;
            }
            ex_02 = ds_2.M().h();
            ex_03 = ds_2.A();
            gb_02 = ds_2.I();
            bl2 = true;
        }
        if (ds_2.I().g().equals(g4.f()) && ds_2.I().i().d() && ds_2.I().i().a(A5.c4)) {
            return;
        }
        if (d.N() && !d.T().x().booleanValue() || c.N()) {
            float f10 = (float)d.V();
            double d3 = c.S();
            float f11 = 1.0f;
            ej_0 ej_02 = ds_2.B();
            gO gO2 = ds_2.t();
            dp_2 dp_22 = ds_2.K();
            if (ej_02.d() && gO2.d()) {
                double d4;
                cy_0 cy_02;
                double d5;
                ex_0 ex_04 = new ex_0(null);
                ds_2.a(ex_04);
                float f12 = dp_22.j();
                gb_0 gb_03 = ej_02.a((double)f12, f11);
                ds_2.a(gb_03);
                gK gK2 = ej_02.m(f11);
                boolean bl3 = false;
                if (dp_22.i()) {
                    f12 = 6.0f;
                    d5 = 6.0;
                } else {
                    d5 = f10;
                    f12 = f10;
                    if ((double)f12 > 3.0) {
                        bl3 = true;
                    }
                }
                if (ds_2.I().d()) {
                    d5 = !dp_22.i() ? ej_02.a(4.5 + (double)(f12 - 3.0f), f11).k().a(gK2) : ej_02.a((double)f12, f11).k().a(gK2);
                }
                if (d5 > 6.0) {
                    d5 = 6.0;
                }
                gK gK3 = ej_02.o(f11);
                gK gK4 = gK2.a(gK3.g() * (double)f12, gK3.h() * (double)f12, gK3.f() * (double)f12);
                ex_0 ex_05 = new ex_0(null);
                ds_2.M().a(ex_05);
                gK gK5 = null;
                float f13 = 1.0f;
                List list = gO2.a(ej_02, ej_02.s().e(gK3.g() * (double)f12, gK3.h() * (double)f12, gK3.f() * (double)f12).d(f13, f13, f13));
                double d6 = d5;
                if (bl && list.size() > 2) {
                    list = c.a(list, gK2, gK4);
                    if (bl2 && list.size() > 1) {
                        ds_2.M().a(ex_02);
                        ds_2.a(ex_03);
                        ds_2.a(gb_02);
                        return;
                    }
                }
                for (int i = 0; i < list.size(); ++i) {
                    ex_0 ex_06 = new ex_0(list.get(i));
                    if (!ex_06.V() || on.p.t().b(ex_06)) continue;
                    if (ex_06.a(A5.cF)) {
                        cy_02 = new ej_0(ex_06.a());
                        if (on.p.N().a((ej_0)cy_02)) continue;
                    }
                    float f14 = (float)((double)ex_06.r() + d3);
                    fP fP2 = ex_06.s().d(f14, f14, f14);
                    gb_0 gb_04 = fP2.a(gK2, gK4);
                    if (fP2.a(gK2)) {
                        if (!(0.0 < d6) && d6 != 0.0) continue;
                        ds_2.M().a(ex_06);
                        gK5 = gb_04.e() ? new gK(gK2) : gb_04.k();
                        d6 = 0.0;
                        continue;
                    }
                    if (!gb_04.d()) continue;
                    d4 = gK2.a(gb_04.k());
                    double d7 = d6;
                    if (!d.a(ex_06)) {
                        d7 = Math.min(d6, 3.0);
                    }
                    if (!(d4 < d7) && d6 != 0.0) continue;
                    if (ex_06.equals(ej_02.m()) && !ex_06.Q()) {
                        if (d6 != 0.0) continue;
                        ds_2.M().a(ex_06);
                        gK5 = gb_04.k();
                        continue;
                    }
                    ds_2.M().a(ex_06);
                    gK5 = gb_04.k();
                    d6 = d4;
                }
                ex_0 ex_07 = ds_2.M().h();
                if (V.c() > 13 && ex_07.d()) {
                    boolean bl4 = d.a(ex_07);
                    if (bl3) {
                        double d8 = gK2.a(gK5);
                        double d10 = bl4 ? (double)f10 : 3.0;
                        if (d8 > d10) {
                            ds_2.M().a(ex_05);
                            cy_02 = gb_0.a(g4.g(), gK5, new gg_0(null), g1.a(gK5));
                            ds_2.a((gb_0)cy_02);
                            ex_07 = ds_2.M().h();
                        }
                    }
                }
                if ((d6 < d5 || ds_2.I().e()) && !ex_07.e()) {
                    if (gK5 != null && d3 > 0.0) {
                        double d11 = ex_07.z();
                        double d12 = ex_07.l();
                        d4 = ex_07.g();
                        fP fP3 = ex_07.Y().d(ex_07.r(), ex_07.r(), ex_07.r());
                        double d13 = fP3.h() - d11;
                        double d14 = fP3.g() - d12;
                        double d15 = fP3.l() - d12;
                        double d16 = fP3.i() - d4;
                        double d17 = gK5.g() - d11;
                        double d18 = gK5.h() - d12;
                        double d19 = gK5.f() - d4;
                        double d20 = d13 * Y.a(d17 / (d13 + (double)((float)d3)), -1.0, 1.0);
                        double d21 = Y.a(d18 > 0.0 ? d18 / (double)((float)(d14 + d3)) : d18 / (d15 + (double)((float)d3)), -1.0, 1.0);
                        double d22 = d18 > 0.0 ? d14 * d21 : d15 * d21;
                        double d23 = d16 * Y.a(d19 / (d16 + (double)((float)d3)), -1.0, 1.0);
                        gK5 = gK.b(d11 + d20, d12 + d22, d4 + d23);
                    }
                    gb_0 gb_05 = gb_0.a(ex_07, gK5);
                    ds_2.a(gb_05);
                    if (A5.cF.isInstance(ex_07) || A5.J.isInstance(ex_07)) {
                        ds_2.a(ex_07);
                    }
                }
                if (gb_02 != null && ex_03 != null && ex_02 != null && bl && gb_02.d() && ex_03.d() && ex_02.d() && ex_07.e()) {
                    ds_2.M().a(ex_02);
                    ds_2.a(ex_03);
                    ds_2.a(gb_02);
                }
            }
        }
    }

    private static void d() {
        if (VapeSettings.d()) {
            return;
        }
        if (d.N() && !d.T().x().booleanValue() || c.N()) {
            float f10 = (float)d.V();
            float f11 = c.S();
            float f12 = 1.0f;
            ej_0 ej_02 = ds_2.B();
            gO gO2 = ds_2.t();
            dp_2 dp_22 = ds_2.K();
            if (ej_02.d() && gO2.d()) {
                cy_0 cy_02;
                ex_0 ex_02 = new ex_0(null);
                ds_2.a(ex_02);
                float f13 = 4.5f;
                gb_0 gb_02 = ej_02.a((double)f13, f12);
                ds_2.a(gb_02);
                gK gK2 = ej_02.m(f12);
                boolean bl = false;
                double d3 = f10;
                f13 = f10;
                if ((double)f13 > 3.0) {
                    bl = true;
                }
                if (ds_2.I().d()) {
                    d3 = ej_02.a(4.5 + (double)(f13 - 3.0f), f12).k().a(gK2);
                }
                if (d3 > 6.0) {
                    d3 = 6.0;
                }
                gK gK3 = ej_02.o(f12);
                gK gK4 = gK2.a(gK3.g() * (double)f13, gK3.h() * (double)f13, gK3.f() * (double)f13);
                ex_0 ex_03 = new ex_0(null);
                ds_2.M().a(ex_03);
                gK gK5 = null;
                float f14 = 1.0f;
                List list = gO2.a(ej_02, ej_02.s().e(gK3.g() * (double)f13, gK3.h() * (double)f13, gK3.f() * (double)f13).d(f14, f14, f14));
                double d4 = d3;
                for (int i = 0; i < list.size(); ++i) {
                    double d5;
                    cy_02 = new ex_0(list.get(i));
                    if (!((ex_0)cy_02).V()) continue;
                    float f15 = ((ex_0)cy_02).r() + f11;
                    fP fP2 = ((ex_0)cy_02).s().d(f15, f15, f15);
                    gb_0 gb_03 = fP2.a(gK2, gK4);
                    if (fP2.a(gK2)) {
                        if (!(0.0 < d4) && d4 != 0.0) continue;
                        ds_2.M().a((ex_0)cy_02);
                        gK5 = gb_03.e() ? new gK(gK2) : gb_03.k();
                        d4 = 0.0;
                        continue;
                    }
                    if (!gb_03.d() || !((d5 = gK2.a(gb_03.k())) < d4) && d4 != 0.0) continue;
                    if (cy_02.equals(ej_02.m()) && !((ex_0)cy_02).Q()) {
                        if (d4 != 0.0) continue;
                        ds_2.M().a((ex_0)cy_02);
                        gK5 = gb_03.k();
                        continue;
                    }
                    ds_2.M().a((ex_0)cy_02);
                    gK5 = gb_03.k();
                    d4 = d5;
                }
                ex_0 ex_04 = ds_2.M().h();
                if (V.c() > 13 && ex_04.d() && bl && gK2.a(gK5) > (double)f10) {
                    ds_2.M().a(ex_03);
                    cy_02 = gb_0.a(g4.g(), gK5, new gg_0(null), g1.a(gK5));
                    ds_2.a((gb_0)cy_02);
                    ex_04 = ds_2.M().h();
                }
                if ((d4 < d3 || ds_2.I().e()) && !ex_04.e()) {
                    cy_02 = gb_0.a(ex_04, gK5);
                    ds_2.a((gb_0)cy_02);
                    if (A5.cF.isInstance(ex_04) || A5.J.isInstance(ex_04)) {
                        ds_2.a(ex_04);
                    }
                }
            }
        }
    }

    static {
        v2.b(0);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int e() {
        return b;
    }

    public static int a() {
        int n6 = v2.e();
        if (n6 == 0) {
            return 61;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

