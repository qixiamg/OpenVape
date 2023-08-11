/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.ColorValue;

public class zB
extends Module {
    private final qR K = new qR();
    private final qB J = new qB();
    private final qs B = new qs(Collections.singleton(A5.af), new Color(173, 12, 255));
    private final qs P = new qs(Collections.singleton(A5.cS), new Color(255, 238, 154));
    private final qs O = new qs(Collections.singleton(A5.cA), new Color(255, 255, 255));
    private final pb_0 u = new pb_0("Always");
    private final pb_0 L = new pb_0("Threat");
    private final pb_0 E = new pb_0("Hit Only");
    private final DX S = DX.a((Object)this, "Alert Type", this.L, this.u, this.L, this.E);
    private final ColorValue R = ColorValue.createValue((Object)this, "Color", new Color(255, 0, 0));
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Show Distance", false, "Renders the distance next to the arrow.");
    private final DF A = DF.a((Object)this, "Radius Scale", "#.##", "x", 0.0, 0.15, 1.0, 0.05);
    private final BooleanValue T = BooleanValue.createValue(this, "Show Arrows", true);
    private final BooleanValue H = BooleanValue.createValue(this, "Show Pearls", false);
    private final BooleanValue x = BooleanValue.createValue(this, "Show Potions", false);
    private final BooleanValue F = BooleanValue.createValue(this, "Show Eggs", true);
    private final BooleanValue z = BooleanValue.createValue(this, "Show Snowballs", true);
    private final BooleanValue G = BooleanValue.createValue(this, "Show Fireballs", true);
    private e2 N;
    private final Map<ex_0, double[]> I = new HashMap<ex_0, double[]>();
    private fG Q;
    private fG y;
    private fG v;
    private fG w;
    private fG D;
    private fG M;

    public zB() {
        super("Indicators", 16746028, CQ.d, "Draws arrows on screen when projectiles\nare nearby/hitting you.");
        this.a(this.S, this.R, this.T, this.H, this.x, this.F, this.z, this.G, this.A, this.C);
    }

    public boolean c(ex_0 ex_02) {
        eE eE2;
        ca_0 ca_02;
        if (Cp.e()) {
            return false;
        }
        if (ex_02.a(A5.ad) && this.G.u().booleanValue()) {
            double d3 = this.a(new eR(ex_02.a()));
            if (this.S.v() == this.E) {
                return d3 == 0.0;
            }
            return d3 != -1.0;
        }
        if (ex_02.a(A5.bn) && (ca_02 = this.a(eE2 = new eE(ex_02.a()))) != null) {
            double d4 = this.a(eE2, ca_02);
            if (this.S.v() == this.E) {
                return d4 == 0.0;
            }
            return d4 != -1.0;
        }
        return false;
    }

    @Override
    public void a(kx_0 kx_02) {
        if (this.N == null) {
            this.N = e2.b(ds_2.t(), c0.a(UUID.randomUUID(), "nig"));
        }
        this.I.clear();
        ef_0 ef_02 = ds_2.r();
        for (Object e10 : ds_2.t().k()) {
            ex_0 ex_02 = new ex_0(e10);
            if (!this.c(ex_02)) continue;
            double d3 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)kx_02.getTicks() - ef_02.m();
            double d4 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)kx_02.getTicks() - ef_02.n();
            double d5 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)kx_02.getTicks() - ef_02.j();
            double[] dArray = ac_1.a(d3, d4, d5);
            this.I.put(ex_02, dArray);
        }
    }

    @Override
    public void t() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || eJ2.i().e()) {
            return;
        }
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        float f10 = (float)d0_02.g() / 2.0f;
        float f11 = (float)d0_02.h() / 2.0f;
        o7.a(Color.WHITE, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        dr_1 dr_12 = ds_2.m();
        for (ex_0 ex_02 : this.I.keySet()) {
            Color color;
            Object object;
            Object object2;
            boolean bl = this.S.v() == this.E;
            double d3 = 0.0;
            double d4 = 0.0;
            if (!bl) {
                if (ex_02.a(A5.bn)) {
                    object2 = new eE(ex_02.a());
                    ca_0 ca_02 = this.a((eX)object2);
                    if (ca_02 != null) {
                        d3 = this.a((eX)object2, ca_02);
                        bl = d3 == 0.0;
                        d4 = 5.0;
                    }
                } else if (ex_02.a(A5.ad)) {
                    d3 = this.a(new eR(ex_02.a()));
                    bl = d3 < 3.0;
                    d4 = 12.0;
                }
            }
            if (this.S.v() == this.L && d3 > d4) continue;
            object2 = this.I.get(ex_02);
            Object object3 = object2[0];
            double d5 = (double)ds_2.H() - object2[1];
            if (object2[2] < 1.0 && this.a((double)(object3 / (double)d0_02.f()), d5 / (double)d0_02.f(), d0_02)) continue;
            float f12 = this.a(f10, (double)(object3 / (double)d0_02.f()), f11, d5 / (double)d0_02.f()) + (float)(object2[2] > 1.0 ? 180 : 0);
            double d6 = (double)f10 * this.A.a();
            double d7 = (double)f11 * this.A.a();
            double d8 = Math.sqrt(1.0 / (1.0 / (d6 * d6) + Math.pow(Math.tan(Math.toRadians(f12)), 2.0) / (d7 * d7)));
            double d10 = Math.tan(Math.toRadians(f12)) * d8;
            float f13 = Y.a(f12 + 90.0f);
            if (f13 < 0.0f) {
                d8 = -d8;
                if (f13 > -180.0f) {
                    d10 = -d10;
                }
            }
            int n6 = 0;
            if (!bl && this.S.v() == this.L) {
                n6 = (int)(eJ2.a(ex_02) * 2.0f);
            }
            if (n6 > 200) {
                n6 = 200;
            }
            fG fG2 = this.a(ex_02);
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d8 + (double)((float)d0_02.g() / 2.0f)), (double)(d10 + (double)((float)d0_02.h() / 2.0f)), (double)0.0);
            if (bl) {
                GL11.glScaled((double)1.5, (double)1.5, (double)1.0);
            }
            GL11.glPushMatrix();
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            ds_2.J().a(ds_2.m(), ds_2.l(), fG2, -8, -20);
            GL11.glPopMatrix();
            if (this.C.u().booleanValue() && n6 < 200) {
                GL11.glPushMatrix();
                object = (bl ? "\u00a7l" : "") + (int)eJ2.a(ex_02) + "m";
                GL11.glScaled((double)0.5, (double)0.5, (double)0.0);
                e3.r();
                color = bl ? new Color(255, 0, 0) : new Color(255, 255, 255, 255 - n6);
                dr_12.d((String)object, (double)((float)(-dr_12.c((String)object)) / 2.0f), -dr_12.a((String)object), yI.a(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                e3.f();
                GL11.glPopMatrix();
            }
            GL11.glRotatef((float)(f12 - 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScaled((double)0.375, (double)0.5, (double)0.0);
            object = this.b(ex_02);
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - n6);
            k9.a(color, -16.0f, 0.0f, "exo", 1.0f, false);
            GL11.glPopMatrix();
        }
        this.I.clear();
    }

    public fG a(ex_0 ex_02) {
        if (this.Q == null) {
            this.Q = fG.a(fk_0.a(262));
            this.y = fG.a(fk_0.a(368));
            this.v = fG.a(fk_0.a(438));
            this.w = fG.a(fk_0.a(344));
            this.D = fG.a(fk_0.a(332));
            this.M = fG.a(fk_0.a(385));
        }
        if (ex_02.a(A5.c9)) {
            return this.Q;
        }
        if (ex_02.a(A5.af)) {
            return this.y;
        }
        if (ex_02.a(A5.aX)) {
            return this.v;
        }
        if (ex_02.a(A5.cS)) {
            return this.w;
        }
        if (ex_02.a(A5.cA)) {
            return this.D;
        }
        return this.M;
    }

    private Color b(ex_0 ex_02) {
        if (ex_02.a(A5.bn)) {
            eE eE2 = new eE(ex_02.a());
            Color color = this.a(eE2).a(eE2.a());
            if (color == null) {
                color = new Color(255, 255, 255);
            }
            return color;
        }
        if (ex_02.a(A5.dG)) {
            return new Color(255, 109, 0);
        }
        return this.R.K();
    }

    private List<ca_0> S() {
        ArrayList<ca_0> arrayList = new ArrayList<ca_0>();
        if (this.T.u().booleanValue()) {
            arrayList.add(this.K);
        }
        if (this.x.u().booleanValue()) {
            arrayList.add(this.J);
        }
        if (this.H.u().booleanValue()) {
            arrayList.add(this.B);
        }
        if (this.F.u().booleanValue()) {
            arrayList.add(this.P);
        }
        if (this.z.u().booleanValue()) {
            arrayList.add(this.O);
        }
        return arrayList;
    }

    private ca_0 a(eX eX2) {
        if (eX2.v()) {
            return null;
        }
        if (eX2.z() == eX2.T() && eX2.g() == eX2.X()) {
            return null;
        }
        for (ca_0 ca_02 : this.S()) {
            if (!ca_02.a(eX2)) continue;
            return ca_02;
        }
        return null;
    }

    private double a(eR eR2) {
        if (!eR2.a(A5.ad)) {
            return -1.0;
        }
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        double d3 = eR2.z();
        double d4 = eR2.l();
        double d5 = eR2.g();
        double d6 = eR2.k();
        double d7 = eR2.D();
        double d8 = eR2.u();
        double d10 = 1000.0;
        for (int i = 0; i < 100; ++i) {
            gK gK2;
            float f10 = eR2.n();
            float f11 = eR2.A();
            fP fP2 = fP.a(d3 - (double)f10, d4, d5 - (double)f10, d3 + (double)f10, d4 + (double)f11, d5 + (double)f10);
            gK gK3 = gK.b(d3, d4, d5);
            gb_0 gb_02 = gO2.a(gK3, gK2 = gK.b(d3 + d6, d4 + d7, d5 + d8), false, true, false);
            if (gb_02.d()) {
                gK2 = gK.b(gb_02.k().g(), gb_02.k().h(), gb_02.k().f());
            }
            List list = gO2.a(this.N, fP2.e(d6, d7, d8).d(1.0, 1.0, 1.0));
            double d11 = 0.0;
            for (Object e10 : list) {
                double d12;
                gb_0 gb_03;
                ex_0 ex_02 = new ex_0(e10);
                if (!ex_02.a(A5.cF) || ex_02.a(A5.cI) || !ex_02.V() || !ex_02.equals(eJ2) || !(gb_03 = (fP2 = ex_02.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d12 = gK3.a(gb_03.k())) < d11) && d11 != 0.0) continue;
                d11 = d12;
                gb_03.a(ex_02);
                gb_02 = gb_03;
            }
            double d13 = eJ2.a(d3 += d6, d4 += d7, d5 += d8);
            if (d13 < d10) {
                d10 = d13;
            }
            if (!gb_02.d()) continue;
            d3 = gb_02.k().g();
            d4 = gb_02.k().h();
            d5 = gb_02.k().f();
            if (!gb_02.h().d()) break;
            return gb_02.h().a(A5.u) ? 0.0 : eJ2.a(d3, d4, d5);
        }
        return d10;
    }

    private double a(eX eX2, ca_0 ca_02) {
        if (!eX2.a(A5.bn)) {
            return -1.0;
        }
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        double d3 = eX2.z();
        double d4 = eX2.l();
        double d5 = eX2.g();
        double d6 = eX2.k();
        double d7 = eX2.D();
        double d8 = eX2.u();
        double d10 = 1000.0;
        while (true) {
            gK gK2;
            float f10 = ca_02.b();
            float f11 = ca_02.a();
            fP fP2 = fP.a(d3 - (double)f10, d4, d5 - (double)f10, d3 + (double)f10, d4 + (double)f11, d5 + (double)f10);
            gK gK3 = gK.b(d3, d4, d5);
            gb_0 gb_02 = gO2.a(gK3, gK2 = gK.b(d3 + d6, d4 + d7, d5 + d8), false, eX2.a(A5.c9), false);
            if (gb_02.d()) {
                gK2 = gK.b(gb_02.k().g(), gb_02.k().h(), gb_02.k().f());
            }
            List list = gO2.a(this.N, fP2.e(d6, d7, d8).d(1.0, 1.0, 1.0));
            double d11 = 0.0;
            for (Object e10 : list) {
                double d12;
                gb_0 gb_03;
                ex_0 ex_02 = new ex_0(e10);
                if (!ex_02.a(A5.cF) || ex_02.a(A5.cI) || !ex_02.V() || !ex_02.equals(eJ2) || !(gb_03 = (fP2 = ex_02.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d12 = gK3.a(gb_03.k())) < d11) && d11 != 0.0) continue;
                d11 = d12;
                gb_03.a(ex_02);
                gb_02 = gb_03;
            }
            double d13 = eJ2.a(d3 += d6, d4 += d7, d5 += d8);
            if (d13 < d10) {
                d10 = d13;
            }
            if (gb_02.d()) {
                d3 = gb_02.k().g();
                d4 = gb_02.k().h();
                d5 = gb_02.k().f();
                if (!gb_02.h().d()) break;
                return gb_02.h().a(A5.u) ? 0.0 : eJ2.a(d3, d4, d5);
            }
            if (d4 < -128.0) break;
            d6 *= eX2.H() ? 0.8 : 0.99;
            d7 *= eX2.H() ? 0.8 : 0.99;
            d8 *= eX2.H() ? 0.8 : 0.99;
            d7 -= 0.05;
        }
        return d10;
    }

    private boolean a(double d3, double d4, d0_0 d0_02) {
        return d3 > 0.0 && d4 > 0.0 && d3 < (double)d0_02.g() && d4 < (double)d0_02.h();
    }

    private float a(double d3, double d4, double d5, double d6) {
        return (float)Math.toDegrees(Math.atan2(d6 - d5, d4 - d3));
    }
}

