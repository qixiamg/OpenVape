/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zZ
extends Module {
    private final dy_0 u = dy_0.createValue((Object)this, "Range", "#.##", "blocks", 3.0, 3.0, 3.2, 6.0, 0.01, "The range in which your reach will be increased to.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Misplace", false, "Pulls players towards you rather than giving you extra reach distance. Uses the minimum slider value.");
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Disadvantage", false, "Moves misplaced players in opposite direction. Useful for framing other players");
    private final BooleanValue A = BooleanValue.createValue((Object)this, "Vertical Check", false, "Prevents hitting players which are y0.2 above or below you\nfor more legitimate use");
    private final BooleanValue z = BooleanValue.createValue((Object)this, "Only while sprinting", false, "Only give extra reach while sprinting");
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Disable in water", false, "Won't give any extra reach while standing in water");
    private final Map<Integer, ac_0> y = new HashMap<Integer, ac_0>();

    public zZ() {
        super("Reach", -16711936, CQ.c, "Extends attack reach");
        this.x.a(new BasicValue[]{this.w});
        this.a(this.u, this.x, this.w, this.A, this.z, this.v);
    }

    public double V() {
        if (!this.N() || this.x.x().booleanValue() || this.v.u().booleanValue() && (ds_2.k().H() || ds_2.k().w())) {
            return 3.0;
        }
        if (this.z.u().booleanValue() && !ds_2.k().C()) {
            return 3.0;
        }
        return this.u.t();
    }

    private float a(double d3, double d4, double d5, double d6) {
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

    private void e(boolean bl) {
        gO gO2 = ds_2.t();
        if (gO2.e()) {
            return;
        }
        for (Object e10 : gO2.k()) {
            ex_0 ex_02 = new ex_0(e10);
            if (!ex_02.a(A5.L) || ex_02.a(A5.u)) continue;
            e2 e22 = new e2(e10);
            int n6 = ex_02.q();
            double d3 = ex_02.z();
            double d4 = ex_02.g();
            ac_0 ac_02 = null;
            if (this.y.containsKey(n6)) {
                ac_02 = this.y.get(n6);
            } else {
                ac_02 = new ac_0();
                ac_02.g = n6;
            }
            this.y.put(n6, ac_02);
            ac_02.e = d3;
            ac_02.q = d4;
            ac_02.h = ex_02.T();
            ac_02.m = ex_02.X();
            ac_02.l = e22.bc();
            ac_02.o = e22.a3();
            ac_02.b = e22.a7();
            ac_02.p = e22.ba();
            if (bl) {
                e22.h(ac_02.c);
                e22.e(ac_02.n);
                e22.b(ac_02.k);
                e22.f(ac_02.f);
                e22.r(ac_02.i);
                e22.o(ac_02.a);
                e22.c(ex_02.z(), ex_02.l(), ex_02.g());
                continue;
            }
            e22.h(ac_02.c);
            e22.e(ac_02.n);
            e22.c(ex_02.z(), ex_02.l(), ex_02.g());
            e22.h(ac_02.e);
            e22.e(ac_02.q);
        }
    }

    private void S() {
        gO gO2 = ds_2.t();
        eJ eJ2 = ds_2.k();
        if (gO2.e()) {
            return;
        }
        float f10 = this.w.u() != false ? -90.0f : 90.0f;
        for (Object e10 : gO2.k()) {
            double d3;
            ex_0 ex_02 = new ex_0(e10);
            if (!ex_02.a(A5.L) || ex_02.a(A5.u)) continue;
            e2 e22 = new e2(e10);
            double d4 = this.u.s() - 3.0;
            double d5 = Math.hypot(eJ2.z() - ex_02.z(), eJ2.g() - ex_02.g());
            float f11 = this.a(eJ2.z(), eJ2.g(), ex_02.z(), ex_02.g());
            double d6 = d5 - d4;
            if (d6 < 0.5 && (d4 += (d3 = d6 - 0.5)) < 0.0) {
                d4 = 0.0;
            }
            d3 = Math.cos(Math.toRadians(f11 + f10)) * d4;
            double d7 = Math.sin(Math.toRadians(f11 + f10)) * d4;
            int n6 = ex_02.q();
            double d8 = ex_02.z();
            double d10 = ex_02.g();
            ac_0 ac_02 = null;
            boolean bl = false;
            if (this.y.containsKey(n6)) {
                ac_02 = this.y.get(n6);
                bl = true;
            } else {
                ac_02 = new ac_0();
                ac_02.g = n6;
            }
            this.y.put(n6, ac_02);
            ac_02.e = d8;
            ac_02.q = d10;
            ac_02.h = ex_02.T();
            ac_02.m = ex_02.X();
            ac_02.l = e22.bc();
            ac_02.o = e22.a3();
            ac_02.b = e22.a7();
            ac_02.p = e22.ba();
            ac_02.c = ac_02.e - d3;
            ac_02.n = ac_02.q - d7;
            ac_02.k = ac_02.h - d3;
            ac_02.f = ac_02.m - d7;
            ac_02.i = ac_02.l - d3;
            ac_02.a = ac_02.o - d7;
            if (!bl) continue;
            ac_02.k = ac_02.d;
            ac_02.f = ac_02.j;
        }
    }

    private void U() {
        float f10 = this.w.u() != false ? -90.0f : 90.0f;
        double d3 = this.u.s() - 3.0;
        eM eM2 = ds_2.y();
        if (eM2.e()) {
            return;
        }
        try {
            List<eA>[][] listArray;
            List<eA>[][] listArray2 = listArray = eM2.f();
            int n6 = listArray2.length;
            for (int i = 0; i < n6; ++i) {
                List<eA>[] listArray3;
                for (List<eA> list : listArray3 = listArray2[i]) {
                    for (eA eA2 : list) {
                        eJ eJ2;
                        if (eA2.e() || !eA2.a(A5.cG) && !eA2.a(A5.dB) || (eJ2 = ds_2.k()).e() || !((double)eJ2.a(eA2) < this.u.w() + 2.0) || !(eA2.l() < eJ2.l() + 2.5) || pf_0.c(eJ2, eA2)) continue;
                        float f11 = this.a(eJ2.z(), eJ2.g(), eA2.z(), eA2.g());
                        double d4 = Math.cos(Math.toRadians(f11 + f10)) * d3;
                        double d5 = Math.sin(Math.toRadians(f11 + f10)) * d3;
                        eA2.h(eA2.z() - d4);
                        eA2.e(eA2.g() - d5);
                        eA2.b(eA2.T() - d4);
                        eA2.f(eA2.X() - d5);
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void f(boolean bl) {
        gO gO2 = ds_2.t();
        if (gO2.e()) {
            return;
        }
        for (Map.Entry<Integer, ac_0> entry : this.y.entrySet()) {
            ac_0 ac_02 = entry.getValue();
            ex_0 ex_02 = new ex_0(((gS)gO2).a(ac_02.g));
            if (!ex_02.d() || !ex_02.a(A5.L)) continue;
            e2 e22 = new e2(((gS)gO2).a(ac_02.g));
            if (bl) {
                ac_02.d = ac_02.c;
                ac_02.j = ac_02.n;
                e22.h(ac_02.e);
                e22.e(ac_02.q);
                e22.b(ac_02.h);
                e22.f(ac_02.m);
                e22.r(ac_02.l);
                e22.o(ac_02.o);
            }
            e22.c(e22.z(), e22.l(), e22.g());
        }
    }

    @Override
    public void a(kf_0 kf_02) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.S();
        if (kf_02.a() == da_0.b) {
            this.e(false);
        } else {
            this.f(false);
            if (V.c() <= 15) {
                this.U();
            }
        }
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.e(true);
    }

    @Override
    public void a(ke_0 ke_02) {
        if (!this.x.u().booleanValue()) {
            return;
        }
        this.f(true);
    }

    @Override
    public void J() {
        this.y.clear();
    }

    public BooleanValue T() {
        return this.x;
    }

    public boolean a(ex_0 ex_02) {
        if (!this.N()) {
            return true;
        }
        eJ eJ2 = ds_2.k();
        if (ex_02.e() || eJ2.e()) {
            return false;
        }
        double d3 = eJ2.l() - (ex_02.l() + (double)ex_02.am());
        return this.A.u() == false || !(d3 >= 0.2) && !(d3 <= -0.2);
    }
}

