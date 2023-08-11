/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

/*
 * Renamed from manthe.zj
 */
public class zj_0
extends Module {
    private BooleanValue x = BooleanValue.createValue(this, "Show distance", true);
    private gS v;
    private List<n5> w = new CopyOnWriteArrayList<n5>();
    private HashMap<n5, nk_0> u = new HashMap();

    public zj_0() {
        super("BedPlates", new Color(245, 0, 37).getRGB(), CQ.h);
        this.a(10L, true);
        this.a(this.x);
    }

    @Override
    public void q() {
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        if (gO2.e() || !gO2.equals(this.v)) {
            this.w.clear();
            this.u.clear();
        }
        int n6 = 100;
        for (int i = -n6; i < n6; ++i) {
            for (int j = -n6; j < n6; ++j) {
                int n10 = 0;
                while (n10 != -1) {
                    n10 = n10 == 0 ? 1 : -1;
                    for (int k = 0; k < 20; ++k) {
                        int n11;
                        int n12;
                        if (eJ2.e() || gO2.e()) {
                            return;
                        }
                        int n13 = k * n10;
                        int n14 = (int)eJ2.z() + i;
                        dx_2 dx_22 = gO2.b(n14, n12 = (int)eJ2.l() + n13, n11 = (int)eJ2.g() + j);
                        int n15 = dx_2.a(dx_22);
                        if (n15 != 26) continue;
                        n5 n52 = new n5(n14, n12, n11);
                        da_1 da_12 = new da_1(dx_22);
                        boolean bl = da_12.b(gO2, n14, n12, n11);
                        if (this.w.contains(n52) || bl) continue;
                        this.w.add(n52);
                    }
                }
            }
        }
        this.v = gO2;
    }

    private void S() {
        gO gO2 = ds_2.t();
        for (n5 n52 : this.w) {
            this.u.computeIfAbsent(n52, arg_0 -> this.lambda$updateExisting$0(n52, arg_0));
            nk_0 nk_02 = this.u.get(n52);
            nk_02.c();
            dx_2 dx_22 = gO2.b(n52.d(), n52.e(), n52.c());
            da_1 da_12 = new da_1(dx_22);
            gg_0 gg_02 = da_12.c(gO2, n52.d(), n52.e(), n52.c());
            int n6 = gg_02.h();
            int n10 = 4;
            for (int i = 1; i < n10; ++i) {
                int n11 = -i;
                int n12 = -i;
                int n13 = i;
                int n14 = i;
                int n15 = 0;
                int n16 = 0;
                if (n6 == 2) {
                    ++n14;
                    ++n16;
                }
                if (n6 == 3) {
                    --n12;
                    --n16;
                }
                if (n6 == 4) {
                    ++n13;
                    ++n15;
                }
                if (n6 == 5) {
                    --n11;
                    --n15;
                }
                for (int j = 0; j <= i; ++j) {
                    for (int k = n11; k <= n13; ++k) {
                        for (int i10 = n12; i10 <= n14; ++i10) {
                            int n17;
                            if (k != n11 && k != n13 && i10 != n12 && i10 != n14 && Math.abs(j) != Math.abs(i)) continue;
                            double d3 = pf_0.a(n52.d(), n52.c(), n52.d() + k, n52.c() + i10) + (double)j;
                            double d4 = pf_0.a(n52.d() + n15, n52.c() + n16, n52.d() + k, n52.c() + i10) + (double)j;
                            boolean bl = false;
                            if (d3 > (double)i && d4 > (double)i) {
                                bl = true;
                            }
                            dx_2 dx_23 = gO2.b(n52.d() + k, n52.e() + j, n52.c() + i10);
                            int n18 = dx_2.a(dx_23);
                            int n19 = dx_23.a(n52.d() + k, n52.e() + j, n52.c() + i10);
                            int n20 = n17 = bl ? i + 1 : i;
                            if (n17 >= n10) continue;
                            nk_0.a(nk_02, n17, n18, n19);
                        }
                    }
                }
            }
        }
    }

    private void a(nk_0 nk_02) {
        eJ eJ2 = ds_2.k();
        double d3 = ds_2.r().m();
        double d4 = ds_2.r().n();
        double d5 = ds_2.r().j();
        double d6 = (double)nk_02.a().d() - d3 + 0.5;
        double d7 = (double)nk_02.a().e() - d4;
        double d8 = (double)nk_02.a().c() - d5 + 0.5;
        gl_0 gl_02 = ds_2.O();
        double d10 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)gl_02.g() - d3;
        double d11 = eJ2.R() + (eJ2.l() - eJ2.R()) * (double)gl_02.g() - d4;
        double d12 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)gl_02.g() - d5;
        ds_2.M().a(1.0);
        for (int i = 1; i < 4; ++i) {
            List<to_0> list = nk_02.a(i);
            for (int j = 0; j < list.size(); ++j) {
                to_0 to_02 = list.get(j);
                E.a(to_02.b, to_02.a);
            }
        }
        Color color = new Color(0, 0, 0, 170);
        double d13 = pf_0.a(d6, d7, d8, d10, d11, d12);
        double d14 = d13 / 5.0;
        double d15 = 0.01666666753590107 * (d14 * 0.3 * 3.0);
        GL11.glPushMatrix();
        eh_0.f();
        GL11.glTranslated((double)(d6 + 0.0), (double)(d7 + 1.0), (double)d8);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ds_2.s().i() == 2) {
            GL11.glRotatef((float)(-ds_2.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds_2.r().g(), (float)-1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)(-ds_2.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds_2.r().g(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScaled((double)(-d15), (double)(-d15), (double)d15);
        e3.l();
        e3.a(false);
        e3.u();
        e3.r();
        e3.a(770, 771, 1, 0);
        e3.l();
        ArrayList<to_0> arrayList = new ArrayList<to_0>();
        for (int i = 1; i < 4; ++i) {
            List<to_0> list = nk_02.a(i);
            int n6 = 0;
            for (int j = 0; j < list.size(); ++j) {
                to_0 to_03 = list.get(j);
                if (to_03.a()) continue;
                ++n6;
                if (arrayList.contains(to_03)) continue;
                arrayList.add(to_03);
            }
            if (n6 == 0) break;
        }
        String string = (int)d13 + "m";
        int n10 = Math.max(arrayList.size(), 1);
        float f10 = 22.0f;
        float f11 = n10 * 18 + 6;
        if (this.x.u().booleanValue()) {
            f11 = Math.max((float)(ds_2.m().c(string) + 4), f11);
        }
        float f12 = -f11 / 2.0f;
        float f13 = -f10;
        if (this.x.u().booleanValue()) {
            f13 -= 8.0f;
            f10 += 8.0f;
        }
        pe_0.a((double)f12, (double)f13, (double)f11, (double)f10, color);
        float f14 = f12 + 4.0f;
        float f15 = f13 + f10 - 20.0f;
        for (to_0 to_04 : arrayList) {
            if (to_04.a()) continue;
            E.a(to_04.b, to_04.a, f14, f15, 16, 16);
            f14 += 18.0f;
        }
        if (arrayList.size() == 0) {
            pe_0.a(f12 + f11 / 2.0f - 5.0f, f15 + 3.0f, 10.0f, 1.5f, 1.0f, new Color(120, 120, 120, 255));
        }
        if (this.x.u().booleanValue()) {
            ds_2.m().a(string, (double)(f12 + f11 / 2.0f), (double)(f13 + 2.0f), -1);
        }
        e3.p();
        e3.n();
        e3.g();
        e3.a(true);
        e3.n();
        e3.f();
        e3.a(1.0f, 1.0f, 1.0f, 1.0f);
        eh_0.h();
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }

    @Override
    public void a(kx_0 kx_02) {
        Object object;
        gO gO2 = ds_2.t();
        if (gO2.e()) {
            return;
        }
        if (!gO2.equals(this.v)) {
            this.w.clear();
            this.u.clear();
            return;
        }
        for (n5 n52 : this.w) {
            object = gO2.b(n52.d(), n52.e(), n52.c());
            int n6 = dx_2.a((dx_2)object);
            if (n6 == 26) continue;
            this.w.remove(n52);
            this.u.remove(n52);
        }
        try {
            this.S();
            for (n5 n52 : this.u.keySet()) {
                object = this.u.get(n52);
                this.a((nk_0)object);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private nk_0 lambda$updateExisting$0(n5 n52, n5 n53) {
        return this.u.put(n53, new nk_0(n52));
    }
}

